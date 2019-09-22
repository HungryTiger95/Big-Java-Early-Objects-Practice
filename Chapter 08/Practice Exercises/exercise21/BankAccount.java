package exercise21;

import java.util.ArrayList;

/**
 * Add a method ArrayList<Double> getStatement() to the BankAccount class that returns a
 * list of all deposits and withdrawals as positive or negative values. Also add a method
 * void clearStatement() that resets the statement.
 * 
 * @author Mayuresh
 *
 */
public class BankAccount
{
	// Instance Variables
	private double balance;
	private int accountNumber;
	private ArrayList<Double> statement = new ArrayList<Double>();
	
	private static int lastAssignedNumber = 1000;
	public static final double OVERDRAFT_FEE = 20.95;
	
	
	// Constructors
	/**
	 * Constructs a BankAccount object with 0 balance and an assigned account number
	 */
	public BankAccount()
	{
		lastAssignedNumber++;
		
		accountNumber = lastAssignedNumber;
		balance = 0;
	}
	
	/**
	 * Constructs a BankAccount object with a given balance and an assigned account number
	 * @param initialBalance initial balance
	 */
	public BankAccount(double initialBalance)
	{
		lastAssignedNumber++;
		
		accountNumber = lastAssignedNumber;
		balance = initialBalance;
	}
	
	// Methods
	/**
	 * Deposits an amount into the account
	 * @param amount amount to be deposited
	 */
	public void deposit(double amount)
	{
		balance = balance + amount;
		
		addToStatement(amount);
	}
	
	/**
	 * Withdraws an amount from the account
	 * @param amount amount to be withdrawn
	 */
	public void withdraw(double amount)
	{
		if (amount > balance)
		{
			balance = balance - OVERDRAFT_FEE;
			
			addToStatement(-OVERDRAFT_FEE);
		}
		else
		{
			balance = balance - amount;
			
			addToStatement(-amount);
		}
	}
	
	/**
	 * Gets the balance of the account
	 * @return balance
	 */
	public double getBalance()
	{
		return balance;
	}
	
	/**
	 * Gets the account number of the account
	 * @return account number
	 */
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	/**
	 * Adds a transaction to the statement
	 * @param value value to be added
	 */
	public void addToStatement(double value)
	{
		statement.add(value);
	}
	
	/**
	 * Gets the statement for this account
	 * @return statement
	 */
	public ArrayList<Double> getStatement()
	{
		return statement;
	}
	
	/**
	 * Clears the statement
	 */
	public void clearStatement()
	{
		statement.clear();
	}
}
