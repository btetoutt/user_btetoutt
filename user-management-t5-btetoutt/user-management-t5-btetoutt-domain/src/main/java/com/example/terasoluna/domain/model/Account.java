package com.example.terasoluna.domain.model;

import java.io.Serializable;

public class Account implements Serializable {

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
    
	/*
	private static final long serialVersionUID = 1L;

	private String userid;

	private String username;

	private String email;

	private String encodedPassword;

	private Date birthday;

	private String zip;

	private String address;

	private String cardNumber;

	private Date cardExpirationDate;

	private String cardSecurityCode;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getEncodedPassword() {
		return encodedPassword;
	}

	public void setEncodedPassword(String encodedPassword) {
		this.encodedPassword = encodedPassword;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Date getCardExpirationDate() {
		return cardExpirationDate;
	}

	public void setCardExpirationDate(Date cardExpirationDate) {
		this.cardExpirationDate = cardExpirationDate;
	}

	public String getCardSecurityCode() {
		return cardSecurityCode;
	}

	public void setCardSecurityCode(String cardSecurityCode) {
		this.cardSecurityCode = cardSecurityCode;
	}

	public String getLastFourOfCardNumber() {
		if (cardNumber == null) {
			return "";
		}
		return cardNumber.substring(cardNumber.length() - 4);
	}
	*/
}

