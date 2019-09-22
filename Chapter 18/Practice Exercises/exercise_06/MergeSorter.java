package exercise_06;

import java.lang.reflect.Array;

/**
 * Implement a generic version of the merge sort algorithm. Your program should compile without warnings.
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
	public static <T extends Comparable<T>> void sort(T[] array)
	{
		// if the length of the array is less than 1 or 1, the array
		// doesn't have any elements or the array is length 1 and
		// an array of length 1 is already sorted
		if(array.length <= 1)
		{
			return;
		}
		
		Class<?> arrayClass = array.getClass();
		Class<?> elementClass = arrayClass.getComponentType();
		
		@SuppressWarnings("unchecked")
		T[] first = (T[]) Array.newInstance(elementClass, array.length / 2);
		@SuppressWarnings("unchecked")
		T[] second = (T[]) Array.newInstance(elementClass, array.length - first.length);
		
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
	public static <T extends Comparable<T>>void merge(T[] first, T[] second, T[] array)
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
