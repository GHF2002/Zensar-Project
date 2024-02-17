package com.bean;

public class User {

	private String uname;
	private String pass;
	private String sqn;
	private String sans;
	
	public User(String uname, String pass, String sqn, String sans) {
		super();
		this.uname = uname;
		this.pass = pass;
		this.sqn = sqn;
		this.sans = sans;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getSqn() {
		return sqn;
	}

	public void setSqn(String sqn) {
		this.sqn = sqn;
	}

	public String getSans() {
		return sans;
	}

	public void setSans(String sans) {
		this.sans = sans;
	}

	public String getUname1() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
