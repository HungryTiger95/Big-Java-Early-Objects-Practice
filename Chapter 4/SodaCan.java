
/**
 * E4.22
 * 
 * Implement a class SOdaCan whose constructor receives the height and diameter of the
 * soda can. Supply methods getVolume and getSurfaceArea. Supply a SodaCanTester class
 * that tests your class.
 * 
 * @author Mayuresh
 *
 */
public class SodaCan
{
	// Instance Variables
	private int h;
	private int d;
	
	// Constructors
	/**
	 * Constructs a SodaCan object with a given height and diameter
	 * @param height height of SodaCan
	 * @param diameter diameter of SodaCan
	 */
	public SodaCan(int height, int diameter)
	{
		h = height;
		d = diameter;
	}
	
	// Methods
	/**
	 * Gets the volume of SodaCan
	 * @return volume
	 */
	public double getVolume()
	{
		double volume = Math.PI * Math.pow(d / 2.0, 2) * h;
		return volume;
	}
	
	/**
	 * Gets the surface area of SodaCan
	 * @return surface area
	 */
	public double getSurfaceArea()
	{
		double surfaceArea = (2 * Math.PI * (d / 2) * h) + (2 * Math.PI * Math.pow((d / 2), 2));
		return surfaceArea;
	}
}
