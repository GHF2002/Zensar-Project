package com.provider;

import java.io.FileInputStream;
import java.util.Properties;

import com.dao.DAOInterface;



public class DAOProvider 
{

	public static DAOInterface getDAO()
	{
		DAOInterface dao = null;
		
		try
		{
			FileInputStream fis = new FileInputStream(".//Resources//info.properties");
			Properties p = new Properties();
			p.load(fis);
		
			String DAOClass = p.getProperty("daoclass");
			dao = (DAOInterface)Class.forName(DAOClass).newInstance();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return dao;
	}
	



}
