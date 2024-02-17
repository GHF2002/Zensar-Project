package com.misc;

import com.bean.Date;

public class Demo {

		public static void main(String[] args)
		{
			
			Date d1=new Date(1,2,2007);
			Date d2=new Date(2,3,2007);
			
			System.out.println(d1);
			System.out.println(d2);
			
			String s1="Java";
			String s2="Java";
			
			if(s1==s2)
				System.out.println("Same Memory");
			else
				System.out.println("Different Memory");
			if(s1.equals(s2))
				System.out.println("Same Contents");
			else
				System.out.println("Different Contents");
			
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			
			//Immutability
			
			s1=s1.concat("Rocks");
			System.out.println(s1);
			System.out.println(s1.hashCode());
			s1=s1.toUpperCase();
			System.out.println(s1);
			System.out.println(s1.hashCode());
			
			StringBuffer sb1=new StringBuffer("Java");
			StringBuffer sb2=new StringBuffer("Java");
			
			if(sb1==sb2)
				System.out.println("Same reff");
			else
				System.out.println("Diff reff");
			
			if(sb1.equals(sb2))
				System.out.println("Same Contents");
			else
				System.out.println("Diff Contents");
			System.out.println(sb1.hashCode());
			sb1=sb1.append("Rocks");
			System.out.println(sb1.hashCode());
			
			//Comparing content of string Buffer Object
			
			int cs=sb1.compareTo(sb2);
			
			if(cs==0)
			{
				System.out.println("Same Content");
			}
			else
			{
				System.out.println("Diff Content");
			}
		}
}
