import java.util.Scanner;

/**
 * P6.3
 * 
 * Factoring of Integers
 * 
 * Write a program that asks the user for an integer and then print out all its factors.
 * Use a class FactorGenerator with a constructor FactoGenerator(int numberToFactor) and methods
 * nextFactor and hasMoreFactors. Supply a class Factoring whose main method reads
 * a user input, constructs a FactorGenerator object, and prints the factors.
 * 
 * @author Mayuresh
 *
 */
public class Factoring
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Value: ");
		int n = in.nextInt();
		
		in.close();
		
		FactorGenerator factorGen = new FactorGenerator(n);
		
		while(factorGen.hasMoreFactors())
		{
			System.out.println(factorGen.nextFactor());
		}
	}
}
