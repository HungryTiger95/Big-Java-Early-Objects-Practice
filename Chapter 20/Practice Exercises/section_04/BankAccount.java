package section_04;

import java.io.Serializable;

public class BankAccount implements Serializable
{
	private static final long serialVersionUID = 3906167439172356111L;
	private int accountNumber;
	private double balance;
	
	/**
	 * Constructs a bank account with 0 balance
	 * @param accountNumber the account number
	 */
	public BankAccount(int accountNumber)
	{
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	
	/**
	 * Constructs a bank account with a given initial balance
	 * @param accountNumber the account number
	 * @param balance the initial balance
	 */
	public BankAccount(int accountNumber, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	/**
	 * Gets the account number
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
	 * Withdraws money from the account
	 * @param amount the amount to withdraw
	 */
	public void withdraw(double amount)
	{
		this.balance -= amount;
	}
	
	/**
	 * Gets the balance of the account
	 * @return the balance
	 */
	public double getBalance()
	{
		return this.balance;
	}
}
