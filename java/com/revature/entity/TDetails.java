package com.revature.entity;

public class TDetails {
	
	private String mail;
	private String pw;
	
	
	public TDetails(String mail, String pw) {
		super();
	
	
		this.mail=mail;
		this.pw = pw;
			
	}
 
	public String getmail() {
		return mail;
	}


	public void setmail(String mail) {
		this.mail = mail;
	}
	
	public String getpw() {
		return pw;
	}


	public void setpw(String pw) {
		this.pw = pw;
	}

	public String toString() {
		return "CusDetails [mail :" + mail + ", pw :" + pw + "]";
}

	
	

}
