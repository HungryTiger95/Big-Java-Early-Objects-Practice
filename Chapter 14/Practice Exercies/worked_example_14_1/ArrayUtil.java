package worked_example_14_1;

import java.util.Random;

public class ArrayUtil
{
	// Instance Variables
	private static Random gen = new Random();
	
	// Constructors
	
	// Methods
	/**
	 * Creates an array filled with random values
	 * @param arrayLength the length of the array
	 * @param maxNum the max random value to be generated (1 to this number)
	 * @return an array filled with arrayLength numbers between 1 and maxNum
	 */
	public static int[] randomIntArray(int arrayLength, int maxNum)
	{
		int[] a = new int[arrayLength];
		
		for(int i = 0; i < a.length; i++)
		{
			a[i] = gen.nextInt(maxNum) + 1;
		}
		
		return a;
	}
	
	/**
	 * Swaps two entries of an array
	 * @param array the array
	 * @param i the first position to swap
	 * @param j the second position to swap
	 */
	public static void swap(int[] array, int i, int j)
	{
		int temp = array[i];
		array[i] = array[j];
		array[j]  = temp;
	}
}
