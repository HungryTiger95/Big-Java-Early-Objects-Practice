package section_02;

/**
 * The selection sort algorithm sorts an array by repeatedly finding the
 * smallest element of the unsorted tail region and moving it to the front.
 * 
 * This algorithm, while entirely correct, shows disappointing performance
 * when run on a large data set
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
			int minPos = minimumPosition(array, i);
			
			ArrayUtil.swap(array, minPos, i);
		}
	}
	
	/**
	 * Finds the smallest element in a tail range of the array
	 * @param array the array to sort
	 * @param pos the first position in the array to compare
	 * @return the position of the smallest element in the range array[pos] ... array[array.length - 1]
	 */
	public static int minimumPosition(int[] array, int pos)
	{
		int minPos = pos;
		
		for(int i = pos + 1; i < array.length; i++)
		{
			if(array[i] < array[minPos])
			{
				minPos = i;
			}
		}
		
		return minPos;
	}
}
