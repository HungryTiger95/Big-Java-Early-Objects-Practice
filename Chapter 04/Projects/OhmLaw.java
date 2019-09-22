import java.util.Scanner;

/**
 * Science P4.11
 * 
 * Consider a circuit. Write a program that reads the resistances of the three
 * resistors and computes the total resistance, using Ohm's law.
 * 
 * @author Mayuresh
 *
 */
public class OhmLaw
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		double r1, r2, r3, totalR;
		
		System.out.print("Enter Resistance: ");
		r1 = in.nextInt();
		
		System.out.print("Enter Resistance: ");
		r2 = in.nextInt();
		
		System.out.print("Enter Resistance: ");
		r3 = in.nextInt();
		
		in.close();
		
		totalR = r1 + r2 + r3;
		
		System.out.println("Total Resistance: " + totalR);
	}
}
