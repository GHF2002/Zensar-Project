package com.gen;

public class DemoMultiPara<T,W> {
	
	private T obj;
	private W obj1;
	
	public DemoMultiPara(T obj,W obj1)
	{
		this.obj=obj;
		this.obj1=obj1;
	}
	
	public void getData()
	{
		System.out.println(obj);
		System.out.println(obj1);
	}
	
	public static void main(String[] args)
	{
		DemoMultiPara<Integer,Float> d1=new DemoMultiPara<Integer,Float>(1000,45.0f);
		d1.getData();
		
		DemoMultiPara<Float,String> d2=new DemoMultiPara<Float,String>(1020.0f,"Java");
		d2.getData();
		
		
	}
}
