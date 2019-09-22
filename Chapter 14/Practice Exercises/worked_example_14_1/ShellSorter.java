package worked_example_14_1;

import java.util.ArrayList;

/**
 * The sort method of this class sorts an array, using the Shell sort algorithm
 * 
 * @author Mayuresh
 *
 */
public class ShellSorter
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	/**
	 * Sorts an array, using selection sort
	 * @param array the array to sort
	 */
	public static void sort(int[] array)
	{
		// Generate the sequence values
		ArrayList<Integer> columns = new ArrayList<Integer>();
		int c = 1;
		
		while(c < array.length)
		{
			columns.add(c);
			c = 3 * c + 1;
		}
		
		// For each column count, sort all columns
		for(int s = columns.size() - 1; s >= 0; s--)
		{
			c = columns.get(s);
			
			for(int k = 0; k < c; k++)
			{
				insertionSort(array, k, c);
			}
		}
	}
	
	/**
	 * Sorts a column, using insertion sort
	 * @param array the array to sort
	 * @param k the index of the first element in the column
	 * @param c the gap between elements in the column
	 */
	public static void insertionSort(int[] array, int k, int c)
	{
		for(int i = k + c; i < array.length; i = i + c)
		{
			int next = array[i];
			
			// Move all larger elements up
			int j =i;
			
			while(j >= c && array[j - c] > next)
			{
				array[j] = array[j - c];
				j = j - c;
			}
			
			// Insert the element
			array[j] = next;
		}
	}
}
