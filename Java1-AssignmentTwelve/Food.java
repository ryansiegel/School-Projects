//************************************************************************
//    Food.java
//
//    Child Class of LivingCreature
//
//  STUDENTS:  UPDATE THIS DOCUMENTATION BLOCK WITH YOUR PERSONAL INFO
//************************************************************************

public class Food extends Animal
{
    private String foodName;
    private boolean poisonForHumans;
    private String plantOrMeat;

    public Food(boolean isAlive, String dateOfBirth, String dateOfDeath, String description, String speciesName, String landOrSea, int oldestKnownAge, String name, String foodName, boolean poisonForHumans, String plantOrMeat)
    {  
        super(isAlive, dateOfBirth, dateOfDeath, description, speciesName, landOrSea, oldestKnownAge, name);
        
        this.foodName = foodName;
        this.poisonForHumans = poisonForHumans;
        //verify it is land or sea
        if (plantOrMeat.equals("Plant") || plantOrMeat.equals("Mean")) {this.plantOrMeat = plantOrMeat;}
        else {plantOrMeat = "Unknown";}
    }

    public Food()
    {    super();
        foodName = "Unknown";
        //always assume something is poison if not told
        poisonForHumans = true;
        plantOrMeat = "Unknown";
    }

    
    public String getFoodName()
    {   return foodName; }

    public boolean getPoisonForHumans()
    {   return poisonForHumans;   }

    public String getPlantOrMeat()
    {   return plantOrMeat;  }

    
    public void setFoodName(String foodName)
    {   this.foodName = foodName;   }

    public void setPlantOrMeat(String plantOrMeat)
    {   if (plantOrMeat.equals("Plant") || plantOrMeat.equals("Mean")) {this.plantOrMeat = plantOrMeat;}    }

    public void setPoisonForHumans(boolean poisonForHumans)
    {   this.poisonForHumans = poisonForHumans; }


    public String superPower()     
    {
        if (poisonForHumans == true)
        {return "\tDue to the fact that " + foodName + " is poison for humans, it puts on quite the display when it is killing them. But the most impressive part of this process is the strobe of rainbow colored light that comes out of the humans mouth as this process progresses.";   }
        else
        {return "\t" + foodName + " might not be poison for humans, but it does have some other special things it can do to humans. For example, this food can make a human grow 100x the size of a Llama. That's impressive!"; }
    }


    public String toString()
    {    
        String phrase;
        phrase = super.toString() + "\n\n\t-----Data from Food Child Class -----" + "\n\tThe food this animal eats is called "+ foodName +
        "\n\tPoison for Humans: \t" + poisonForHumans + "\n\tPlant or Meat: \t" + plantOrMeat;
        return phrase;
    }
}