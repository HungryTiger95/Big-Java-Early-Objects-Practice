package section_04;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * This program demonstrates serialization of a Bank object.
 * If a file with serialized data exists, then it is loaded.
 * Otherwise the program starts with a new bank.
 * Bank accounts are added to the bank. Then the bank object
 * is saved.
 * @author Mayuresh
 *
 */
public class SerialDemo
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Bank firstBankOfJava;
		
		/*
		 * Construct a file object called javaBank.dat.
		 * 
		 * If the file already exists, then construct a ObjectInputStream and
		 * read in the the object that exists in the file. then close the
		 * the ObjectInputStream.
		 * 
		 * If the file does not exist, then create a new Bank object and add two
		 * accounts to the bank.
		 */
		File f = new File("javaBank2.dat");
		if(f.exists())
		{
			System.out.println("Bank Exists, Reading Bank data...");
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
			firstBankOfJava = (Bank) in.readObject();
			in.close();
		}
		else
		{
			System.out.println("Creating a new Bank...");
			firstBankOfJava = new Bank();
			firstBankOfJava.addAccount(new BankAccount(1001, 20000));
			firstBankOfJava.addAccount(new BankAccount(1015, 10000));
			firstBankOfJava.addAccount(new SavingsAccount(1020, 15000));
		}
		
		// Deposit some money
		BankAccount a = firstBankOfJava.find(1001);
		a.deposit(100);
		System.out.println(a.getAccountNumber() + ": " + a.getBalance());
		
		a = firstBankOfJava.find(1015);
		System.out.println(a.getAccountNumber() + ": " + a.getBalance());
		
		SavingsAccount b = (SavingsAccount) firstBankOfJava.find(1020);
		System.out.println(a.getAccountNumber() + ": " + a.getBalance() + " IR: " + b.getInterestRate());
		
		// output the bank object into a file
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
		out.writeObject(firstBankOfJava);
		out.close();
	}
}
