import java.util.Scanner;

/**
 * E5.17
 * 
 * The original U.S. income tax of 1913 was quite simple. The tax was:
 * 
 * 		* 1 percent on the first 50,000
 * 		* 2 percent on the amount over 50,000 up to 75,000
 * 		* 3 percent on the amount over 75,000 up to 100,000
 * 		* 4 percent on the amount over 100,00 up to 250,000
 * 		* 5 percent on the amount over 250,000 up to 500,000
 * 		* 6 percent on the amount over 500,000
 * 
 * There was no separate schedule for single or married taxpayers. Write a program that
 * computes the income tax according to the schedule.
 * 
 * @author Mayuresh
 *
 */
public class IncomeTax
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Income: ");
		int income = in.nextInt();
		double tax;
		
		in.close();
		
		if(income > 500000)
		{
			tax = 6.0 / 100.0;
			System.out.println("Income Tax: " + tax * income);
		}
		else if(income > 250000)
		{
			tax = 5.0 / 100.0;
			System.out.println("Income Tax: " + tax * income);
		}
		else if(income > 100000)
		{
			tax = 4.0 / 100.0;
			System.out.println("Income Tax: " + tax * income);
		}
		else if(income > 75000)
		{
			tax = 3.0 / 100.0;
			System.out.println("Income Tax: " + tax * income);
		}
		else if(income > 50000)
		{
			tax = 2.0 / 100.0;
			System.out.println("Income Tax: " + tax * income);
		}
		else
		{
			tax = 1.0 / 100.0;
			System.out.println("Income Tax: " + tax * income);
		}
	}
}
