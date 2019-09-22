
/**
 * A small program to showcase how to use an enhanced for loop
 * 
 * @author Mayuresh
 *
 */
public class EnhancedLoop
{
	public static void main(String[] args)
	{
		/**
		 * The enhanced for loop is used to traverse the entire array.
		 * You can't use it to modify the contents of the array.
		 * 
		 * It works like this:
		 * 
		 * When the loop is executed, the variable element is set to values[0]. Then
		 * element is set to 0, then to values[1], then to 0 and so on. If you try to modify
		 * the array by setting all the elements to 0, then everything would stay the same
		 * if you were using an enhanced for loop.
		 */
		int[] values = {10, 20, 30, 40, 50, 60, 70};
		
		System.out.println("Print using normal for loop:");
		printArray(values);
		
		System.out.println("\nPrint useing enhanced for loop:");
		for(int nums : values)
		{
			System.out.print(nums + " | ");
		}
	}
	
	// Methods
	/**
	 * Prints all the elements of an array
	 */
	public static void printArray(int...values)
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
}
