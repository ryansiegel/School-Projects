//********************************************************************
//  CreatureTest.java       Java Foundations
//
//  Solution to Programming Project 9.5
//
//  STUDENTS:  UPDATE THIS DOCUMENTATION BLOCK WITH YOUR PERSONAL INFO
//********************************************************************

public class CreatureTest
{
   //-----------------------------------------------------------------
   //  Creates and exercises objects that instantiate the Speaker
   //  interface.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      Human Tucker = new Human(true, "07/01/2001", "", "Kentuckian", "Blonde", "Blue", "Cindy");
      Food Bob = new Food(true, "09/24/2015", "", "Is an animal", "Chicken", "Land", 24, "Bob", "Grass", false, "Plant");
      Animal HTim = new Animal(true, "02/16/1973", "", "Is an animal", "Horse", "Land", 96, "H-Tim");
      Bug JimBug = new Bug(false, "11/04/2019", "12/25/2019", "Is a bug", "Spider", false, 8, "JimBug");
      Human someOne = new Human ();
      
      System.out.println("Printing object named Tucker" + Tucker);
      System.out.println(Tucker.superPower() + "\n\n");
      
      System.out.println("Printing object named Bob" + Bob);
      System.out.println(Bob.superPower() + "\n\n");
      
      System.out.println("Printing object named HTim" + HTim);
      System.out.println(HTim.superPower() + "\n\n");
      
      System.out.println("Printing object named JimBug" + JimBug);
      System.out.println(JimBug.superPower() + "\n\n");
      
      System.out.println("Printing object named someOne" + someOne);
      System.out.println(someOne.superPower()+ "\n\n");


   }
}
