package com.misc;
import com.bean.Account;

import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


public class DemoReflection {

	public static void main(String[] args) {
		
		try
		{
			Class c = Class.forName("com.bean.Account");

			Field f[] = c.getFields();
			
			for(int i=0; i<f.length; i++)
			{
				System.out.println("Variable of the Class Are ........"+f[i]);
			}
			
			Constructor cc[] = c.getConstructors();
			
			for(int i=0; i<cc.length; i++)
			{
				System.out.println("Constructors of the Class Are ........"+cc[i]);
			}
			
			Method m[] = c.getMethods();
			
			for(int i=0; i<m.length; i++)
			{
				System.out.println("Method of the Class Are ........"+m[i]);
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
