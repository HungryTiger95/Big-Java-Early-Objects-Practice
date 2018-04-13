/**
 * E1.4
 * 
 * Write a program that prints the balance of an account after the first, second, and third
 * year. The account has an initial balance of 1,000 and earns 5 percent interest per year.
 * 
 * @author Mayuresh
 *
 */

public class Interest
{
	public static void main (String[] args)
	{
		double balance;
		double initialBalance = 1000;
		double interestRate = 5.0 / 100;
		
		// Initial Balance
		System.out.println("Initial Balance: " + initialBalance);
		
		// 1 Year Interest
		balance = initialBalance + (initialBalance * interestRate);
		System.out.println("Balance after One Year Interest: " + balance);
		
		// 2 Years Interest
		balance = balance + (balance * interestRate);
		System.out.println("Balance after Two Years Interest: " + balance);
		
		// 3 Years Interest
				balance = balance + (balance * interestRate);
				System.out.println("Balance after Three Years Interest: " + balance);
	}
}
