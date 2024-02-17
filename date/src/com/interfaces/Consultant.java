package com.interfaces;

public class Consultant implements TaxCalculater
{
    private String cName;
    private float commertials;
    
    public Consultant(String cName,float commertials)
    {
    	this.cName=cName;
    	this.commertials=commertials;
    			
    }
    public float calTax()
    {
    	float tax=0.0f;
    	if(commertials>500000.0f)
    	{
    		System.out.println("Your income is taxable....");
    		tax=commertials*20/100;
    		
    	}
    	else
    	{
    		System.out.println("No need to pay Tax");
    	}
    	return tax;
    }
    public void print()
    {
    	System.out.println("Tax on your income is...."+calTax());
    }
	public static void main(String[] args) 
	{
		TaxCalculater c1=new Consultant("Abc", 800000.0f);
		c1.print();

	}

}
