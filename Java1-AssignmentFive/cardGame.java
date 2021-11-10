/*
Name: Ryan Siegel
Date: 09/28/2021
Instructor: Krishna Nandanoor
Class: CIT 149 - Java 1
Purpose of program: Play a shorten version of the card game Great Dalmuti that prints the deck then choses two cards at random to compare and see who wins.
*/
import java.util.Random;
public class cardGame
{
    public static void main (String [] args) 
    {
        Random rand = new Random();
        
        //declare var
        final String DALMUTI = "Dalmuti";
        final String ARCHBISHOP = "Archbishop";
        final String EARL_MARSHAL = "Earl Marshal";
        final String BARONESS = "Baroness";
        final String ABBESS = "Abbess";
        final String KNIGHT = "Knight";
        final String SEAMSTRESS = "Seamstress";
        final String MASON = "Mason";
        final String COOK = "Cook";
        final String SHEPHERDESS = "Shepherdess";
        final String STONECUTTER = "Stonecutter";
        final String PEASANT = "Peasant";
        final String JESTER = "Jester";
        String userCard = "";
        String compCard = "";
        
        //prints title and info
        System.out.println(">>>The Great Dalmuti - the card game<<<\n"+
                        "Below is the standard deck for the Great Dalmulti card game.\n-------");
        /*
         * print card list
         */
        for (int cardNum=1; cardNum<81; cardNum++)
        {
            System.out.print("Card " + cardNum + ":\t");
            
            //prints based on the card number
            switch (cardNum)
            {
                case 1:
                    System.out.println("\t" + DALMUTI + "\n");
                    break;
                case 2: case 3:
                    System.out.println("\t" + ARCHBISHOP);
                    break;
                case 4: case 5: case 6:
                    System.out.println("\t" + EARL_MARSHAL);
                    break;
                case 7: case 8: case 9: case 10:
                    //if else for tab spacing
                    if (cardNum==10) {System.out.println(BARONESS);}
                    else {System.out.println("\t" + BARONESS);}
                    break;
                case 11: case 12: case 13: case 14: case 15:
                    System.out.println(ABBESS);
                    break;
                case 16: case 17: case 18: case 19: case 20: case 21:
                    System.out.println(KNIGHT);
                    break;
                case 22: case 23: case 24: case 25: case 26: case 27: case 28:
                    System.out.println(SEAMSTRESS);
                    break;
                case 29: case 30: case 31: case 32: case 33: case 34: case 35: case 36:
                    System.out.println(MASON);
                    break;
                case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44: case 45:
                    System.out.println(COOK);
                    break;
                case 46: case 47: case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55:
                    System.out.println(SHEPHERDESS);
                    break;
                case 56: case 57: case 58: case 59: case 60: case 61: case 62: case 63: case 64: case 65: case 66:
                    System.out.println(STONECUTTER);
                    break;
                case 67: case 68: case 69: case 70: case 71: case 72: case 73: case 74: case 75: case 76: case 77: case 78:
                    System.out.println(PEASANT);
                    break;
                case 79: case 80:
                    System.out.println(JESTER);
                    break;
            }
            
            //Add extra line to last card in group
            switch (cardNum)
            {
                case 3: case 6: case 10: case 15: case 21: case 28: case 36: case 45: case 55: case 66: case 78: case 80:
                System.out.println();
                break;
            }
        }
        
        /*
         * Deal cards
         */
        //random generate card for user
        int randCardUser = rand.nextInt(13) + 1;
        //assign card names to numbers drawn - user
        if (randCardUser == 1) {userCard = DALMUTI;}
        else if (randCardUser == 2) {userCard = ARCHBISHOP;}
        else if (randCardUser == 3) {userCard = EARL_MARSHAL;}
        else if (randCardUser == 4) {userCard = BARONESS;}
        else if (randCardUser == 5) {userCard = ABBESS;}
        else if (randCardUser == 6) {userCard = KNIGHT;}
        else if (randCardUser == 7) {userCard = SEAMSTRESS;}
        else if (randCardUser == 8) {userCard = MASON;}
        else if (randCardUser == 9) {userCard = COOK;}
        else if (randCardUser == 10) {userCard = SHEPHERDESS;}
        else if (randCardUser == 11) {userCard = STONECUTTER;}
        else if (randCardUser == 12) {userCard = PEASANT;}
        else if (randCardUser == 13) {userCard = JESTER;}
        
        //random generate card for comp
        int randCardComp = rand.nextInt(13) + 1;
        //if both cards are 1, re generate card
        while (randCardUser == 1 && randCardComp == 1) {randCardComp = rand.nextInt(12) + 2;}
        //assign card names to numbers drawn - computer
        if (randCardComp == 1) {compCard = DALMUTI;}
        else if (randCardComp == 2) {compCard = ARCHBISHOP;}
        else if (randCardComp == 3) {compCard = EARL_MARSHAL;}
        else if (randCardComp == 4) {compCard = BARONESS;}
        else if (randCardComp == 5) {compCard = ABBESS;}
        else if (randCardComp == 6) {compCard = KNIGHT;}
        else if (randCardComp == 7) {compCard = SEAMSTRESS;}
        else if (randCardComp == 8) {compCard = MASON;}
        else if (randCardComp == 9) {compCard = COOK;}
        else if (randCardComp == 10) {compCard = SHEPHERDESS;}
        else if (randCardComp == 11) {compCard = STONECUTTER;}
        else if (randCardComp == 12) {compCard = PEASANT;}
        else if (randCardComp == 13) {compCard = JESTER;}
        
        /*
         * Determine winner and print info
         */
        System.out.println("******************************\n\nLet's deal some cards and do a test play!\n" +
                            "Users card:\t\t" + userCard +
                            "\nComputers card: \t" + compCard);
        //computer wins
        if (randCardUser > randCardComp) {System.out.println(">>WINNER: The Computer!");}
        //user wins
        else if (randCardUser < randCardComp) {System.out.println(">>WINNER: The User!");}
        //tie
        else {System.out.println(">>WINNER: Its a tie!!");}
        System.out.println("\n******************************");
    }
}
