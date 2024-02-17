package com.provider;

import com.serviceImpl.UserServiceImpl;

public class Objectprovider {
	public static UserServiceImpl provideObject()
	{
		UserServiceImpl us=new UserServiceImpl();
		return us;
	}
}
