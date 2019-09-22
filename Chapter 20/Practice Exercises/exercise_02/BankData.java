package exercise_02;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 * This class is a conduit to a random access file
 * containing bank account records
 * @author Mayuresh
 *
 */
public class BankData
{
	private RandomAccessFile file;
	
	public static final int INT_SIZE = 4;
	public static final int DOUBLE_SIZE = 8;
	public static final int RECORD_SIZE = INT_SIZE + DOUBLE_SIZE;
	
	/**
	 * Constructs a BankData object that is not associated with a file
	 */
	public BankData()
	{
		this.file = null;
	}
	
	/**
	 * Opens the data file
	 * @param fileName the name of the file containing bank account information
	 * @throws IOException
	 */
	public void open(String fileName) throws IOException
	{
		if(this.file != null)
		{
			this.file.close();
		}
		this.file = new RandomAccessFile(fileName, "rw");
	}
	
	/**
	 * Gets the number of accounts in the file
	 * @return the number of accounts
	 * @throws IOException
	 */
	public int size() throws IOException
	{
		return (int) (this.file.length() / RECORD_SIZE);
	}
	
	/**
	 * Closes the data file
	 * @throws IOException
	 */
	public void close() throws IOException
	{
		if(this.file != null)
		{
			this.file.close();
		}
		this.file = null;
	}
	
	/**
	 * Reads a bank account record
	 * @param n the index of the account in the data file
	 * @return a bank account object initialized with the file data
	 * @throws IOException
	 */
	public BankAccount read(int n) throws IOException
	{
		this.file.seek(n * RECORD_SIZE);
		
		int accountNumber = file.readInt();
		double balance = file.readDouble();
		return new BankAccount(accountNumber, balance);
	}
	
	/**
	 * Returns an array list of all the bank accounts in the data file
	 * @return the array list of bank accounts
	 * @throws IOException
	 */
	public ArrayList<BankAccount> readAll() throws IOException
	{
		ArrayList<BankAccount> accounts = new ArrayList<>();
		
		for(int i = 0; i < size(); i++)
		{
			this.file.seek(i * RECORD_SIZE);
			int accountNumber = this.file.readInt();
			double balance = this.file.readDouble();
			
			if(accountNumber != 0)
			{
				BankAccount a = new BankAccount(accountNumber, balance);
				accounts.add(a);
			}
		}
		
		return accounts;
	}
	
	/**
	 * Finds the position of a bank account with a given number
	 * @param accountNumber the number to find
	 * @return the position of the account with the given number,
	 * or -1 if there is no such account
	 * @throws IOException
	 */
	public int find(int accountNumber) throws IOException
	{
		for(int i = 0; i < size(); i++)
		{
			this.file.seek(i * RECORD_SIZE);
			int a = this.file.readInt();
			
			if(a == accountNumber) { return i; }
		}
		return -1;
	}
	
	/**
	 * Writes a bank account record to the data file
	 * @param n the index of the account in the data file
	 * @param account the account to write
	 * @throws IOException
	 */
	public void write(int n, BankAccount account) throws IOException
	{
		this.file.seek(n * RECORD_SIZE);
		this.file.writeInt(account.getAccountNumber());
		this.file.writeDouble(account.getBalance());
	}
	
	/**
	 * Deletes a record in the data file
	 * @param n the index of the account in the data file
	 * @throws IOException
	 */
	public void deleteRecord(int n) throws IOException
	{
		this.file.seek(n * RECORD_SIZE);
		this.file.writeInt(0);
		this.file.writeDouble(0);
	}
}
