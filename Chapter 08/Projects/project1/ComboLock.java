package project1;

import java.util.ArrayList;

/**
 * Declare a class ComboLock that works like the combination lock in a gym locker.
 * The lock is constructed with a combination - three numbers between 0 and 39.
 * The reset method resets the dial so that it points to 0. The turnLeft and
 * turnRight methods turn the dial by a given number of ticks to the left or
 * right. The open method attempts to oen the lock. The lock opens if the user
 * first turned it right to the first number in the combination, then left to
 * the second, and then right to the third.
 * 
 * @author Mayuresh
 *
 */
public class ComboLock
{
	// Instance Variables	
	private int currentPosition;
	
	private ArrayList<Integer> correctNums = new ArrayList<Integer>();
	private ArrayList<Integer> move = new ArrayList<Integer>();
	private ArrayList<Integer> pos = new ArrayList<Integer>();
	
	private boolean unlocked = false;
	
	// Constructors
	/**
	 * Constructs a combination lock with a set combination
	 * @param secret1 first combination
	 * @param secret2 second combination
	 * @param secret3 third combination
	 */
	public ComboLock(int secret1, int secret2, int secret3)
	{
		correctNums.add(secret1);
		correctNums.add(secret2);
		correctNums.add(secret3);
		
		currentPosition = 0;
	}
	// Methods
	/**
	 * Rests the lock to 0
	 */
	public void reset()
	{
		currentPosition = 0;
	}
	
	/**
	 * Turns the lock towards the left. If the lock reaches 39, it adjusts to
	 * start back at 0
	 * @param ticks number of ticks to move to the left
	 */
	public void turnLeft(int ticks)
	{
		if(currentPosition + ticks > 39)
		{
			int temp1 = 39 - currentPosition + 1;
			currentPosition = ticks - temp1;
		}
		else
		{
			currentPosition = currentPosition + ticks;
		}
		
		pos.add(currentPosition);
		move.add(2);
	}
	
	/**
	 * Turns the lock towards the right. If the lock reaches 39, it adjusts to
	 * start back at 0
	 * @param ticks number of ticks to move to the left
	 */
	public void turnRight(int ticks)
	{
		if(currentPosition - ticks < 0)
		{
			int temp1 = (currentPosition + 1) - ticks;
			temp1 = Math.abs(temp1);
			currentPosition = 39  - temp1;
		}
		else
		{
			currentPosition = currentPosition - ticks;
		}
		
		pos.add(currentPosition);
		move.add(1);
	}
	
	/**
	 * Tries to open the lock
	 * @return true if the lock opens, false if the lock fails to open
	 */
	public boolean open()
	{
		ArrayList<Integer> correctMoves = new ArrayList<Integer>();
		
		correctMoves.add(1);
		correctMoves.add(2);
		correctMoves.add(1);
		
		if(move.equals(correctMoves) && (pos.equals(correctNums)))
		{
			unlocked = true;
		}
		else
		{
			unlocked = false;
		}
		
		return unlocked;
	}
	
	/**
	 * Gets the current position of the combo lock
	 * @return 
	 */
	public int getCurrentPosition()
	{
		return currentPosition;
	}
}
