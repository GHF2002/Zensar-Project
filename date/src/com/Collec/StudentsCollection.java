package com.Collec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentsCollection {

	public static void main(String[] args) {
		
		//1. Addition
		
		ArrayList a=new ArrayList();
		a.add(new Student(1,"ABC",18));
		a.add(new Student(2,"PQR",23));
		a.add(new Student(3,"ABV",67));
		a.add(new Student(4,"ANR",25));
		
		//2. Searching the object
		
		boolean val=a.contains(new Student(3,"ABV",67));
		System.out.println(val);
		
		if(val)
		{
			//3. removal of the object from the collection
			a.remove(new Student (3,"ABV",67));
		}
		System.out.println(a);
		
		//4. sorting of the collection
		Collections.sort(a);
		
		//5. Iterator over collection
		
		Iterator<Student> i=a.iterator();
		
		while(i.hasNext())
		{
			Student s=i.next();
			System.out.println(s);
			
			if(s.getAge()>60)
				System.out.println("too old to apper");
		}
	}
}
