package exercise21.testing;

import exercise21.BankAccount;

public class BankAccountTester
{
	public static void main(String[] args)
	{
		BankAccount mayo = new BankAccount(1000);
		
		System.out.println("Statement: " + mayo.getStatement());
		
		mayo.deposit(150);
		mayo.withdraw(500);
		mayo.withdraw(600);
		mayo.deposit(1500);
		mayo.withdraw(2000);
		mayo.deposit(500);
		mayo.withdraw(2000);
		
		System.out.println("Statement: " + mayo.getStatement());
		System.out.printf("Balance: %.2f\n", mayo.getBalance());
	}
	
}
