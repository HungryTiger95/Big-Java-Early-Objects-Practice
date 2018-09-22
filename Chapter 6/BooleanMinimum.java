import java.util.Scanner;

/**
 * E6.6
 * 
 * Translate the following pseudocode for finding the minimum value from a set of inputs into a Java
 * program.
 * 
 * 		Set a Boolean variable "first" to true
 * 		While another value has been read successfully
 * 			if first is true
 * 				Set the minimum to the value
 * 				Set first to false
 * 			Else if the value is less than the minimum
 * 				Set the minimum to the value
 * 		Print the minimum
 * 
 * @author Mayuresh
 *
 */
public class BooleanMinimum
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		boolean first = true;
		double min = Double.MAX_VALUE;
		double val;
		
		System.out.print("Please Enter A Number (Q) to quit: ");
		do
		{
			val = in.nextDouble();
			
			if (first == true)
			{
				min = val;
				first = false;
			}
			else if (val < min)
			{
				min = val;
			}
			
			System.out.print("Please Enter A Number (Q) to quit: ");
		}
		while (in.hasNextDouble());
		
		in.close();
		
		System.out.println("Minimum is: " + min);
	}
}
