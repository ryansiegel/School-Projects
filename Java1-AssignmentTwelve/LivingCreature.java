//************************************************************************
//    LivingThing.java
//
//    Parent Class for Inheritance Illustration (with  no security included yet)
//
//  STUDENTS:  UPDATE THIS DOCUMENTATION BLOCK WITH YOUR PERSONAL INFO
//             UPDATE DOCUMENTATION BELOW TO IMPROVE THIS CLASS
//************************************************************************

abstract public class LivingCreature
{
    private boolean isAlive;
    private String dateOfBirth;
    private String dateOfDeath;
    private String description;

    //***********************************************************************************
    //  Constructors
    //***********************************************************************************

    public LivingCreature(boolean isAlive, String dateOfBirth, String dateOfDeath, String description)
    {    this.isAlive = isAlive;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDeath = dateOfDeath;
        this.description = description;
    }

    public LivingCreature()
    {    this.isAlive = true;
        this.dateOfBirth = "Unknown";
        this.dateOfDeath = "Unknown";
        this.description = "Unknown";
    }

    //***********************************************************************************
    //  Accessors
    //***********************************************************************************

    public boolean checkIsAlive()
    {        return isAlive;    }

    public String getDateOfBirth()
        {    return dateOfBirth;    }


    public String getDateOfDeath()
    {    return dateOfDeath;    }

    public String getDescription()
    {    return description;    }
    

    //***********************************************************************************
    //  Mutators
    //***********************************************************************************

    public void setIsAlive(boolean isAlive)
    {    this.isAlive = isAlive;    }

    public void setDateOfBirth(String dateOfBirth)
    {    this.dateOfBirth = dateOfBirth;    }

    public void setDateOfDeath(String dateOfDeath)
    {    this.dateOfDeath = dateOfDeath;    }

    public void setDescription(String description)
    {    this.description = description;    }

    //***********************************************************************************
    //  Other Methods
    //
    //  superPower() is a n abstract method and must defined in child classes.
    //
    //  toString() creates and returns a String of parent data.
    //***********************************************************************************

    public abstract String superPower();  

    public String toString()
    {
        String phrase;
        phrase = "\n\t-----Data from LivingCreature parent class-----" + "\n\tLiving Thing:\t" + description +
        "\n\tAlive?\t\t\t" + isAlive + "\n\tBirth Date: \t\t" + dateOfBirth +
                "\n\tDeath Date:\t\t" + dateOfDeath;
        return phrase;

    }
}