//************************************************************************
//    Token -- Represents a Token for the Homeless
//  
//  Student Name: Ryan Siegel
//  Date: 01/18/2022
//  Description of class: The class tests the TokenDriver and runs the inputted info through it.
//    Known issues with code: None.
//
//************************************************************************

import java.util.Random;

public class Token
{

    //***********************************************************************************
    //  Instance variables
    //        cardName    Description of card
    //        cardRank    Rank of card
    //
    //  STUDENTS:  DO NOT ADD INSTANCE DATA ITEMS.  DECLARE LOCAL VARIABLES WITHIN
    //             METHODS, IF ADDITIONAL VARIABLES ARE NEEDED.
    //***********************************************************************************

    private String ID = "";
    private String firstName = "", lastName = "";
    private int quadrant = 0;
    private double balance = 0.0;    
    private boolean alerts[] = {false, false, false};
    

    //***********************************************************************************
    //  Constructor
    //***********************************************************************************

    public Token(String ID, String firstName, String lastName, int quadrant)
    {
        //verify ID is a number and is length of 5
        if (ID.length() == 5 && isAllDigits(ID) == true) {this.ID = ID;}
        else {this.ID = "99999";}
        
        //verify if firstName & lastname is not empty or null
        if (firstName.length() > 0 && lastName.length() > 0) {this.firstName = firstName; this.lastName = lastName;}
        else {this.firstName = ""; this.lastName = "";}
        
        //verify if quadrant is between 1 & 15
        if (quadrant >= 1 && quadrant <= 15) {this.quadrant = quadrant;}
        else {this.quadrant = 0;}
        
        //set first alert to true since balance defaults to 0
        this.alerts[0] = true;
    }


    //***********************************************************************************
    //  Accessors for ID, lastName, firstName, quadrant, balance, alerts
    //***********************************************************************************

    public String getID()
    {    
        return ID;
    }

    public String getLastName()
    {    
        return lastName;
    }

    public String getFirstName()
    {    
        return firstName;
    }        
    
    public int getQuadrant() 
    {    
        return quadrant;
    }
        
    public double getBalance() 
    {    
        return balance;
    }
        
    public boolean getAlert(int singleAlert) 
    {    
        return alerts[singleAlert];
    }    
    
    //***********************************************************************************
    //  Mutators for lastName, firstName, and quadrant
    //***********************************************************************************

    public void setLastName(String lastName) 
    {
        //verify if lastName is not empty
        if (lastName.length() > 0) {this.lastName = lastName;}
    }
        
    public void setFirstName(String firstName) 
    {
        //verify if firstName is not empty
        if (firstName.length() > 0) {this.firstName = firstName;}
    }
        
    public void setQuadrant(int quadrant) 
    {
        //verify quadrant is between 1 and 15
        if (quadrant >= 1 && quadrant <= 15) {this.quadrant = quadrant;}
    }


    //***********************************************************************************
    //  Helping methods
    //***********************************************************************************
    public boolean addToBalance(double donation)    
    {
        //verify donation amount is larger than $0
        if (donation > 0)
        {
            //if balance starts at 0, set alerts[0] to false
            if (balance == 0)
            {
                this.alerts[0] = false;
            }
            //update balance and return true
            balance = balance + donation;
            return true;
        }
        //return false if value is not larger than $0
        else {return false;}
    }
    
    public boolean buyItem(double purchaseAmount)     
    {
        //verify purchaseAmount is larger than 0 and the balance is larger than or equal to the purchaseAmount
        if (purchaseAmount > 0 && balance >= purchaseAmount)
        {
            //update balance and return true
            balance = balance - purchaseAmount;
            return true;
        }
        //return false if the if statement is not met
        else {return false;}
    }
        
    public void setAlert(int singleAlert)     
    {
        //verify singleAlert is between 0 to 2
        if (singleAlert >= 0 && singleAlert <= 2)
        {
            //if singleAlert 0 has a balance of 0, do this. Otherwise if singleAlert 0 is more than one then do nothing.
            if (singleAlert == 0 && balance == 0)
            {
                alerts[0] = true;
            }
            //if singleAlert 1 or 2
            else if (singleAlert > 0)
            {
                alerts[singleAlert] = true;
            }
        }
    }
    
    public void clearAlert(int singleAlert)    
    {
        //verify singleAlert is between 0 to 2
        if (singleAlert >= 0 && singleAlert <= 2)
        {
            //if singleAlert 0 has a balance of 0, don't this. Otherwise if singleAlert 0 is more than one then do this.
            if (singleAlert == 0 && balance != 0)
            {
                alerts[0] = false;
            }
            //if singleAlert 1 or 2
            else if (singleAlert > 0)
            {
                alerts[singleAlert] = false;
            }
        }
    }        
        
    public boolean isAllDigits (String testString)    
    {    /*------------------------------------------------------------------------------
         *  isAllDigits() verifies that each character in a string is a numeric digit
         *
         *  The method returns a true value if all characters are digits and returns
         *  a false value if any of the characters is not a digit.
         * ----------------------------------------------------------------------------*/
        
        char[ ] testStringAsChar = testString.toCharArray();
        for (char c : testStringAsChar) {
            if (! Character.isDigit(c))     
                return false;
        }
        return true;
    }
    

    //***********************************************************************************
    //  toString() Method returns a String (DOES NOT DISPLAY ANYTHING)
    //  
    //  The string returned should contain all of the instance data items in a pleasing
    //  format.
    //***********************************************************************************

     public String toString()
    {    
        String returnStr = "ID: " + ID + "\tName: " + firstName + " " + lastName + "\tBalance: " + balance + "\tQuadrant: " + quadrant + "\tAlert 1, 2, & 3: " + alerts[0] + ", " + alerts[1] + ", " + alerts[2];
        return returnStr;
    }
}

