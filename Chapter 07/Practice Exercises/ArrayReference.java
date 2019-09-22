import java.util.Scanner;

/**
 * A small program to show how array references work
 * 
 * @author Mayuresh
 *
 */
public class ArrayReference
{
	public static void main(String[] args)
	{
		/**
		 * An array reference specifies the location of an array.
		 * Copying the reference yields a second reference to
		 * the same array.
		 */
		int[] values = {10, 20, 30, 40, 50};
		
		int[] moreValues = values;
		
		System.out.println("Array1 element 3: " + values[3]);
		System.out.println("Array2 element 3: \n\n" + moreValues[3]);
		
		/**
		 * You can modify the array though either of the variables
		 */
		values[3] = 70;
		
		System.out.println("Array Reference Index 3 changed from 40 to 70");
		System.out.println("Array1 element 3: " + values[3]);
		System.out.println("Array2 element 3: " + moreValues[3]);
		
		/**
		 * An array cannot change size at run time so you have to come up with
		 * a good guess on the maximum number of elements that you need to store.
		 * This is a partially filled array and you need to keep a companion variable
		 * that counts how many elements are actually used.
		 * 
		 * To process the gathered array elements, you again use the companion variable,
		 * not the array length.
		 */
		final int LENGTH = 100;
		int[] scores = new int[LENGTH];
		int currentSize = 0;
		boolean done = false;
		Scanner in = new Scanner(System.in);
		
		System.out.println("\n\nEnter Scores, -1 to Quit: ");
		while(!done && currentSize < LENGTH)
		{
			int score = in.nextInt();
			if(score == -1)
			{
				done = true;
			}
			else
			{
				scores[currentSize] = score;
				currentSize++;
			}
		}
		in.close();
		
		System.out.print("You Entered the following scores: ");
		for(int i = 0; i < currentSize; i++)
		{
			System.out.print(scores[i] + " | ");
		}
		System.out.println();
		
		/**
		 * Testing the addPoints method
		 */
		int[] points = {50, 10, 18, 90, 8};
		System.out.println("\n\nTotal Points: " + addPoints(points));
		printArray(points);
		System.out.println("\nExpected 176");
		
		System.out.println("\n\nTotal Points: " + addPoints(10, 23, 40));
		System.out.println("Expected: 73");
		
	}
	
	public static int addPoints(int... values)
	{
		int totalScore = 0;
		
		for(int i = 0; i < values.length; i++)
		{
			totalScore += values[i];
		}
		
		return totalScore;
	}
	
	public static void printArray(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.printf("%d | ", array[i]);
		}
	}
}
