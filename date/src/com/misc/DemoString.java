package com.misc;

public class DemoString {

	public static void main(String[] args) {
		
		String s1 = "JAVA";
		String s2 = "JAVA";

		if(s1==s2)
			System.out.println("Same Memory");
		else
			System.out.println("Diffrent Memory");
		
		if(s1.equals(s2))
			System.out.println("Same Memory");
		else
			System.out.println("Diffrent Memory");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println("******************************************************");
		
//Immutability
		
		s1=s1.concat("Rocks");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		s1=s1.toUpperCase();
		System.out.println(s1.hashCode());
		
		
		StringBuffer sb1 = new StringBuffer("Java");
		StringBuffer sb2 = new StringBuffer("Java");
		
		if(sb1==sb2)
			System.out.println("Same Refernce");
		else
			System.out.println("Diffrent Refernce");
		
		if(sb1.equals(sb2))
			System.out.println("Same Refernce");
		else
			System.out.println("Diffrent Refernce");
		
		
		System.out.println(s1.hashCode());
		sb1=sb1.append("Rocks");
		
		System.out.println("******************************************************");
		
		String ss1 = new String("Techno");
		String ss2 = new String("Techno");
		
		if(ss1==ss2)
			System.out.println("Same Refernce");
		else
			System.out.println("Diffrent Refernce");
		
		if(ss1.equals(ss2))
			System.out.println("Same Refernce");
		else
			System.out.println("Diffrent Refernce");
		
		
//CampareTo Value in String Buffer
		
		int x = sb1.compareTo(sb2);
		
		if(x==0)
			System.out.println("Same");
		else
			System.out.println("Diffrent");
		
	}

}
