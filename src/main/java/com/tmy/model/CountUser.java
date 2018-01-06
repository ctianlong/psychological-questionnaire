package com.tmy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "psy_count_user")
public class CountUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String username;
	private Integer visitTimes;
	private String name;
	private String email;
	private String eid;
	private String cloudpassport;
	private String gender;
	private String openId;
	private Boolean isInputWeibo;

	public Integer getVisitTimes() {
		return visitTimes;
	}

	public void setVisitTimes(Integer visitTimes) {
		this.visitTimes = visitTimes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getCloudpassport() {
		return cloudpassport;
	}

	public void setCloudpassport(String cloudpassport) {
		this.cloudpassport = cloudpassport;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Boolean getIsInputWeibo() {
		return isInputWeibo;
	}

	public void setIsInputWeibo(Boolean isInputWeibo) {
		this.isInputWeibo = isInputWeibo;
	}

	@Override
	public String toString() {
		return "CountUser [id=" + id + ", username=" + username + ", visitTimes=" + visitTimes + ", name=" + name
				+ ", email=" + email + ", eid=" + eid + ", cloudpassport=" + cloudpassport + ", gender=" + gender
				+ ", openId=" + openId + ", isInputWeibo=" + isInputWeibo + "]";
	}

}
