import java.util.Scanner;

/**
 * E6.2
 * 
 * Write programs that read a sequence of integer inputs and print
 * 		1) the smallest and largest of the inputs.
 * 		2) the number of even and odd inputs.
 * 		3) cumulative totals
 * 		4) all adjacent duplicates
 * 
 * Sample Input: 1 3 3 4 5 5 6 6 6 2 q
 * 
 * @author Mayuresh
 *
 */

public class SequenceOfIntegers
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		int input;
		int largest, smallest;
		int evenCount, oddCount;
		int sum;
		
		System.out.print("Please Enter a Sequence of Integers, q to Quit: ");
		
		input = in.nextInt();
		
		evenCount = 0;
		oddCount = 0;
		if (input % 2 == 0)
		{
			evenCount++;
		}
		else
		{
			oddCount ++;
		}
		
		largest = input;
		smallest = input;
		sum = input;
		
		while (in.hasNextInt())
		{
			int previousVal = input;
			input = in.nextInt();
			
			// Find Largest Value
			if (input > largest)
			{
				largest = input;
			}
			
			// Find Smallest Value
			if (input < smallest)
			{
				smallest = input;
			}
			
			// Find Number of Even Values
			if (input % 2 == 0)
			{
				evenCount++;
			}
			
			// Find Number of Odd Values
			if (input % 2 != 0)
			{
				oddCount++;
			}
			
			// Find Sum of All Values
			sum = sum + input;
			
			// Finding All Duplicate Values
			
			if (input == previousVal)
			{
				System.out.println("Duplicate Values: " + input);
			}
		}
		
		in.close();
		
		System.out.println("Largest Value is: " + largest + "\nSmallest Value is: " + smallest);
		System.out.println("Number of Even Values: " + evenCount + "\nNumber of Odd Values: " + oddCount);
		System.out.println("Sum of All Values: " + sum);
		
		
		
		
		
	}
}
