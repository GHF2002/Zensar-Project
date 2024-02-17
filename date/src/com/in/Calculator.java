package com.in;

public class Calculator implements Operations
{

	private float a;
	private float b;
	
	public Calculator(float a,float b)
	{
		this.a=a;
		this.b=b;
		
	}
	public float add()
	{
		return a+b;
	}
	public float sub()
	{
		float c=a-b;
		assert(c>0); //allow next if the c is greater then 0
		return c;
	}
	
	public float multiply()
	{
		return a*b;
	}
	
	public float divide()
	{
		assert(b>0);
		return a/b;
	}
	public float calArea()
	{
		return a*b;
	}
	
	public void print()
	{
		System.out.println("Addition is : "+add());
		System.out.println("Substraction is : "+sub());
		System.out.println("multiplication is : "+multiply());
		System.out.println("division is : "+divide());
		System.out.println("area is : "+calArea());
		//System.out.println("");
	}
	
	public static void main(String[] args) {
		
		Calculator o=new Calculator(20.0f,0.0f);
		o.print();

	}                     // class circle is remain
	@Override
	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int subtract(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float divide(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

}