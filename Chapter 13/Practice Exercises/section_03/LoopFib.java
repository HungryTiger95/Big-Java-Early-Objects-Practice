package section_03;

import java.util.Scanner;

/**
 * If we imitate the pencil-and-paper process, then we get the following program:
 * 
 * 		public static long fib(int n)
 *		{
 *			if(n <= 2)
 *			{
 *				return 1;
 *			}
 *			else
 *			{
 *				long olderValue = 1;
 *				long oldValue = 1;
 *				long newValue = 1;
 *			
 *				for(int i = 3; i <= n; i++)
 *				{
 *					newValue = oldValue + olderValue;
 *					olderValue = oldValue;
 *					oldValue = newValue;
 *				}
 *				return newValue;
 *			}
 *		}
 *
 * This method runs much faster than the recursive version.
 *
 * In this example of the fib method, the recursive solution was easy to program
 * because it followed the mathematical definition, but it ran far more slowly than
 * the iterative solution, because it computed many intermediate results multiple times.
 * 
 * @author Mayuresh
 *
 */
public class LoopFib
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
		
		in.close();
	}
	
	public static long fib(int n)
	{
		if(n <= 2)
		{
			return 1;
		}
		else
		{
			long olderValue = 1;
			long oldValue = 1;
			long newValue = 1;
			
			for(int i = 3; i <= n; i++)
			{
				newValue = oldValue + olderValue;
				olderValue = oldValue;
				oldValue = newValue;
			}
			return newValue;
		}
	}
}
