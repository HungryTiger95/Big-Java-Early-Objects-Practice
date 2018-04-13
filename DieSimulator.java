import java.util.Random;

/**
 * E2.11
 * 
 * The Random class implements a random number generator, which produces sequences
 * of numbers that appear to be random. To generate random integer, you construct
 * an object of the Random class, and then apply the nextInt method. For example, the call
 * generator.nextInt(6) gives you a random number between 0 and 5.
 * 
 * Write a program DieSimulator that uses the Random class to simulate the cast of a die,
 * printing a random number between 1 and 6 everytime that the program is run.
 * 
 * @author Mayuresh
 *
 */

public class DieSimulator
{
	public static void main (String[] args)
	{
		Random generator = new Random();
		int dieCast = generator.nextInt(6) + 1;
		
		System.out.println("Roll: " + dieCast);
	}
}
