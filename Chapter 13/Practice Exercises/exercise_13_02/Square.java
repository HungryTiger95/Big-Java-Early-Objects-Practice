package exercise_13_02;

/**
 * Given a class Square with an instance variable width, provide a recursive getArea method.
 * Construct a square whose width is one less than the original and call its getArea method.
 
 * @author Mayuresh
 *
 */
public class Square
{
	// Instance Variables
	private int width;
	
	// Constructors
	/**
	 * Constructs a square with a given width
	 * @param width width
	 */
	public Square(int width)
	{
		this.width = width;
	}
	
	// Methods
	/**
	 * Gets the width of the rectangle
	 * @return width
	 */
	public int getWidth()
	{
		return this.width;
	}
	
	/**
	 * Gets the area of square
	 * @return area
	 */
	public int getArea()
	{
		if(this.width <= 0)
		{
			return 0;
		}
		else if(this.width == 1)
		{
			return 1;
		}
		else
		{
			Square smallerSquare = new Square(this.width - 1);
			int smallerArea = smallerSquare.getArea();
			return smallerArea + this.width + this.width - 1;
		}
	}
}
