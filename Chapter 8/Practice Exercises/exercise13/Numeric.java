package exercise13;

/**
 * Consider the following algorithm for computing x^n for an integer n. If n < 0, x ^n
 * is 1/x ^ -1. If n is positive and even, then x ^ n = (x ^ n/2) ^ 2. If n is positive and odd, then
 * x ^ n = x ^ n - 1 * x. Implement a static method double intPower(double x, int n) that uses
 * this algorithm. Add it to a class called Numeric.
 * 
 * @author Mayuresh
 *
 */

public class Numeric
{
	
	// Instance Variables
	
	// Constructors
	
	// Methods
	public static double  intPower(double x, int n)
	{
		if(n > 0 && n % 2 == 0)
		{
			return Math.pow(Math.pow(x, n / 2.0), 2);
		}
		else if(n > 0 && n % 2 != 0)
		{
			return Math.pow(x, n - 1) * x;
		}
		else
		{
			return (1 / Math.pow(x, -n));
		}
	}
}
