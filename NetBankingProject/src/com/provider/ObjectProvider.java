package com.provider;

import java.io.FileInputStream;
import java.util.Properties;

import com.serviceImpl.AccountServiceImpl;
import com.services.AccountServices;

public class ObjectProvider    //this class provide object which help to hide the implementation from the client
{
	public static AccountServices provideObject()
	{
		AccountServices acc =null;
		FileInputStream fis = null;
	
		
		try
		{
		
		fis = new FileInputStream(".//Resources//info.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String businessClass = p.getProperty("classname");
	
		acc=(AccountServices)Class.forName(businessClass).newInstance();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fis.close();	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		return acc;
		
		
	}
	
}
