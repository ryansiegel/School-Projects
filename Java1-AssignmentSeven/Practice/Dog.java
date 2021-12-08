//Ryan Siegel - Java 1 - 12/8/21
public class Dog
{
    private String name;
    private int age;
    private String licenseTagNumber;

    public Dog (String name, int age, String licenseTagNumber)
    {
        this.name = name;
        if (age >= 0) {this.age = age;}
        else {age = 0;}
        this.licenseTagNumber = licenseTagNumber;

    }
    
    public Dog()
    {
        name = "Unknown";
        age = 0;
        licenseTagNumber = "Unknown";
    }
    
    
    public String getName() {return name;}
    public int getAge() {return age;}
    public String getLicenseTagNumber() {return licenseTagNumber;}
    
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {if (age >= 0) {this.age = age;}}
    public void setLicenseTagNumber(String licenseTagNumber) {this.licenseTagNumber = licenseTagNumber;}

    public boolean equals(Dog dog)
    {
        //if dog is the same, return true. Otherwise return false.
        if (dog == null) {return false;}
        if (this.getLicenseTagNumber().equals(dog.getLicenseTagNumber())) {return true;}
        return false;
    }
    
    public String toString()
    {
        return name + " " + age + " " + licenseTagNumber;
    }
}