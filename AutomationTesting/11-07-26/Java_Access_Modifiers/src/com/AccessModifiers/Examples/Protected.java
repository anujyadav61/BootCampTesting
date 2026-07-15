package com.AccessModifiers.Examples;

public class Protected extends B{
	

	public static void main(String[] args) {
		Protected obj = new Protected();
		int output = obj.z();
		System.out.println("Value of z is :" + output);
		obj.ProtectedMethod();
	}

}
