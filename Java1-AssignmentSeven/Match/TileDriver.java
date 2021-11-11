/*
Name: Ryan Siegel
Date: 10/19/2021
Instructor: Krishna Nandanoor
Class: CIT 149 - Java 1
Purpose of program: A driver for the match game to try and get 3 numbers in a row.
*/

import java.util.Random;
import java.util.Scanner;

public class TileDriver
{
    public static void main (String[] args)
    {
        //create objects
        Random rand = new Random();
        Scanner console = new Scanner(System.in);
        Tile tileOne = new Tile ();
        Tile tileTwo = new Tile ();
        Tile tileThree = new Tile ();
        
        //declare
        String colorText = "";
        String playAgain = "yes";
        int randNumber = 0;
        int randColor = 0;
        
        //continue to play if yes
        while(playAgain.equals("yes"))
        {
            //get tiles 1 through 3
            for (int tileNum=1; tileNum<4; tileNum++)
            {    
                //random number and random color
                randNumber = rand.nextInt(13) + 1;
                randColor = rand.nextInt(4) + 1;
                
                //color number to string
                if (randColor == 1) {colorText = "Red";}
                else if (randColor == 2) {colorText = "Green";}
                else if (randColor == 3) {colorText = "Yellow";}
                else if (randColor == 4) {colorText = "Blue";}
                
                //add info to tile depending on number in for loop
                if (tileNum == 1) 
                    {
                        tileOne.tradeTiles(colorText, randNumber);
                    }
                else if (tileNum == 2) 
                    {
                        tileTwo.tradeTiles(colorText, randNumber);
                    }
                else if (tileNum == 3) 
                {
                    tileThree.tradeTiles(colorText, randNumber);
                    // if all 3 tiles are the same then switch third tile till different
                    while (tileOne.equals(tileTwo) == true && tileOne.equals(tileThree) == true)
                    {
                        randNumber = rand.nextInt(13) + 1;
                        randColor = rand.nextInt(4) + 1;
                        tileThree.tradeTiles(colorText, randNumber);
                    }
                }   
            }
            //print results
            System.out.println("THE MATCH GAME - your results below");
            System.out.println("Tile One:\t" + tileOne.toString());
            System.out.println("Tile Two:\t" + tileTwo.toString());
            System.out.println("Tile Three:\t" + tileThree.toString());
            
            //if all 3 numbers match, then you win. Otherwise you lose
            if (tileOne.getValue() == tileTwo.getValue() && tileOne.getValue() == tileThree.getValue() && tileTwo.getValue() == tileThree.getValue())
            {
                System.out.println("***Congrats, YOU WIN!!***\n");
            }
            else {System.out.println("***Sorry, you lost.***\n");}
            
            //ask user if play again. if yes then play again, if no then quit program.
            System.out.print("Would you like to play again? Enter yes to play again, no to end the game: ");
            playAgain = console.nextLine();
            playAgain = playAgain.toLowerCase();
            System.out.println("\n---------------------");
        }
    }
}