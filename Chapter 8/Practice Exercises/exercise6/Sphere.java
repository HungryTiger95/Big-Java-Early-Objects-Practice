package exercise6;

public class Sphere
{
	// Instance Variables
	private double radius;
	
	// Constructors
	/**
	 * Constructs a sphere object
	 * @param radius
	 */
	public Sphere(double radius)
	{
		this.radius = radius;
	}
	
	// Methods
	/**
	 * Gets the Volume of the sphere
	 * @return volume
	 */
	public double getVolume()
	{
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		return volume;
	}
	
	/**
	 * Gets the Surface Area of the sphere
	 * @return surface area
	 */
	public double getSurfaceArea()
	{
		double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2);
		return surfaceArea;
	}
}
