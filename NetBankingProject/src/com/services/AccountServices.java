package com.services;

public interface AccountServices 
{
	int openAccount(String type,float amount);
	float deposit(int accNo,float amount);
	float whithdrawl(int accNo,float amount);
	float balInquiry(int accNo,String type);
	
	
}
