package Constructor;

public class C_02_COoveloadingArgumentType {
	public C_02_COoveloadingArgumentType(int a, int b) {
		int c = a+b;
		System.out.println("Summation is " +c);
	}
	
	public C_02_COoveloadingArgumentType(double a, double b) {
		double c = a+b;
		System.out.println("Summation is "+ c);
	}
	public void display() {
		System.out.println("Constructor overloading is working successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C_02_COoveloadingArgumentType obj1 = new C_02_COoveloadingArgumentType(10,20);
		obj1.display();
		C_02_COoveloadingArgumentType obj2 = new C_02_COoveloadingArgumentType(20.55,20.51);
		obj2.display();
	}

}
