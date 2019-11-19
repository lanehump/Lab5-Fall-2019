
/**
 * Calculates what coins should be returned after given an amount of change due.
 *
 * @author (Lane Humphreys)
 * @version (10/2/19)
 */
import java.util.Scanner;
public class Change
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the change due in decimal form.");
        double changeDue = scan.nextDouble();
        double pennies = changeDue * 100;//calculate how many pennies are in the change due
        int quarters = (int) (pennies / 25);//calculates the amount of quarters 
        int dimes = (int) ((pennies - quarters * 25) / 10);//caluclates the amount of dimes
        int nickels = (int) ((pennies - dimes * 10 - quarters * 25) / 5);//calculates amount of nickels
        int penniesRemaining = (int) pennies - quarters * 25 - dimes * 10 - nickels * 5;//calculates number of pennnies
        
        //Prints Results
        System.out.println("Out of " + pennies + " Cents");
        System.out.print("There will be "+ quarters + " Quarters, ");
        System.out.print(dimes + " Dimes, ");
        System.out.print(nickels + " Nickels, and ");
        System.out.print(penniesRemaining + " Pennies.");
    }
}
