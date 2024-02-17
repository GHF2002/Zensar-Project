package com.misc;

public class OuterClass {
	
	private int oVal = 300;
	
	public void oprint()
	{
		System.out.println("Outer Class Data "+oVal);
		
		InnerClass i1 = new InnerClass();
		
		System.out.println("Accessing  Data of Outer Class  ..."+i1.iVal);
	}
	
//Simple Innner Class
	
	class InnerClass
	{
		private int iVal =100;
		
		public void iprint()
		{
			System.out.println("Inner Class Data ..."+iVal);
			System.out.println("Accessing  Data of Outer Class  ..."+oVal); //Private data of inner Class

		}
	}

//Static Inner Class
	
	static class staticinnerclass
	{
		private static String name ="JAVA";
		
		public static void print()
		{
			System.out.println("Static Inner Class Data"+name);

		}
	}
	
	
// Method local Inner Class 
	public void aMethod()
	{
		int i=1000;
		System.out.println("Method Data ...."+i);
		
		class MethodInnerClass
		{
			int j=500;
				public void display()
				{
					System.out.println("Method Local class Data ...."+j);
				}
		}
		
		MethodInnerClass m1 = new MethodInnerClass();
		m1.display();
		
		
	}
	
	
	
	public static void main(String[] args)
	{
		

		OuterClass o1 = new OuterClass();
		o1.oprint();

// Simple Inner Class Object
		
		InnerClass I1 =o1.new InnerClass();
		I1.iprint();
		
// Static inner class Object
		
		OuterClass.staticinnerclass s1 = new OuterClass.staticinnerclass();
		s1.print();
			
	}

}

//
//class Test   // We Can Not Access Outside the class
//{
//	public static void main(String[] args)
//	{
//		
//
//		OuterClass o1 = new OuterClass();
//		o1.oprint();
//
//// Simple Inner Class Object
//		
//		InnerClass I1 =o1.new InnerClass();
//		I1.iprint();
//		
//// Static inner class Object
//		
//		OuterClass.staticinnerclass s1 = new OuterClass.staticinnerclass();
//		s1.print();
//			
//	}
//
//
//}
