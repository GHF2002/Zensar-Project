package com.client;

import com.provider.ObjectProvider;
import com.serviceImpl.AccountServiceImpl;
import com.services.AccountServices;


public class ClientCode 
{

	public static void main(String[] args)
	{
		//AccountServices bank=new AccountServiceImpl();  //here client can identify the which class contain services and which has the implementation
		
		AccountServices bank=ObjectProvider.provideObject();
		int accNo=bank.openAccount("Saving", 100000.0f);
		System.out.println("Account opend with Account number :"+accNo);
		
		float bal=bank.deposit(1000, 100000.0f);
		System.out.println("Account Balance after deposit is : "+bal);
		
		float bal1=bank.whithdrawl(1000, 50000.0f);
		System.out.println("Account Balance after withdrawl is : "+bal1);
		
		float bal2=bank.balInquiry(1000, "Saving");
		//System.out.println("Account Balance Inquiry ");
		System.out.println("Account Balance is : "+bal2);
	}

}
