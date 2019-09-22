package section_06;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchDemo
{
	public static void main(String[] args)
	{
		int[] a = ArrayUtil.randomIntArray(20, 100);
		System.out.println(Arrays.toString(a));
		
		// The array must be sorted for binary search to work
		Arrays.sort(a);
		
		// Print the sorted array
		System.out.println(Arrays.toString(a));
		
		Scanner in = new Scanner(System.in);
		
		boolean done = false;
		while(!done)
		{
			System.out.print("Enter the Number to search for, -1 to quit: ");
			
			StopWatch t = new StopWatch();
			
			int n = in.nextInt();
			if(n == -1)
			{
				done = true;
			}
			else
			{
				t.start();
				int pos = BinarySearcher.search(a, 0, a.length - 1, n);
				t.stop();
				
				if(pos == -1)
				{
					System.out.println("Value not found | Time: " + t.getElapsedTime());
				}
				else
				{
					System.out.println("Found in Position " + pos + " | Time: " + t.getElapsedTime());
				}
			}
		}
		
		in.close();
	}
}
