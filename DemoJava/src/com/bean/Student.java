package com.bean;

public class Student {
	private int rollNo;
	private String name;
	private int m1,m2,m3;
	
	//a method to set the data
	
	/*	public void setData(int rn,String sname,int mr1,int mr2,int mr3)
		{
			rollNo=rn;
			name = sname;
			m1=mr1;
			m2=mr2;
			m3=mr3;
					
		}
	*/	
	
	
		public void setrolno(int rn)
		{
			rollNo=rn;
		}
		public void setname(String sname)
		{
			name=sname;
		}
		public void setm1(int mr1)
		{
			m1=mr1;
		}
		public void setm2(int mr2)
		{
			m2=mr2;
		}
		public void setm3(int mr3)
		{
			m3=mr3;
		}
		
		public int getrollno()
		{
			return rollNo;
		}
		
		public String getname()
		{
			return name;
		}
		public int getm1()
		{
			return m1;
		}
		public int getm2()
		{
			return m2;
		}
		public int getm3()
		{
			return m3;
		}
		//method to display data
		
		public void display()
		{
			System.out.println("student data : \n"+rollNo+"  "+name+"  "+m1+"  "+m2+"  "+m3
								);
		}
		
		public float average()
		{
			float avg;
			
			avg=(m1+m2+m3)/3;
			
			
			return avg;
		}
		public void grade(float a1)
		{
			float a=a1;
			if(a>=40 && a<=60)
			{
				System.out.println("Grade= C");
				
			}
			if(a>60 && a<=80)
			{
				System.out.println("Grade= B");
				
			}
			if(a>80)
			{
				System.out.println("Grade= A");
				
			}
			if(a<40)
			{
				System.out.println("Fail");
			}
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		
		
		s1.setrolno(77);
		s1.setname("Asmita");
		s1.setm1(80);
		s1.setm2(90);
		s1.setm3(85);
		s1.display();
		
		float avg1=s1.average();
		
		System.out.println("Average is "+avg1);
		s1.grade(avg1);
		
		System.out.println(s1.getrollno());
		System.out.println(s1.getname());
		System.out.println(s1.getm1());
		System.out.println(s1.getm2());
		System.out.println(s1.getm3());
		
	}

}

