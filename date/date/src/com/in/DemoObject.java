package com.in;

public class DemoObject 
{
    private int i;
    
    public DemoObject(int i)
    {
    	this.i=i;
    }
    public String toString()
    {
    	return "Objects content is:"+i;
    }
    public boolean equals(Object obj)
    {
    	DemoObject d=(DemoObject)obj;
    	if(i==d.i)
    		return true;
    	else
    		return false;
    }
    public int hashCode()
    {
    	return 1000*i;
    }
    public void finalize()
    {
    	System.out.println("Garbage collecter called on....."+i);
    }
	public static void main(String[] args)
	{
		DemoObject d1=new DemoObject(2000);
		DemoObject d2=new DemoObject(3000);
		DemoObject d3=new DemoObject(8000);
		DemoObject d4=new DemoObject(6000);
		
		d1=d2=d3=d4=null;
		
		System.gc();
		
		

	}

}
