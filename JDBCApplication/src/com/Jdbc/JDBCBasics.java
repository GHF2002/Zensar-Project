package com.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class JDBCBasics
{
	
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	public JDBCBasics()
	{
		try
		{
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql:@localhost:3351:root","root","root");
		con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void retriveData()
	{
		try
		{
			rs=stmt.executeQuery("Select *from root.account");
			
			while(rs.next())
			{
				int Acc_no=rs.getInt(1);
				int Acc_type=rs.getInt(1);
				int Acc_bal=rs.getInt(1);
				
				System.out.println("Account details are....."+Acc_no+"/"+Acc_type+"/"+Acc_bal);
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
			stmt.executeUpdate("Insert into account values(1111,1,35000)");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				stmt.close();
				rs.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) 
	{
		JDBCBasics j=new JDBCBasics();
		j.retriveData();

	}
	public void insertDynamicData(int accNo, String accType, float amount) {
		// TODO Auto-generated method stub
		
	}

}
