package exercise_14;

public class SavingsAccount extends BankAccount
{
	// Instance Variables
	double interestRate;
	private double minBalance;
	
	// Constructors
	/**
	 * Constructs a savings account with zero balance
	 */
	public SavingsAccount()
	{
		super();
	}
	
	/**
	 * Constructs a savings account with a zero balance and sets the account number
	 * for this account
	 * @param initialBalance initial balance in the account at the time of construction
	 */
	public SavingsAccount(double initialBalance)
	{	
		super.deposit(initialBalance);
	}
	
	// Methods
	/**
	 * Sets the interest rate for this account
	 * @param rate the monthly interest rate in percent
	 */
	public void setInterestRate(double rate)
	{
		this.interestRate = rate;
	}
	
	/**
	 * Withdraws an amount of money from this account and then checks whether or not
	 * the current balance of the account is the minimum balance seen on the account
	 * for this current month.
	 */
	public void withdraw(double amount)
	{
		super.withdraw(amount);
		
		double balance = getBalance();
		if(balance < minBalance)
		{
			minBalance = balance;
		}
	}
	
	/**
	 * Carries out the month end processing that is appropriate for this account.
	 * For this account, interest is calculated using the minimum balance that was
	 * seen on this account for the month. The earned interest is deposited into the
	 * account and then sets the current balance to the minimum balance seen on the
	 * account for the next month.
	 */
	public void monthEnd()
	{
		double interest = minBalance * interestRate / 100;
		
		deposit(interest);
		
		minBalance = getBalance();
	}
	
	public String toString()
	{
		return super.toString() + "[interestRate=" + interestRate + "]";
	}
}
