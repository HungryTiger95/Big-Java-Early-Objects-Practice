import java.util.Scanner;

/**
 * Business P4.7
 * 
 * Translate the pseudocode:
 * 
 * 		1)	Assign price to integer variable
 * 		2)	Multiply the difference price - dollars by 100 and add .5
 * 		3)  Assign result to variable cents
 * 
 * @author Mayuresh
 *
 */

public class Money
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int dollars, cents;
		double price;
		
		System.out.print("Price: ");
		price = in.nextDouble();
		
		in.close();
		
		dollars = (int) price;
		
		cents = (int) ((price - dollars) * 100);
		System.out.println(dollars + " dollars and " + cents + " cents");
	}
}
