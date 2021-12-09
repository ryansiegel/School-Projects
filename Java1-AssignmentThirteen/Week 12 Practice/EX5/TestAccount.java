//Ryan Siegel - Java 1 - 12/8/21
import java.util.Scanner;
public class TestAccount
{
    public static void main(String[] args)
    {   
        Scanner console = new Scanner(System.in);
        
        //test user input without balance
        System.out.print("Bank Testing\n-----\nWhat is your name? ");
        String name = console.nextLine();
        System.out.print("What is your id? ");
        String id = console.nextLine();
        Account a1 = new Account(id, name);
        System.out.println("Account Name: " + a1.getName() + "\nAccount ID: " + a1.getID() + "\nAccount Balance: $" + a1.getBalance());
        
        //testing added balance
        Account a2 = new Account("123abc", "Ryan", 200);
        System.out.println("\n\nAccount Name: " + a2.getName() + "\nAccount ID: " + a2.getID() + "\nAccount Balance: $" + a2.getBalance());
        
        //testing credit, debit and transfer
        Account a3 = new Account("123", "Bob", 200);
        Account a4 = new Account("321", "Jim", 300);
        System.out.println("\n\nAccount Name: " + a3.getName() + "\nAccount ID: " + a3.getID() + "\nAccount Balance: $" + a3.getBalance());
        a3.credit(100);
        System.out.println("\nCREDIT - Account Name: " + a3.getName() + "\nAccount ID: " + a3.getID() + "\nNew Account Balance: $" + a3.getBalance());
        a3.debit(50);
        System.out.println("\nDEBIT - Account Name: " + a3.getName() + "\nAccount ID: " + a3.getID() + "\nNew Account Balance: $" + a3.getBalance());
        System.out.println("Account Name: " + a4.getName() + "\nAccount ID: " + a4.getID() + "\nAccount Balance: $" + a4.getBalance());
        a3.transferTo(a4, 100);
        System.out.println("\nTRANSFER - Account Name: " + a3.getName() + "\nAccount ID: " + a3.getID() + "\nNew Account Balance: $" + a3.getBalance());
        System.out.println("Account Name: " + a4.getName() + "\nAccount ID: " + a4.getID() + "\nNew Account Balance: $" + a4.getBalance());
    
        //testing to string
        System.out.println("/n/n" + a3.toString());
        System.out.println(a3);
        System.out.println("Operator '+' invokes toString() too: " + a3);
    }
}