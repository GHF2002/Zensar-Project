package com.in;

import com.interfaces.TaxCalculater;

public class Employee 
{
     protected int eNo;
     protected String eName;
     protected float eSal;    
     
     
     public Employee(int eNo,String eName,float eSal)
     {
    	 System.out.println("Parents para const");
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
    	 System.out.println("Employee Data is:"+eNo+"/"+eName+"/"+eSal);
     }
}
class Manager extends Employee implements TaxCalculater
{
	protected float inc;
	
	/*public Manager()
	{
		System.out.println("Childs const");
		inc=20000;
	}*/
	public float calTax()
	{
		float tax=0.0f;
		if(eSal>250000)
		{
			System.out.println("you are liable to pay the tax...");
			tax=eSal*10/100;
		}
		else
		{
			System.out.println("No tax applicable");
		}
		return tax;
	}
	public void print()
	{
		System.out.println("Tax on your income is:"+calTax());
	}
	public Manager(int eNo,String eName,float eSal,int inc)
	{
		super(eNo,eName,eSal);
		
		this.inc=inc;
	}
	
	public float calSalary()
	{
		
		float netSal=0.0f;
		netSal=(eSal+inc)*12f;
		System.out.println("gross sal is:"+super.calSalary());
		return netSal;
	}
	 public void printDetails()
	{
		super.printDetails();
		System.out.println("Managers Data is:"+inc);
	}
	 public void test()
	 {
		 System.out.println("testing manager class");
	 }
	public static void main(String args[])
	{
		Employee e1=new Employee(1002, "PQR", 80000.0f);
		e1.calSalary();
		e1.printDetails();
		
		e1=new Manager(1001,"Abc",90000.0f,30000);
		e1.calSalary();
		e1.printDetails();
		((Manager) e1).test();  
		//downcasting
		((TaxCalculater) e1).print();
		
	}
	
}





