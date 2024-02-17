package com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ConsoleToConsole {

	public static void main(String[] args) {
		
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		
		try
		{
			bis=new BufferedInputStream(new FileInputStream(".//Resources//Data.txt"));
			bos=new BufferedOutputStream(System.out);
			
			int i=0;
			while((i=bis.read())!=-1)
			{
				bos.write(i);
				bos.flush();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bis.close();
				bos.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
