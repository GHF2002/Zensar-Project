package com.exception;

public class DemoAssertion {

	int calAge;
	public int ageCalculater(int birthYear)
	{
		int age=0;
		int currentYear=2022;
		age=currentYear-birthYear;
		calAge=age;
		return age;
	}
	public void votingEligibility()
	{
		System.out.println(calAge);
		assert(calAge>0):"-ve age is calculated";
		if(calAge>18)
		System.out.println("You are eligible for voting");
		else
			System.out.println("Too early to vote");
	}
	public static void main(String[] args)
	{
		int birthYear=Integer.parseInt(args[0]);
		DemoAssertion d1=new DemoAssertion();
		d1.ageCalculater(birthYear);
		d1.votingEligibility();
	}
}