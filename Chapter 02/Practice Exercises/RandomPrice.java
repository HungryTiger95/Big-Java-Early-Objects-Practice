import java.util.Random;

/**
 * E2.12
 * 
 * Write a program RandomPrice that prints a random price between $10.00 and $19.95
 * every time the program is run.
 * 
 * @author Mayuresh
 *
 */

public class RandomPrice
{
	public static void main (String[] args)
	{
		Random price = new Random();
		
		double realPrice = price.nextDouble();
		realPrice = realPrice * (19.95 - 10.00) + 10;
		System.out.println(realPrice);
	}
}
