
/**
 * A small program to show how arrays are instantiated
 * 
 * @author Mayuresh
 *
 */
public class InstantiateArray
{
	public static void main(String[] args)
	{
		/**
		 * Creates an array of 10 int type values. [] denotes array. [10] denotes the array size.
		 * All elements of this array are set to be 0.
		 */
		int[] values = new int[10];
		
		/**
		 * This array has specified values for each element in the array.
		 */
		int[] moreValues = {10, 2, 5, 3, 1, 12, 20, 32, 0, 50};
		
		/**
		 * The type of value can be any of the types that Java supports
		 * and generic types.
		 */
		double[] evenMoreValues = new double[5];
		
		/**
		 * To visit each element in an array, use this algorithm.
		 * To make sure you don't try to access an index larger than the
		 * array size, use arrayName.length. This return the size of the
		 * array.
		 */
		for(int i = 0; i < moreValues.length; i++)
		{
			System.out.printf("%d | ", moreValues[i]);
		}
		
	}
}
