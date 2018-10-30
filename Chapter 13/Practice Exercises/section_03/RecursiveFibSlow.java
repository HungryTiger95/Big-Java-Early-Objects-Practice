package section_03;

import java.util.Scanner;

/**
 * As you have seen in this chapter, recursion can be a powerful tool for implementing complex algorithms.
 * On the other hand, recursion can lead to algorithms that perform poorly.
 * 
 * Consider the Fibonacci sequence: a sequence of numbers defined by the equation
 * 
 * 		f1 = 1;
 * 		f2 = 1;
 * 		fn = fn-1 + fn-2;
 * 
 * It is easy to extend this sequence indefinitely. Just keep appending the sum of the last two values of
 * the sequence.
 * 
 * We would like to write a method that computes fn for any value of n. Here we translate the definition
 * directly into a recursive method:
 * 
 * 		public static long fib(int n)
 *		{
 *			if(n <= 2)
 *			{
 *				return 1;
 *			}
 *			else
 *			{
 *				return fib(n - 1) + fib(n - 2);
 *			}
 *		}
 *
 * @author Mayuresh
 *
 */
public class RecursiveFibSlow
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = in.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			long f = fib(i);
			System.out.println("fib(" + i + ") = " + f);
		}
		System.out.println();
		
		in.close();
	}
	
	/**
	 * Computes a Fibonacci number
	 * @param n an integer
	 * @return the nth fibonacci number
	 */
	public static long fib(int n)
	{
		if(n <= 2)
		{
			return 1;
		}
		else
		{
			return fib(n - 1) + fib(n - 2);
		}
	}
}
