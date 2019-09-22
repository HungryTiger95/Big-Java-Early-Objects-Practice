package worked_example_14_1;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSortTimer
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Array Size: ");
		int n = in.nextInt();
		
		in.close();
		
		double sum1 = 0;
		double sum2 = 0;
		double sum3 = 0;
		for(int i = 0; i < 50; i++)
		{
			System.out.println("Trial " + (i + 1) + ": ");
			// Construct a random array
			int[] a = ArrayUtil.randomIntArray(n, 1000);
			int[] a2 = Arrays.copyOf(a, a.length);
			int[] a3 = Arrays.copyOf(a, a.length);
			
			// Use the stopwatch to time selection sort
			StopWatch t = new StopWatch();

			t.start();
			ShellSorter.sort(a);
			t.stop();

			System.out.println("Elapsed Time With Shell Sort: " + t.getElapsedTime() + " milliseconds");
			sum1 += t.getElapsedTime();
			t.reset();

			// Use the stopwatch to time the sorting algorithm used in the arrays class
			t.start();
			Arrays.sort(a2);
			t.stop();

			System.out.println("Elapsed Time with Arrays.sort: " + t.getElapsedTime() + " milliseconds");
			sum2 += t.getElapsedTime();
			t.reset();

			// Check if both arrays have the same elements in the same positions
			if(!Arrays.equals(a, a2))
			{
				throw new IllegalStateException("Incorrect Sort Result");
			}

			t.start();
			InsertionSorter.sort(a3);
			t.stop();

			System.out.println("Elapsed Time with Insertion Sort: " + t.getElapsedTime() + " milliseconds");
			sum3 += t.getElapsedTime();
			
			System.out.println("================================================");
		}
		
		// Find average Values for each
		System.out.printf("Average 1: %.2f\n", (sum1 / 100));
		System.out.printf("Average 2: %.2f\n", (sum2 / 100));
		System.out.printf("Average 3: %.2f\n", (sum3 / 100));
	}
}
