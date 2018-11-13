package section_04;

/**
 * The merge sort is a much more efficient algorithm than the selection sort. The basic idea behind merge
 * sort is very simple.
 * 
 * Suppose we have an array of 10 integers. Let us engage in a bit of wishful thinking and hope that the
 * first half of the array is already perfectly sorted, and the second half is too, like this:
 * 
 * 		5 9 10 12 17 and 1 8 11 20 32
 * 
 * Now it is simple to merge the two sorted arrays into one sorted array, by taking a new element form
 * either the first or the second subarray, and choosing the smaller of the elements each time:
 * 
 * 		5 9 10 12 17  8 11 20 32		1	
 * 		  9 10 12 17  8 11 20 32		1 5
 * 			10 12 17    11 20 32		1 5 8
 * 			   12 17    11 20 32        1 5 8 9
 * 				  17    11 20 32        1 5 8 9 10
 * 			               20 32        1 5 8 9 10 11
 * 			               20 32        1 5 8 9 10 11 12
 * 			               20 32        1 5 8 9 10 11 12 17
 * 							  32		1 5 8 9 10 11 12 17 20
 * 										1 5 8 9 10 11 12 17 20 32
 * 
 * If the computer keeps dividing the array into smaller and smaller subarrays, sorting each half and
 * merging them back together, it carries out dramatically fewer steps than the selection sort requires.
 * 
 * When the MergeSorter sorts an array, it makes two arrays, each half the size of the original, and sorts
 * them recursively. Then it merges the two sorted arrays together:
 * 
 * @author Mayuresh
 *
 */
public class MergeSorter
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	/**
	 * Sorts an array, using merge sort
	 * @param array the array to sort
	 */
	public static void sort(int[] array)
	{
		// if the length of the array is less than 1 or 1, the array
		// doesn't have any elements or the array is length 1 and
		// an array of length 1 is already sorted
		if(array.length <= 1)
		{
			return;
		}
		
		int[] first = new int[array.length / 2];
		int[] second = new int[array.length - first.length];
		
		// Copy the first half of the array into first, and the second half
		// into second
		for(int i = 0; i < first.length; i++)
		{
			first[i] = array[i];
		}
		for(int i = 0; i < second.length; i++)
		{
			second[i] = array[first.length + i];
		}
		
		sort(first);
		sort(second);
		merge(first, second, array);
	}
	
	/**
	 * Merges two sorted arrays into an array
	 * @param first the first sorted array
	 * @param second the second sorted array
	 * @param array the array into which to merge first and second
	 */
	public static void merge(int[] first, int[] second, int[] array)
	{
		// Next element to consider in the first array
		int iFirst = 0;
		
		// Next element to consider in the second array
		int iSecond = 0;
		
		// Next open position in the array
		int j = 0;
		
		// As long as neither iFirst nor iSecond past the end, move
		// the smaller element into the array
		while(iFirst < first.length && iSecond < second.length)
		{
			if(first[iFirst] < second[iSecond])
			{
				array[j] = first[iFirst];
				iFirst++;
			}
			else
			{
				array[j] = second[iSecond];
				iSecond++;
			}
			
			j++;
		}
		
		// Note that only one of the two loops below copies entries
		// Copy any remaining entries of the first array
		while(iFirst < first.length)
		{
			array[j] = first[iFirst];
			iFirst++;
			j++;
		}
		
		// Copy any remaining entries of the second half
		while(iSecond < second.length)
		{
			array[j] = second[iSecond];
			iSecond++;
			j++;
		}
	}
}
