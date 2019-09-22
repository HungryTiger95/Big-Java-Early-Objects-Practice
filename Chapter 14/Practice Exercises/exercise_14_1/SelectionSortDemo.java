package exercise_14_1;

import java.util.Arrays;

public class SelectionSortDemo
{
	public static void main(String[] args)
	{
		int[] a = ArrayUtil.randomIntArray(1000, 10);
		System.out.println(Arrays.toString(a));
		
		StopWatch t = new StopWatch();
		
		t.start();
		SelectionSorter.sort(a);
		t.stop();
		
		System.out.println(Arrays.toString(a));
		System.out.println("Elapsed Time: " + t.getElapsedTime() + " milliseconds");
	}
}
