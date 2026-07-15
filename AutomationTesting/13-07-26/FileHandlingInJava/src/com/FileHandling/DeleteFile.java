package com.FileHandling;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {

        try {

            File myObj = new File("C:\\Files\\Anuj1.txt");

            if (myObj.delete()) {
                System.out.println("Deleted the file: " + myObj.getName());
            } else {
                System.out.println("Failed to delete the file or file does not exist.");
            }

        } 
        catch (Exception e) {

            System.out.println("An error occurred while deleting the file.");
            System.out.println("Error: " + e.getMessage());

        }

    }

}