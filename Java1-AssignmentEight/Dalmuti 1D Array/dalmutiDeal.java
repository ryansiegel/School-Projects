/*
Name: Ryan Siegel
Date: 10/26/2021
Instructor: Krishna Nandanoor
Class: CIT 149 - Java 1
Purpose of program: Use statc methods to deal cards for the dalmuti game.
*/
import java.util.*;
public class dalmutiDeal
{
    //shuffle cards method
    public static String[] shuffleCards(String[] cardDeck)
    {
	//shuffle the cards in the deck
        for (int i = 0; i < cardDeck.length; i++) 
	{
            int r = i + (int) (Math.random() * (cardDeck.length-i));
            String temp = cardDeck[r];
            cardDeck[r] = cardDeck[i];
            cardDeck[i] = temp;
        }
        return cardDeck;
    }
    //deal cards method
    public static String[] dealCards(String[] cardDeck)
    {
        //declare array for print string
        String[] printString = new String[22];
        printString[0] = "Player 1\t\tPlayer 2\t\tPlayer 3\t\tPlayer 4";
        printString[1] = "====================================================================================";       
        //get length divided by num of players
        int n = (cardDeck.length) / 4;
        for (int i=0; i<n; i++)
        {
            //if very first run
            if (i == 0)
            {
                //current number to add to print array
                int y = i + 2;
                //add string to array
                printString[y] = cardDeck[0] + "\t\t" + cardDeck[1] + "\t\t" + cardDeck[2] + "\t\t" + cardDeck[3];
            }
            //every run after
            else
            {
                //current number to add to print array
                int y = i + 2;
                //current number to grab from cardDeck. Then assigns the correct value to a var to grab.
                int x = 4 * i; int playerOne = x; int playerTwo = x + 1; int playerThree = x + 2; int playerFour = x + 3;
                //add string to array
                printString[y] = cardDeck[playerOne] + "\t\t" + cardDeck[playerTwo] + "\t\t" + cardDeck[playerThree] + "\t\t" + cardDeck[playerFour];
            }
        }
        return printString;
    }
    
    public static void main(String [] args) 
    {
        //declare var & array
        String[] cardDeck = new String[80];
        
        //fill array with card deck
        for (int cardNum=0; cardNum<80; cardNum++)
        {
            //card 1
            if (cardNum == 0) {cardDeck[cardNum] = "1: Dalmuti";}
            //card 2-3
            else if (cardNum >= 1 && cardNum <= 2) {cardDeck[cardNum] = "2: Archbishop";}
            //card 4-6
            else if (cardNum >= 3 && cardNum <= 5) {cardDeck[cardNum] = "3: Earl Marshal";}
            //card 7-10
            else if (cardNum >= 6 && cardNum <= 9) {cardDeck[cardNum] = "4: Baroness";}
            //card 11-15
            else if (cardNum >= 10 && cardNum <= 14) {cardDeck[cardNum] = "5: Abbess";}
            //card 16-21
            else if (cardNum >= 15 && cardNum <= 20) {cardDeck[cardNum] = "6: Knight";}
            //card 22-28
            else if (cardNum >= 21 && cardNum <= 27) {cardDeck[cardNum] = "7: Seamstress";}
            //card 29-36
            else if (cardNum >= 28 && cardNum <= 35) {cardDeck[cardNum] = "8: Mason";}
            //card 37-45
            else if (cardNum >= 36 && cardNum <= 44) {cardDeck[cardNum] = "9: Cook\t";}
            //card 46-55
            else if (cardNum >= 45 && cardNum <= 54) {cardDeck[cardNum] = "10: Shepherdess";}
            //card 56-66
            else if (cardNum >= 55 && cardNum <= 65) {cardDeck[cardNum] = "11: Stonecutter";}
            //card 67-78
            else if (cardNum >= 66 && cardNum <= 77) {cardDeck[cardNum] = "12: Peasant";}
            //card 79-80
            else if (cardNum >= 78 && cardNum <= 79) {cardDeck[cardNum] = "13: Jester";}
        }
        //send array cardDeck to shuffleCards method to shuffle deck
        cardDeck = shuffleCards(cardDeck);
        //send array cardDeck to dealCards method to deal cards to each player and then assign it to a new array to print out.
        String[] printDeck = dealCards(cardDeck);
        //print results.
        for (int i=0; i<22; i++) {System.out.println(printDeck[i]);}
    }
}