package com.io;

import java.io.File;

public class FileNotEditable {

	public static void main(String[] args) {
		File f=new File(".//Resources//PersonalDetails.txt");
		f.setReadOnly();
		if(f.canWrite())
		{
			System.out.println("Editable");
		}
		else
		{
			System.out.println("Not Editable");
		}

	}

}
