/**
 * E3.12
 * 
 * Write a class Bug that models a bug moving along a horizontal line. The bug moves
 * either to the right or left. Initial, the bug moves to the right, but it can turn to
 * change its direction. In each move, its position changes by one unit in the current
 * direction. Provide a constructor public Bug(int initialPosition) and methods
 * turn(), move(), and getPosition().
 * 
 * @author Mayuresh
 *
 */

public class Bug
{
	// Instance Variables
	private int currentPosition;
	private int xPosition = 1;		// Signifies moving 1 in the x-axis
	
	// Constructors
	/**
	 * Constructs a object bug at a given position
	 * @param initialPosition initial position
	 */
	public Bug(int initialPosition)
	{
		currentPosition = initialPosition;
	}
	
	// Methods
	/**
	 * Turns the bug around (x-axis)
	 */
	public void turn()
	{
		xPosition = xPosition * -1;
	}
	
	/**
	 * Moves the bug one space
	 */
	public void move()
	{
		currentPosition = currentPosition + xPosition;
	}
	
	/**
	 * Gets the current position of the bug
	 * @return current position
	 */
	public int getPosition()
	{
		return currentPosition;
	}
}
