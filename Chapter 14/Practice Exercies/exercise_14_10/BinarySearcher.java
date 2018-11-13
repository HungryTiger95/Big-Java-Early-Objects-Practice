package exercise_14_10;

/**
 * Consider the binary search algorithm in Section 14.6. If no match is found, the search
 * method returns -1. Modify the method so that if a is not found, the method returns
 * -k - 1, where k is the position before which the element should be inserted. (This
 * is the same behavior as Arrays.binarySearch.)
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
	public static int search(int[] array, int low, int high, int valueToFind)
	{
		if(low <= high)
		{
			int mid = (low + high) / 2;
			
			if(array[mid] == valueToFind)
			{
				return mid;
			}
			else if(array[mid] < valueToFind)
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
			return -(low + 1);
		}
	}
}
