package com.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo 
{
	public static boolean validate(String s,String p)
	{
		boolean val=false;
		
		if(s.equals("java")&&p.equals("java"))
		{
			val=true;
		}
		else
		{
			val=false;
		}
		return val;
	}

	public static void main(String[] args) 
	{
		FileInputStream fis=null;
		try
		{
			fis=new FileInputStream(".//REsources//Info.properties");
			Properties p=new Properties();
			p.load(fis);
			
			String username=p.getProperty("username");
			String password=p.getProperty("password");
			
			boolean val=validate(username,password);
			if(val)
				System.out.println("Welcom to java world");
			else
				System.out.println("Invalid user try again");
			
		}
		catch(IOException e)
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

	}

}
