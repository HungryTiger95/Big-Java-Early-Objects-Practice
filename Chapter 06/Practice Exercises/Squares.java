import java.util.Scanner;

/**
 * E6.15
 * 
 * Write a program that reads an integer and displays, using asterisks, a filled and hollow square, placed
 * next to each other.
 * 
 * @author Mayuresh
 *
 */

public class Squares
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		int sideLength;
		
		System.out.print("Please Enter the Side Length: ");
		sideLength = in.nextInt();
		
		in.close();
		
		System.out.println();
		
		for (int i = 0; i < sideLength; i++)
		{
			for (int j = 0; j < sideLength; j++)
			{
				System.out.print("*");
			}
			
			System.out.print(" ");
			
			if (i == 0 || i == sideLength - 1)
			{
				for (int k = 0; k < sideLength; k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			else
			{
				for (int l = 0; l < sideLength; l++)
				{
					if (l == 0 || l == sideLength - 1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			
		}
	}
}
