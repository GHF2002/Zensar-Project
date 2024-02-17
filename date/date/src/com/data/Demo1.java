package com.data;



public class Demo1 {

		
		protected static int val;
		//class variable global variable
		protected int valO=900;
		
		static
		{
			System.out.println("static block is called");
			val=8999;
		}
		
		public static void aMethod()
		{
			System.out.println("static method with data "+val);
			//System.out.println(valO);
		}
		
		public void objectMethod()
		{
			System.out.println("object method "+valO);
			System.out.println(val);
		}
	}

	class Test
	{
		
		public static void main(String[] args) {
			System.out.println("main method.....");
			System.out.println("Data is : "+Demo1.val);
			Demo1.aMethod();

		}

	}