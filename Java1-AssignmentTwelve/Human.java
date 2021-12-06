//************************************************************************
//    Human.java
//
//    Child Class of LivingCreature
//
//  STUDENTS:  UPDATE THIS DOCUMENTATION BLOCK WITH YOUR PERSONAL INFO
//************************************************************************

public class Human extends LivingCreature
{
    private String hairColor;
    private String eyeColor;
    private int chromosomes;
    private String name;

    //***********************************************************************************
    //  Constructors
    //***********************************************************************************

    public Human(boolean isAlive, String dateOfBirth, String dateOfDeath, String description, String hairColor,
                 String eyeColor, String name)
    {    //------------------------------------------------------------
        //   The statement below calls the parent constructor 
        //   (the one with 4 parameters).  
        //   It is referenced using super() and passed 4 data items
        //------------------------------------------------------------   
        super(isAlive, dateOfBirth, dateOfDeath, description);
        
        //------------------------------------------------------------
        //   The statements below update student data items.
        //------------------------------------------------------------
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        chromosomes = 46;
        this.name = name;
    }

    public Human()
    {    super();
        hairColor = "Unknown";
        eyeColor = "Unknown";
        chromosomes = 46;
        name = "Unknown";
    }

    //***********************************************************************************
    //  Accessors
    //***********************************************************************************

    public String getHairColor()
    {        return hairColor;    }

    public String getEyeColor()
        {    return eyeColor;    }

    public int getChromosomes()
    {    return chromosomes;    }

    public String getName()
    {    return name;    }

    //***********************************************************************************
    //  Mutators
    //  NOTE:  There is no mutator for chromosomes since all humans have 46 chromosomes.
    //***********************************************************************************

    public void setHairColor(String hairColor)
    {    this.hairColor = hairColor;    }

    public void setEyeColor(String eyeColor)
    {    this.eyeColor = eyeColor;    }

    public void setName(String name)
    {    this.name = name;     }


    //***********************************************************************************
    //  Other Methods
    //
    //  superPower() is an abstract method that must be defined for all non-abstract 
    //               child classes
    //  toString()returns class data
    //***********************************************************************************

    public  String superPower()     
    {    //------------------------------------------------------------
        //  This defines the abstract method from the parent
        //------------------------------------------------------------
    
        return "\t" + name + " has eyes in the back of her head thus sees all sneaky activities of little humans.";      
    }


    public String toString()
    {    //------------------------------------------------------------
        //  Notice the call to super.toString() which calls the parent's
        //  toString().  Do not replicate work in the child that is done
        //  in the parent.  Call the parent's methods using super as a 
        //  reference to the parent's methods.
        //------------------------------------------------------------
        
        String phrase;
        phrase = super.toString() + "\n\n\t-----Data from Human Child Class -----" + "\n\t"+ name +
        " is a human\n\tHair Color: \t" + hairColor + "\n\tEye Color: \t" + eyeColor +
        "\n\tNumber of Chromosomes: " + chromosomes;
        return phrase;
    }
}