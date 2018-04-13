import java.util.Scanner;

/**
 * Business E6.17 / Business E6.18
 * 
 * Write a program that first asks the user to type today's price for one
 * dollar in Japanese yen, then reads U.S. dollar values and converts each
 * to yen. Use 0 as a sentinel.
 * 
 * Write a program that first asks the user to type in today's price of one
 * dollar in Japanese yen, then reads U.S. dollar values and converts each to
 * Japanese yen. Use 0 as the sentinel value to denote the end of dollar inputs.
 * Then the program reads a sequence of yen amounts and converts them to dollars.
 * The second sequence is terminated by another zero value.
 * 
 * 1 USD = 109.22 yen
 * 1 yen = .0092 USD
 * 
 * @author Mayuresh
 *
 */
public class CurrencyConversion
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		final double DOLLAR_TO_YEN = 107.23;
		final double YEN_TO_DOLLAR = .0093;
		
		double val;
		
		System.out.print("Dollar: ");
		val = in.nextDouble();
		
		while(val != 0)
		{
			val = val * DOLLAR_TO_YEN;
			System.out.printf("%.2f%5s", val, " Yen\n\n");
			
			System.out.print("Dollar: ");
			val = in.nextDouble();
		}
		
		System.out.println("======================================================");
		
		System.out.print("Yen: ");
		val = in.nextDouble();
		
		while(val != 0)
		{
			val = val * YEN_TO_DOLLAR;
			System.out.printf("%.2f%5s", val, " Dollar\n\n");
			
			System.out.print("Yen: ");
			val = in.nextDouble();
		}
		
		in.close();
	}
}
