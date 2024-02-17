package com.Jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JDBCBasic
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	PreparedStatement pst;
	
	public JDBCBasic()
	{
		try
		{
			//read the middleware
			FileInputStream fis=new FileInputStream(".//Resources//DbConfig.properties");
			Properties p=new Properties();
			p.load(fis);
			
			String driver=p.getProperty("driverclass");
			String url=p.getProperty("url");
			String user=p.getProperty("username");
			String pass=p.getProperty("password");
			
			
			//1. Load the driver class
			Class.forName(driver);
			
			//2.created connection
			con=DriverManager.getConnection(url,user,pass);
			//3. created a medium for sql queries
			stmt=con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
	}
    public void retriveData(float accBal)
    {
    	try
    	{
    		//rs=stmt.executeQuery("select * from Account_table where accBal=?");
    		pst=con.prepareStatement("select * from Account_table where accBal=?");
    		pst.setFloat(1, accBal);
    		rs=pst.executeQuery();
    		
    		while(rs.next())
    		{
    			int accNo=rs.getInt(1);
    			String accType=rs.getString(2);
    			float amount=rs.getFloat(3);
    			
    			System.out.println("Account details are:......"+accNo+"/"+accType+"/"+amount);
    		}
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    public void insertRecord()
    {
    	try
    	{
    		int count=stmt.executeUpdate("insert into Account_table values(1111,'Savings',90000)");
    		if(count>0)
    			System.out.println("query worked");
    		else
    			System.out.println("query failed");
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    public void insertDynamicData(int accNo,String accType,float accBal)
    {
    	try
    	{
    		pst=con.prepareStatement("insert into Account_tables values(?,?,?)");
    		pst.setInt(1, accNo);
    		pst.setString(2, accType);
    		pst.setFloat(3, accBal);
    		int updatecount=pst.executeUpdate();
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
	public static void main(String[] args) 
	{
		JDBCBasics j=new JDBCBasics();
		
		j.insertRecord();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter acc No:");
		int accNo=sc.nextInt();
		
		System.out.println("please enter account type");
		String accType=sc.next();
		
		System.out.println("please enter amount");
		float amount=sc.nextFloat();
		
		j.insertDynamicData(accNo, accType, amount);
		j.retriveData();
				

	}

}
