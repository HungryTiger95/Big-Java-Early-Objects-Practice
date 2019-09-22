package special_topic_14_2;

import java.util.ArrayList;
import java.util.Scanner;

import section_02.ArrayUtil;
import section_02.SelectionSorter;
import section_02.StopWatch;

/**
 * Insertion sort is another simple sorting algorithm. In this algorithm, we assume that
 * the initial sequence:
 * 
 * 		a[0] a[1] . . . a[k]
 * 
 * of an array is already sorted. (When the algorithm starts, we set k to 0.) We enlarge
 * the initial sequence by inserting the next array element, a[k + 1], at the proper
 * location. When we reach the end of the array, the sorting process is complete.
 * 
 * For example, suppose we start with the array:
 * 
 * 		11 9 16 5 7
 * 
 * Of course, the initial sequence of length 1 is already sorted. We now add a[1], which
 * has the value 9. The element needs to be inserted before the element 11. The result is:
 * 
 * 		9 11 16 5 7
 * 
 * Next, we add a[2], which has the value 16. This element does not have to be moved:
 * 
 * 		9 11 16 5 7
 * 
 * We repeat the process, inserting a[3] or 5 at the very beginning of the initial sequence:
 * 
 * 		5 9 11 16 7
 * 
 * Finally, a[4] or 7 is in its correct position, and the sorting is completed:
 * 
 * 		5 7 9 11 16
 * 
 * How efficient is this algorithm? Let n denote the size of the array. We carry out n - 1
 * iterations. In the kth iteration, we have a sequence  of k elements that is already
 * sorted, and we need to insert a new element into the sequence. For each insertion, we
 * need to visit the elements of the initial sequence until we have found the location in
 * which the new element can be inserted. Then we need to move up the remaining elements
 * of the sequence. Thus, k + 1 array elements are visited. Therefore, the total number of
 * visits is:
 * 
 * 		2 + 3 + ... + n = (n(n + 1) / 2) - 1
 * 
 * We conclude that the insertion sort is O(n^2).
 * 
 * Insertions sort has a desirable property: its performance is O(n) if the array is
 * already sorted. This is useful property in practical applications, in which data sets
 * are often partially sorted.
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
