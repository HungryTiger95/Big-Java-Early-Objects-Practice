package how_to_example_1;

import java.util.Scanner;

public class BankAccountDemo
{
	public static void main(String[] args)
	{
		BankAccount[] accounts = new BankAccount[2];
		BankAccount johnSavings = new SavingsAccount();
		BankAccount johnChecking = new CheckingAccount();
		
		accounts[0] = johnSavings;
		accounts[1] = johnChecking;
		
		System.out.println("John Savings Account Number: " + johnSavings.getAccountNumber());
		System.out.println("John Checking Account Number: " + johnChecking.getAccountNumber());
		System.out.println(johnSavings.toString());
		System.out.println(johnChecking.toString());

		Scanner in = new Scanner(System.in);
		
		boolean done = false;
		while(!done)
		{
			System.out.print("D)eposit W)ithdraw M)onth Q)uit: ");
			String input = in.next();
			
			if(input.equals("D") || input.equals("W"))
			{
				System.out.print("Enter account number and amount: ");
				int num = in.nextInt();
				double amount = in.nextDouble();
				
				if(input.equals("D"))
				{
					accounts[num].deposit(amount);
				}
				else
				{
					accounts[num].withdraw(amount);
				}
				
				System.out.println("Balance: " + accounts[num].getBalance());
			}
			else if(input.equals("M"))
			{
				for(int i = 0; i < accounts.length; i++)
				{
					accounts[i].monthEnd();
					System.out.println(i + " " + accounts[i].getBalance());
				}
			}
			else if(input.equals("Q"))
			{
				done = true;
			}
			else
			{
				System.out.println("Wrong Input:");
				break;
			}
		}
		
		System.out.println("Savings Balance: " + johnSavings.getBalance());
		System.out.println("Checking Balance: " + johnChecking.getBalance());
		System.out.println("Equal Bank Accounts: " + johnSavings.equals(johnChecking));
		
		in.close();
	}
}
