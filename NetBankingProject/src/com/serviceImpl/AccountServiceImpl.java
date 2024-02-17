package com.serviceImpl;
import com.bean.Account;
import com.dao.DAOInterface;
import com.provider.DAOProvider;
import com.services.AccountServices;

public class AccountServiceImpl implements AccountServices
{
	Account acc;

	DAOInterface dao = DAOProvider.getDAO();
	
	public int openAccount(String type, float amount) 
	{
		acc=new Account(type,amount);
		
		dao.insertRecord(acc);
		
		return acc.getAccNo();

	}

	
	public float deposit(int accNo, float amount) 
	{
		float bal=0.0f;
		Account acc = null;
		
		acc=dao.retriveData(accNo);
		
		if(acc!=null)
		{
			float newBal = 0.0f;
			
			acc.getAccBal();
			bal = bal+amount;
			
			//acc.setAccBal(acc.getAccBal()+amount);
			//bal=acc.getAccBal();
			
		}
		else
		{
			System.out.println("invalid account no");
		
		}
		return bal;
	}

	
	public float whithdrawl(int accNo, float amount) {
		
		float bal=0.0f;
		if(acc.getAccNo()==accNo)
		{
			acc.setAccBal(acc.getAccBal()-amount);
			bal=acc.getAccBal();
			
		}
		else
		{
			System.out.println("invalid account no");
		}
		return bal;
	}

	
	public float balInquiry(int accNo, String type) {
	
		float bal=0.0f;
		if(acc.getAccNo()==accNo && acc.getAccType()==type)
		{
			//acc.setAccBal(acc.getAccBal());
			bal=acc.getAccBal();
			
		}
		else
		{
			System.out.println("invalid account no");
		}
		return bal;
	}
	

}
