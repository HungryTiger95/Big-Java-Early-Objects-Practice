package section_02;

public class Sum
{
	public static void main(String[] args)
	{
		int[] nums = {2, 3, 13, 5, 8, 7, 8, 9, 10};
		
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		System.out.println("Sum: " + secondCalcSum(nums));
	}
	
	/**
	 * Calculates the sum of an array of integers
	 * @param numArray the array to calculate the sum of
	 * @return the sum of the values of the array
	 */
	public static int calculateSume(int[] numArray)
	{
		return calculateSum(numArray, 0);
	}
	
	/**
	 * Calculates the sum of the values in a given array
	 * @param numArray the array to calculate the sum for
	 * @param start the index where summation should start
	 * @return the sum of all values in the array from the given
	 * start position
	 */
	public static int calculateSum(int[] numArray, int start)
	{
		// Base case
		if(start >= numArray.length - 1)
		{
			return numArray[start];
		}
		else
		{
			return calculateSum(numArray, start + 1) + numArray[start];
		}
	}
	
	/**
	 * Calculates the sum of all the values in an array
	 * @param numArray the array
	 * @return the sum of all the values of the array
	 */
	public static int secondCalcSum(int[] numArray)
	{
		// Base Case
		if(numArray.length <= 1)
		{
			return numArray[0];
		}
		else
		{
			int[] tempArray = new int[numArray.length - 1];
			for(int i = 0; i < tempArray.length; i++)
			{
				tempArray[i] = numArray[i + 1];
			}
			
			return secondCalcSum(tempArray) + numArray[0];
		}
	}
}
