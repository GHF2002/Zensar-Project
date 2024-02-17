package com.serial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) 
	{
		FileInputStream fis=null;
		ObjectInputStream oo=null;
		try
		{
			fis=new FileInputStream(".//Resources//Serial.txt");
			oo=new ObjectInputStream(fis);
			Employee e=(Employee)oo.readObject();
			System.out.println(e);
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

	}

}
