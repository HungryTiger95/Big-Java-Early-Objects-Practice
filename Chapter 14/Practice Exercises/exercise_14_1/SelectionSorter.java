package exercise_14_1;

/**
 * Modify the selection sort algorithm to sort an array of integers
 * in descending order.
 * 
 * @author Mayuresh
 *
 */
public class SelectionSorter
{
	// Methods
	
	// Constructors
	
	// Methods
	/**
	 * Sorts an array, using selection sort
	 * @param array the array to sort
	 */
	public static void sort(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			int maxPos = maximumPosition(array, i);
			
			ArrayUtil.swap(array, maxPos, i);
		}
	}
	
	/**
	 * Finds the smallest element in a tail range of the array
	 * @param array the array to sort
	 * @param pos the first position in the array to compare
	 * @return the position of the smallest element in the range array[pos] ... array[array.length - 1]
	 */
	public static int maximumPosition(int[] array, int pos)
	{
		int maxPos = pos;
		
		for(int i = pos + 1; i < array.length; i++)
		{
			if(array[i] > array[maxPos])
			{
				maxPos = i;
			}
		}
		
		return maxPos;
	}
}
