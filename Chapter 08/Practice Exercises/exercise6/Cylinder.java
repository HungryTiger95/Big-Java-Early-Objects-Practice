package exercise6;

public class Cylinder
{
	// Instance Variables
	private double radius, height;
	
	// Constructors
	/**
	 * Constructs a cylinder with a height and radius
	 * @param radius radius
	 * @param height height
	 */
	public Cylinder(double radius, double height)
	{
		this.radius = radius;
		this.height = height;
	}
	
	// Methods
	/**
	 * Gets the volume of a cylinder
	 * @return volume
	 */
	public double getVolume()
	{
		double volume = Math.PI * Math.pow(radius, 2) * height;
		return volume;
	}
	
	/**
	 * Gets the surface area of a cylinder
	 * @return surface area
	 */
	public double getSurfaceArea()
	{
		double surfaceArea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
		return surfaceArea;
	}
}
