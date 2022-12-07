package com.revature.repository;

public class User {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	private String name;
	private String mail;
	private String pw;
	private String phone;
	private String address;

	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getmail() {
		return mail;
	}
	public void setmail(String string) {
		this.mail=mail;
		
	}
	public String getpw() {
		return pw;
	}
	public void setpw(String string) {
		this.pw=pw;
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

	
	@Override
	public String toString() {
		return "Account [id : " + id + ", name : " + name + ", mail :" + mail +", pw :" + pw +", address : " + address +"]";
	}
	
	
	


}
