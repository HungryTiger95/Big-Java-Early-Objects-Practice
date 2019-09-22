package exercise_15;

/**
 * Modify the LabeledPoint class of E15.13 so that it implements the Comparable interface. Sort points
 * first by their x-coordinates. If two points have the same x-coordinates, then sort them by their y-coordinates.
 * If two points have the same x- and y-coordinates, sort them by their label. Write a tester program that checks
 * all cases by inserting points into a TreeSet.
 * 
 * @author Mayuresh
 *
 */
public class LabeledPoint implements Comparable<LabeledPoint>
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
	
	/**
	 * Compares a labeled point to another first against the x, then the y, then the label.
	 */
	public int compareTo(LabeledPoint otherPoint)
	{
		if(this.x < otherPoint.getX())
		{
			return -1;
		}
		else if(this.x > otherPoint.getX())
		{
			return 1;
		}
		else
		{
			if(this.y < otherPoint.getY())
			{
				return -1;
			}
			else if(this.y > otherPoint.getY())
			{
				return 1;
			}
			else
			{
				if(this.label.compareToIgnoreCase(otherPoint.getLabel()) < 0)
				{
					return -1;
				}
				else if(this.label.compareToIgnoreCase(otherPoint.getLabel()) > 0)
				{
					return 1;
				}
				else
				{
					return 0;
				}
			}
		}
	}
	
	public String toString()
	{
		return this.getClass().getName() + "[x=" + this.x + "][y=" + this.y + "][label=" + this.label + "]";
	}
	
	public int hashCode()
	{
		int h1 = this.label.hashCode();
		int h2 = Integer.hashCode(this.x);
		int h3 = Integer.hashCode(this.y);
		
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
