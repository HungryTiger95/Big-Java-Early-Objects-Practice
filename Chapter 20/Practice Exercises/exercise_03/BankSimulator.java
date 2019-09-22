package exercise_03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * This program demonstrates random access. You can access existing
 * accounts and deposit money, or create new accounts. The accounts
 * are saved in a random access file.
 * 
 * The data file in the previous exercise may end up with many deleted records
 * that take up space. Write a program that compacts such a file, moving all
 * active records to the beginning and shortening the file length. Hint: Use
 * the setLength method of the RandomAccessFile class to truncate the file length.
 * Look up the method's behavior in the API document.
 * @author Mayuresh
 *
 */
public class BankSimulator
{
	public static void main(String[] args) throws IOException
	{
		Scanner in = new Scanner(System.in);
		BankData data = new BankData();
		
		try
		{
			data.open("bank.dat");
			
			boolean done = false;
			while(!done)
			{
				System.out.print("Account Number: ");
				int accountNumber = in.nextInt();
				
				System.out.print("(R)emove, (D)eposit, or (W)ithdraw? ");
				String option = in.next();
				
				if(option.equalsIgnoreCase("D"))
				{
					System.out.print("Amount to Deposit: ");
					double amount = in.nextDouble();
					
					int position = data.find(accountNumber);
					BankAccount account;
					
					if(position >= 0)
					{
						System.out.println("Depositing...");
						account = data.read(position);
						account.deposit(amount);
						
						System.out.println("New Balance: " + account.getBalance());
					}
					else
					{
						System.out.println("Making New Account...");
						account = new BankAccount(accountNumber, amount);
						position = data.size();
						
						System.out.println("Adding New Account...");
					}
					
					data.write(position, account);
				}
				else if(option.equalsIgnoreCase("W"))
				{
					System.out.print("Amount to Withdraw: ");
					double amount = in.nextDouble();
					
					int position = data.find(accountNumber);
					BankAccount account;
					
					if(position >= 0)
					{
						System.out.println("Withdrawing...");
						account = data.read(position);
						account.withdraw(amount);
						System.out.println("New Balance: " + account.getBalance());
						data.write(position, account);
					}
					else
					{
						System.out.println("Could Not Find Account");
					}
				}
				else
				{
					int position = data.find(accountNumber);
					
					if(position >= 0)
					{
						System.out.println("Removing...");
						data.deleteRecord(position);
					}
					else
					{
						System.out.println("Account Does Not Exist.");
					}
				}
				
				System.out.print("Done? (Y|N) ");
				String input = in.next();
				if(input.equalsIgnoreCase("Y"))
				{
					done = true;
					
					// Lets print out all the accounts
					ArrayList<BankAccount> accounts = data.readAll();
					System.out.println("\nAll Accounts [unsorted]: " + accounts);
					Collections.sort(accounts);
					System.out.println("All Accounts[sorted]: " + accounts);
					
					System.out.println("Accounts Length: " + data.size());
					System.out.println("File Length: " + data.getFile().length());
					System.out.println();
					data.printDat();
				}
			}
		}
		finally
		{
			data.close();
		}
		
		// Get all the accounts
		in.close();
	}
}
