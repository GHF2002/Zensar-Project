package com.gen;

public class DemoGenClass<T> {
	
	private T obj;
	
	public DemoGenClass(T obj)
	{
		this.obj=obj;
	}
	public T getData()
	{
		return obj;
	}
	public static void main(String[] args)
	{
		DemoGenClass<Integer> d1=new DemoGenClass<Integer>(1000);
		int i=d1.getData();
		System.out.println(i);
		
		DemoGenClass<Float> d2=new DemoGenClass<Float>(1020.0f);
		Float j=d2.getData();
		System.out.println(j);
		
		DemoGenClass<String> d3=new DemoGenClass<String>("Java");
		String s=d3.getData();	
		System.out.println(s);
		
	}

}
