package exercise_12;

/**
 * A labeled point has x- and y-coordinates and a string label. Provide a class LabledPoint
 * with a constructor LabledPoint(int x, int y, String label) and a toString method
 * that displays x, y, and the label.
 * 
 * @author Mayuresh
 *
 */
public class LabeledPoint
{
	// Instance Variables
	private int xVal, yVal;
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
		xVal = x;
		yVal = y;
		label = pointLabel;
	}
	
	// Methods
	/**
	 * Returns the content values of the object
	 */
	public String toString()
	{
		return getClass().getName() + "[x=" + getX() + "][y=" + getY() + "][label=" + getLabel() + "]";
	}
	
	/**
	 * Gets the x value of the point
	 * @return x
	 */
	public int getX()
	{
		return xVal;
	}
	
	/**
	 * Sets the x value of the point
	 * @param x the x value
	 */
	public void setX(int x)
	{
		xVal = x;
	}
	
	/**
	 * Gets the y value of the point
	 * @return y
	 */
	public int getY()
	{
		return yVal;
	}
	
	/**
	 * Sets the y value of the point
	 * @param y the x value
	 */
	public void setY(int y)
	{
		yVal = y;
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
