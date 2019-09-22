package exercise12;

import java.util.Scanner;

/**
 * Write a method public static int readInt(Scanner in, String prompt, String error, int min, int max)
 * that displays the prompt string, reads an integer, and tests whether it is between the minimum and maximum.
 * If not, print an error message and repeat reading the input. Add the method to a class Input.
 * 
 * @author Mayuresh
 *
 */

public class Input
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	public static int readInt(Scanner in, String prompt, String error, int min, int max)
	{
		boolean outOfBounds = false;
		int num;
		
		do
		{
			System.out.print(prompt);
			num = in.nextInt();
		
			if (num >= min && num <= max)
			{
				outOfBounds = false;
			}
			else
			{
				System.out.println(error);
				
				outOfBounds = true;
			}
		}
		while (outOfBounds == true);
		
		return num;
		
	}
}
