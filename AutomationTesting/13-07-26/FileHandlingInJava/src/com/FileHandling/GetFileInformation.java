package com.FileHandling;

import java.io.File;

public class GetFileInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myObj = new File("C:\\Files/Anuj1.txt");

		if (myObj.exists()) {
		    System.out.println("File name: " + myObj.getName());
		    System.out.println("Absolute path: " + myObj.getAbsolutePath());
		    System.out.println("Writeable: " + myObj.canWrite());
		    System.out.println("Readable " + myObj.canRead());
		    System.out.println("File size in bytes " + myObj.length());
		} else {
		    System.out.println("The file does not exist.");
		}

	}

}
