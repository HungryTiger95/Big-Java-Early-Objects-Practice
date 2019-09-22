/**
 * E4.21
 * 
 * Implement a class IceCreamCone with methods getSurfaceArea() and getVolume(). In the
 * constructor, supply the height and radius of the cone. Be careful when looking up the
 * formula for the surface area - you should only include the outside area along the side
 * of the cone since the cone has an opening on the top to hold the ice cream.
 * 
 * @author Mayuresh
 *
 */

public class IceCreamCone
{
	// Instance Variables
	private int r;
	private int h;
	
	// Constructors
	/**
	 * Creates an object called IceCreamCone with a given radius and height
	 * @param radius radius of the base
	 * @param height height of the cone
	 */
	public IceCreamCone(int radius, int height)
	{
		r = radius;
		h = height;
	}
	
	// Methods
	/**
	 * Gets the surface area of the ice cream cone
	 * @return surface area
	 */
	public double getSurfaceArea()
	{
		double surfaceArea = Math.PI * r * (r + Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2)));
		return surfaceArea;
	}
	
	/**
	 * Gets the volume of the ice cream cone
	 * @return volume
	 */
	public double getVolume()
	{
		double volume = (1.0 / 3.0) * Math.PI * Math.pow(r, 2) * h;
		return volume;
	}
}
