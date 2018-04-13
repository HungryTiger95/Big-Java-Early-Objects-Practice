import java.awt.geom.Point2D;

/**
 * P4.3
 * 
 * In this project, you will perform calculations with triangles. A triangle is defined by
 * the x- and y-coordinates of its three corner points.
 * 
 * Your job is to compute the following properties of a given triangle:
 * 
 * 		Lengths of its sides
 * 		Angles at all corners
 * 		Perimeter
 * 		Area
 * 
 * Implement a Triangle class with appropriate methods. Supply a program the
 * prompts the user for the corner point coordinates and produces a nicel formatted
 * table of the triangle properties.
 * 
 * @author Mayuresh
 *
 */

public class Triangle
{
	// Instance Variables
	private double x1, x2, x3, y1, y2, y3;
	private Point2D.Double a;
	private Point2D.Double b;
	private Point2D.Double c;
	
	
	// Constructors
	/**
	 * Constructs a Triangle object with given x and y coordinates of 3 points
	 * @param x1 x-coordinate of point 1
	 * @param y1 y-coordinate of point 1
	 * @param x2 x-coordinate of point 2
	 * @param y2 y-coordinate of point 2
	 * @param x3 x-coordinate of point 3
	 * @param y3 y-coordinate of point 3
	 */
	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3)
	{
		// Coordinates
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		// Points
		a = new Point2D.Double(x1, y1);
		b = new Point2D.Double(x2, y2);
		c = new Point2D.Double(x3, y3);
	}
	
	// Methods
	/**
	 * Gets the perimeter of the triangle
	 * @return perimeter
	 */
	public double getPerimeter()
	{
		double line1 = a.distance(b);
		double line2 = a.distance(c);
		double line3 = b.distance(c);
		
		double perimeter = line1 + line2 + line3;
		return perimeter;
	}
	
	/**
	 * Gets the length of the side a
	 * @return length
	 */
	public double getALength()
	{
		double length = a.distance(b);
		return length;
	}
	
	/**
	 * Gets the length of the side a
	 * @return length
	 */
	public double getBLength()
	{
		double length = b.distance(c);
		return length;
	}
	
	/**
	 * Gets the length of the side a
	 * @return length
	 */
	public double getCLength()
	{
		double length = c.distance(a);
		return length;
	}
	
	/**
	 * Gets the area of the triangle
	 * @return area
	 */
	public double getArea()
	{
		double area;
		area = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2);
		return area;
	}
	
	/**
	 * Gets the angle A
	 * @return angle A
	 */
	public double getAngleA()
	{
		double angle = (Math.pow(getCLength(), 2) + Math.pow(getALength(), 2) - Math.pow(getBLength(), 2)) / 
				(2 * getCLength() * getALength());
		angle = Math.acos(angle);
		return angle;
	}
	
	/**
	 * Gets the angle B
	 * @return angle B
	 */
	public double getAngleB()
	{
		double angle = (Math.pow(getBLength(), 2) + Math.pow(getCLength(), 2) - Math.pow(getALength(), 2)) / 
				(2 * getBLength() * getCLength());
		angle = Math.acos(angle);
		return angle;
	}
	
	/**
	 * Gets the angle C
	 * @return angle C
	 */
	public double getAngleC()
	{
		double angle = (Math.pow(getALength(), 2) + Math.pow(getBLength(), 2) - Math.pow(getCLength(), 2)) / 
				(2 * getALength() * getBLength());
		angle = Math.acos(angle);
		return angle;
	}
}
