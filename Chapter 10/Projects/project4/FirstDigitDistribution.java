package project4;

import java.util.ArrayList;

/**
 * Provide a class FirstDigitDistribution that works just like the LastDigitDistribution class, except that it
 * counts the distribution of the first digit of each value. For practical purposes, this method is used to detect
 * accounting fraud because the first digits of random values are not uniformly distributed.
 * 
 * @author Mayuresh
 *
 */
public class FirstDigitDistribution
{
	// Instance Variables
	private int[] counters;
	private ArrayList<Integer> nums;
	
	// Constructors
	public FirstDigitDistribution()
	{
		counters = new int[10];
		nums = new ArrayList<Integer>();
	}
	
	// Methods
	/**
	 * Processes the values from this sequence 
	 * @param seq
	 * @param valuesToProcess
	 */
	public void process(Sequence seq, int valuesToProcess)
	{
		for(int i = 1; i <= valuesToProcess; i++)
		{
			int value = seq.next();
			nums.add(value);
			
			while(value < -9 || 9 < value)
			{
				value /= 10;
			}
			
			counters[value]++;
		}
	}
	
	/**
	 * Displays the distribution of the first digit
	 */
	public void display()
	{
		for(int i = 0; i < counters.length; i++)
		{
			System.out.printf("%3d: (%3d): ", i, counters[i]);
	        for(int j = 0; j < counters[i]; j++)
	        {
	        	System.out.print("*");
	        }
	         
	        System.out.println();
		}
	}
	
	public ArrayList<Integer> getValues()
	{
		return this.nums;
	}
}
