package exercise_13_09;

/**
 * Using recursion, compute the sum of all values in an array
 * 
 * @author Mayuresh
 *
 */
public class ArraySum
{
	public static void main(String[] args)
	{
		int[] list = {10, 10, 20, 10, 10, 10, 10, 10, 10, 10};
		for(int i = 0; i < list.length; i++)
		{
			System.out.print(list[i] + " ");
		}
		System.out.println();
		
		System.out.printf("Sum Of Array: %d", sum(list));
	}
	
	/**
	 * Gets the sum of all the elements of an array
	 * @param array the array
	 * @return the sum
	 */
	public static int sum(int[] array)
	{
		return sum(array, 0);
	}
	
	/**
	 * Gets the sum of all the elements of an array
	 * @param array the array
	 * @param currentPos the current position
	 * @return the sum
	 */
	public static int sum(int[] array, int currentPos)
	{
		if(currentPos == array.length - 1)
		{
			return array[currentPos];
		}
		else
		{
			return sum(array, currentPos + 1) + array[currentPos];
		}
	}
}
