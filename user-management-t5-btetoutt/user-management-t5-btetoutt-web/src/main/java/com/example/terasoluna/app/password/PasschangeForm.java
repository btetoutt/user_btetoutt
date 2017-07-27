package com.example.terasoluna.app.password;

import java.io.Serializable;

public class PasschangeForm implements Serializable {

	private static final long serialVersionUID = 1L;
	
    private String userid;
    private String password1;
    private String password2;
    
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
}
