package exercise_10;

import java.awt.Rectangle;

/**
 * The java.awt.Rectangle class of the standard Java library does not supply a method
 * to compute the area or perimeter of a rectangle. Provide a sublcass BetterRectangle of
 * the Rectangle class that has getPerimeter and getArea methods. Do not add any instance
 * variables. In the constructor, call the setLocation and setSize methods of the Rectangle
 * class. Provide a program that tests the methods that you supplied.
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
		super.setLocation(xLeft, yLeft);
		super.setSize(width, height);
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
