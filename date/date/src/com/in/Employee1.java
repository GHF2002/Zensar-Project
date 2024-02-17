package com.in;

public class Employee1
{
	protected int eNo;
	protected String eName;
	protected float eSal;
	
	public Employee1 (int eNo,String eName,float eSal)
	{
		System.out.println("Parent parametrized constructor....");
		this.eNo=eNo;
		this.eName=eName;
		this.eSal=eSal;
	}
	
	public float calSalary()
	{
		return eSal*12f;
	}
	
	public void printDetails()
	{
		System.out.println("Employee Data is :"+eNo+"/"+eName+"/"+eSal);
	}

}

class Manager1 extends Employee1
{
	protected float inc;
	
	public Manager1 (int eNo,String eName, float eSal,float inc)
	{
		super(eNo,eName,eSal);//called para const of parent
		System.out.println("child parametrized constructor....");
		this.inc=inc;
	}
	
	public float calSalary()
	{
		float netSal=0.0f;
		netSal=(eSal+inc)*12f;
		System.out.println("Gross Salary is :"+super.calSalary());
		return netSal;
	}
	
	public void printDetails() 
	{
		super.printDetails();
		System.out.println("Manager data is :"+eNo+"/"+eName+"/"+eSal+"/"+inc);
	}
	
}
class areaSalesManager extends Manager1{
	
	protected float pInc;
	protected float fInc;
	protected float mInc;
	
	public areaSalesManager(int eNo,String eName, float eSal,float inc,float pInc,float fInc,float mInc)
	{
		super(eNo,eName,eSal,inc);//called para const of parent
		System.out.println("child parametrized constructor....");
		this.pInc=pInc;
		this.fInc=fInc;
		this.mInc=mInc;
	}
	
	public float calSalary()
	{
		float netSal=0.0f;
		netSal=(eSal+inc+pInc+fInc+mInc)*12f;
		System.out.println("Gross Salary is :"+super.calSalary());
		return netSal;
	}
	
	public void printDetails() 
	{
		super.printDetails();
		System.out.println("areaSalesManager data is :"+eNo+"/"+eName+"/"+eSal+"/"+inc+"/"+pInc+"/"+fInc+"/"+mInc);
	}
	
	public static void main(String args[])
	{
		areaSalesManager m1=new areaSalesManager(1001,"ABC",90000.0f,30000,3400.0f,1223.0f,123.67f);
		m1.calSalary();
		m1.printDetails();
		
	}
}