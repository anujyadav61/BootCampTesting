package basicprograms;

public class LargestTwoNumbers {

    public static void main(String[] args) {

        int num1 = 45;
        int num2 = 67;

        if (num1 > num2) {
            System.out.println(num1 + " is Larger.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is Larger.");
        } else {
            System.out.println("Both numbers are Equal.");
        }

    }
}