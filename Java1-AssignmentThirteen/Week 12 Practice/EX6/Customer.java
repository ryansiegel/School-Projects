//Ryan Siegel - Java 1 - 12/8/21
public class Customer
{
    private int ID;
    private String name;
    private char gender;
    
    public Customer(int ID, String name, char gender)
    {
        this.ID = ID;
        this.name = name;
        if (gender == 'm' || gender == 'f') {this.gender = gender;}
        //using t as they if gender not given
        else {gender = 't';}
    }
    
    public int getID() {return ID;}
    public String getName() {return name;}
    public char getGender() {return gender;}
     
    public String toString()
    {
        String phrase;
        phrase = name + "(" + ID + ")";
        return phrase;
    }
}