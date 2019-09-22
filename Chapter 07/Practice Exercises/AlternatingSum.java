/**
 * E7.6
 * 
 * Compute the alternating sum of all elements in an array.
 * 
 * @author Mayuresh
 *
 */

public class AlternatingSum
{
	public static void main (String[] args)
	{
		int[] array = {1, 4, 9, 10, 3, 40, 20, 39, 12, 16};
		int sum = 0;
		
		System.out.println("Expected Alternating Sum: 1 + 4 - 9 + 10 - 3 + 40 - 20 + 39 - 12 + 16 = 66");
		
		for (int i = 0; i < array.length; i++)
		{
			if (i == 0 || i == 1)
			{
				sum = array[0] + array[1];
			}
			else
			{
				if (i % 2 == 0)
				{
					sum = sum - array[i];
				}
				else if (i % 2 != 0)
				{
					sum = sum + array[i];
				}
			}
		}
		
		System.out.println("Alternating Sum: " + sum);
	}
}
