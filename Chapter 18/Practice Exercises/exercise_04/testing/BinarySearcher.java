package exercise_04.testing;

import java.util.ArrayList;

/**
 * Implement a generic version of the binary search algorithm
 * 
 * @author Mayuresh
 *
 */
public class BinarySearcher
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	/**
	 * Finds a value in a range of a sorted array, using the binary search algorithm
	 * @param array the array to search through
	 * @param low the low index of the range
	 * @param high the high index of the range
	 * @param valueToFind the value to find
	 * @return the index at which the value occurs, or -1 if it does not occur in the array
	 */
	public static <T extends Comparable<T>> int search(ArrayList<T> array, int low, int high, T valueToFind)
	{
		if(low <= high)
		{
			int mid = (low + high) / 2;
			
			if(array.get(mid).compareTo(valueToFind) == 0)
			{
				return mid;
			}
			else if(array.get(mid).compareTo(valueToFind) < 0)
			{
				return search(array, mid + 1, high, valueToFind);
			}
			else
			{
				return search(array, low, mid - 1, valueToFind);
			}
		}
		else
		{
			return -1;
		}
	}
}
