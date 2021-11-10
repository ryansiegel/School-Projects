/*
Name: Ryan Siegel
Date: 09/07/2021
Instructor: Krishna Nandanoor
Class: CIT 149 - Java 1
Purpose of program: Add customer info and excrypt then decrypt their pin and ssn.
*/

import java.util.Scanner;

public class caesarCipher
{
    public static void main (String [] args) 
    {
        // create scanner object
        Scanner console = new Scanner(System.in);
        
        //declare and gather info
        System.out.println("Let's encrypt some customer data!\n"
                        +"Please enter the first name of the customer to get started.");
        String firstName = console.nextLine();
        System.out.println("\nPlease enter the last name of the customer.");
        String lastName = console.nextLine();
        System.out.println("\nPlease enter the customers 5 digit pin number.");
        int pinNum = console.nextInt();
        System.out.println("\nPlease enter the customers last 4 digits of their SSN.");
        short socialNum = console.nextShort();
        System.out.println("\nPlease enter a number between 1 and 99999 for the caesar shift to encrypt the inserted data.");
        int caesarShift = console.nextInt();
        
        //declare and create full name
        String fullName = firstName + " " + lastName;

        //declare and preforms calculations to encrypt
        int encryptPin = pinNum + caesarShift;
        int encryptSocial = socialNum + caesarShift;
        
        //output info
        System.out.println("\n\nCustomer:\t\t"+fullName+"\nPin:\t\t\t"+pinNum
                        +"\nLast 4 of SSN:\t\t"+socialNum+"\nCaesar Shift:\t\t"+caesarShift
                        +"\nEncrypted Pin:\t\t"+encryptPin+"\nEncrypted SSN:\t\t"+encryptSocial);
                        
        //declare and preforms calculations to decrypt
        int decryptPin = encryptPin - caesarShift;
        int decryptSocial = encryptSocial - caesarShift;
        
        //output remaining info
        System.out.print("Decrypted Pin:\t\t"+decryptPin+"\nDecrypted SSN:\t\t"+decryptSocial);
    }
}
