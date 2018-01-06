package com.tmy.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.httpclient.HttpException;
import org.apache.commons.lang.StringUtils;
import org.scribe.model.Token;
import org.scribe.model.Verifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tmy.model.CountUser;
import com.tmy.model.OAuthUser;
import com.tmy.model.SurveyAnswer;
import com.tmy.model.User;
import com.tmy.oauth.service.OAuthServiceDeractor;
import com.tmy.oauth.service.OAuthServices;
import com.tmy.repository.CountUserRepository;
import com.tmy.repository.OauthUserRepository;
import com.tmy.repository.SurveyAnswerRepository;
import com.tmy.repository.UserRepository;

@Controller
public class AccountController {

	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

	@Autowired
	private OAuthServices oAuthServices;
	@Autowired
	private OauthUserRepository oauthUserRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private CountUserRepository countUserRepository;
	@Autowired
	private SurveyAnswerRepository answerRepository;
	
	/**
	 * 应对审批
	 * @param model
	 * @return
	 */
	@RequestMapping(value = {"/index"}, method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("MyoAuthServices", oAuthServices.getAllOAuthServices());
		return "index";
	}

	@RequestMapping(value = {"/login"}, method = RequestMethod.GET)
	public String showLogin(Model model) {
		model.addAttribute("MyoAuthServices", oAuthServices.getAllOAuthServices());
		return "login";
	}
	
	@RequestMapping(value = "/tjinfo", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Void> tjinfo(@RequestBody User user, HttpServletRequest request) {
		if (StringUtils.isNotBlank(user.getUsername())) {
			request.getSession().setAttribute("user", user);
			return ResponseEntity.ok().build();
		} else {
			return ResponseEntity.badRequest().build();
		}
	}
	
	@RequestMapping(value = "/count", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Void> count(@RequestBody CountUser countUser) {
		CountUser oldCountUser = countUserRepository.findByUsername(countUser.getUsername());
		if(oldCountUser == null) {
			countUser.setIsInputWeibo(false);
			countUser.setVisitTimes(1);
			countUserRepository.saveAndFlush(countUser);
		} else {
			oldCountUser.setVisitTimes(oldCountUser.getVisitTimes() + 1);
			countUserRepository.flush();
		}
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping(value = "/oauth/{type}/callback", method = RequestMethod.GET)
	public String callback(@RequestParam(value = "code", required = true) String code,
			@PathVariable(value = "type") String type, HttpServletRequest request, Model model) {
		OAuthServiceDeractor oAuthService = oAuthServices.getOAuthService(type);
		Token accessToken = oAuthService.getAccessToken(null, new Verifier(code));
		OAuthUser oAuthInfo = oAuthService.getOAuthUser(accessToken);
		OAuthUser oAuthUser = oauthUserRepository.findByOAuthTypeAndOAuthId(oAuthInfo.getoAuthType(),
				oAuthInfo.getoAuthId());
		if (oAuthUser == null) {
			oAuthUser = new OAuthUser();
			oAuthUser.setoAuthId(oAuthInfo.getoAuthId());
			oAuthUser.setoAuthType(oAuthInfo.getoAuthType());
			oAuthUser.setAccessToken(accessToken.getToken());
			User user = (User) request.getSession().getAttribute("user");
			if (user == null) {
				user = new User();
				user.setUsername(oAuthInfo.getoAuthType() + ":" + oAuthInfo.getoAuthId());
				user.setIsTj(false);
				user.setIsFinished(false);
				user.setIsPaid(false);
				userRepository.save(user);
				oAuthUser.setUser(user);
				oauthUserRepository.save(oAuthUser);
				request.getSession().setAttribute("oauthUser", oAuthUser);
				return "redirect:/success";
			} else {
				// 统计相关，将统计用户设置为确认进行了微博输入
				CountUser cUser = countUserRepository.findByUsername(user.getUsername());
				if(cUser != null){
					cUser.setIsInputWeibo(true);
					countUserRepository.flush();
				}else {
					cUser = new CountUser();
					cUser.setName(user.getName());
					cUser.setCloudpassport(user.getCloudpassport());
					cUser.setEid(user.getEid());
					cUser.setEmail(user.getEmail());
					cUser.setGender(user.getGender());
					cUser.setIsInputWeibo(true);
					cUser.setOpenId(user.getOpenId());
					cUser.setUsername(user.getUsername());
					cUser.setVisitTimes(1);
					countUserRepository.saveAndFlush(cUser);
				}
				User oldUser = userRepository.findByUsername(user.getUsername());
				if (oldUser == null) {
					user.setIsTj(true);
					user.setIsFinished(false);
					user.setIsPaid(false);
					userRepository.save(user);
					oAuthUser.setUser(user);
					oauthUserRepository.save(oAuthUser);
					request.getSession().setAttribute("oauthUser", oAuthUser);
					return "redirect:/success";
				} else {
					oAuthUser.setUser(oldUser);
					oauthUserRepository.save(oAuthUser);
					request.getSession().setAttribute("oauthUser", oAuthUser);
					if (oldUser.getIsFinished()) {
						return "redirect:/finish";
					} else {
						return "redirect:/success";
					}
				}
			}
		} else {
			request.getSession().setAttribute("oauthUser", oAuthUser);
			if (oAuthUser.getUser().getIsFinished()) {
				return "redirect:/finish";
			} else {
				return "redirect:/success";
			}
		}
	}

	@RequestMapping(value = {"", "/success"}, method = RequestMethod.GET)
	public Object success(HttpServletRequest request, Model model) throws HttpException {
		/*
		 * GetWeiboParams params=new GetWeiboParams();
		 * params.access_token=accessToken.getToken(); params.uid="1873939611";
		 * params.count="90"; params.page="1"; params.feature="1"; String
		 * requestURL=ParamUtils.get(
		 * "https://api.weibo.com/2/statuses/user_timeline.json",
		 * params.getRequestParams()); String response= HttpUtil.doGet(requestURL,
		 * "UTF-8");
		 */
		if (((OAuthUser) request.getSession().getAttribute("oauthUser")).getUser().getIsFinished()) {
			return "redirect:/finish";
		}
		return "survey";
	}

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<Map<String, Object>> survey(@RequestBody SurveyAnswer answer, HttpServletRequest request) {
		Map<String, Object> res = new HashMap<>();
		User user = ((OAuthUser) request.getSession().getAttribute("oauthUser")).getUser();
		if (user.getIsFinished()) {
			res.put("success", false);
		} else {
			user.setIsFinished(true);
			userRepository.save(user);
			answer.setUser(user);
			answer.setCreateTime(new Date());
			answerRepository.save(answer);
			res.put("success", true);
		}
		return ResponseEntity.ok(res);
	}
	
	@GetMapping("/finish")
	public String finish(Model model, HttpServletRequest request) {
		User user = ((OAuthUser) request.getSession().getAttribute("oauthUser")).getUser();
		if (StringUtils.isNotBlank(user.getAccountType())) {
			model.addAttribute("accountType", user.getAccountType());
			model.addAttribute("account", user.getAccount());
		}
		return "finish";
	}
	
	@PostMapping("/account")
	@ResponseBody
	public ResponseEntity<Void> saveAccount(String accountType, String account, HttpServletRequest request) {
		if (StringUtils.isBlank(account) || StringUtils.isBlank(account)) {
			return ResponseEntity.badRequest().build();
		}
		User user = ((OAuthUser) request.getSession().getAttribute("oauthUser")).getUser();
		user.setAccountType(accountType);
		user.setAccount(account);
		userRepository.saveAndFlush(user);
		return ResponseEntity.ok().build();
	}

	// @RequestMapping(value = "/showAnswers", method = RequestMethod.POST)
	// public String save(@ModelAttribute(value = "answers") @Valid QuestionAnswers
	// page_answers,
	// BindingResult bindingResult, Model model) throws ClassNotFoundException,
	// IOException, InterruptedException {
	// page_answers.setChoices(choices);
	// if (bindingResult.hasErrors()) {
	// return "testProperties";
	// } else
	// return "survey";

	// }

}
