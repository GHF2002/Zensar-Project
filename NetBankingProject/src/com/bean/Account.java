package com.bean;

public class Account 
{
	
	private int accNo;
	private String accType;
	private float accBal;
	private int series=1000;
	
	public Account(/*int accNo,*/ String accType, float accBal) {
		super();
		this.accNo = series;
		series++;
		this.accType = accType;
		this.accBal = accBal;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	public String toString() {
		return "Account [accNo=" + accNo + ", accType=" + accType + ", accBal=" + accBal + "]";
	}
	
	

}
