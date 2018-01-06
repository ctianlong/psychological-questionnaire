package com.tmy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "psy_oauth_user")
public class OAuthUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@ManyToOne
	private User user;

	private String oAuthType;
	private String oAuthId;

	private String accessToken;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getoAuthType() {
		return oAuthType;
	}

	public void setoAuthType(String oAuthType) {
		this.oAuthType = oAuthType;
	}

	public String getoAuthId() {
		return oAuthId;
	}

	public void setoAuthId(String oAuthId) {
		this.oAuthId = oAuthId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
