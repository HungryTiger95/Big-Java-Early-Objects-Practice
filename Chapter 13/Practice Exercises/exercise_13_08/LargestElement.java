package exercise_13_08;

/**
 * Using recursion, find the largest element in an array.
 * 
 * Hint: Find the largest element in the subset containing all but the
 * last element. Then compare the maximum to the value of the last element.
 * 
 * @author Mayuresh
 *
 */
public class LargestElement
{
	public static void main(String[] args)
	{
		int[] list = {45, 2, 4, 3, 2, 12, 32, 3, 5, 10};
		
		for(int i = 0; i < list.length; i++)
		{
			System.out.print(list[i] + " ");
		}
		System.out.println();
		
		System.out.println("Largest Element: " + largestElement(list));
	}
	
	/**
	 * Gets the largest element in an array
	 * @param array the array
	 * @return largest element
	 */
	public static int largestElement(int[] array)
	{
		return largestElement(array, 0, 0);
	}
	
	/**
	 * Gets the largest element in an array
	 * @param array the array
	 * @param currentPos the currrent position of the index
	 * @param largestPos the position of the largest element
	 * @return the largest element
	 */
	public static int largestElement(int[] array, int currentPos, int largestPos)
	{
		// Base case
		if(currentPos == array.length - 1)
		{
			if(array[currentPos] > array[largestPos])
			{
				return array[currentPos];
			}
			else
			{
				return array[largestPos];
			}
		}
		else
		{
			if(array[currentPos] > array[largestPos])
			{
				return largestElement(array, currentPos + 1, currentPos);
			}
			else
			{
				return largestElement(array, currentPos + 1, largestPos);
			}
		}
	}
}
