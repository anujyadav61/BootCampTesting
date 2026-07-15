package Constructor;

public class ConstructrsUsingInstanceVariable {

    String webName;
    int webAge;

    // Parameterized Constructor
    ConstructrsUsingInstanceVariable(String name, int age) {
        this.webName = name;
        this.webAge = age;
    }

    public static void main(String[] args) {

        ConstructrsUsingInstanceVariable obj1 =
                new ConstructrsUsingInstanceVariable("Raghavendra", 47);

        ConstructrsUsingInstanceVariable obj2 =
                new ConstructrsUsingInstanceVariable("https://www.google.com/", 18);

        System.out.println(obj1.webName + " " + obj1.webAge);
        System.out.println(obj2.webName + " " + obj2.webAge);
    }
}