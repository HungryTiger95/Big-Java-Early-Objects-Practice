
public class BankAccount
{
	// Instance Variables
	private double balance;
	private double interestRate;
	
	// Constructors
	/**
	 * Constructs a bank account with 0 balance
	 */
	public BankAccount()
	{
		balance = 0;
	}
	
	/**
	 * Constructs a bank account with a given balance
	 * @param balance the initial balance
	 */
	public BankAccount(double initialBalance)
	{
		this.balance = initialBalance;
	}
	// Methods
	/**
	 * Withdraws money from bank account
	 * @param amount the amount to withdraw
	 */
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	/**
	 * Deposits money into the bank account
	 * @param amount the amount to deposit
	 */
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	/**
	 * Gets the current balance of the bank account
	 * @return the current balance
	 */
	public double getBalance()
	{
		return balance;
	}
	
	/**
	 * Adds interest to the bank account
	 * @param rate interest rate
	 */
	public void addInterest(double rate)
	{
		interestRate = rate / 100.0;
		balance = (balance * interestRate) + balance;
	}
}
