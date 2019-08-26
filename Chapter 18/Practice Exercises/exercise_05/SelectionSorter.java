package exercise_05;

import java.util.ArrayList;

/**
 * Implement a generic version of the selection sort algorithm.
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
	public static <T extends Comparable<T>> void sort(ArrayList<T> array)
	{
		for(int i = 0; i < array.size(); i++)
		{
			int minPos = minimumPosition(array, i);
			
			// Swap the minPos value with the value at i
			T temp = array.get(minPos);
			array.set(minPos, array.get(i));
			array.set(i, temp);
		}
	}
	
	/**
	 * Finds the smallest element in a tail range of the array
	 * @param array the array to sort
	 * @param pos the first position in the array to compare
	 * @return the position of the smallest element in the range array[pos] ... array[array.length - 1]
	 */
	public static <T extends Comparable<T>> int minimumPosition(ArrayList<T> array, int pos)
	{
		int minPos = pos;
		
		for(int i = pos + 1; i < array.size(); i++)
		{
			if(array.get(i).compareTo(array.get(minPos)) < 0)
			{
				minPos = i;
			}
		}
		return minPos;
	}
}
