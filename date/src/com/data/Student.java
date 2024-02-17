package com.data;
import com.bean.Date;
public class Student {
	private int rollNo;
	private String name;
	private Date bDate;
	public Student(int rollNo,String name,Date bDate)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.bDate=bDate;
	}
	public void setrollno(int rollNo)
	{
		this.rollNo=rollNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setBdate(Date bDate)
	{
		this.bDate=bDate;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public String getName()
	{
		return name;
	}
	public Date getBdate()
	{
		return bDate;
	}
	public String toString()
	{
		return "Student details are:"+rollNo+"/"+name+"/"+bDate;
	}
}