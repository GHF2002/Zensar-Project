package com.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.Account;
import com.dao.DAOInterface;
import com.services.DBConnectionProvider;

public class DAOImp implements DAOInterface
{
//InvalidAccountException
	//provideDBConnection
	Connection conn = DBConnectionProvider.provideConn();
	PreparedStatement pst;
	ResultSet rs;
	
	
	public int insertRecord(Account acc)
	{
		int uc = 0;
		
		try
		{
				pst = conn.prepareStatement("insert into account values(?,?,?)");
				pst.setInt(1, acc.getAccNo());
				pst.setString(2, acc.getAccType());
				pst.setFloat(3, acc.getAccBal());
				uc=pst.executeUpdate();
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return uc;
	}
	
	
	public Account retriveData(int accNo)
	{
		Account acc = null;
		try
		{
			pst.setInt(1, accNo);
			rs = pst.executeQuery();
			
			rs.next();
				
			int no = rs.getInt(1);
			String accType = rs.getString(2);
			float accBal = rs.getFloat(3);
			
			acc = new Account(accType,accBal);
			acc.setAccNo(no);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return acc;
	}


	@Override
	public float deposit(int acNo, float ammount) {
		// TODO Auto-generated method stub
		return 0;
	}
}
