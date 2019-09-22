package exercise_14_8;

import java.util.Arrays;

/**
 * Implement the algorithm described in Section 14.7.4, but only remember the
 * value with the highest frequency so far:
 * 
 * 		int mostFrequent = 0;
 * 		int higestFrequency = -1;
 * 		for(int i = 0; i < a.length; i++)
 * 			Count how often a[i] occurs in a[i + 1] ... a[a.length - 1]
 * 			If it occurs more often than highestFrequency
 * 				highestFrequency = that count
 * 				mostFrequent = a[i]
 * 
 * @author Mayuresh
 *
 */
public class Frequency
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	public static void main(String[] args)
	{
		int[] a = ArrayUtil.randomIntArray(30, 10);
		
		System.out.println("Unsorted:\n" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Sorted:\n" + Arrays.toString(a));
		
		System.out.println("Most Frequent in the Array: " + mostFrequent(a));
	}
	
	/**
	 * Gets the most frequent value in an array
	 * @param array the array
	 * @return the most frequent value
	 */
	public static int mostFrequent(int[] array)
	{
		int mostFrequent = 0;
		int highestFrequency = -1;
		
		for(int i = 0; i < array.length; i++)
		{
			int count = 0;
			
			// Count how often a[i] occurs in the rest of the array
			for(int j = i + 1; j < array.length - 1; j++)
			{
				if(array[i] == array[j])
				{
					count++;
				}
			}
			
			// Check if the count is more than highestFrequency
			if(count > highestFrequency)
			{
				highestFrequency = count;
				mostFrequent = array[i];
			}
		}
		
		return mostFrequent;
	}
}
