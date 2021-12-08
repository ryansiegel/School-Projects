//Ryan Siegel - Java 1 - 12/8/21
import java.util.*;
public class Fibonacci
{
    public static int fibonacci(int n)
    {
        int fibArray[] = new int[n+2];
        fibArray[0] = 0; fibArray[1] = 1;
        
        //if n is 3, then run this for loop. Adds last 2 items in array together.
        for (int i=3; i<=n; i++)
        {
            fibArray[i] = fibArray[i-1] + fibArray[i-2];
        }
        return fibArray[n];
    }
    
    public static void main(String [] args) 
    {
        //get answer from user
        Scanner console = new Scanner(System.in);
        System.out.print("Fibonacci Series\n-------\nEnter a number in the fibonacci you'd like to return: ");
        int n = console.nextInt();
        //run fibonacci method and return the result
        int fibNum = fibonacci(n);
        System.out.println("The " + n + " number in the fibonacci series is: " + fibNum);
    }

}
