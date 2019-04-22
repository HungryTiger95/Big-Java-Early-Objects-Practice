package exercise_12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BankAccountDemo
{
	public static void main(String[] args)
	{
		BankAccount a1 = new BankAccount(1000);
		BankAccount a2 = new BankAccount(10000);
		BankAccount a3 = new BankAccount(5000);
		BankAccount a4 = new BankAccount(1000);
		BankAccount a5 = new BankAccount(10000);
		BankAccount a6 = new BankAccount(1100);
		BankAccount a7 = new BankAccount(10100);
		
		Set<BankAccount> bankAccounts = new HashSet<BankAccount>();
		bankAccounts.add(a1);
		bankAccounts.add(a2);
		bankAccounts.add(a3);
		bankAccounts.add(a4);
		bankAccounts.add(a5);
		bankAccounts.add(a6);
		bankAccounts.add(a7);
		
		Iterator<BankAccount> iter = bankAccounts.iterator();
		while(iter.hasNext())
		{
			BankAccount account = iter.next();
			System.out.print("[HashCode=" + account.hashCode() + "]: ");
			System.out.println(account.toString());
		}
	}
}
