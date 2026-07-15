package AbstractionTestDemo;

abstract class Bank {
	public void deposit() {
		System.out.println("Money Deposited");
	}
	
	public void withdraw() {
		System.out.println("Money Withdrawn");
	}
	
	abstract void calculateInterest();
}

class SBI extends Bank{
	void calculateInterest() {
		System.out.println("SBI Interest = 6.5%");
	}
}

class HDFC extends Bank{
	void calculateInterest() {
		System.out.println("HDFC Interest = 7%");
	}
}

public class BankTestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi = new SBI();
		sbi.deposit();
		sbi.withdraw();
		sbi.calculateInterest();
	}

}
