package exercise_13;

import java.awt.Point;

/**
 * Reimplement the LabeledPoint class by storing the location in a
 * java.awt.Point object. Your toString method should invoke the toString
 * method of the point class
 * 
 * @author Mayuresh
 *
 */
public class LabeledPoint extends Point
{
	// Instance Variables
	private String label;
	
	// Constructors
	/**
	 * Constructs a Labeled Point with a given x, y, and a label
	 * @param x top left corner - x
	 * @param y top left corner - y
	 * @param pointLabel label
	 */
	public LabeledPoint(int x, int y, String pointLabel)
	{
		super(x, y);
		label = pointLabel;
	}
	
	// Methods
	/**
	 * Returns the content values of the object
	 */
	public String toString()
	{
		return super.toString() + "[label=" + getLabel() + "]";
	}
	
	/**
	 * Gets the x value of the point
	 * @return x
	 */
	public double getX()
	{
		return super.getX();
	}
	
	/**
	 * Gets the y value of the point
	 * @return y
	 */
	public double getY()
	{
		return super.getY();
	}
	
	/**
	 * Gets the label
	 * @return label
	 */
	public String getLabel()
	{
		return label;
	}
	
	/**
	 * Sets the label for the point
	 * @param label the label
	 */
	public void setLabel(String label)
	{
		this.label = label;
	}
}
