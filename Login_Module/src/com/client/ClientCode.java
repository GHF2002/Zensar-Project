package com.client;
import com.provider.Objectprovider;
import com.serviceImpl.UserServiceImpl;
import com.services.UserServices;
import com.exception.InvalidValueException;

public class ClientCode {

	public static void aMethod(String s)throws InvalidValueException
	{
		if(s==" ")
		{
			throw new InvalidValueException("Null values are not acceptable");
		}
	}
	public static void main(String[] args)
	{
		UserServices us=Objectprovider.provideObject();
		
		String sI1=us.signIn(" ","asmita","what is ur fav color","Pink");
		
		boolean sU1=us.signUp("as","asmita");
		try
		{
			aMethod(sI1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
