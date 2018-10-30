package exercise_13_11;

import java.util.Scanner;

/**
 * The following method was known to the ancient Greeks for computing square roots. Given the
 * value x > 0 and a guess g for the square root, a better guess is (g + x / g) / 2. Write a
 * recursive helper method public static sauareRootGuess(double x, double g). If g^2 is approximately
 * equal to x, return g, otherwise, return squareRootGuess with the better guess. Then write a method
 * public static squareRoot(double x) that uses the helper method.
 * 
 * @author Mayuresh
 *
 */
public class SquareRoot
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter X: ");
		double x = in.nextInt();
		
		System.out.printf("Answer: %.3f", squareRootGuess(x));
		
		in.close();
	}
	
	/**
	 * Gets the square root of a given number
	 * @param x the number
	 * @return the square root of x
	 */
	public static double squareRootGuess(double x)
	{
		return squareRootGuess(x, x - 1);
	}
	
	/**
	 * Gets the square root of a number given a guess
	 * @param x the number to find the square root of
	 * @param g a guess
	 * @return the square root
	 */
	public static double squareRootGuess(double x, double g)
	{
		if(Math.abs(Math.sqrt(x) - g) < .001)
		{
			return g;
		}
		else
		{
			double betterGuess = (g + (x / g)) / 2;
			return squareRootGuess(x, betterGuess);
		}
	}
}
