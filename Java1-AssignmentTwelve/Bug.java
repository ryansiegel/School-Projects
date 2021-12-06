//************************************************************************
//    Bug.java
//
//    Child Class of LivingCreature
//
//  STUDENTS:  UPDATE THIS DOCUMENTATION BLOCK WITH YOUR PERSONAL INFO
//************************************************************************

public class Bug extends LivingCreature
{
    private String speciesName;
    private boolean canFly;
    private int numOfLegs;
    private String name; //added a 4th as I felt name was important for this assignment

    public Bug(boolean isAlive, String dateOfBirth, String dateOfDeath, String description, String speciesName, boolean canFly, int numOfLegs, String name)
    {  
        super(isAlive, dateOfBirth, dateOfDeath, description);
        
        this.speciesName = speciesName;
        this.name = name;
        this.canFly = canFly;
        //verify number of legs is larger than 2, there are some with none but they don't really count as bugs
        if (numOfLegs > 1) {this.numOfLegs = numOfLegs;}
        else {numOfLegs = 2;}
    }

    public Bug()
    {    super();
        speciesName = "Unknown";
        //we'll assume most bugs can't fly for my own sanity haha
        canFly = false;
        //6 is the common amount of legs
        numOfLegs = 6;
        name = "Unknown";
    }

    
    public String getSpeciesName()
    {   return speciesName; }

    public boolean getCanFly()
    {   return canFly;   }

    public int getNumOfLegs()
    {   return numOfLegs;  }
    
    public String getName()
    {   return name;    }

    
    public void setSpeciesName(String speciesName)
    {   this.speciesName = speciesName; }

    public void setCanFly(boolean canFly)
    {   this.canFly = canFly;   }

    public void setNumOfLegs(int numOfLegs)
    {   if (numOfLegs > 1) {this.numOfLegs = numOfLegs;}    }
    
    public void setName(String name)
    {    this.name = name;     }

    
    public String superPower()     
    {
        if (canFly == true)
        {   return "\t" + name + " can pretend to be a non-flying bug by hiding its wings. But when those wings become exposed, the bug will fly faster than the human eye can see.";   }
        else
        {   return "\t" + name + " is sneaky as this super bug can dig its way underground to where no evil force could get it. Then, when you least expect it, it arrives out of the ground to attack!";} 
    }


    public String toString()
    {    
        String phrase;
        phrase = super.toString() + "\n\n\t-----Data from Bug Child Class -----" + "\n\t"+ name +
        " is a bug\n\tSpecies name: \t" + speciesName + "\n\tFlying bug: \t" + canFly +
        "\n\tNumber of legs: " + numOfLegs;
        return phrase;
    }
}