package exercise_13;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Time the results of heapsort and merge sort. Which algorithm behaves better in practice?
 * 
 * @author Mayuresh
 *
 */
public class TimerDemo
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<Long> timesList = new ArrayList<>();
		
		// Take input for the array size to build the various data structures
		System.out.print("Enter the array size: ");
		int arraySize = in.nextInt();
		
		// Ask for the number of trials to perform
		System.out.print("How man trials?: ");
		int trials = in.nextInt();
		
		// Get results for each type of sorter
		ArrayList<Long> heapTimes = heapSorter(arraySize, trials);
		ArrayList<Long> mergeTimes = mergeSorter(arraySize, trials);
		//ArrayList<Long> quickTimes = quickSorter(arraySize, trials);
		//ArrayList<Long> selectionTimes = selectionSorter(arraySize, trials);
		//ArrayList<Long> shellTimes = shellSorter(arraySize, trials);
		
		// Print out the results
		for(int i = 0; i < trials; i++)
		{
			System.out.println("Heap " + (i + 1) + ": " + heapTimes.get(i));
			System.out.println("Merge " + (i + 1) + ": " + mergeTimes.get(i));
			//System.out.println("Quick " + (i + 1) + ": " + quickTimes.get(i));
			//System.out.println("Selection " + (i + 1) + ": " + selectionTimes.get(i));
			//System.out.println("Shell " + (i + 1) + ": " + shellTimes.get(i));
			System.out.println();
		}
		
		// Get the average of the results for both
		double averageHeapTime = getTimeAverages(heapTimes, trials);
		double averageMergeTime = getTimeAverages(mergeTimes, trials);
		//double averageQuickTime = getTimeAverages(quickTimes, trials);
		//double averageSelectionTimes = getTimeAverages(selectionTimes, trials);
		//double averageShellTimes = getTimeAverages(shellTimes, trials);
		
		// Print average results
		System.out.println("\nAverages:");
		System.out.println("Heap: " + averageHeapTime);
		System.out.println("Merge: " + averageMergeTime);
		//System.out.println("Quick: " + averageQuickTime);
		//System.out.println("Selection: " + averageSelectionTimes);
		//System.out.println("Shell: " + averageShellTimes);
	}
	
	public static double getTimeAverages(ArrayList<Long> times, int trials)
	{
		double sum = 0;
		for(Long time : times)
		{
			sum += time;
		}
		return (sum / trials);
	}
	
	public static ArrayList<Long> heapSorter(int arrayLength, int trials)
	{
		ArrayList<Long> timesList = new ArrayList<>();
		
		for(int i = 0; i < trials; i++)
		{
			int[] a = ArrayUtil.randomIntArray(arrayLength, 100);
			StopWatch t = new StopWatch();
			
			t.start();
			HeapSorter.sort(a);
			t.stop();
			
			timesList.add(t.getElapsedTime());
			
			t.reset();
		}
		
		return timesList;
	}
	
	public static ArrayList<Long> quickSorter(int arrayLength, int trials)
	{
		ArrayList<Long> timesList = new ArrayList<>();
		
		for(int i = 0; i < trials; i++)
		{
			int[] a = ArrayUtil.randomIntArray(arrayLength, 100);
			StopWatch t = new StopWatch();
			
			t.start();
			QuickSort.sort(a);
			t.stop();
			
			timesList.add(t.getElapsedTime());
			
			t.reset();
		}
		
		return timesList;
	}
	
	public static ArrayList<Long> selectionSorter(int arrayLength, int trials)
	{
		ArrayList<Long> timesList = new ArrayList<>();
		
		for(int i = 0; i < trials; i++)
		{
			int[] a = ArrayUtil.randomIntArray(arrayLength, 100);
			StopWatch t = new StopWatch();
			
			t.start();
			SelectionSorter.sort(a);
			t.stop();
			
			timesList.add(t.getElapsedTime());
			
			t.reset();
		}
		
		return timesList;
	}
	
	public static ArrayList<Long> shellSorter(int arrayLength, int trials)
	{
		ArrayList<Long> timesList = new ArrayList<>();
		
		for(int i = 0; i < trials; i++)
		{
			int[] a = ArrayUtil.randomIntArray(arrayLength, 100);
			StopWatch t = new StopWatch();
			
			t.start();
			ShellSorter.sort(a);
			t.stop();
			
			timesList.add(t.getElapsedTime());
			
			t.reset();
		}
		
		return timesList;
	}

	public static ArrayList<Long> mergeSorter(int arrayLength, int trials)
	{
		ArrayList<Long> timesList = new ArrayList<>();
		
		for(int i = 0; i < trials; i++)
		{
			int[] a = ArrayUtil.randomIntArray(arrayLength, 100);
			StopWatch t = new StopWatch();
			
			t.start();
			MergeSorter.sort(a);
			t.stop();
			
			timesList.add(t.getElapsedTime());
			
			t.reset();
		}
		
		return timesList;
	}
}
