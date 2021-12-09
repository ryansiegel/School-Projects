//Ryan Siegel - Java 1 - 12/8/21
import java.text.DecimalFormat;
public class Account
{
    private int id;
    private Customer customer;
    private double balance = 0.0;
    
    public Account(int id, Customer customer)
    {
        this.id = id;
        this.customer = customer;
        balance = 0;
    }
    
    public Account(int id, Customer customer, double balance)
    {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    
    public int getID() {return id;}
    public Customer getCustomer() {return customer;}
    public double getBalance() {return balance;}
    public void setBalance(double balance) {this.balance = balance;}
    
    public String toString()
    {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        String phrase;
        phrase = customer + " balance=$" + formatter.format(balance);
        return phrase;
    }
    
    public double deposit(double amount)
    {
        balance = balance + amount;
        return balance;
    }
    
    public double withdraw(double amount)
    {
        if (balance >= amount) {balance = balance - amount;}
        else
        {
            System.out.println("Amount withdrawn exceeds the current balance.");            
        }
        return balance;
    }
}
