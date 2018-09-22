import java.util.Random;

/**
 * Write a program that initializes an array with ten random integers and then prints four
 * lines of output, containing
 * 		1) Every element at an even index
 * 		2) Every even element
 * 		3) All elements in reverse order
 * 		4) Only the first and last element
 * 
 * @author Mayuresh
 *
 */

public class E7_1
{
	public static void main (String[] args)
	{
		Random generator = new Random();
		
		int [] values = new int[10];
		
		// Initialize an array
		for(int i = 0; i < 10; i++)
		{
			int randNum = generator.nextInt(100);
			values[i] = randNum;
		}
		
		// Print all elements to see what numbers were generated
		System.out.print("All Elements: ");
		for (int i = 0; i < 10; i++)
		{
				System.out.print(values[i] + " ");
		}
		System.out.println();
		
		// Part 1) All elements at even indexes
		System.out.print("All Elements At Even Indexes: ");
		for (int i = 0; i < 10; i++)
		{
			if (i % 2 == 0)
			{
				System.out.print(values[i] + " ");
			}
		}
		System.out.println();
		
		// Part 2) all even elements
		System.out.print("All Even Elements: ");
		for (int i = 0; i < 10; i++)
		{
			if (values[i] % 2 == 0)
			{
				System.out.print(values[i] + " ");
			}
		}
		System.out.println();
		
		// Part 3) elements in reverse order
		System.out.print("All Elements in Reverse Order: ");
		for (int i = 9; i >= 0; i--)
		{
			System.out.print(values[i] + " ");
		}
		System.out.println();
		
		// Part 4) Only first and Last element
		System.out.print("First and Last Elements: " + values[0] + " " + values[values.length - 1]);
		System.out.println();
	}
}
