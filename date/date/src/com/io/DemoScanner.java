package com.io;

import java.util.Scanner;

public class DemoScanner 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your name:");
		
		String name=sc.next();
		
		System.out.println("Please enter your ID:");
		int no=sc.nextInt();
		
		System.out.println("Please enter your salary:");
		float sal=sc.nextFloat();
		
		System.out.println("Your details are......."+name+"/"+no+"/"+sal);

	}

}
