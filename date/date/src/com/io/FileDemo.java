package com.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		try
		{
			File f=new File(".//Resources//Data.txt");
			f.createNewFile();		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
		
	

}
