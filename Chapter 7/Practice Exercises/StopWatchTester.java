import java.util.Arrays;
import java.util.Random;

public class StopWatchTester
{
	public static void main(String[] args)
	{
		int n = 10000;
		
		int array[] = new int[n];
		
		StopWatch timer = new StopWatch();
		timer.start();
		
		addAll(array);
		
		//System.out.println("Original Array: ");
		//print(array);
		
		//System.out.println("Sorted Array: ");
		Arrays.sort(array);
		//print(array);
		
		timer.stop();
		
		System.out.println("Duration: " + timer.getElapsedTime() + " milliseconds");
	}
	
	public static void add(int[] array, int index, int val)
	{
		array[index] = val;
	}
	
	public static void addAll(int[] array)
	{
		Random gen = new Random();
		int randVal;
		
		for(int i = 0; i < array.length; i++)
		{
			randVal = gen.nextInt(500) + 1;
			array[i] = randVal;
		}
	}
	
	public static void print(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(i > 0)
			{
				System.out.print(" | ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
