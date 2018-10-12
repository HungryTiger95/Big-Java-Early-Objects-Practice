package project_6;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Design a class Bank that contains a number of bank accounts. Each account has an account number
 * and a current balance. Add an accountNumber field to the BankAccount class. Store the bank accounts
 * in an array list. Write a readFile method of the Bank class for reading a file with the format:
 * 
 * 		accountNumber1 balance1
 * 		accountNumber2 balance2
 * 		...
 * 
 * Implement read methods for the Bank and BankAccount classes. Write a sample program to read in a file with
 * bank accounts, then print the account with the highest balance. If the file is not properly formatted,
 * give the user a chance to select another file.
 * 
 * @author Mayuresh
 *
 */
public class Bank
{
	// Instance Variables
	ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	
	// Constructors
	
	// Methods
	public ArrayList<BankAccount> readFile(String fileName) throws IOException
	{
		File inFile = new File("src\\project_6\\".concat(fileName));
		
		try(Scanner in = new Scanner(inFile))
		{
			readData(in);
			return accounts;
		}
	}
	
	public void readData(Scanner in) throws BadDataException
	{
		while(in.hasNextLine())
		{
			if(!in.hasNextInt())
			{
				throw new BadDataException("Expected Account Number");
			}
			
			int accountNumber = in.nextInt();
			
			if(!in.hasNextDouble())
			{
				throw new BadDataException("Expected Balance");
			}
			
			double balance = in.nextDouble();
			
			// Create a bank account and add it to the array list
			BankAccount newAccount = new BankAccount(accountNumber, balance);
			accounts.add(newAccount);
		}
	}
	
	public int getLargestAccount()
	{
		double largestBalance = accounts.get(0).getBalance();
		int largestBalancePos = 0;
		
		for(int i = 1; i < accounts.size(); i++)
		{
			if(accounts.get(i).getBalance() > largestBalance)
			{
				largestBalance = accounts.get(i).getBalance();
				largestBalancePos = i;
			}
		}
		
		return largestBalancePos;
	}
}
