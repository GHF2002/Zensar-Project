package com.bean;

public class Date {
private int dd;
private int mm;
private int yy;
public boolean check;


public void setDate(int dd)
{
	this.dd=dd;
}
public void setMonth(int mm) 
{
	this.mm=mm;
}
public void setYear(int yy)
{
	this.yy=yy;
}
public int getDate()
{
	return dd;
}
public int getMonth()
{
	return mm;

}
public int getYear()
{
    return yy;	
}
public Date()
{
	dd=12;
	mm=05;
	yy=2007;
}
public Date(int dd,int mm,int yy)
{
	this.dd=dd;
	this.mm=mm;
	this.yy=yy;
}
public String toString()
{
	return "Date is "+dd+"/"+mm+"/"+yy;
	
}
public boolean validateDate()
{
	if(mm==2 && yy%4 ==0 &&dd>29)
	{
		check=false;
	}
	else if(mm==2 && yy%4!=0 && dd>2)
	{
		check=false;
	}
	else if((mm>0 && mm<=7 && mm%2==0 && mm%2!=0)&& dd>30)
	{
		check=false;
	}
	else if((mm>0 && mm<=7 && mm%2!=0 && mm!=2)&& dd>31)
	{
		check=false;
	}
	else if((mm>7 && mm<=12 && mm%2==0 && mm%2==0)&& dd>31)
	{
		check=false;
	}
	else if((mm>7 && mm<=12 && mm%2!=0)&& dd>30)
	{
		check=false;
	}
	else if(yy>2022 || mm>12)
	{
		check=false;
	}
	else
	{
		check=true;
	}
	return check;
}
public void display()
{
	if (check==true)
	{
		System.out.println("Data is validate");
	}
	else
	{
		System.out.println("Data is invalid");
		
	}
}
public static void main(String[] args)
{
	Date d1=new Date();
	System.out.println(d1);
	d1.validateDate();
	d1.display();
	System.out.println("\n\n");


	Date d2=new Date(21,4,2022);
	System.out.println(d2);
	d2.validateDate();
	d2.display();

	
}
}