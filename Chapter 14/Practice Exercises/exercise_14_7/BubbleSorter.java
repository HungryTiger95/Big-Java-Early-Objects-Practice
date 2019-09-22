package exercise_14_7;

/**
 * Implement the bubble sort algorithm described in R14.19.
 * 
 * Consider the following algorithm known as bubble sort:
 * 
 * 		while the array is not sorted
 * 			For each adjacent pair of elements
 * 				If the pair is not sorted
 * 					sort its elements
 * 
 * What is the Big-Oh efficiency of this algorithm?
 * 
 * @author Mayuresh
 *
 */
public class BubbleSorter
{
	// Instance Variables
	
	// Constructors
	
	// Methods
//	public static void sort(int[] array)
//	{
//		for(int i = 0; i < array.length - 1; i++)
//		{
//			for(int j = 0; j < array.length - i - 1; j++)
//			{
//				if(array[j] > array[j + 1])
//				{
//					// Make temp value
//					int temp = array[j];
//					array[j] = array[j + 1];
//					array[j + 1] = temp;
//				}
//			}
//		}
//	}
	
	public static void sort(int[] array)
	{
		boolean swapped = true;
		
		while(swapped)
		{
			swapped = false;
			
			for(int i = 1; i < array.length; i++)
			{
				if(array[i - 1] > array[i])
				{
					int temp = array[i - 1];
					
					array[i - 1] = array[i];
					array[i] = temp;
					
					swapped = true;
				}
			}
		}
	}
}
