package com.yahoo.mayureshpatel.BankAccount;

public class BankAccount
{
	// Instance Variables
	private double balance;
	private int accountNumber;
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
		}
		else
		{
			balance = balance - amount;
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
}
