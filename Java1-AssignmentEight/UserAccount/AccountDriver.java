//********************************************************************
//  UserAccount.java
//  Student name: Ryan Siegel
//    Date: 10.26.21
//  Purpose: Create account driver.
//********************************************************************
import java.util.Scanner;
public class AccountDriver
{
    // instance variables - replace the example below with your own
    public static void main (String[] args)
    {
        Scanner console = new Scanner(System.in);
        String userName = "";
        String password = "";
        
        System.out.println("Welcome to the Account Driver! We will be first testing constructors three times.");
        //test constructors three times
        for (int i=0; i<3; i++)
        {
            System.out.print("Please enter a username(must be between 8 & 16 characters): ");
            userName = console.nextLine();
            System.out.print("Please enter a password(must be between 8 & 20 characters): ");
            password = console.nextLine();
            
            UserAccount account = new UserAccount (userName, password);
            System.out.println(account + "\n");
        }
        
        //test accessors
        System.out.println("----------\n");
        System.out.println("We will now be testing the accessors.");
        UserAccount accountOne = new UserAccount ("John Smith", "Zab98W55k");
        System.out.println("The username is:\t" + accountOne.getUserName() + "\nThe password is:\t" + accountOne.getPassword());
        
        //test mutators
        System.out.println("\n----------\n");
        System.out.println("We will now be testing the mutators.");
        System.out.print("Please enter a new password for the John Smith account(must be between 8 & 20 characters): ");
        password = console.nextLine();
        accountOne.setPassword(password);
        System.out.println(accountOne + "\n");
        
        //test encryption method
        System.out.println("----------\n");
        System.out.println("We will now be testing the encrypt method.");
        //test encryption twice
        for (int i=0; i<2; i++)
        {
            System.out.println("The below is before encryption--");
            System.out.println(accountOne + "\n");
            System.out.print("Please enter a shift amount(must be a number between 1 & 19): ");
            int shift = console.nextInt();
            accountOne.encrypt(shift);
            System.out.println("The below is after the 1st encryption--");
            System.out.println(accountOne + "\n");
            accountOne.encrypt(shift);
            System.out.println("The below is after the 2nd encryption--");
            System.out.println(accountOne + "\n");
            //reset account password to test again
            if (i == 0)
            {
                System.out.println("\nWe will now be testing this again.");
                accountOne.decrypt();
            }
        }
        
        //test decryption method
        System.out.println("----------\n");
        System.out.println("We will now be testing the decrypt method.");
        UserAccount accountTwo = new UserAccount ("Sally McIntosh", "B1N8hop10");
        System.out.println("The below is before encryption--");
        System.out.println(accountTwo + "\n");
        System.out.print("Please enter a shift amount(must be a number between 1 & 19): ");
        int shift = console.nextInt();
        accountTwo.encrypt(shift);
        System.out.println("The below is after encryption--");
        System.out.println(accountTwo + "\n");
        if (accountTwo.isEncrypted() == true) {System.out.println("Encryption Status: Password Encrypted\n");}
        else {System.out.println("Encryption Status: Password NOT Encrypted\n");}
        accountTwo.decrypt();
        System.out.println("The below is after the 1st decryption--");
        System.out.println(accountTwo + "\n");
        accountTwo.decrypt();
        System.out.println("The below is after the 2nd decryption--");
        System.out.println(accountTwo + "\n");
        if (accountTwo.isEncrypted() == true) {System.out.println("Encryption Status: Password Encrypted\n");}
        else {System.out.println("Encryption Status: Password NOT Encrypted\n");}
        System.out.println("Testing ended");
    }
}
