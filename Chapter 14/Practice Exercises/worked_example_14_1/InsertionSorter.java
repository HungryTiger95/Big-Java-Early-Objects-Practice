package worked_example_14_1;

/**
 * The sort method of this class sorts an array, using the insertion sort algorithm
 * @author Mayuresh
 *
 */
public class InsertionSorter
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	/**
	 * Sorts an array, using insertion sort
	 * @param array the array to sort
	 */
	public static void sort(int[] array)
	{
		for(int i = 1; i < array.length; i++)
		{
			int next = array[i];
			
			// Move all larger elements up
			int j = i;
			while(j > 0 && array[j - 1] > next)
			{
				array[j] = array[j - 1];
				j--;
			}
			
			// Insert the element
			array[j] = next;
		}
	}
}
