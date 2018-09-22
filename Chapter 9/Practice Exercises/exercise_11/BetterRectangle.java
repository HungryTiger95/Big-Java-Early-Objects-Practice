package exercise_11;

import java.awt.Rectangle;

/**
 * Repeat exercise 10 but this time, invoke the superclass constructor
 * 
 * @author Mayuresh
 *
 */
public class BetterRectangle extends Rectangle
{
	// Instance Variables
	
	// Constructors
	/**
	 * Constructs a BetterRectangle object with a given position and size
	 * @param xLeft top left x-position
	 * @param yLeft top left y-position
	 * @param width width
	 * @param height height
	 */
	public BetterRectangle(int xLeft, int yLeft, int width, int height)
	{
		super(xLeft, yLeft, width, height);
	}
	
	// Methods
	/**
	 * Gets the perimeter of the rectangle
	 * @return the perimeter
	 */
	public double getPerimeter()
	{	
		return (getWidth() * 2) + (getHeight() * 2);
	}
	
	/**
	 * Gets the area of the rectangle
	 * @return the area
	 */
	public double getArea()
	{
		return getWidth() * getHeight();
	}
}
