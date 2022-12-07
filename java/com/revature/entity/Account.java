package com.revature.entity;

public class Account {

	private String user_name;
	private String pw;
	

	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getw() {
		return pw;
	}
	public void setpassword(String password) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "Account [user_name : " + user_name + ", password : " + pw +"]";
	}
	

}