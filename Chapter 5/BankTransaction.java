import java.util.Scanner;

/**
 * Business P5.8
 * 
 * Write a program to simulate a bank transaction. There are two bank accounts: checking
 * and savings. First, ask for the initial balances of the bank accounts; reject negative
 * balances. Then ask for the transactions; options are deposit, withdrawal, and transfer.
 * Then ask for the account; options are checking and savings. Reject transactions that
 * overdraw an account. At the end, print the balances of both accounts.
 * 
 * @author Mayuresh
 *
 */
public class BankTransaction
{
	public static void main(String[] args)
	{	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Initial Balance of Checking Account: ");
		double checkingInitialBalance = in.nextDouble();
		
		System.out.print("Enter Initial Balance of Savings Account: ");
		double savingsInitialBalance = in.nextDouble();
		
		BankAccount savings = new BankAccount(savingsInitialBalance);
		BankAccount checking = new BankAccount(checkingInitialBalance);
		
		// Ask for transactions
		System.out.print("Checkings[1] or Savings[2]");
		int accountChoice = in.nextInt();
		
		System.out.print("Deposit[1], Withdrawal[2], or Transfer[3]? ");
		int choice = in.nextInt();
		
		System.out.print("Enter amount: ");
		double amount = in.nextDouble();
		
		in.close();
		
		if(choice == 1)
		{
			if(accountChoice == 1)
			{
				checking.deposit(amount);
			}
			else if(accountChoice == 2)
			{
				savings.deposit(amount);
			}
			else
			{
				System.out.println("Account Choice is Incorrect");
			}
		}
		else if(choice == 2)
		{
			if(accountChoice == 1)
			{
				checking.withdraw(amount);
			}
			else if(accountChoice == 2)
			{
				savings.withdraw(amount);
			}
			else
			{
				System.out.println("Account Choice is Incorrect");
			}
		}
		else if(choice == 3)
		{
			if(accountChoice == 1)
			{
				checking.transferTo(savings, amount);
			}
			else if(accountChoice == 2)
			{
				savings.transferTo(checking, amount);
			}
			else
			{
				System.out.println("Account Choice is Incorrect");
			}
		}
		else
		{
			System.out.println("Incorrect Choice");
		}
		
		System.out.printf("Savings Balance: %5.2f\nChecking Balance: %5.2f", savings.getBalance(), checking.getBalance());
	}

}
