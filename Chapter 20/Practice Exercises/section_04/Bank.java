package section_04;

import java.io.Serializable;
import java.util.ArrayList;

public class Bank implements Serializable
{
	private static final long serialVersionUID = -7006038608224712173L;
	private ArrayList<BankAccount> accounts;
	
	/**
	 * Constructs a bank with no bank accounts
	 */
	public Bank()
	{
		accounts = new ArrayList<BankAccount>();
	}
	
	/**
	 * Adds an account to this bank.
	 * @param a the account to add
	 */
	public <E extends BankAccount> void  addAccount(E a)
	{
		accounts.add(a);
	}
	
	/**
	 * Finds a bank account with a given number
	 * @param accountNumber the number to find
	 * @return the account with the given number, or null if there
	 * is no such account
	 */
	public BankAccount find(int accountNumber)
	{
		for(BankAccount a : accounts)
		{
			if(a.getAccountNumber() == accountNumber)
			{
				return a;
			}
		}
		return null;
	}
}
