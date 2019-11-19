/**
 * Provides a set of written methods.
 * 
 * @author (Lane Humphreys) 
 * @version (09/17/19)
 */
public class BankAccount
{
    private double balance;
    /**Constructs a bank accoubt with a given balance
     @param initialBalance must be a double
     */
    public BankAccount(double initialBalance)
    {
        balance = initialBalance; 
    }
    /**
       Deposits money into the bank account.
       @param amount doulbe of the amount that will be deposited
     */
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    /**
     * Withdraws money from the bank account
     * @param amount to withdraw
     */ 
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }
    /**
     * Gets current balance of the account
     *  @return the current balance
     */ 
    public double getBalance()
    {
        return balance;
    }
    /**
     * Gives an interest rate
     * @param rate the rate of interest
     * 
     */
    public void addInterest(double rate)
    {
        balance = balance + (balance * rate);
    }

}
