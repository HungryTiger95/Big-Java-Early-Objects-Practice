package exercise_14_7;

import java.util.ArrayList;
import java.util.Scanner;

import section_02.ArrayUtil;
import section_02.StopWatch;

public class BubbleSorterTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		// Construct an array to hold all the times
		ArrayList<Long> timesList = new ArrayList<Long>();

		// Ask for the size of the random array
		System.out.print("Enter the Array Size: ");
		int arrayLength = in.nextInt();

		// Loop through the sorting algorithm a given amount of times
		//System.out.print("Enter the number of trials: ");
		int trials = 50;

		StopWatch t = new StopWatch();

		for(int j = 0; j < trials; j++)
		{
			int[] a = ArrayUtil.randomIntArray(arrayLength, 100);

			t.start();
			BubbleSorter.sort(a);
			t.stop();

			System.out.printf("Trial: %d - Elapsed Time: %d milliseconds\n", j + 1, t.getElapsedTime());
			timesList.add(t.getElapsedTime());
			
			//System.out.println(Arrays.toString(a));
			t.reset();
		}


		// Print out the average time
		double sum = 0;
		for(int j = 0; j < timesList.size(); j++)
		{
			sum += timesList.get(j);
		}

		System.out.printf("Average Time: %.4f\n", sum / timesList.size());

		in.close();
	}
}
