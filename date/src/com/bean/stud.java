package com.bean;

public class stud {
	private int rollNo;
	private String name;
	private Date bDate;
	private static int series=1000;
	public stud(int rollNo,String name,Date bDate)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.bDate=bDate;
	}
	public void print()
	{
		System.out.println("Student bdate is "+bDate.getDate()+"/"+bDate.getMonth()+"/"+bDate.getYear());
		System.out.println(bDate);
	}
	public int calAge()
	{
		int cyear=2022;
		return cyear-bDate.getYear();
	}
	public String votingEligibility()
	{
		if(calAge()>1)
			return "Eligible";
		else
			return "Not Eligible";
	}
	public static void main(String[] args)
	{
		stud s=new stud(101,"sai",new Date(21,2,2000));
		s.print();
		s.calAge();
		s.votingEligibility();
	}
}