import java.util.Scanner;

/**
 * E5.1 / E5.2
 * 
 * Write a program that reads an integer and prints whether it is negative, zero, or
 * positive.
 * 
 * Write a program that reads a floating-point number and prints "zero" if the number
 * is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value
 * of the number is less than 1, or "large" if it exceeds 1,000,000.
 * 
 * @author Mayuresh
 *
 */

public class NegativeZeroPositive
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int num;
		double num2;
		
		System.out.print("Please enter an integer: ");
		num = in.nextInt();
		
		System.out.print("This number is: ");
		if (num == 0)
		{
			System.out.println("zero");
		}
		else if (num > 0)
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("negative");
		}
		
		System.out.println();
		
		System.out.print("Please enter a floating-point number: ");
		num2 = in.nextDouble();
		
		System.out.print("This number is: ");
		if (num2 == 0)
		{
			System.out.println("zero");
		}
		else if (num2 > 0 && num2 < 1)
		{
			System.out.println("small positive");
		}
		else if (num2 > 0 && num2 < 1000000)
		{
			System.out.println("positive");
		}
		else if (num2 > 1000000)
		{
			System.out.println("large positive");
		}
		else if (num2 < 0 && num2 > -1)
		{
			System.out.println("small negative");
		}
		else if (num2 < 0 && num2 > -1000000)
		{
			System.out.println("negative");
		}
		else if (num2 < -1000000)
		{
			System.out.println("large negative");
		}
		
		in.close();
	}
}
