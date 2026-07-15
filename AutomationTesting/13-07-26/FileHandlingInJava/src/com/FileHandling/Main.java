package com.FileHandling;

import java.io.IOException;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File myObj = new File("C:\\Files/Anuj1.txt");
			
			if(myObj.createNewFile()) {
				System.out.println("File Created:" + myObj.getName());
				System.out.println("Absolute path:" + myObj.getAbsolutePath());
			}
			else {
				System.out.println("File already exists");
			}
		}
		catch(IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		
	}

}
