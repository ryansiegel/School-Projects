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
    //declare arrays
    static String[][] dealtCards;
    static String[] cardDeck = new String[80];
    static boolean keepPlaying = true;
    
    //shuffle cards method
    public static String[] shuffleCards()
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
    public static String[][] dealCards()
    {
        String[][] dealtCards = new String[20][4];
        int deckNum = 0;
        for (int row=0; row<dealtCards.length; row++)
        {
            for (int col=0; col<dealtCards[row].length; col++)
            {
                dealtCards[row][col] = cardDeck[deckNum];
                deckNum++;
            }
        }
        return dealtCards;
    }
    //print player decks per player
    public static String printDecks(int playerNum)
    {
        int currentPlayer = playerNum + 1;
        System.out.println("\n***Player " + currentPlayer + "***");
        for (int row=0; row<dealtCards.length; row++)
        {
            System.out.println(dealtCards[row][playerNum]);
        }
        System.out.println("---");
        return null;
    }
    
    public static void main(String [] args) 
    {
        //declare
        Scanner console = new Scanner(System.in);
        String qAnswer;
        
        System.out.println("Let's play the DALMUTI DEAL!!!\n---------");
        
        //play again
        do
        {
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
            cardDeck = shuffleCards();
            //send array cardDeck to dealCards method to deal cards to each player and then assign it to a new array to print out.
            dealtCards = dealCards();
            //print results.
            for (int playerNum=0; playerNum<=3; playerNum++)
            {
                printDecks(playerNum);
            }
            
            System.out.println("Would you like to play again? Type 'yes' for yes, 'no' for no. :");
        //if yes, play again. if no end program.
        } while (console.next().equalsIgnoreCase("yes"));
    }
}