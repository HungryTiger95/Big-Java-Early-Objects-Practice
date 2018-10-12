package project_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A store owner keeps a record of daily cash transactions in a text file. Each line contains
 * three items: the invoice number, the cash amount, and the letter P if the amount was paid
 * for or R if it was received. Items are separated by spaces. Write a program that prompts
 * the store owner for the amount of cash at the beginning and end of the day, and the name of the file.
 * Your program should check whether the actual amount of cash at the end of the day equals the expected
 * value.
 * 
 * @author Mayuresh
 *
 */
public class TransactionReader
{
	// Instance Variables
	ArrayList<Transaction> list = new ArrayList<>();
	
	// Constructors
	
	// Methods
	public ArrayList<Transaction> readFile(String fileName) throws IOException
	{
		File inFile = new File("src\\project_9\\".concat(fileName));
		
		try(Scanner in = new Scanner(inFile))
		{
			readData(in);
			return list;
		}
	}
	
	public void readData(Scanner in) throws BadDataException
	{
		while(in.hasNextLine())
		{
			Transaction t = new Transaction();
			
			// Pick Apart the Line and Add Each Variable to a Transaction Object
			if(!in.hasNextInt())
			{
				list.clear();
				throw new BadDataException("Expected Invoice Number");
			}
			t.setInvoiceNumber(in.nextInt());
			
			if(!in.hasNextDouble())
			{
				list.clear();
				throw new BadDataException("Expected Transaction Amount");
			}
			t.setTransactionAmount(in.nextDouble());
			
			if(in.hasNextDouble() || in.hasNextInt())
			{
				list.clear();
				throw new BadDataException("Expected Transaction Type");
			}
			t.setTransactionType(in.next());
			
			list.add(t);
		}
	}
	
	public Double calculateEndBalance(double startBalance)
	{
		double total = startBalance;
		
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getTransactionType().equals("P"))
			{
				total -= list.get(i).getTransactionAmount();
			}
			else
			{
				total += list.get(i).getTransactionAmount();
			}
		}
		
		return total;
	}
	
	public ArrayList<Transaction> getAllTransactions()
	{
		return this.list;
	}
}
