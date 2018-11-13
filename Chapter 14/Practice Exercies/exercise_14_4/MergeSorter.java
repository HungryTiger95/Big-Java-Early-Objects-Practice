package exercise_14_4;

/**
 * Modify the merge sort algorithm to sort an array of strings in lexicographic order
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
	public static void sort(String[] strings)
	{
		// if the length of the array is less than 1 or 1, the array
		// doesn't have any elements or the array is length 1 and
		// an array of length 1 is already sorted
		if(strings.length <= 1)
		{
			return;
		}
		
		String[] first = new String[strings.length / 2];
		String[] second = new String[strings.length - first.length];
		
		// Copy the first half of the array into first, and the second half
		// into second
		for(int i = 0; i < first.length; i++)
		{
			first[i] = strings[i];
		}
		for(int i = 0; i < second.length; i++)
		{
			second[i] = strings[first.length + i];
		}
		
		sort(first);
		sort(second);
		merge(first, second, strings);
	}
	
	/**
	 * Merges two sorted arrays into an array
	 * @param first the first sorted array
	 * @param second the second sorted array
	 * @param array the array into which to merge first and second
	 */
	public static void merge(String[] first, String[] second, String[] strings)
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
			if(first[iFirst].compareTo(second[iSecond]) < 0)
			{
				strings[j] = first[iFirst];
				iFirst++;
			}
			else
			{
				strings[j] = second[iSecond];
				iSecond++;
			}
			
			j++;
		}
		
		// Note that only one of the two loops below copies entries
		// Copy any remaining entries of the first array
		while(iFirst < first.length)
		{
			strings[j] = first[iFirst];
			iFirst++;
			j++;
		}
		
		// Copy any remaining entries of the second half
		while(iSecond < second.length)
		{
			strings[j] = second[iSecond];
			iSecond++;
			j++;
		}
	}
}
