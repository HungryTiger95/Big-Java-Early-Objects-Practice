package exercise9;

import java.awt.geom.Ellipse2D;

/**
 * Write methods
 * 
 * 		public static double perimeter(Ellipse2D.Double e)
 * 		public static double area(Ellipse2D.Double e)
 * 
 * that compute the area and perimeter of the ellipse e. Add thse methods to a class Geometry.
 * 
 * @author Mayuresh
 *
 */
public class Geometry
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	/**
	 * Calculates the perimeter of an ellipse
	 * @param ellipse ellipse
	 * @return perimeter of an ellipse
	 */
	public static double perimeter(Ellipse2D.Double ellipse)
	{
		double perimeter;
		
		double a = ellipse.getWidth() / 2.0;
		double b = ellipse.getHeight() / 2.0;
		
		perimeter = Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
		
		return perimeter;
	}
	
	/**
	 * Calculates the area of an ellipse
	 * @param ellipse ellipse
	 * @return area of an ellipse
	 */
	public static double area(Ellipse2D.Double ellipse)
	{
		double area;
		double a = ellipse.getWidth() / 2.0;
		double b = ellipse.getHeight() / 2.0;
		
		area = Math.PI * a * b;
		
		return area;
	}
}
