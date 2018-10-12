package project_9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		TransactionReader reader = new TransactionReader();
		
		ArrayList<Transaction> log = new ArrayList<Transaction>();
		
		boolean isDone = false;
		while(!isDone)
		{
			try
			{
				System.out.print("Enter Input File: ");
				String fileName = in.next();
				
				System.out.print("Enter Day Start Cash: ");
				double start = in.nextDouble();
				
				System.out.print("Enter Expected Day End Cash: ");
				double end = in.nextDouble();
				
				log = reader.readFile(fileName);
				
				// Print the transaction log
				System.out.println("Printing Log...");
				for(int i = 0; i < log.size(); i++)
				{
					System.out.print("[" + log.get(i).getInvoiceNumber() + "]");
					System.out.print("[" + log.get(i).getTransactionAmount() + "]");
					System.out.println("[" + log.get(i).getTransactionType() + "]");
				}
				
				// Calculate the end balance
				double endBal = reader.calculateEndBalance(start);
				
				// Compare whether or not the end balance equals the expected balance
				if(endBal != end)
				{
					System.out.println("Day End Balance is Not the Expected Balance: " + endBal);
				}
				else
				{
					System.out.println("Day End Balance is the Expected Balance: " + endBal);
				}
				
				isDone = true;
			}
			catch(FileNotFoundException e)
			{
				System.out.println("ERROR: File Not Found");
			}
			catch(BadDataException e)
			{
				System.out.println("Bad Data: " + e.getMessage());
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
		in.close();
	}
}
