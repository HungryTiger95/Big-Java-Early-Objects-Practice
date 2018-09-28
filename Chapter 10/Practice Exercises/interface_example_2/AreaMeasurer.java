package interface_example_2;

import java.awt.Rectangle;

/**
 * Objects of this class measure rectangles by area
 * 
 * @author Mayuresh
 *
 */
public class AreaMeasurer implements Measurer
{
	/**
	 * Measures a Rectangle object
	 * @param anObject the object to be measured, the rectangle
	 * @return the area of the rectangle
	 */
	public double measure(Object anObject)
	{
		Rectangle aRectangle = (Rectangle) anObject;
		
		double area = aRectangle.getWidth() * aRectangle.getHeight();
		return area;
	}
}
