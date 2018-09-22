import java.util.Arrays;

public class Scores
{
	public static void main(String[] args)
	{
		double[] scores = {8, 7, 8.5, 9.5, 7, 4, 10};
		
		// Print the original array
		System.out.println("Original Array:");
		printArray(scores);
		
		// Find the Minimum value and its position
		double sum = 0, min = scores[0];
		int minPos = 0;
		
		for(int i = 1; i < scores.length; i++)
		{
			if(scores[i] < min)
			{
				min = scores[i];
				minPos = i;
			}
		}
		
		// Remove the minimum value (order does not matter)
		scores[minPos] = 0;
		for(int i = minPos; i < scores.length - 1; i++)
		{
			double temp = scores[i + 1];
			
			scores[i] = temp;
			scores[i + 1] = 0;
		}
		
		System.out.println("Array After Removing Min:");
		scores = Arrays.copyOf(scores, scores.length - 1);
		printArray(scores);
		
		// Compute the sum
		for(int i = 0; i < scores.length; i++)
		{
			sum += scores[i];
		}
		
		System.out.println("Sum: " + sum);
	}
	
	// Methods
		/**
		 * Prints all the elements of an array
		 */
		public static void printArray(double... values)
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
