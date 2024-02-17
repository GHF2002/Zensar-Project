package com.misc;

public class String_operation_Assig {

	public static void main(String[] args) {
	
// Problem 1: Convert String into Lower Case
		
		String S1 = new String("JAVA IS OBJECT BASED TECHNOLOGY");

		System.out.println(S1);
		System.out.println(S1.hashCode());
		S1=S1.toLowerCase();
		System.out.println(S1);
		System.out.println(S1.hashCode());

// Problem 2: Find String Length
		
		System.out.println("Length of String => "+S1.length());
		

// Problem 3:Replace Every 'o' to A and 'A' to 'P'
		
		String r1 = S1.replace('o','a');
		System.out.println("Replace String 'o' to 'A' => "+r1);
		
		String r2 = S1.replace('a','p');
		System.out.println("Replace String 'a' to 'p' => "+r2);
		
// Problem 4: Seperates Every Word form String
		
		String[] arr = S1.split(" ");    
		for ( String aa : arr) {
		    System.out.println(aa);
		}

// Problem 5: Covert String to Charactor Array
		
		for(int i=0; i<S1.length(); i++)
		{
			char c = S1.charAt(i);
			
			System.out.println("Covert String to Charactor Array => "+c);
		}

// Problem 6: Remove All Spaces from String	
				
		System.out.println(S1.replaceAll("\\s", ""));
		
		
	}

}
