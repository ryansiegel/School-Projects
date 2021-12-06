//********************************************************************
//  CreatureTest2.java       Java Foundations
//
//  Solution to Programming Project 9.5
//
//  STUDENTS:  UPDATE THIS DOCUMENTATION BLOCK WITH YOUR PERSONAL INFO
//********************************************************************

public class CreatureTest2
{
   //-----------------------------------------------------------------
   //  Creates and exercises objects that instantiate the Speaker
   //  interface.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      //-----------
      //Instantiate - input data in each object.
      //-----------
      //Human class -- isAlive, dateOfBirth, dateOfDeath, description, hairColor, eyeColor, name
      Human Tucker = new Human(true, "07/01/2001", "", "Kentuckian", "Blonde", "Blue", "Cindy");
      //Aniaml class -- isAlive, dateOfBirth, dateOfDeath, description, speciesName, landOrSea, oldestKnownAge, name
      Animal HTim = new Animal(true, "02/16/1973", "", "Is an animal", "Horse", "Land", 96, "H-Tim");
      //Food class that extends from the Animal class -- -- isAlive, dateOfBirth, dateOfDeath, description, speciesName, landOrSea, oldestKnownAge, name, foodName, poisonForHumans, plantOrMeat
      Food Bob = new Food(true, "09/24/2015", "", "Is an animal", "Chicken", "Land", 24, "Bob", "Grass", false, "Plant");
      //Bug class -- isAlive, dateOfBirth, dateOfDeath, description, speciesName, canFly, numOfLegs, name
      Bug JimBug = new Bug(false, "11/04/2019", "12/25/2019", "Is a bug", "Spider", false, 8, "JimBug");
      
      //-----------
      //Display Objects - prints using the toString() thats in each class and prints the superPower method in the class.
      //-----------
      //Human class
      System.out.println("Printing object named Tucker>>" + Tucker);
      System.out.println(Tucker.superPower() + "\n\n");
      //Aniaml class
      System.out.println("Printing object named HTim>>" + HTim);
      System.out.println(HTim.superPower() + "\n\n");
      //Food class      
      System.out.println("Printing object named Bob>>" + Bob);
      System.out.println(Bob.superPower() + "\n\n");
      //Bug class
      System.out.println("Printing object named JimBug>>" + JimBug);
      System.out.println(JimBug.superPower() + "\n\n");
      
      //-----------
      //Testing Accessors
      //-----------
      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Tucker Object<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
      System.out.println("---------------\n\nPrinting object named Tucker using Accessors>>");
      //LivingCreature class
      System.out.println("\t-----Data from LivingCreature parent class-----" +
              "\n\tLiving Thing:\t" + Tucker.getDescription() + "\n\tAlive?\t\t\t" + Tucker.checkIsAlive() +
              "\n\tBirth Date: \t\t" + Tucker.getDateOfBirth() + "\n\tDeath Date:\t\t" + Tucker.getDateOfDeath());
      //Human class
      System.out.println("\n\t-----Data from Human Child Class -----" +
              "\n\t"+ Tucker.getName() + " is a human\n\tHair Color: \t" + Tucker.getHairColor() +
              "\n\tEye Color: \t" + Tucker.getEyeColor() + "\n\tNumber of Chromosomes: " + Tucker.getChromosomes());
      //Superpower Method
      System.out.println(Tucker.superPower());
      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>HTim Object<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
      System.out.println("\n\nPrinting object named HTim using Accessors>>");
      //LivingCreature class
      System.out.println("\t-----Data from LivingCreature parent class-----" +
              "\n\tLiving Thing:\t" + HTim.getDescription() + "\n\tAlive?\t\t\t" + HTim.checkIsAlive() +
              "\n\tBirth Date: \t\t" + HTim.getDateOfBirth() + "\n\tDeath Date:\t\t" + HTim.getDateOfDeath());        
      //Aniaml class
      System.out.println("\n\t-----Data from Animal Child Class -----" +
              "\n\t"+ HTim.getName() + " is a animal\n\tSpecies name: \t" + HTim.getSpeciesName() +
              "\n\tLand or sea species: \t" + HTim.getLandOrSea()+ "\n\tOldest known age of this species: " + HTim.getOldestKnownAge());
      //Superpower Method
      System.out.println(HTim.superPower());
      
      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>Bob Object<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
      System.out.println("\n\nPrinting object named Bob using Accessors>>");
      //LivingCreature class
      System.out.println("\t-----Data from LivingCreature parent class-----" +
              "\n\tLiving Thing:\t" + Bob.getDescription() + "\n\tAlive?\t\t\t" + Bob.checkIsAlive() +
              "\n\tBirth Date: \t\t" + Bob.getDateOfBirth() + "\n\tDeath Date:\t\t" + Bob.getDateOfDeath());   
      //Aniaml class
      System.out.println("\n\t-----Data from Animal Child Class -----" +
              "\n\t"+ Bob.getName() + " is a animal\n\tSpecies name: \t" + Bob.getSpeciesName() +
              "\n\tLand or sea species: \t" + Bob.getLandOrSea()+ "\n\tOldest known age of this species: " + Bob.getOldestKnownAge());
      //Food class
      System.out.println("\n\t-----Data from Food Child Class -----" +
              "\n\tThe food this animal eats is called "+ Bob.getFoodName() + "\n\tPoison for Humans: \t" + Bob.getPoisonForHumans() +
              "\n\tPlant or Meat: \t" + Bob.getPlantOrMeat());
      //Superpower Method
      System.out.println(Bob.superPower());
      
      //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>JimBug Object<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
      System.out.println("\n\nPrinting object named JimBug using Accessors>>");
      //LivingCreature class
      System.out.println("\t-----Data from LivingCreature parent class-----" +
              "\n\tLiving Thing:\t" + JimBug.getDescription() + "\n\tAlive?\t\t\t" + JimBug.checkIsAlive() +
              "\n\tBirth Date: \t\t" + JimBug.getDateOfBirth() + "\n\tDeath Date:\t\t" + JimBug.getDateOfDeath());   
      //Bug class
      System.out.println("\n\t-----Data from Bug Child Class -----" +
              "\n\t"+ JimBug.getName() + " is a bug\n\tSpecies name: \t" + JimBug.getSpeciesName() +
              "\n\tFlying bug: \t" + JimBug.getCanFly() + "\n\tNumber of legs: " + JimBug.getNumOfLegs());
      //Superpower Method
      System.out.println(JimBug.superPower());
      
      
      //-----------
      //Update Object using Mutators
      //-----------
      //>>>>>>>>>Tucker Object<<<<<<<<
      //BEFORE
      System.out.println("\n---------------\n\nBEFORE -- Updating object named Tucker using Mutators>>" + Tucker + "\n\n");
      //LivingCreature class update object
      Tucker.setDescription("New Yorker"); 
      //Human class update object
      Tucker.setHairColor("Brown");
      //AFTER
      System.out.println("AFTER -- Updating object named Tucker using Mutators>>" + Tucker + "\n\n");
      
      //>>>>>>>>>HTim Object<<<<<<<<
      //BEFORE
      System.out.println("---------------\n\nBEFORE -- Updating object named HTim using Mutators>>" + HTim + "\n\n");
      //LivingCreature class update object
      HTim.setDescription("Is a animal"); 
      //Animal class update object, put incorrect info in LandOrSea to show that it shouldn't change the output
      HTim.setSpeciesName("Zebra"); HTim.setLandOrSea("Se"); HTim.setName("Bobby");
      //AFTER
      System.out.println("AFTER -- Updating object named HTim using Mutators>>" + HTim + "\n\n");
      
      //>>>>>>>>>Bob Object<<<<<<<<
      //BEFORE
      System.out.println("---------------\n\nBEFORE -- Updating object named HTim using Mutators>>" + Bob + "\n\n");
      //LivingCreature class update object
      Bob.setDateOfBirth("12/24/2003"); Bob.setDescription("Is a animal"); 
      //Animal class update object
      Bob.setSpeciesName("Fish"); Bob.setName("Fishy");
      //Food class update object, put incorrect info in PlantOrMeat to show that it shouldn't change the output
      Bob.setFoodName("Moss"); Bob.setPlantOrMeat("Pla");
      //AFTER
      System.out.println("AFTER -- Updating object named Bob using Mutators>>" + Bob + "\n\n");
      
      //>>>>>>>>>JimBug Object<<<<<<<<
      //BEFORE
      System.out.println("---------------\n\nBEFORE -- Updating object named JimBug using Mutators>>" + JimBug + "\n\n");
      //LivingCreature class update object
      JimBug.setDescription("Is the best bug"); 
      //Bug class update object
      JimBug.setNumOfLegs(12); JimBug.setName("BugJim");
      //AFTER
      System.out.println("AFTER -- Updating object named JimBug using Mutators>>" + JimBug + "\n\n");
      
      
      //-----------
      //Update Object using Mutators for Death
      //-----------
      //Animal class
      //>>>>>>>>>HTim Object<<<<<<<<
      //BEFORE
      System.out.println("---------------\n\nBEFORE -- Updating object named HTim using Mutators after death>>" + HTim + "\n\n");
      //LivingCreature class update object
      HTim.setIsAlive(false); HTim.setDateOfDeath("12/05/2021");
      //AFTER
      System.out.println("AFTER -- Updating object named HTim using Mutators after death>>" + HTim + "\n\n");
      
   }
}
