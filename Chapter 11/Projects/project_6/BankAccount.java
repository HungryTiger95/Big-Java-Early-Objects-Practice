package project_6;

public class BankAccount
{
	// Instance Variables
	private double balance;
	private int accountNumber;
	
	// Constructors
	/**
	 * Constructs a bank account with a given balance and account number
	 * 
	 * @param accountNumber the account number associated with this bank account
	 * @param initialBalance the initial balance
	 */
	public BankAccount(int accountNumber, double initialBalance)
	{
		if(initialBalance < 0)
		{
			throw new IllegalArgumentException("Initial Balance Cannot Be Negative");
		}
		
		this.balance = initialBalance;
		this.accountNumber = accountNumber;
	}
	// Methods
	/**
	 * Sets the balance for this account
	 * @param balance the balance
	 */
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	/**
	 * Gets the balance for this account
	 * @return the balance for this account
	 */
	public double getBalance()
	{
		return this.balance;
	}
	
	/**
	 * Gets the account number associated with this account
	 * @return the account number
	 */
	public int getAccountNumber()
	{
		return this.accountNumber;
	}
	
	/**
	 * Deposits an amount into this account. Throws an IllegalArgumentException if the deposit is less than 0 
	 * @param amount the amount to be deposited
	 */
	public void deposit(double amount)
	{
		if(amount < 0)
		{
			throw new IllegalArgumentException("Cannot Deposit Negative Amount");
		}
		
		this.balance += amount;
	}
	
	/**
	 * Withdraws an amount from this account. Throws an IllegalArgumentException if the withdraw amount is less
	 * than 0 or if the amount if more than the balance on the account
	 * @param amount the amount to be withdrawn
	 */
	public void withdraw(double amount)
	{
		if(amount < 0 || amount > this.balance)
		{
			throw new IllegalArgumentException("You Cannot Withdraw A 0 Aount Or You Cannot Withdraw That Amount");
		}
		
		this.balance -= amount;
	}
}
