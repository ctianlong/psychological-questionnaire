package com.tmy.model;

/**
 * Set-Cookie: JSESSIONID=B8F988458DE03A83AD61C18748B5B0CD;path=/;HttpOnly
 * @author ctl
 *
 */
public class SessionInfo {
	
	private String jsessionid;

	public String getJsessionid() {
		return jsessionid;
	}

	public void setJsessionid(String jsessionid) {
		this.jsessionid = jsessionid;
	}

	@Override
	public String toString() {
		return "SessionInfo [jsessionid=" + jsessionid + "]";
	}
	
}
