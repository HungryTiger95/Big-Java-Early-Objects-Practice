package exercise_13.bank_account_testing;

import exercise_13.*;

public class AccountMeasurerTester
{
	public static void main(String[] args)
	{
		Measurable<BankAccount> accountMeas = new Measurer<>();
		BankAccount[] accounts = new BankAccount[5];
		accounts[0] = new BankAccount(2000);
		accounts[1] = new BankAccount(3000);
		accounts[2] = new BankAccount(4000);
		accounts[3] = new BankAccount(5000);
		accounts[4] = new BankAccount(6000);
		
		System.out.println("Largest: " + Data.max(accounts, accountMeas));
		System.out.println("Average: " + Data.average(accounts, accountMeas));
	}
}
