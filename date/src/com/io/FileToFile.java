package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileToFile {

	public static void main(String[] args) {
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try
		{
			fis=new FileInputStream(".//Resources//Data.txt");
			fos=new FileOutputStream(".//Resources//Backup.txt");
			
			int i=0;
			while((i=fis.read())!=-1)
			{
				fos.write(i);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{

	    }
	}
}
