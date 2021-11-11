/*
Name: Ryan Siegel
Date: 10/05/2021
Instructor: Krishna Nandanoor
Class: CIT 149 - Java 1
Purpose of program: Print a ASCII art on the console.
*/
import java.util.Scanner;
import java.text.DecimalFormat;
public class inputOutput
{
    public static void main (String [] args) 
    {
        //create objects
        Scanner console = new Scanner(System.in);
        
        //declare
        double nameValue = 0;
        
        //collect name
        System.out.print("Please enter your first name: ");
        String name = console.nextLine();
        //collect age
        System.out.print("Please enter your age: ");
        int age = console.nextInt();
        
        //split name to seperate chars
        String[] nameSplit = name.split("");
        for (String i : nameSplit)
        {
            //change string char to type char
            char stringToChar = i.charAt(0);
            //change char to int and add it to current total
            nameValue = nameValue + (int)stringToChar;
        }
        //format round to 2 decimal places
        DecimalFormat decimalTwo = new DecimalFormat (".00");
        //divide the age by the total nameValue
        double astroCode = nameValue / age;
        System.out.println("---------------------\n" +
                            "Name: " + name + "\n" +
                            "Age: " + age + "\n" +
                            "Name Value: " + (int)nameValue + "\n" +
                            "Astrological Code: " + decimalTwo.format(astroCode));
        
    }
}