package exercise_14_11;

import java.util.Arrays;

import exercise_14_10.ArrayUtil;

public class BottomUpMergeSortDemo
{
	public static void main(String[] args)
	{
		int[] a = ArrayUtil.randomIntArray(16, 20);
		int[] helper = new int[a.length];
		
		System.out.println("Unsorted: " + Arrays.toString(a) + "\n");
		
		BottomUpMergeSort.sort(a, helper);
		System.out.println("\nSorted: " + Arrays.toString(a));
	}
}
