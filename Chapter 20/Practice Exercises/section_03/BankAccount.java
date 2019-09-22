package section_03;

/**
 * A bank account that has a balance that can be changed by deposits and
 * withdrawals.
 * @author Mayuresh
 *
 */
public class BankAccount
{
	private int accountNumber;
	private double balance;
	
	/**
	 * Constructs a bank account with 0 balance
	 * @param accountNumber the account number for this account
	 */
	public BankAccount(int accountNumber)
	{
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	
	/**
	 * Constructs a bank account with a given balance
	 * @param accountNumber the account number
	 * @param balance the initial balance
	 */
	public BankAccount(int accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	/**
	 * Gets the account number of this bank account
	 * @return the account number
	 */
	public int getAccountNumber()
	{
		return this.accountNumber;
	}
	
	/**
	 * Deposits money into the bank account
	 * @param amount the amount to deposit
	 */
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	
	/**
	 * Withdraws money fron the bank account
	 * @param amount the amount to withdraw
	 */
	public void withdraw(double amount)
	{
		this.balance -= amount;
	}
	
	/**
	 * Gets the current balance of the bank account
	 * @return the current balance
	 */
	public double getBalance()
	{
		return this.balance;
	}
	
}
