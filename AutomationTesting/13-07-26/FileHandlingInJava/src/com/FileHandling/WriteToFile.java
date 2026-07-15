package com.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) {

        try {
            FileWriter myWriter = new FileWriter("C:\\Files/Anuj1.txt");

            myWriter.write("Hello Anuj!\n");
            myWriter.write("Welcome to Java File Handling.\n");
            myWriter.write("This file is created using FileWriter.");

            myWriter.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}