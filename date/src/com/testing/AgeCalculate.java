package com.testing;

import java.util.Scanner;

public class AgeCalculate {

int age;	
	public int calAge(int birthYear)
	{
		int currentYear=2022;
		age=currentYear-birthYear;
		return age;
	}
	
	public void vottingEligibility()
	{
		if(age>18)
		{
			System.out.println("Eligibal for Votting");
		}
		else
		{
			System.out.println("Not Eligibal for Votting");			
		}
	}
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please Enter the BirthYear => ");
		
		int bYear = sc.nextInt();
	
		
	}

}
