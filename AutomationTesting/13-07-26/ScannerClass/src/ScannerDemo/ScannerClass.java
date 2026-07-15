package ScannerDemo;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your first name initial: ");
        String firstInitial = keyboard.nextLine();

        System.out.print("Please enter your last name: ");
        String lastName = keyboard.nextLine();

        System.out.print("Please enter your house number: ");
        int houseNumber = keyboard.nextInt();

        keyboard.nextLine(); 

        System.out.print("Please enter your street name: ");
        String streetName = keyboard.nextLine();

        System.out.print("Please enter your street type: ");
        String streetType = keyboard.nextLine();

        System.out.print("Please enter your city: ");
        String city = keyboard.nextLine();

        System.out.println("\n----- Address Details -----");
        System.out.println(firstInitial + " " + lastName);
        System.out.println(houseNumber + " " + streetName + " " + streetType);
        System.out.println(city);

        keyboard.close();
    }
}