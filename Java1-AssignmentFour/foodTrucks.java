/*
Name: Ryan Siegel
Date: 09/21/2021
Instructor: Krishna Nandanoor
Class: CIT 149 - Java 1
Purpose of program: Print a schedule of the events of the park from the day chosen and the rest of the weeks schedule.
*/

import java.util.Scanner;

public class foodTrucks
{
    public static void main (String [] args) 
    {
        //create objects
        Scanner console = new Scanner(System.in);
        
        //declare
        final String sunLineup = "You're Bacon Me Crazy\n\tWhat the Fork";
        final String monLineup = "Serial Grillers\n\tPlanet of the Crepes\n\tSPECIAL EVENT: Triva Night - Disney in the 90's";
        final String tueLineup = "Be More Pacific\n\tThe Dump Truck";
        final String wedLineup = "Meat and Greet\n\tThe Shrimp Pimp";
        final String thurLineup = "Game of Greens\n\tFood 4D Seoul";
        final String friLineup = "Cheese Louise\n\tSomething Different\n\tSPECIAL EVENT: Karaoke Night - Boy Bands from Yesterday and Today";
        final String satLineup = "Deli Llama\n\tFork in the Road";
        
        //print info
        System.out.print("Welcome to Ivana Tinkle Park!\n\nWe're glad you're interested in joining us for one of our weekly special activities."
                        + "\nEach day from 11am to 2pm we have 2 food trucks located in our park for lunch, otherwise any other\nevents are listed in the schedule."
                        + "\n\nPlease enter a day of the week as a number to view that days food trucks and scheduled events\nalong with the rest of the weeks schedule."
                        + "\n(Example: Sunday = 1, Monday = 2, Tuesday = 3, ...., Saturday = 7): ");
        
        //declare and grab day of week choice from user
        int dayChoice = console.nextInt();
        
        //based on user input, print schedule. If 1, print Sun thru Sat schedule. 2, print Mon thru Sat schedule. Etc
        System.out.println("\n------------------\n\n****Ivana Tinkle Park Schedule****");
        switch (dayChoice) 
        {
            case 1:
                System.out.println("SUNDAY:\n\t" + sunLineup);
            case 2:
                System.out.println("MONDAY:\n\t" + monLineup);
            case 3:
                System.out.println("TUESDAY:\n\t" + tueLineup);
            case 4:
                System.out.println("WEDNESDAY:\n\t" + wedLineup);
            case 5:
                System.out.println("THURSDAY:\n\t" + thurLineup);
            case 6:
                System.out.println("FRIDAY:\n\t" + friLineup);
            case 7:
                System.out.println("SATURDAY:\n\t" + satLineup);
                break;
            default:
                System.out.println("You have entered an unvaild entry for the day. Please re-enter a correct entry which should be one number from 1 to 7.");
                break;
        }

    }
}
