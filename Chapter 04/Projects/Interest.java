import java.util.Scanner;

/**
 * Business P4.9
 * 
 * An online bank wants you to create a program that shows prospective customers
 * how their deposits will grow. Your program should read the initial balance and the
 * annual interest rate. Interest is compounded monthly. Print out the balances after the
 * first three months.
 * 
 * @author Mayuresh
 *
 */

public class Interest
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double initialBalance, interestRate, balance;
		
		System.out.print("Please enter initial balance: ");
		initialBalance = in.nextDouble();
		
		System.out.print("Please enter interest rate: ");
		interestRate = in.nextDouble();
		
		in.close();
		
		interestRate = interestRate / 100;
		balance = initialBalance;
		
		balance = balance + (interestRate * balance / 12);
		System.out.printf("After first month: %.2f\n", balance);
		
		balance = balance + (interestRate * balance / 12);
		System.out.printf("After second month: %.2f\n", balance);
		
		balance = balance + (interestRate * balance / 12);
		System.out.printf("After third month: %.2f\n", balance);
	}
}
