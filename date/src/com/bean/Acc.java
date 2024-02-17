package com.bean;

public class Acc {

		// instance variable
		
		private int accno;
		private String acctype;
		private float accbal;
		private static int series=1000;
		//a method to set the data
	/*
		public void setData(int accno,String name,float bal)
		{
			this.accno=accno;              //shadowing effect same variable----solution ---- 'this'
			acctype= name;
			accbal=bal;
		
					
		}
	*/
		//setter methods
		public void setaccno(int an)
		{
			accno=an;
		}
		
		public void setacctype(String type)
		{
			acctype=type;
		}
		public void setaccbal(float bal)
		{
			accbal=bal;
		}
		
		//getter method /accessor method
		
		public int getaccno()
		{
			return accno;
		}
		public String getacctype()
		{
			return acctype;
		}
		public float getaccbal()
		{
			return accbal;
		}
		//method to display data/ facilitetor method
		
		public void display()
		{
			System.out.println("account data is : "+accno+"/"+acctype+"/"+accbal);
		}
		
		//business logic
		public float bonusCalculation()
		{
			float bonus=500.0f;
			if(accbal>50000.0f)
			{
				bonus=accbal+bonus;
				
			}
			else
			{
				System.out.println("not eligible for bonus");
			
			}
			return bonus;
		}
		
		//constructor
		
		public Acc()
		{
			System.out.println("In default constructor");
			accno=1001;
			acctype="Demat";
			accbal=80000.0f;
		}
		public Acc(int no,String type,float bal)
		{
			System.out.println("In parameterised constructor");
			accno=no;
			acctype=type;
			accbal=bal;
			
		}
		
	  /*	public void ckeck()
		{
			if(2022-getyyyy()>5)
			{
				System.out.println(acc1.accbal+5000);
			}
		
		}
	   */
		
		//to print the content of object
		public String toString()
		{
			return "Account data is :"+accno+"/"+"/"+acctype+"/"+accbal;
		}
		
		public static void main(String[] args) {
			
			
		/*	
			Demo1 acc=new Demo1();
			
			acc.setaccno(10001);
			acc.setacctype("saving");
			acc.setaccbal(90000.0f);
			
			acc.display();
			
			System.out.println(acc.getaccno());
			System.out.println(acc.getacctype());
			System.out.println(acc.getaccbal());
			
			System.out.println("Bonus: ");
			
			System.out.println(acc.bonusCalculation());
			float val=acc.bonusCalculation();
			System.out.println(val);
		*/
			
			
			//1. initialize the data with value
			Acc ac=new Acc();
			ac.display();
			Acc ac1=new Acc(10001,"saving",70000.0f);
			ac1.display();
			
			System.out.println(ac1);
			
			Date d1=new Date(8,2,2003);
			
		//	dl.check();
			System.out.println(d1.getYear());
			
			
			
			
		}

	}

