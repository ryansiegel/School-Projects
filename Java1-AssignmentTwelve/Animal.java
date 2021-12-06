//************************************************************************
//    Animal.java
//
//    Child Class of LivingCreature
//
//  STUDENTS:  UPDATE THIS DOCUMENTATION BLOCK WITH YOUR PERSONAL INFO
//************************************************************************

public class Animal extends LivingCreature
{
    private String speciesName;
    private String landOrSea;
    private int oldestKnownAge;
    private String name; //added a 4th as I felt name was important for this assignment

    public Animal(boolean isAlive, String dateOfBirth, String dateOfDeath, String description, String speciesName, String landOrSea, int oldestKnownAge, String name)
    {  
        super(isAlive, dateOfBirth, dateOfDeath, description);
        
        this.speciesName = speciesName;
        this.name = name;
        //verify it is land or sea
        if (landOrSea.equals("Land") || landOrSea.equals("Sea")) {this.landOrSea = landOrSea;}
        else {landOrSea = "Unknown";}
        //verify age is larger than 0
        if (oldestKnownAge > 0) {this.oldestKnownAge = oldestKnownAge;}
        else {oldestKnownAge = 0;}
    }

    public Animal()
    {    super();
        speciesName = "Unknown";
        landOrSea = "Unknown";
        oldestKnownAge = 0;
        name = "Unknown";
    }

    
    public String getSpeciesName()
    {   return speciesName; }

    public String getLandOrSea()
    {   return landOrSea;   }

    public int getOldestKnownAge()
    {   return oldestKnownAge;  }
    
    public String getName()
    {   return name;    }

    
    public void setSpeciesName(String speciesName)
    {   this.speciesName = speciesName; }

    public void setLandOrSea(String landOrSea)
    {   if (landOrSea.equals("Land") || landOrSea.equals("Sea")) {this.landOrSea = landOrSea;}  }

    public void setOldestKnownAge(int oldestKnownAge)
    {   if (oldestKnownAge > 0) {this.oldestKnownAge = oldestKnownAge;} }
    
    public void setName(String name)
    {    this.name = name;     }

    
    public String superPower()     
    {
        if (landOrSea == "Land")
        {   return "\t" + name + " can run as fast as the speed of light. With its super speed, it might even be known as the fastest animal alive.";   }
        else if (landOrSea == "Sea") 
        {   return "\t" + name + " can light itself up in the darkest of waters using its power called Flashlight. It has even been known to blind other sea animals.";}
        else
        {   return "\t" + name + " is an unknown creature, so unknown that its powers are still to be discovered.";} 
    }


    public String toString()
    {    
        String phrase;
        phrase = super.toString() + "\n\n\t-----Data from Animal Child Class -----" + "\n\t"+ name +
        " is a animal\n\tSpecies name: \t" + speciesName + "\n\tLand or sea species: \t" + landOrSea +
        "\n\tOldest known age of this species: " + oldestKnownAge;
        return phrase;
    }
}