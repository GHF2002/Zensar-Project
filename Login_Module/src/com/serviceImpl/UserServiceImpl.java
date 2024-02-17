package com.serviceImpl;

import com.bean.User;
import com.services.UserServices;
import com.exception.InvalidValueException;
public abstract class UserServiceImpl implements UserServices{

	User u;
	public String signIn(String uname,String pass,String sq,String sans) 
	{
		u=new User(uname,pass,sq,sans);
		return u.getUname();
	}
	
	
	public boolean signUp(String uname,String pass) 
	{

		if(u.getUname()==uname && u.getPass()==pass)
		{
			System.out.println("Welcome user..");				
			return true;
		}
		else
		{
			System.out.println("Invalid login ");
			return false;
		}
		
		
	}
		
}
