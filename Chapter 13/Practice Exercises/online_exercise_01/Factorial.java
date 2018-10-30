package online_exercise_01;

import java.util.Scanner;

/**
 * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
 * Compute the result recursively (without loops).
 * 
 * @author Mayuresh
 *
 */
public class Factorial
{
	public static void main(String[] args)
	{
		int n;
		Scanner in = new Scanner(System.in);
		
		// Request user input of the factorial
		System.out.print("Please enter nth Factorial: ");
		n = in.nextInt();
		
		// Print out the factorial
		System.out.println("nth Factorial: " + n + "\nAnswer: " + factorial(n));
		
		in.close();
	}
	
	public static int factorial(int n)
	{
		// Base Case:
		if (n == 1)
		{
			return 1;
		}
		// Recursion
		else
		{
			return n * factorial(n - 1);
		}
	}
}
