import java.util.Scanner;

/**
 * E6.16
 * 
 * Write a program that reads an integer and displays, using asterisks, a filled diamond
 * of the given side length.
 * 
 * Note: Only Works with Odd Numbers!!!!
 * 
 * @author Mayuresh
 *
 */

public class Diamond
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int width;
		int odd = 1;
		
		System.out.print("Please Enter a Width: ");
		width = in.nextInt();
		
		int numberOfSpaces = width / 2;
		
		in.close();
		
		for (int i = 1; i <= width; i++)					// For the Number of rows
		{
			for (int j = numberOfSpaces; j >= 1; j--)		// For the Number of Spaces
			{
				System.out.print(" ");
			}
			
			for (int k = 1; k <= odd; k++)				// For the Number of Columns
			{
				System.out.print("*");
			}
			System.out.println();
			
			if (i < width / 2 + 1)
			{
				odd += 2;								// Columns increase till center row
				numberOfSpaces -= 1;					// Spaces decrease till center row
			}
			else
			{
				odd -= 2;					// Columns decreasing
				numberOfSpaces += 1;		// Spaces increasing
			}
		}
	}

}
