
/**
 * Write a description of class ProductTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ProductPrinter
{
    public static void main(String[]args)
  {
   Scanner scan = new Scanner(System.in);//Constucts Scanner
   Product mic = new Product( "Microwave", 49.99);//Constructs product under my parameters
   Product fridge = new Product( "Refridgerator", 599);//Constructs product under my parameters
   System.out.print("Product number one is a " + mic.getName());//Prints and returns name of mic
   System.out.println(" and the price is $" + mic.getPrice());//prints price
   System.out.println("How much would you like taken off the price?");//Requesting user input
   mic.reducePrice(scan.nextDouble());//Scanner takes user input and makes calculation
   System.out.println("The new price of the " + mic.getName() + " is $" + mic.getPrice());//prints name and new price
   System.out.println("-----------------------------------------------");
   System.out.print("Product number 2 is a " + fridge.getName() + " and the price is $");//prints name and price
   System.out.println(fridge.getPrice());
   System.out.println("How much would you like taken off the price?");//requests user input
   fridge.reducePrice(scan.nextDouble());//Takes input and makes calculation
   System.out.println("The new price of the " + fridge.getName() + " is $" + fridge.getPrice());//prints name and new price
  }
}
