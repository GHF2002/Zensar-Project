package com.testing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class TestAge {

	AgeCalculate a;
	
	@BeforeClass
	public static void resourceBuilding()
	{
		System.out.println("DBConnection");
		System.out.println("@BeforeClass");
	}
	
	@Before
	public void createObject()
	{
		a = new AgeCalculate();
		System.out.println("@Before");
	}
	 
	
	public void testCalAge() 
	{
		int age = a.calAge(1984);
		assertNotEquals(age,0);
		System.out.println("@Test");
	}

	private void assertNotEquals(int age, int i) {
		// TODO Auto-generated method stub
		
	}

	@After
	public void releaseObject()
	{
		a = null;
		System.out.println("@After");
	}
	
	@AfterClass
	public static void releaseResource()
	{
		System.out.println("Release Resources");
		System.out.println("@AfterClass");
	}
}
