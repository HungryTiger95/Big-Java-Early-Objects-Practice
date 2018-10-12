package project_6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class BankTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Bank bank = new Bank();
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		
		boolean isDone = false;
		while(!isDone)
		{
			try
			{
				System.out.print("Enter the Input File Name: ");
				String fileName = in.next();
				
				accounts = bank.readFile(fileName);
				
				System.out.println("Printing Accounts...");
				for(int i = 0; i < accounts.size(); i++)
				{
					System.out.print("Account: " + accounts.get(i).getAccountNumber());
					System.out.println(" Balance: " + accounts.get(i).getBalance());
				}
				
				System.out.println("Largest Bank Account: " + accounts.get(bank.getLargestAccount()).getAccountNumber());
				
				isDone = true;
			}
			catch(FileNotFoundException e)
			{
				accounts.clear();
				System.out.println("ERROR: File Not Found");
			}
			catch(BadDataException e)
			{
				accounts.clear();
				System.out.println("Bad Data: " + e.getMessage());
			}
			catch(IOException e)
			{
				accounts.clear();
				e.printStackTrace();
			}
		}
		
		in.close();
	}
}
