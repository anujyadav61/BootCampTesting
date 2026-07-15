package Constructor;

public class C_01_Constructor {

    // Constructor
    public C_01_Constructor() {
        System.out.println("This is a constructor block");
    }

    // Method
    public void method() {
        System.out.println("This is the method block");
    }

    // Main Method
    public static void main(String[] args) {

        C_01_Constructor obj = new C_01_Constructor();
        obj.method();

    }
}