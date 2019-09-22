import java.util.Scanner;

/**
 * E5.5 / E5.6
 * 
 * Write a program that reads three numbers and prints "increasing" if they are in
 * increasing order, "decreasing" if they are in decreasing order, and "neither" otherwise.
 * 
 * Ask whether or not increasing/decreasing should be strict or lenient. In lenient mode, if
 * all numbers are the same they are both increasing and decreasing.
 * 
 * Also if check if all the numbers are the same or different and print "all the same", "all different",
 * or "neither", accordingly.
 * 
 * @author Mayuresh
 *
 */

public class IncreasingDecreasing
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int mode, num1, num2, num3;
		
		System.out.print("Enter 1 for Lenient or 2 for Strict Mode: ");
		mode = in.nextInt();
		
		System.out.print("Please enter 3 integers: ");
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		
		in.close();
		
		if (mode == 1)
		{	
			if (num1 < num2 && num2 < num3)
			{
				System.out.println("increasing");
			}
			else if (num1 > num2 && num2 > num3)
			{
				System.out.println("decreasing");
			}
			else if (num1 == num2 && num2 < num3)
			{
				System.out.println("increasing");
			}
			else if (num1 == num2 && num2 > num3)
			{
				System.out.println("decreasing");
			}
			else if (num1 < num2 && num2 == num3)
			{
				System.out.println("increasing");
			}
			else if (num1 > num2 && num2 == num3)
			{
				System.out.println("decreasing");
			}
			else
			{
				System.out.println("neither");
			}
		}
		else if (mode == 2)
		{
			if (num1 < num2 && num2 < num3)
			{
				System.out.println("increasing");
			}
			else if (num1 > num2 && num2 > num3)
			{
				System.out.println("decreasing");
			}
			else
			{
				System.out.println("neither");
			}
		}
		else
		{
			System.out.println("This is not supported");
		}
	}
}
