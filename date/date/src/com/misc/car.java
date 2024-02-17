package com.misc;

abstract public class car {
	
	public abstract void drive();
		
}

class Services
{
	public static void main(String[] args) {
	
	car c1 = new car()
	{
		public void drive()
		{
			System.out.println("BMW With 200 Speed");
		}
	};
	
	c1.drive();
}

}


interface Work
{
		void service();
}

class Automobile
{
public static void main(String[] args) {
	
	Work c1 = new Work()
	{
		public void service()
		{
			System.out.println("Oil Checked");
		}
	};
	
	c1.service();
}

}