package section_03;

import java.util.Scanner;

/**
 * The RecursiveFibSlow program is certainly simple, and the method will work correctly. But watch the output
 * closely as you run the test program. The first few calls to the fib method are fast. For larger
 * values, through, the program pauses an amazingly long time between outputs.
 * 
 * To find out the problem, let us insert trace messages into the method:
 * 
 * 		public static long fib(int n)
 *		{
 *			System.out.println("Entering Fib: n = " + n);
 *		
 *			long f;
 *		
 *			if(n <= 2)
 *			{
 *				return 1;
 *			}
 *			else
 *			{
 *				f = fib(n - 1) + fib(n - 2);
 *			
 *				System.out.println("Exiting Fib: n = " + n + " return value = " + f);
 *				return f;
 *			}
 *		}
 *
 * Figure 2 in the book shows the pattern of recursive calls for computing fib(n).
 * The figure shows why the method takes so long. The method is computing the same values over
 * and over. For example, the computation of fib(6) calls fib(4) twice and fib(3) three times.
 * 
 * @author Mayuresh
 *
 */
public class RecursiveFibSlowTrace
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = in.nextInt();
		
		long f = fib(n);
		
		System.out.println("Fib(" + n + ") = " + f);
		
		in.close();
	}
	
	/**
	 * Computes a Fibonacci number
	 * @param n an integer
	 * @return the nth fibonacci number
	 */
	public static long fib(int n)
	{
		System.out.println("Entering Fib: n = " + n);
		
		long f;
		
		if(n <= 2)
		{
			return 1;
		}
		else
		{
			f = fib(n - 1) + fib(n - 2);
			
			System.out.println("Exiting Fib: n = " + n + " return value = " + f);
			return f;
		}
	}
}
