package exercise_14_3;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSortDemo
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
	
		for(int i = 0; i <= 10000; i += 500)
		{
			// Construct an array to hold all the times
			ArrayList<Long> timesList = new ArrayList<Long>();
		
			// Ask for the size of the random array
			//System.out.print("Enter the Array Size: ");
			int arrayLength = i;
		
			// Loop through the sorting algorithm a given amount of times
			//System.out.print("Enter the number of trials: ");
			int trials = 10;
		
			StopWatch t = new StopWatch();
		
			for(int j = 0; j < trials; j++)
			{
				int[] a = ArrayUtil.randomIntArray(arrayLength, 100);
			
				t.start();
				SelectionSorter.sort(a);
				t.stop();
			
				//System.out.printf("Trial: %d - Elapsed Time: %d milliseconds\n", i + 1, t.getElapsedTime());
				timesList.add(t.getElapsedTime());
			
				t.reset();
			}
		
		
			// Print out the average time
			double sum = 0;
			for(int j = 0; j < timesList.size(); j++)
			{
				sum += timesList.get(j);
			}
		
			System.out.printf("n: %d | Average Time: %.4f\n", i, sum / timesList.size());
		}
		
		in.close();
	}
}
