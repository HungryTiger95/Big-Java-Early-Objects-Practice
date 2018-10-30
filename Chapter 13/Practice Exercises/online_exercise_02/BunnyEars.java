package online_exercise_02;

import java.util.Scanner;

/**
 * We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number
 * of ears across all the bunnies recursively (without loops or multiplication).
 * 
 * @author Mayuresh
 *
 */
public class BunnyEars
{
	public static void main(String[] args)
	{
		// Request number of bunnies
		Scanner in = new Scanner(System.in);
		int n;
	
		System.out.print("Please enter the number of bunnies: ");
		n = in.nextInt();
	
		System.out.println("Number of Bunnies: " + n + "\nNumber of Ears: " + bunnyEars(n));
		
		in.close();
	}

	public static int bunnyEars(int n)
	{
		// Base Case
		if (n == 0)
		{
			return 0;
		}
		// All other cases
		else
		{
			return 2 + bunnyEars(n - 1);
		}
	}
}
