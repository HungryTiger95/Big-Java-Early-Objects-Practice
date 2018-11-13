package exercise_14_6;

import java.util.ArrayList;
import java.util.Scanner;

import section_02.ArrayUtil;
import section_02.SelectionSorter;
import section_02.StopWatch;

/**
 * Implement a program that measures the performance of the insertion sort algorithm
 * described in special topic 14.2
 * 
 * @author Mayuresh
 *
 */
public class InsertionSorter
{
	// Instance Variables
	
	// Constructors
	
	// Methods
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
		int trials = 25;
	
		StopWatch t = new StopWatch();
	
		for(int j = 0; j < trials; j++)
		{
			int[] a = ArrayUtil.randomIntArray(arrayLength, 100);
		
			t.start();
			SelectionSorter.sort(a);
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
	
		System.out.printf("Average Time: %.4f\n", sum / timesList.size());
		
		in.close();
	}
	
	/**
	 * Sorts an array using insertion sort
	 * @param array the array to be sorted
	 */
	public static void sort(int[] array)
	{
		for(int i = 1; i < array.length; i++)
		{
			int next = array[i];
			
			int j = i;
			while(j > 0 && array[j - 1] > next)
			{
				array[j] = array[j - 1];
				j--;
			}
			
			array[j] = next;
		}
	}
}
