
/**
 * Write a description of class Product here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Product
{
  private String name;
  private double price;
  /**
   * Constructs Product object
   * @param pName product name must be a String
   * @param pPrice product price must be a double
   */
  public Product(String pName, double pPrice)
  {
      name = pName;
      price = pPrice;
  }
  /**
   * Method to return the name of the product
   * @return name
   */
  public String getName()
  {
      return name;
  }
  /**
   * Method to return the price of the product
   * @return price
   */
  public double getPrice()
  {
      return price;
  }
  /**
   * Reduces the price of the product by an amount
   * @param amount must be a double
   */
  public void reducePrice(double amount)
  {
      price = price - amount;
  }
}
