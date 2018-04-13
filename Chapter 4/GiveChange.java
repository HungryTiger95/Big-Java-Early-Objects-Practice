import java.util.Scanner;

/**
 * Business P4.8
 * 
 * Implement a program that directs a cashier how to give change.
 * The program has two inputs: the amount due and the amount received
 * from the customer. Display the dollars, quarters, dimes, nickels, and pennies
 * that the customer should receive in return. In order to avoid roundoff errors,
 * the program user should supply both amounts in pennies.
 * 
 * @author Mayuresh
 *
 */

public class GiveChange
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		final int QUARTER_VALUE = 25;
		final int DIME_VALUE = 10;
		final int NICKEL_VALUE = 5;
		final int PENNY_VALUE = 1;
		int price, payment, change, dollars, quarters, dimes, nickels, pennies;
		
		System.out.print("Price: ");
		price = in.nextInt();
		System.out.print("Payment: ");
		payment = in.nextInt();
		
		in.close();
		
		change = payment - price;
		
		dollars = (change / 100);
		change = change - (dollars * 100);
		System.out.println("Dollars: " + dollars);
		
		quarters = (change / QUARTER_VALUE);
		change = change - (quarters * QUARTER_VALUE);
		System.out.println("Quarters: " + quarters);
		
		dimes = (change / DIME_VALUE);
		change = change - (dimes * DIME_VALUE);
		System.out.println("Dimes: " + dimes);
		
		nickels = (change / NICKEL_VALUE);
		change = change - (nickels * NICKEL_VALUE);
		System.out.println("Nickels: " + nickels);
		
		pennies = (change / PENNY_VALUE);
		change = change - (pennies * PENNY_VALUE);
		System.out.println("Pennies: " + pennies);
	}
}
