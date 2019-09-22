package section_06;

/**
 * If you want to find a number in a sequence of values that occur in arbitrary
 * order, there is nothing you can do to speed up the search. You must simply
 * look through all elements until you have found a match or until you reach the
 * end. This is called a linear or sequential search.
 * 
 * How long does a linear search take? If we assume that the element v is present
 * in the array a, then the average search visits n / 2 elements, when n is the
 * length of the array. If it is not present, then all n elements must be inspected
 * to verify the absence. Either way, a linear search is an O(n) algorithm.
 * 
 * Note: A linear search examines all values in an array until it finds a match
 * or reaches the end.
 * 
 * Note: A linear search locates a value in an array in O(n) steps.
 * 
 * @author Mayuresh
 *
 */
public class LinearSearcher
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	/**
	 * Finds a value in an array, using the linear search algorithm
	 * @param array the array to search
	 * @param valueToSearchFor the value to find 
	 * @return the index at which the value occurs, or -1 if it does not occur in the array
	 */
	public static int search(int[] array, int valueToSearchFor)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == valueToSearchFor)
			{
				return i;
			}
		}
		
		return -1;
	}
}
