package com.exception;

public class DemoExc {

	public static void main(String[] args)
	{
		try
		{
			int no=Integer.parseInt(args[0]);
			no=10/no;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();		
		}	
		catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		
		catch(Exception e) {
			
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally is executing");

		}
		System.out.println("Rest of the code");

	}
}