package basicprograms;

public class FibonacciPalindrome {

    public static void main(String[] args) {

        // Fibonacci Series
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= 10; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

        }

        System.out.println();

        // Palindrome Number
        int number = 121;
        int temp = number;
        int reverse = 0;

        while (number > 0) {

            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;

        }

        if (temp == reverse) {
            System.out.println(temp + " is a Palindrome.");
        } else {
            System.out.println(temp + " is not a Palindrome.");
        }

    }
}