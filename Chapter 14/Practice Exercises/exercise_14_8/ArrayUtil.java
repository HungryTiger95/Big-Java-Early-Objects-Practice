package exercise_14_8;

import java.util.Random;

public class ArrayUtil
{
	// Instance Variables
	private static Random generator = new Random();
	
	// Constructors
	
	// Methods
	/**
	 * Creates an array filled with random values
	 * @param arraySize the size of the array
	 * @param randomNumMax the largest possible value of the number from the generator(not inclusive)
	 * @return an array filled with arraySize numbers between 1 and randomNumMax
	 */
	public static int[] randomIntArray(int arraySize, int randomNumMax)
	{
		int[] array = new int[arraySize];
		
		for(int i = 0; i < arraySize; i++)
		{
			array[i] = generator.nextInt(randomNumMax) + 1;
		}
		
		return array;
	}
	
	/**
	 * Swaps two elements in an array
	 * @param array the array
	 * @param i the first position to swap
	 * @param j the second position to swap
	 */
	public static void swap(int[] array, int i, int j)
	{
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
