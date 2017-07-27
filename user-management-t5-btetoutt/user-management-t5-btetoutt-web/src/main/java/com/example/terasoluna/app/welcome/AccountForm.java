package com.example.terasoluna.app.welcome;

import java.io.Serializable;

public class AccountForm  implements Serializable{
private static final long serialVersionUID = 1L;
	
    private String userid;
    private String username;
    private String birthday;
    private String address;
    private String telnumber;
    private String encodedPassword;
    private String status;
    private String finalupdate;
    
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelnumber() {
		return telnumber;
	}
	public void setTelnumber(String telnumber) {
		this.telnumber = telnumber;
	}
	public String getEncodedPassword() {
		return encodedPassword;
	}
	public void setEncodedPassword(String encodedPassword) {
		this.encodedPassword = encodedPassword;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFinalupdate() {
		return finalupdate;
	}
	public void setFinalupdate(String finalupdate) {
		this.finalupdate = finalupdate;
	}
    
	@Override
    public String toString() {
        
		return "Account [userid=" + userid +",username="
		       + username +",birthday="+ birthday +",address="
			   + address +",telnumber="+ telnumber +",password="
		       + encodedPassword +",status="+ status +",finalupdate="
			   + finalupdate + "]";
	}
}
