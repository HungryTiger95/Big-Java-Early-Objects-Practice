import java.util.Arrays;
import java.util.Scanner;

/**
 * These are just a few common array algorithms
 * 
 * @author Mayuresh
 *
 */
public class CommonAlgorithms
{
	public static void main(String[] args)
	{
		int[] array = new int[10];
		
		/**
		 * Filling an array
		 * 
		 * In this example we will fill an array with squares
		 */
		for(int i = 0; i < array.length; i++)
		{
			array[i] = i * i;
		}
		
		printArray(array);
		
		/**
		 * Sum and Average Values
		 * 
		 * Using the same array as before
		 */
		double total = 0;
		double average = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			total += array[i];
		}
		
		average = total / array.length;
		
		System.out.printf("Sum: %.1f\nAverage: %.1f\n", total, average);
		
		/**
		 * Max and Min
		 * 
		 * Here we start the loop with 1 because we already set the
		 * min and max values to array[0] so there's no point in
		 * testing the first element.
		 * 
		 * Using the same array as before
		 */
		int min = array[0], max = array[0];
		int maxPlace = 0, minPlace = 0;
		
		for(int i = 1; i < array.length; i++)
		{
			if(array[i] > max)
			{
				max = array[i];
				maxPlace = i;
			}
			
			if(array[i] < min)
			{
				min = array[i];
				maxPlace = i;
			}
		}
		System.out.printf("Max: %d [i = %d]\nMin: %d [i = %d]\n", max, maxPlace, min, minPlace);
		
		/**
		 * Print array using Arrays.toString method
		 */
		System.out.println("Values: " + Arrays.toString(array) + "\n");
		
		/**
		 * Removing an Element
		 * 
		 * If you want to remove the element with the index pos from the array values,
		 * you need a companion variable for tracking the number of elements in the array.
		 * If the elements are not in any particular order, simply overwrite the element to
		 * be removed with the last element of the array, then decrement the currentSize variable.
		 * 
		 * If the order matters, then you must move all elements following the element to be removed
		 * to a lower index, and then decrement the variable holding the size of the array
		 */
		int[] orderDoesNotMatter = {10, 23, 4, 50, 8};
		int[] orderMatters = {1, 2, 3, 4, 5, 6};
		
		int currentSize = orderDoesNotMatter.length;
		int pos = 3;
		
		System.out.println("Removing an Element when Order Does Not Matter: ");
		
		printArray(orderDoesNotMatter);
		
		orderDoesNotMatter[pos] = orderDoesNotMatter[currentSize - 1];
		currentSize--;
		
		for (int i = 0; i < currentSize; i++)
		{
			if (i > 0)
			{
				System.out.print(" | ");
			}
			System.out.print(orderDoesNotMatter[i]);
		}
		System.out.println();
		
		System.out.println("\nRemoving an Element when Order Matters: ");
		
		currentSize = orderMatters.length;
		
		printArray(orderMatters);
		
		for(int i = pos + 1; i < currentSize; i++)
		{
			orderMatters[i - 1] = orderMatters[i];
		}
		currentSize--;
		
		for (int i = 0; i < currentSize; i++)
		{
			if (i > 0)
			{
				System.out.print(" | ");
			}
			System.out.print(orderMatters[i]);
		}
		System.out.println();
		
		/**
		 * Swapping Elements
		 * 
		 * This method is used to sort arrays
		 */
		System.out.println("\nSwapping Elemnts");
		
		int[] sort = {10, 20, 30, 40, 50};
		
		printArray(sort);
		
		int temp = sort[4];
		sort[4] = sort[1];
		sort[1] = temp;
		
		printArray(sort);
		
		/**
		 * Copying Arrays
		 * 
		 * Array variables do not themselves hold array element. They hold a reference
		 * to the actual array. If you want to make a true copy of an array,
		 * call the Arrays.copyOf method. The call Array.copyOf(values, n) allocates
		 * an array of length n, copies the first n elements of values(or the
		 * entire values array if n > values.length) into it, and returns the new array.
		 * 
		 * You can use the Arrays.copyOf to grow an array that has run out of space by...
		 * 		
		 * 		double[] newValues = Arrays.copyOf(valeus, 2 * values.length);
		 * 		values = newValues;
		 */
		int[] copy1 = {10, 20, 25, 30, 35};
		int [] copy2 = Arrays.copyOf(copy1, copy1.length);
		
		System.out.println("Copying Arrays:\n");
		printArray(copy1);
		printArray(copy2);
		
		System.out.println("\nChanging first array: ");
		copy1[2] = 100;
		
		printArray(copy1);
		printArray(copy2);
		
		System.out.println();
		
		/**
		 * Reading Input
		 * 
		 * If you need to read a sequence of arbitrary length.
		 */
		final int LENGTH = 5;
		double[] values = new double[LENGTH];
		currentSize = 0;
		
		System.out.println("Enter Values, Q to quit:");
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextDouble())
		{
			if(currentSize >= values.length)
			{
				values = Arrays.copyOf(values, 2 * values.length);
				System.out.println("Array Size Increased to " + values.length);
			}
			
			values[currentSize] = in.nextDouble();
			currentSize++;
		}
		
		values = Arrays.copyOf(values, currentSize);
		printArray(values);
	}
	
	// Methods
	/**
	 * Prints all the elements of an array
	 * 
	 * Demonstrates Element Separators, a way to easily display all
	 * the elements in a readable format.
	 * 
	 * If you want comma separators simply use Arrays.toString method after
	 * importing java.util.Arrays
	 */
	public static void printArray(int...values)
	{
		for (int i = 0; i < values.length; i++)
		{
			if (i > 0)
			{
				System.out.print(" | ");
			}
			System.out.print(values[i]);
		}
		System.out.println();
	}
	
	public static void printArray(double...values)
	{
		for (int i = 0; i < values.length; i++)
		{
			if (i > 0)
			{
				System.out.print(" | ");
			}
			System.out.print(values[i]);
		}
		System.out.println();
	}
}
