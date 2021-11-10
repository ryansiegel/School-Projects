/*
Name: Ryan Siegel
Date: 08/29/2021
Instructor: Krishna Nandanoor
Class: CIT 149 - Java 1
Purpose of program: This program will calculate the number of hours, days, and years a person has slept in their life.
*/

import java.util.Scanner;

public class snoozingProject
{
    public static void main (String [] args) 
    {
        // declare constants
        final byte hoursDay = 24;
        final short daysYear = 365;
        
        // create scanner object
        Scanner console = new Scanner(System.in);
        
        // declare name and assign input to it
        System.out.println("Welcome to the Sleep Time Calculator!\n"
                            + "Please enter your full name to get started.");
        String name = console.nextLine();
        System.out.println();
        
        // declare age and assign input to it
        System.out.println("Please enter your age. Please only list the number.");
        int age = console.nextInt();
        System.out.println();
        
        // declare hoursSleep and assign input to it
        System.out.println("Please enter the total number of hours of sleep you get a night. Please only list the number.");
        float hoursNight = console.nextFloat();
        
        // prints 2 blank lines before the results are displayed
        System.out.println("\n");
        
        // calculate times
        float hoursSleep = age * daysYear * hoursNight;
        float daysSleep = hoursSleep / hoursDay;
        float yearsSleep = daysSleep / daysYear;
        
        // displays results
        System.out.println(name + ", the number of hours you have slept in your life is:\t" + String.format("%.2f",hoursSleep) + " hours.\n"
                            + "The number of days you have slept in your life is:\t\t\t" + String.format("%.2f",daysSleep) + " days.\n"
                            + "The number of years you have slept in your life is:\t\t\t" + String.format("%.2f",yearsSleep) + " years.");
    }
}
