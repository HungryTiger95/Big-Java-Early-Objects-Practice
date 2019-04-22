package exercise_14;

import java.awt.Point;

/**
 * Reimplement the LabeledPoint class of Exercise 15.13 by storing the location in a
 * java.awt.Point object. Your hashCode and equals method should call the hashCode and
 * equals methods of the point class.
 * 
 * @author Mayuresh
 *
 */
public class LabeledPoint
{
	// Instance Variables
	private Point point;
	private String label;
	
	// Constructors
	/**
	 * Constructs a labeled point that has an x and y coordinate and a label
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @param label the label
	 */
	public LabeledPoint(int x, int y, String label)
	{
		this.point = new Point(x, y);
		this.label = label;
	}
	
	// Methods
	/**
	 * Gets the point
	 * @return the point
	 */
	public Point getPoint()
	{
		return this.point;
	}
	
	/**
	 * Sets the location of the label
	 * @param x the x-coordinate
	 * @param y the y-coordinate
	 */
	public void setLocation(int x, int y)
	{
		this.point.setLocation(x, y);
	}
	
	/**
	 * Gets the x-coordinate
	 * @return the x-coordinate
	 */
	public double getX()
	{
		return this.point.getX();
	}
	
	/**
	 * Gets the y-coordinate
	 * @return the y-coordinate
	 */
	public double getY()
	{
		return this.point.getY();
	}
	
	/**
	 * Sets the label
	 * @param label the label
	 */
	public void setLable(String label)
	{
		this.label = label;
	}
	
	/**
	 * Gets the label
	 * @return the label
	 */
	public String getLabel()
	{
		return this.label;
	}
	
	public String toString()
	{
		return this.getClass().getName() + "[x=" + this.point.getX() + "][y=" + this.point.getY() + "][label=" + this.label + "]";
	}
	
	public int hashCode()
	{
		int h1 = this.label.hashCode();
		int h2 = this.point.hashCode();
		
		final int HASH_MULTIPLIER = 29;
		
		int h = HASH_MULTIPLIER * h1 + h2;
		
		return h;
	}
	
	public boolean equals(Object otherObject)
	{
		LabeledPoint otherPoint = (LabeledPoint) otherObject;
		return this.hashCode() == otherPoint.hashCode();
	}
}
