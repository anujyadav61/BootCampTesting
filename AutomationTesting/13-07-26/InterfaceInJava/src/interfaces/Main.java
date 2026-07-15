package interfaces;

interface FirstInterface{
	public void myMethod();
}

interface SecondInterface{
	public void myOtherMethod();
}

class DemoClass implements FirstInterface, SecondInterface{
	public void myMethod() {
		System.out.println("Enter Some text..");
	}
	
	public void myOtherMethod() {
		System.out.println("Enter some other text");
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass myobj = new DemoClass();
		myobj.myMethod();
		myobj.myOtherMethod();

	}

}
