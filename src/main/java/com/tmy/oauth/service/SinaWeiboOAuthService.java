package com.tmy.oauth.service;

import org.apache.commons.lang.StringUtils;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuthService;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONPath;
import com.tmy.config.OAuthTypes;
import com.tmy.model.OAuthUser;
import com.tmy.model.User;

public class SinaWeiboOAuthService extends OAuthServiceDeractor {
    
    private static final String PROTECTED_RESOURCE_URL = "https://api.weibo.com/oauth2/get_token_info";
    private static final String USERS_SHOW_URL = "https://api.weibo.com/2/users/show.json";

    public SinaWeiboOAuthService(OAuthService oAuthService) {
        super(oAuthService, OAuthTypes.SINA_WEIBO);
    }

    @Override
    public OAuthUser getOAuthUser(Token accessToken) {
        OAuthRequest request = new OAuthRequest(Verb.POST, PROTECTED_RESOURCE_URL);
        this.signRequest(accessToken, request);
        Response response = request.send();
        OAuthUser oAuthUser = new OAuthUser();
        oAuthUser.setoAuthType(getoAuthType());
        oAuthUser.setoAuthId(JSONPath.eval(JSON.parse(response.getBody()), "$.uid").toString());
        oAuthUser.setUser(new User());
        return oAuthUser;
    }
    
    /**
     * 获取微博昵称
     * @param accessToken
     * @return
     */
    public String getScreenName(Token accessToken, String oAuthId, String ScreenName) {
    	OAuthRequest request = new OAuthRequest(Verb.GET, USERS_SHOW_URL);
    	this.signRequest(accessToken, request);
    	if(StringUtils.isNotBlank(oAuthId)) {
    		request.addQuerystringParameter("uid", oAuthId);
    	}else if(StringUtils.isNotBlank(ScreenName)) {
    		request.addQuerystringParameter("screen_name", ScreenName);
    	}
    	Response response = request.send();
    	return JSONPath.eval(JSON.parse(response.getBody()), "$.screen_name").toString();
    }

}
