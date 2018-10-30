package exercise_13_01;

/**
 * Given a class Rectangle with instance variables width and height, provide a recursive getArea method.
 * Construct a rectangle whose width is one less than the original and call its getArea method.
 * 
 * @author Mayuresh
 *
 */
public class Rectangle
{
	// Instance Variables
	int width, height;
	
	// Constructors
	/**
	 * Constructs a rectangle with a width and height
	 * @param width width
	 * @param height height
	 */
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	// Methods
	/** 
	 * Gets the are of a rectangle
	 * @param width width of rectangle
	 * @param height height of rectangle
	 * @return the area of the rectangle
	 */
	public int getArea()
	{
		// Area is 0 if either side is 0
		if(this.width <= 0 || this.height <= 0)
		{
			return 0;
		}
		// Area is 1 if both sides are 1
		else if(this.width == 1 && this.height == 1)
		{
			return 1;
		}
		// Compute area recursively
		else
		{
			Rectangle smallerRectangle = new Rectangle(this.width -1, this.height - 1);
			int smallerArea = smallerRectangle.getArea();
			return smallerArea + this.width + this.height - 1;
		}
	}
	
	/**
	 * Gets the width of the rectangle
	 * @return width
	 */
	public int getWidth()
	{
		return width;
	}
	
	/**
	 * Gets the height of the rectangle
	 * @return height
	 */
	public int getHeight()
	{
		return height;
	}
}
