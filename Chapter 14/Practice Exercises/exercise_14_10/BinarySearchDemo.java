package exercise_14_10;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo
{
	public static void main(String[] args)
	{
		//int[] a = ArrayUtil.randomIntArray(20, 100);
		int[] a = {1, 3, 5, 10, 15, 16, 21, 22, 23, 24, 29, 30};
		System.out.println(Arrays.toString(a));
		
		// The array must be sorted for binary search to work
		Arrays.sort(a);
		
		// Print the sorted array
		//System.out.println(Arrays.toString(a));
		
		Scanner in = new Scanner(System.in);
		
		boolean done = false;
		while(!done)
		{
			System.out.print("Enter the Number to search for, -1 to quit: ");
			
			int n = in.nextInt();
			if(n == -1 || n < 0)	// OR condition just in-case the user enters something other than -1 (should probably just use n < 0) 
			{
				done = true;
			}
			else
			{
				int pos = BinarySearcher.search(a, 0, a.length - 1, n);
				//int pos = Arrays.binarySearch(a, n);
				if(pos < 0)
				{
					System.out.println("Value not found: Add to: " + pos);
				}
				else
				{
					System.out.println("Found in Position " + pos);
				}
			}
		}
		
		in.close();
	}
}
