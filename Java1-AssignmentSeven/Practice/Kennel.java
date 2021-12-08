//Ryan Siegel - Java 1 - 12/8/21
public class Kennel
{
    private int iD;
    private Dog crateOne;
    private Dog crateTwo;
    private Dog crateThree;
    
    public Kennel (int iD)
    {
        this.iD = iD;
    }
    
    public boolean addDog(Dog dog)
    {
        //add dog to kennel if empty
        if (dog == null) {return false;}
        else {
            if (crateOne == null) {crateOne = dog; return true;}
            else {
                if (crateOne.equals(dog)) {return false;}
                else {
                    if (crateTwo == null) {crateTwo = dog; return true;}
                    else {
                        if (crateTwo.equals(dog)) {return false;}
                        else {
                            if (crateThree == null) {crateThree = dog; return true;}
                                else {return false;}
                        }
                    }
                }
            }
        }
    }
    
    public int getID()
    {   return iD;  }
    
    public int getFilledCrateCnt()
    {
        int cntr = 0;
        
        //count if all 3 kennels filled
        if (crateOne != null) {cntr++;}
        if (crateTwo != null) {cntr++;}
        if (crateThree != null) {cntr++;}
        return cntr;
    }
        
    
    public String toString()
    {
        String phrase;
        phrase = "\nKennel ID: " + iD + "\nNumber of Crates: 03\n\n" +
        "CrateOne-Name: " + crateOne.getName() + "\nCrateOne-Age: " + crateOne.getAge() + "\nCrateOne-LicenseTag: " + crateOne.getLicenseTagNumber() +
        "\n\nCrateTwo-Name: " + crateTwo.getName() + "\nCrateTwo-Age: " + crateTwo.getAge() + "\nCrateTwo-LicenseTag: " + crateTwo.getLicenseTagNumber() +
        "\n\nCrateThree-Name: " + crateThree.getName() + "\nCrateThree-Age: " + crateThree.getAge() + "\nCrateThree-LicenseTag: " + crateThree.getLicenseTagNumber();
        return phrase;
    }
}