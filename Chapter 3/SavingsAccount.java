/**
 * E3.5
 * 
 * Write a class Savings Account that is similar to the BankAccount class, except that it has an
 * added instance variable interest. Supply a constructor that sets both the initial balance
 * and the interest rate. Supply a method addInterest (with no explicit parameter)
 * that adds interest to the account. Write a SavingsAccountTester class that constructs a
 * savings account with an initial balance of 1000 and an interest rate of 10 percent.
 * Then apply the addInterest method and print the resulting balance. Also compute the
 * expected result by hand and print it.
 * 
 * @author Mayuresh
 *
 */

public class SavingsAccount
{
	// Instance Variables
	private double balance;
	private double interestRate;

	// Constructors
	/**
	 * Constructs a savings account with an initial balance and an initial interest rate
	 * @param amount the initial balance
	 * @param percentInterest the initial interest rate
	 */
	public SavingsAccount(double amount, double percentInterest)
	{
		balance = amount;
		interestRate = percentInterest / 100.0;
	}
	// Methods
	/**
	 * Adds interest
	 */
	public void addInterest()
	{
		balance = (balance * interestRate) + balance;
	}
	/**
	 * Gets the Balance
	 * @return balance
	 */
	public double getBalance()
	{
		return balance;
	}
}
