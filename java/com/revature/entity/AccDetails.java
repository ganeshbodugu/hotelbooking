package com.revature.entity;

public class AccDetails {
	
	private int id;
	private String name;
	private String mail;
	private String pw;
	private String phone;
	private String address;
	
	public AccDetails(String name, String mail, String pw,String phone,  String address) {
		super();
	
		this.name = name;
		this.mail=mail;
		this.phone = phone;
		this.pw = pw;
		this.address = address;		
	}
	
   public AccDetails() {
		
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
   
   public String getname() {
		return name;
	}


	public void setname(String name) {
		this.name = name;
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


	public String getphone() {
		return phone;
	}


	public void setphone(String phone) {
		this.phone = phone;
	}
	
	public String getaddress() {
		return address;
	}


	public void setaddress(String address) {
		this.address = address;
	}


	public String toString() {
		return "CusDetails [id :" + id + ", name : " + name + ", mail :" + mail + ", pw :" + pw + ", phone : " + phone +", address : "+address+"]";
}

	
	

}
