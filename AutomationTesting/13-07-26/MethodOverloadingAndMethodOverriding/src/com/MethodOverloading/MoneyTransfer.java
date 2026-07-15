package com.MethodOverloading;

public class MoneyTransfer {
	public void transfer(double amount) {
		System.out.println("Transferred Amount" + amount);
	}
	
	public void transfer(double amount, String accountNumber) {
		System.out.println("Transferred" + amount + "to Account:" + accountNumber);
	}
	
	public void transfer(double amount, String accountNumber, String remark) {
		System.out.println("Transfered" + amount);
		System.out.println("Account Number:" + accountNumber);
		System.out.println("Remark" + remark);
	}
	
	public static void main(String[] args) {
		MoneyTransfer mt = new MoneyTransfer();
		mt.transfer(1000);
		mt.transfer(5000, "SBIN12346");
		mt.transfer(45452, "1249756255", "Mvfv");
	}

}
