/**
 * P3.3
 * 
 * Implement a class Balloon. A balloon starts out with radius 0. Supply a method
 * inflate(double amount) that increases the radius by the given amount. Supply a method
 * getVolume() that returns the current volume of the balloon. Use Math.PI for the value of pi.
 * To compute the cube of a value r, use r * r * r.
 * 
 * @author Mayuresh
 *
 */

public class Balloon
{
	private int balloonRadius;
	private double balloonVolume;
	
	// Constructors
	/**
	 * Creates a Balloon object with radius 0
	 */
	public Balloon()
	{
		balloonRadius = 0;
	}
	
	// Methods
	/**
	 * Inflates the Balloon by an amount radius
	 * @param amount amount radius change
	 */
	public void inflate(int amount)
	{
		balloonRadius = balloonRadius + amount;
	}
	
	/**
	 * Gets the volume of the balloon
	 * @return volume of the balloon
	 */
	public double getVolume()
	{
		balloonVolume = (4.0 / 3.0) * Math.PI * Math.pow(balloonRadius, 3);
		return balloonVolume;
	}
}
