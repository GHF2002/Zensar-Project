package com.in;

public abstract class Shape 
{
    protected String name;
    
    public Shape(String name)
    {
    	this.name=name;
    }
    public abstract  float calArea();
    
    public void print()
    {
    	System.out.println("Shape is:"+name);
    }
    
}
class Circle extends Shape
{
	protected float rad;
	
	public Circle(String name,float rad)
	{
		super(name);
		this.rad=rad;
	}
	public float calArea()
	{
		return 3.14f*rad*rad;
	}
}
class Square extends Shape
{
	protected float side;
	
	public Square(String name,float side)
	{
		super(name);
		this.side=side;
	}
	public float calArea()
	{
	//	System.out.println(super.calArea());
		return side*side;
	}
}
class Test
{
   public static void main(String args[])
   {
	   Circle c=new Circle("circle",3.5f);
	   c.print();	   
	   System.out.println(c.calArea());
	   
	   Square s=new Square("Square", 6.7f);
	   s.print();
	   System.out.println(s.calArea());
	   
	  /* Shape s1=new Shape("General term");
	   System.out.println(s1.calArea());*/
	   
	   Shape b=new Circle("circle",3.5f);
	   b.calArea();
	   
	   b=new Square("Square", 6.7f);
	   b.calArea();
	   
   }
}










