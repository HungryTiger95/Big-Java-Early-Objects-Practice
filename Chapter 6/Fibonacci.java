import java.util.Scanner;

/**
 * P6.2
 * 
 * The Fibonacci numbers are defined by the sequence
 * 
 * f1 = 1
 * f2 = 1
 * fn = f(n-1) _ f(n-2)
 * 
 * Reformulate that as
 * 
 * fold1 = 1
 * fold2 = 2
 * fnew = fold1 + fold2
 * 
 * After that, discard fold2, which is no longer needed, and set fold2 to fold1 and fold1
 * to fnew. Repeat an appropriate number of times.
 * 
 * Implement a program that prompts the user for an integer n and prints the nth Fibonacci
 * number, using the above algorithm
 * 
 * @author Mayuresh
 *
 */
public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double fold1 = 1;
		double fold2 = 1;
		double fNew;
		
		System.out.print("Enter Fib Number: ");
		int n = in.nextInt();
		
		in.close();
		
		for(int i = 0; i < n; i++)
		{
			if(i == 0)
			{
				System.out.println("f1 = " + fold1);
			}
			else if(i == 1)
			{
				System.out.println("f2 = " + fold2);
			}
			else
			{
				fNew = fold1 + fold2;
				System.out.println("f" + (i + 1) + "= " + fNew);
				
				fold2 = fold1;
				fold1 = fNew;
			}
		}
	}
}
