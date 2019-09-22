package exercise6;

public class Cone
{
	// Instance Variables
	private double radius, height;
	
	// Constructors
	/**
	 * Constructs a cone object with a radius and a height
	 * @param r radius
	 * @param h height
	 */
	public Cone(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}
	
	// Methods
	/**
	 * Gets the volume of a cone
	 * @return volume
	 */
	public double getVolume()
	{
		double volume = Math.PI * Math.pow(radius, 2) * (height / 3.0);
		return volume;
	}
	
	/**
	 * Gets the surface area of a cone
	 * @return surface area
	 */
	public double getSurfaceArea()
	{
		double surfaceArea = Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
		return surfaceArea;
	}
}
