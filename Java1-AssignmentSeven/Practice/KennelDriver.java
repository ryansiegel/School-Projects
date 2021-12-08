//Ryan Siegel - Java 1 - 12/8/21
import java.util.Scanner;
public class KennelDriver
{
    // instance variables - replace the example below with your own
    public static void main (String[] args)
    {
        //declare
        Scanner console = new Scanner(System.in);
        int cntr = 0; int ageDog;
        String nameDog; String tagDog;
        
        
        System.out.print("DOG KENNEL INVEN\n------------\nWhat is the Kennel ID? ");
        int kennelID = console.nextInt();
        //kennel object
        Kennel kennel = new Kennel(kennelID);
        console.nextLine();
        //cont until all 3 kennels are filled
        while (cntr < 3)
        {
            //collect info
            System.out.print("\nWhat is the name of the dog? ");
            nameDog = console.nextLine();
            System.out.print("What is the age of the dog? ");
            ageDog = console.nextInt();
            console.nextLine();
            System.out.print("What is the license tag number of the dog? ");
            tagDog = console.nextLine();
            //dog object
            Dog dog = new Dog(nameDog, ageDog, tagDog);
            //add dog to kennel
            kennel.addDog(dog);
            //get current count of kennels filled
            cntr = kennel.getFilledCrateCnt();
        }
        System.out.println("\n----------\n" + kennel);
    }
}