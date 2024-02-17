package com.in;

public class DemoFinal 
{
	private final int i=900;
	
	public DemoFinal()
	{
		int i=900;
	}
   public static void main()
   {
	   
   }
}
final class A
{
	public final void aMethod()
	{
		System.out.println("some impl");
	}
}
class B //extends A
{
	public void aMethod()
	{
		System.out.println("B impl");
		A a1=new A();
		a1.aMethod();
	}

}
