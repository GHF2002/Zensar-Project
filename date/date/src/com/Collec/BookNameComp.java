package com.Collec;

import java.util.Comparator;

public class BookNameComp implements Comparator<Books>
{
	public int compare(Books b1,Books b2)
	{
		return b1.getbName().compareTo(b2.getbName());
	}
}
