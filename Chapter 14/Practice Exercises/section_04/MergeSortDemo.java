package section_04;

import java.util.ArrayList;
import java.util.Scanner;

import section_02.ArrayUtil;
import section_02.StopWatch;

public class MergeSortDemo
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
		System.out.print("Enter the number of trials: ");
		int trials = in.nextInt();
	
		for(int j = 0; j < trials; j++)
		{
			int[] a = ArrayUtil.randomIntArray(arrayLength, 100);
			StopWatch t = new StopWatch();
			
			t.start();
			MergeSorter.sort(a);
			t.stop();
			
			System.out.printf("Trial: %d - Elapsed Time: %d milliseconds\n", j + 1, t.getElapsedTime());
			timesList.add(t.getElapsedTime());
			
			t.reset();
		}
		
		
		// Print out the average time
		double sum = 0;
		for(int j = 0; j < timesList.size(); j++)
		{
			sum += timesList.get(j);
		}
		
		System.out.printf("n: %d | Average Time: %.4f\n", arrayLength, sum / timesList.size());
		
		in.close();
	}
}
