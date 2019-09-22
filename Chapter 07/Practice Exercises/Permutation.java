import java.util.Random;

/**
 * Write a program that produces ten random permutations of the numbers 1 to 10. To
 * generate a random permutation, you need to fill an array with the numbers 1 to 10
 * so that no two entries of the array have the same contents. You could do it by brute
 * force, by generating random values until you have a value that is not yet in the array.
 * But that is inefficient. Instead, follow this algorithm:
 * 
 * 			Make a second array and fill it with the numbers 1 - 10.
 * 			Repeat 10 times
 * 				pick a random element from the array.
 * 				remove it and append it to the permuation array
 * 
 * @author Mayuresh
 *
 */
public class Permutation
{
	public static void main(String[] args)
	{
		Random gen = new Random();
		
		int[] permutation = new int[10];
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int arraySize = array.length;
		
		for(int i = 0; i < permutation.length; i++)
		{	
			// Pick a random position
			int randPos = gen.nextInt(arraySize);
			
			// Set that value to the ith position in the permutation array
			permutation[i] = array[randPos];
			
			// Remove that value and position from the array
			for(int j = randPos + 1; j < arraySize; j++)
			{
				array[j - 1] = array[j]; 
			}
			arraySize--;
		}
		
		printArray(permutation);
	}
	
	// Methods
	
	/**
	 * Prints the array
	 * @param values array of int
	 */
	public static void printArray(int[] values)
	{
		for (int i = 0; i < values.length; i++)
		{
			if (i > 0)
			{
				System.out.print(" | ");
			}
			System.out.printf("%2d", values[i]);
		}
		System.out.println();
	}
}
