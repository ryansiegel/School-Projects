//Ryan Siegel - Java 1 - 12/8/21
import java.util.Scanner;
import java.text.DecimalFormat;
public class TestAccount
{
    public static void main(String[] args)
    {   
        Scanner console = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#0.00");
        
        //test user input without balance
        System.out.print("Bank Testing\n-----\nWhat is your name? ");
        String name = console.nextLine();
        System.out.print("What is your id? ");
        int id = console.nextInt();
        System.out.print("What is your gender? Write f or m. ");
        char gender = console.next().charAt(0);
        Customer c1 = new Customer(id, name, gender);
        Account a1 = new Account(id, c1, 500.00);
        System.out.println("Account Name: " + a1.getCustomer() + "\nAccount ID: " + a1.getID() + "\nAccount Balance: $" + a1.getBalance());
        
        //set balance
        a1.setBalance(400.00);
        System.out.println("\nSET BALANCE ($400) -- Account Name: " + a1.getCustomer() + "\nAccount ID: " + a1.getID() + "\nNew Account Balance: $" + formatter.format(a1.getBalance()));
        
        //deposit
        a1.deposit(100.50);
        System.out.println("\nDEPOSIT ($100.50) -- Account Name: " + a1.getCustomer() + "\nAccount ID: " + a1.getID() + "\nNew Account Balance: $" + formatter.format(a1.getBalance()));
        
        //withdraw
        a1.withdraw(50.25);
        System.out.println("\nWITHDRAW ($50.25) -- Account Name: " + a1.getCustomer() + "\nAccount ID: " + a1.getID() + "\nNew Account Balance: $" + formatter.format(a1.getBalance()));
    
        //testing to string
        System.out.println("\n\n" + a1.toString());
        System.out.println(a1);
        System.out.println(c1);
        System.out.println("Operator '+' invokes toString() too: " + a1);
    }
}