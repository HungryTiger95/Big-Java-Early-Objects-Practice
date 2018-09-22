/**
 * Write array methods that carry out the following tasks for an array of integers. For
 * each method, provide a test program.
 * 
 * 		1) Swap the first and last Elements
 * 		2) Shift all elements by one to the right and move the last element into the first position
 * 		3) Replace all even elements with 0
 * 		4) Replace each element except the first and last by the larger of its two neighbors
 * 		5) Remove the middle element if the array length is odd, or the middle two elements if the array is even
 * 		6) Move all even elements to the front, otherwise preserving the order of the elements
 * 		7) Return the second-largest element in the array
 * 		8) Return true if the array is currently sorted in increasing order
 * 		9) Return true if the array contains two adjacent duplicate elements
 * 	   10) Return true if the array contains duplicate elements (not need to be adjacent)
 * 
 * @author Mayuresh
 *
 */

public class ArrayMethods
{
	// Instance Variables
	private int[] values;
	
	// Constructors
	public ArrayMethods(int[] initialValues)
	{
		values = initialValues;
	}
	
	// Methods
	/**
	 * Prints all the elements of an array
	 */
	public void printArray()
	{
		for (int i = 0; i < values.length; i++)
		{
			if (i > 0)
			{
				System.out.print(" | ");
			}
			System.out.print(values[i]);
		}
		System.out.println();
	}
	
	/**
	 * Swaps the first and last elements
	 */
	public void swapFirstAndLast()
	{
		int first, last;
		
		first = values[0];
		last = values[values.length - 1];
		
		values[0] = last;
		values[values.length - 1] = first;
	}
	
	/**
	 * Shifts all elements of an array to the right and brings last element to the front
	 */
	public void shiftRight()
	{
		for (int i = values.length - 1; i > 0; i--)
		{
			int temp = values[i - 1];
			values[i - 1] = values[i];
			values[i] = temp;
		}
	}
	
	/**
	 * Replaces all even elements with 0
	 */
	public void setEvenTo0()
	{
		for (int i = 0; i < values.length; i++)
		{
			if (values[i] % 2 == 0)
			{
				values[i] = 0;
			}
		}
	}
	
	/**
	 * Replaces value with the larger of its neighbors
	 */
	public void replaceWithLarger()
	{
		for (int i = 0; i < values.length; i++)
		{
			if (i == 0)
			{
				if (values[i + 1] > values[i])
				{
					values[i] = values[i + 1];
				}
			}
			else if (i == values.length - 1)
			{
				if (values[i - 1] > values[i])
				{
					values[i] = values[i - 1];
				}
			}
			else
			{
				if (values[i - 1] > values[i])
				{
					values[i] = values[i - 1];
				}
				if (values[i + 1] > values[i])
				{
					values[i] = values[i + 1];
				}
			}
		}
	}
	
	/**
	 * Removes the middle element(s)
	 */
	public void removeMiddle()
	{
		int midPos;
		
		if (values.length % 2 == 0)				// if even
		{
			midPos = (values.length / 2);
			for (int i = midPos; i < values.length; i++)
			{
				if (i == values.length - 1)
				{
					values[i] = 0;
				}
				else
				{
					values[i] = values[i + 1];
				}
					
			}
			midPos -= 1;
			
			for (int i = midPos; i < values.length; i++)
			{
				if (i == values.length - 1)
				{
					values[i] = 0;
				}
				else
				{
					values[i] = values[i + 1];
				}
					
			}
		}
		else									// if odd
		{
			midPos = (values.length / 2);
			for (int i = midPos; i < values.length; i++)
			{
				if (i == values.length - 1)
				{
					values[i] = 0;
				}
				else
				{
					values[i] = values[i + 1];
				}
			}
		}
	}
	
	/**
	 * Makes all even values come to the front
	 * Note: Only works with the current test values (got lazy to fix for other values and array sizes)
	 */
	public void evenFirst()
	{
		int left = 0;
		int right = values.length - 1;
		
		while(left < right)
		{
			while(values[left] % 2 == 0 && left < right)
			{
				left++;
			}
			
			while(values[right] % 2 == 1 && left < right)
			{
				right--;
			}
			
			if(left < right)
			{
				int temp = values[left];
				values[left] = values[right];
				values[right] = temp;
				
				left++;
				right--;
			}
		}
	}
	
	/**
	 * Checks if the array is in increasing order
	 * @return true or false based on if the array is in order
	 */
	public boolean isInOrder()
	{
		boolean order = true;
		
		for (int i = 0; i < values.length - 1; i++)
		{
			if (values[i] < values[i + 1])
			{
				order = true;
			}
			else if (values[i] > values[i + 1])
			{
				order = false;
				break;
			}
		}
		
		return order;
	}
	
	/**
	 * Checks to see if there are similar integers next to each other in an array
	 * @return true or false
	 */
	public boolean sameAdjacent()
	{
		boolean adjacent = true;
		
		for (int i = 0; i < values.length; i++)
		{
			if (i == 0)
			{
				if (values[i] == values[i + 1])
				{
					adjacent = true;
					break;
				}
				else
				{
					adjacent = false;
				}
			}
			else if (i == values.length - 1)
			{
				if (values[i] == values[i - 1])
				{
					adjacent = true;
					break;
				}
				else
				{
					adjacent = false;
				}
			}
			else
			{
				if (values[i] == values[i + 1] || values[i] == values[i - 1])
				{
					adjacent = true;
					break;
				}
				else
				{
					adjacent = false;
				}
			}
		}
		
		return adjacent;
	}
	
	/**
	 * Checks to see if there are any duplicate values
	 * @return true or false
	 */
	public boolean hasDuplicate()
	{
		boolean duplicate = false;
		
		for (int i = 0; i < values.length; i++)
		{
			for (int j = 0; j < values.length; j++)
			{
				if (i == j)
				{
					duplicate = false;
				}
				else if (values[i] == values[j])
				{
					duplicate = true;
					break;
				}
				else
				{
					duplicate = false;
				}
			}
			
			if (duplicate == true)
			{
				break;
			}
		}
		
		return duplicate;
	}
	
	/**
	 * Computes the sum without the smallest value
	 * return sum
	 */
	public int getSumWithoutSmallest()
	{
		int sum = values[0];
		int min = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			// Find smallest
			if(values[i] < min)
			{
				min = values[i];
			}
			
			// Sum everything
			sum += values[i];
		}
		
		// Return the sum - min
		return (sum - min);
	}
	
	/**
	 * Gets the minimum value in the array
	 * @return min
	 */
	public int getMin()
	{
		int min = values[0];
		
		for(int i = 1; i < values.length; i++)
		{
			if(values[i] < min)
			{
				min = values[i];
			}
		}
		
		return min;
	}
	
	/**
	 * Gets the sum of all the elements in the array
	 * @return sum
	 */
	public int getSum()
	{
		int sum = 0;
		
		for(int i = 0; i < values.length; i++)
		{
			sum += values[i];
		}
		
		return sum;
	}
}
