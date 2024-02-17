package com.Collec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class BookCollection {

	public static void main(String[] args)
	{
		//1. Addition
		ArrayList<Books> a1=new ArrayList<>();
		a1.add(new Books(100,"ABC","Asmita",200.0f));
		a1.add(new Books(101,"PQR","Akanksha",300.0f));
		a1.add(new Books(102,"XYZ","Ashwini",450.0f));
	
	Iterator <Books> i=a1.iterator();
	while(i.hasNext())
	{
		Books b=i.next();
		if(b.getAuthor()=="Chetan Bhagat")
		{
			System.out.println(b);
		}
		if(b.getbPrice()>500)
		{
			float p=b.getbPrice()/100*30;
			float p1=b.getbPrice()-p;
			b.setbPrice(p1);
			System.out.println("New price:"+b.getbPrice());
		}
	}
}
}

