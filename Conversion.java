
/**
 * This class will calculate the specified conversions.
 *
 * @author (Lane Humphreys)
 * @version (10/2/19)
 */
import java.util.Scanner;
public class Conversion
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many meters would you like to convert?");
        double meters = scan.nextDouble();
        double inches = (39.370078 * meters);//Here I convert the meters to inches
        int miles = (int) (inches / 63360);//here i find the amount of miles only returning the integer
        int feet =  (int) (inches - miles * 63360) / 12;//here i find the feet only returning the integer
        double inchesRemaining = inches - (miles*63360 + feet*12);//find the remaining inches

        System.out.print(meters + " meter(s) converts to " 
        + miles +" mile(s), " + feet + " feet, " 
        + inchesRemaining + " inch(es)");//print the results
    }
}
