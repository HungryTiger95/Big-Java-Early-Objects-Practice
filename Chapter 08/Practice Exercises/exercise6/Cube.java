package exercise6;

public class Cube
{
	// Instance Variables
	private double height;
	
	// Constructors
	/**
	 * Constructs and object cube with a height
	 * @param height side length
	 */
	public Cube(double height)
	{
		this.height = height;
	}
	
	// Methods
	/**
	 * Gets the volume of a cube
	 * @return volume
	 */
	public double getVolume()
	{
		double volume = Math.pow(height, 3);
		return volume;
	}
	
	/**
	 * Gets the surface area of a cube
	 * @return surface area
	 */
	public double getSurfaceArea()
	{
		double surfaceArea = 6 * Math.pow(height, 2);
		return surfaceArea;
	}
}
