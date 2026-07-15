// E-commerce Application
package com.MethodOverloading;

public class SearchProduct {
	public void search(String productName) {
		System.out.println("Searching by Product Name");
	}
	
	public void search(String productName, String brand) {
		System.out.println("Searching by Product and Brand");
	}
	
	public void search(String productName, String brand, int price) {
		System.out.println("Searching by Product, Brand and Price");
	}

	public static void main(String[] args) {
		SearchProduct s = new SearchProduct();
		s.search("Laptop");
		s.search("Laptop", "MackBook Pro");
		s.search("Laptop", "Lenovo", 50000);

	}

}
