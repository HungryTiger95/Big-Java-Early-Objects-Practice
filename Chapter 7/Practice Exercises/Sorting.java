import java.util.Random;
import java.util.Arrays;

/**
 * Write a program that generates a sequence of 20 rnadom values between 0 and 99 in
 * an array, prints the sequence, sorts it, then print the sortetd sequence. Use the sort
 * method from the standard Java library.
 * 
 * @author Mayuresh
 *
 */
public class Sorting
{
	public static void main(String[] args)
	{
		Random gen = new Random();
		
		int[] num = new int[20];
		int randNum;
		
		// Fill in the array
		for(int i = 0; i < num.length; i++)
		{
			randNum = gen.nextInt(100);
			num[i] = randNum;
		}
		
		// Print Original Array
		System.out.println("Original Array: ");
		print(num);
		
		// Sort the array
		Arrays.sort(num);
		
		// Print the sorted array
		System.out.println("Sorted Array: ");
		print(num);
	}
	
	// Methods
	public static void print(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(i > 0)
			{
				System.out.print(" | ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
