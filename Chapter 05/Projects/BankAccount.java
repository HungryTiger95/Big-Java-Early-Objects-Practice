
public class BankAccount
{
	// Instance Variables
	private double balance;
	
	// Constructors
	/**
	 * Constructs a bank account with an initial balance
	 * @param initialBalance Initial balance
	 */
	public BankAccount(double initialBalance)
	{
		this.balance = initialBalance;
	}
	
	/**
	 * Constructs a bank account with 0 balance
	 */
	public BankAccount()
	{
		this.balance = 0;
	}
	// Methods
	/**
	 * Gets the current balance
	 * @return balance
	 */
	public double getBalance()
	{
		return this.balance;
	}
	
	/**
	 * Withdraws an amount of money from the account
	 * @param amount amount
	 */
	public void withdraw(double amount)
	{
		this.balance = this.balance - amount;
	}
	
	/**
	 * Deposits an amount of money to this account
	 * @param amount amount
	 */
	public void deposit(double amount)
	{
		this.balance = this.balance + amount;
	}
	
	/**
	 * Transfer money to another account from this account
	 * @param accountTransferTo account to transfer to
	 * @param amount amount
	 */
	public void transferTo(BankAccount accountTransferTo, double amount)
	{
		withdraw(amount);
		accountTransferTo.deposit(amount);
	}
	
	/**
	 * Transfers money from another account to this account
	 * @param accountTransferFrom account to transfer from
	 * @param amount amount
	 */
	public void transferFrom(BankAccount accountTransferFrom, double amount)
	{
		deposit(amount);
		accountTransferFrom.withdraw(amount);
	}
}
