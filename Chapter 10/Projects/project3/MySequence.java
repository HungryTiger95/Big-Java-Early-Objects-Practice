package project3;

import java.util.ArrayList;

public class MySequence implements Sequence
{
	// Instance Variables
	private ArrayList<Integer> nums;
	private int index = 0;
	
	// Constructors
	/**
	 * Constructs a sequence object
	 */
	public MySequence()
	{
		nums = new ArrayList<Integer>();
	}
	
	// Methods
	/**
	 * Sets up a sequence of a given size with random values for each element
	 * @param dataSize the number of integers in the sequence
	 */
	public void setUpSequence(int dataSize)
	{
		for(int i = 0; i < dataSize; i++)
		{
			nums.add((int) (Integer.MAX_VALUE * Math.random()));
		}
	}
	
	/**
	 * Displays the sequence
	 */
	public void display()
	{
		System.out.print("[");
		for(int i = 0; i < nums.size(); i++)
		{
			System.out.print(nums.get(i) + ", ");
		}
		System.out.println("]");
	}
	
	@Override
	/**
	 * Gets the next value
	 */
	public int next()
	{
		return nums.get(index++);
	}
	
	@Override
	/**
	 * Checkes whether or not there are more values
	 */
	public boolean hasNext()
	{
		if(index < nums.size())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
