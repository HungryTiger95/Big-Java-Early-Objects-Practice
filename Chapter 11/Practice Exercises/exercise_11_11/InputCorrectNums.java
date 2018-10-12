package exercise_11_11;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a program that asks the user to input a set of floating-point values. When the user enters
 * a value that is not a number, give the user a second chance to enter the value. After two
 * chances, quit reading input. Add all correctly specified values and print the sum when the user is
 * done entering data. Use the exception handling to detect improper inputs.
 * 
 * @author Mayuresh
 *
 */
public class InputCorrectNums
{
	public static void main(String[] args)
	{
		int chances = 3;
		double sum = 0;
		double num = 0;
		Scanner in = new Scanner(System.in);
		
		while(chances > 0)
		{
			try
			{
				System.out.print("Enter a Value: ");
				num = in.nextDouble();
				sum += num;
			}
			catch(InputMismatchException exception)
			{
				String badInput = in.nextLine();			// "Catches" the wrong input, assuming its a string
				System.out.println("You have " + (chances - 1) + " chances left");
				chances--;
			}
		}
		
		System.out.printf("Sum = %.2f\n", sum);
		
		in.close();
	}
}
