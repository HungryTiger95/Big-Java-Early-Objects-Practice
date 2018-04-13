/**
 * E3.13
 * 
 * Implement a class Moth that models a moth flying along a straight line. The moth has
 * a position, which is the distance from a fixed origin. When the moth moves toward a
 * point of light, its new position is halfway between its old position and the position of
 * the light source. Supply a constructor public Moth(double initialPosition) and methods
 * moveToLight(double lightPosition), and double getPosition().
 * 
 * @author Mayuresh
 *
 */

public class Moth
{
	// Instance Variables
	private double currentPosition;
	
	// Constructors
	/**
	 * Constructs a Moth object with a given initial position
	 * @param initialPosition initial position
	 */
	public Moth(double initialPosition)
	{
		currentPosition = initialPosition;
	}
	
	// Methods
	/**
	 * Moves the moth half the distance it is to the light
	 * @param lightPosition position of the light
	 */
	public void moveToLight(double lightPosition)
	{
		currentPosition = currentPosition + (lightPosition / 2.0);
	}
	
	/**
	 * Gets the Moth's position
	 * @return
	 */
	public double getPosition()
	{
		return currentPosition;
	}
}
