package com.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerialization
{

	public static void main(String[] args)
	{
		FileOutputStream fis=null;
		ObjectOutputStream oo=null;
		try
		{
			fis=new FileOutputStream(".//Resources//Serial.txt");
			oo=new ObjectOutputStream(fis);
			oo.writeObject(new Employee(2020,"Asmita",45000.0f));
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
				oo.close();		
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
