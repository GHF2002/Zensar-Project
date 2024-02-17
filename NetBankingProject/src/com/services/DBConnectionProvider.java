package com.services;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnectionProvider
{
	
	Connection con;{
	
	try
	{
		FileInputStream fis = new FileInputStream(".//Resources//DbConfig.properties");
		Properties p = new Properties();
		p.load(fis);
			
			
		String driver = p.getProperty("driveclass");
		String url = p.getProperty("url");
		String user = p.getProperty("username");
		String pass = p.getProperty("password");
		
//		Class.forName("oracle.jdbc.driver.OracleDriver");
		Class.forName(driver);
		
		
		con =  DriverManager.getConnection(url,user,pass);
		
//		stmt = con.createStatement();
	//	stmt = con.createStatement();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}


	}

	public static Connection provideConn() {
		// TODO Auto-generated method stub
		return null;
	}

}


