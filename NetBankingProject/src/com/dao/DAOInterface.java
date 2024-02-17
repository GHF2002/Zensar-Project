package com.dao;

import com.bean.Account;


public interface DAOInterface {
	
	public int insertRecord(Account acc);
	
	float deposit(int acNo, float ammount);
	
	public Account retriveData(int accNo);
}
