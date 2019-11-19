
/**
 * Tests methods of BankAccount with user input.
 * 
 * @author (Lane Humphreys) 
 * @version (10/1/19)
 */
import java.util.Scanner;
public class BankAccountTester
{
   public static void main(String[]args )
   {
       Scanner scan1 = new Scanner(System.in);//Constructs scanner object 
       System.out.println("Please input the initial amount for Account 1");//asking nicely for user input
       BankAccount a1 = new BankAccount(scan1.nextDouble());//constructs the bank  account object with user input from a scan
       System.out.println("The balance of account 1 is now: $" + a1.getBalance());//gathers and prints the new balance
       System.out.println("Please input the initial amount for Account 2");//asking very nicely for user input for account 2
       BankAccount a2 = new BankAccount(scan1.nextDouble());//Constructs account 2 with the parameters of the scan
       System.out.println("The balance of Account 2 is now: $" + a2.getBalance());//prints balance of account 2
       System.out.println("Please input the initial amount for Account 3");
       BankAccount a3 = new BankAccount(scan1.nextDouble());
       System.out.println("The balance of Account 3 is now: $" + a3.getBalance());
   }
}
