package com.Collec;

import java.util.Comparator;

public class PriceComp implements Comparator<Books>
{

	public int compare(Books b1,Books b2)    
	{                                            
		int val=0;                               
		if(b1.getbPrice()==b2.getbPrice())             
			val=0;                               
		if(b1.getbPrice()>b2.getbPrice())              
			val=-1;                              
		else                                     
			val=1;                               
		return val;                              
	}
}
