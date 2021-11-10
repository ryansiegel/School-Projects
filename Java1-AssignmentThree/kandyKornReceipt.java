/*
Name: Ryan Siegel
Date: 09/14/2021
Instructor: Krishna Nandanoor
Class: CIT 149 - Java 1
Purpose of program: Generate a receipt for the customer buying from Kandy's Korn.
*/

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class kandyKornReceipt
{
    public static void main (String [] args) 
    {
        //create objects
        Scanner console = new Scanner(System.in);
        Random generator = new Random();
        
        //declare constants
        final int POPCORN_PRICE_PENNIES = 450;
        final int SODA_PRICE_PENNIES = 100;
        final double pennyToDollar = 100;
        final String POPCORN = "POPCORN";
        final char NUM_SIGN = 35;
        final char HYPHEN = 45;
        
 
        /*
         * Gather information and declare it
         */
        System.out.println("Hello and welcome to the receipt generator for Kandy's Korn.\n"
                + "Please enter the requested information asked below to generate a recipt for the customer.");
        System.out.print("\nIn the format mmddyyyy, where m is for the month, d is for the day, and y is for the year,\n"
                + "please enter todays date as a number (example: 08142022): ");
        String todaysDate = console.nextLine();
        System.out.print("Please enter the customers first name: ");
        String customerFirstName = console.nextLine();
        System.out.print("Please enter the customers last name: ");
        String customerLastName = console.nextLine();
        System.out.print("Please enter the number of bags of popcorn the customer bought: ");
        int numOfPopcornsBought = console.nextInt();
        System.out.print("Please enter the number of soft drinks the customer bought: ");
        int numOfSodaBought = console.nextInt();
        //clear input buffer
        console.nextLine();
        System.out.print("Please enter your street vendor ID: ");
        //make street vendor id uppercase in the event user does not
        String streetVendorId = console.nextLine().toUpperCase();
        
        
        /*
         * Generate info and do calculations
         */
        //make last name all uppercase
        String customerLastUpper = customerLastName.toUpperCase();
        //generate first inital of first name and makes sure it is uppercase
        String customerFirstInit = customerFirstName.substring(0,1).toUpperCase();
        //generate random 4 digit number between 1000 and 4999
        int randomGeneratedNum = generator.nextInt(4000) + 1000;
        //create confirmation number
        String confirmationNum = POPCORN + NUM_SIGN + customerLastUpper + NUM_SIGN + customerFirstInit 
                                    + NUM_SIGN + randomGeneratedNum + NUM_SIGN + streetVendorId;
        
        //date formatting
        String todaysDateFormatted = todaysDate.substring(0,2) + HYPHEN + todaysDate.substring(2,4) + HYPHEN + todaysDate.substring(4,8);
        
        //calculations
        int totalSalePennies = (POPCORN_PRICE_PENNIES * numOfPopcornsBought) + (SODA_PRICE_PENNIES * numOfSodaBought);
        double totalSaleDollar = totalSalePennies/pennyToDollar;
        double popcornPriceDollar = POPCORN_PRICE_PENNIES/pennyToDollar;
        double sodaPriceDollar = SODA_PRICE_PENNIES/pennyToDollar;
        
        
        /*
         * Generate receipt
         */
        //split input from receipt
        System.out.println("\n\n" + HYPHEN + HYPHEN + HYPHEN + HYPHEN + HYPHEN + HYPHEN + HYPHEN);
        
        //format round to 2 decimal places
        DecimalFormat decimalTwo = new DecimalFormat ("0.00##");
        
        System.out.println("\n\n**Kandy's Kountry Kettle Korn**"
                        + "\n\nConfirmation for " + customerFirstName + " " + customerLastName
                        + "\n\nConfirmation Number: " + confirmationNum
                        + "\n\nPopcorn:\t" + numOfPopcornsBought + " @ $" + decimalTwo.format(popcornPriceDollar) + " each"
                        + "\nSoft Drinks:\t" + numOfSodaBought + " @ $" + decimalTwo.format(sodaPriceDollar) + " each"
                        + "\n\nTOTAL:\t\t$" + decimalTwo.format(totalSaleDollar)
                        + "\n\nThanks for visiting our booth on " + todaysDateFormatted);

    }
}
