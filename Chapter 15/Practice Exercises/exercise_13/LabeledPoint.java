package exercise_13;

/**
 * A labeled point has x- and y-coordinates and a string label. Provide a class LabeledPoint with
 * a constructor LabeledPoint(int x, int y, String label) and hashCode and equals methods. Two labeled
 * points are considered the same when they have the same x and y coordinates and the same label.
 * 
 * @author Mayuresh
 *
 */
public class LabeledPoint
{
	// Instance Variables
	private int x;
	private int y;
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
		this.x = x;
		this.y = y;
		this.label = label;
	}
	
	// Methods
	/**
	 * Sets the x-coordinate
	 * @param x the x coordinate
	 */
	public void setX(int x)
	{
		this.x = x;
	}
	
	/**
	 * Sets the y-coordinate
	 * @param y the y coordinate
	 */
	public void setY(int y)
	{
		this.y = y;
	}
	
	/**
	 * Gets the x-coordinate
	 * @return the x-coordinate
	 */
	public int getX()
	{
		return this.x;
	}
	
	/**
	 * Gets the y-coordinate
	 * @return the y-coordinate
	 */
	public int getY()
	{
		return this.y;
	}
	
	/**
	 * Sets the label
	 * @param label the label
	 */
	public void setLabel(String label)
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
		return this.getClass().getName() + "[x=" + this.x + "][y=" + this.y + "][label=" + this.label + "]";
	}
	
	public int hashCode()
	{
		int h1 = this.label.hashCode();
		int h2 = new Integer(this.x).hashCode();
		int h3 = new Integer(this.y).hashCode();
		
		final int HASH_MULTIPLIER = 29;
		
		int h = HASH_MULTIPLIER * h1 + h2;
		h = HASH_MULTIPLIER * h + h3;
		
		return h;
	}
	
	public boolean equals(Object otherObject)
	{
		LabeledPoint otherPoint = (LabeledPoint) otherObject;
		return this.hashCode() == otherPoint.hashCode();
	}
}
