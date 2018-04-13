/**
 * E4.23
 * 
 * Implement a class Balloon that models a spherical balloon that is being filled with air.
 * The constructor constructs an empty balloon. Supply the methods; addAir, getVolume, geSurfaceArea,
 * getRadius. Supply a tester class that constructs a balloon, adds 100cm^3 of air, tests the three
 * accessor methods, adds another 100cm^3 of air, and tests the accessor methods again.
 * 
 * @author Mayuresh
 *
 */
public class Balloon
{
	// Instance Variables
	private double radius;
	private double volume;
	
	// Constructors
	/**
	 * Constructs Balloon object that starts without any air
	 */
	public Balloon()
	{
		volume = 0;
		radius = 0;
	}
	
	// Methods
	/**
	 * Adds air to the Balloon object cubic centimeters
	 * @param amount amount in cubic centimeters
	 */
	public void addAir(double amount)
	{
		volume = volume + amount;
		radius = Math.cbrt((volume) / ((4.0 / 3.0) * Math.PI));
	}
	
	/**
	 * Gets the volume of the Balloon
	 * @return volume in cubic centimeters
	 */
	public double getVolume()
	{
		double thisVolume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		return thisVolume;
	}
	
	/**
	 * Gets the surface area
	 * @return surface area in square centimeters
	 */
	public double getSurfaceArea()
	{
		double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
		return surfaceArea;
	}
	
	/**
	 * Gets the radius
	 * @return radius in centimeters
	 */
	public double getRadius()
	{
		return radius;
	}
}
