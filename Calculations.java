
/**
 * A class that will do a set of math calculations.
 * 
 * @author (Lane Humphreys) 
 * @version (10/4/19)
 */
import java.util.Scanner;
public class Calculations
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your two integers");//requesting user input
        double one = scan.nextDouble();//Sets integer one to user input
        double two = scan.nextDouble();//sets integer two to user input 
        //Calculates the sum
        System.out.println("The sum of the two is: " + (one + two));
        //Calculates the square root of the sum
        System.out.println("The root of the sum is: " + Math.sqrt(one + two));
        //Calculates the difference
        System.out.println("The difference of the two is: " + (one - two));
        //Calculates the product
        System.out.println("The product of the two is: " + (one * two));
        //Product of the two to the fourh power
        System.out.println("The product of the two at the fourth power: " + Math.pow((one * two), 4));
        //Calculates the average
        System.out.println("The average of the two is: " + ((one + two) / 2));
        //Calculates the maximum value of the two
        System.out.println("The Maximum of the two is: " + Math.max(one, two));
        //Calculates the minimum value of the two
        System.out.println("The Minimum of the two is: " + Math.min(one, two));
        
    }
}
