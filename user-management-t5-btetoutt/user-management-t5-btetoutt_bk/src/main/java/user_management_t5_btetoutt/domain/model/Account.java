package user_management_t5_btetoutt.domain.model;

import java.io.Serializable;

public class Account implements Serializable {
  
    public static interface passwFinish {
    };
    
	private static final long serialVersionUID = 1L;

	
    private String userid;
    private String username;
    private String birthday;
    private String address;
    private String telnumber;
    private String password;
    private String status;
    private String finalupdate;
    
    /*
    private String username;

    private String password;

    private String firstName;

    private String lastName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    */

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
		       + password +",status="+ status +",finalupdate="
			   + finalupdate + "]";
		
		/*
		return "Account [username=" + username + ", password=" + password
                + ", firstName=" + firstName + ", lastName=" + lastName + "]";
        */
    }
}
