package com.AccessModifiers.Examples;

public class Public extends B{

	public static void main(String[] args) {
		Public obj = new Public();
		int output = obj.x;
		System.out.println("Value of x is :" +output);
		obj.b1();
	}

} 
