package exercise_10_5;

import java.awt.Rectangle;

public class PerimeterMeasurer implements Measurer
{
	/**
	 * Measures the perimeter of a Rectangle object
	 * @param the object to measure, the rectangle
	 * @return the perimeter of the rectangle
	 */
	public double measure(Object anObject)
	{
		Rectangle aRectangle = (Rectangle) anObject;
		double perimeter = (aRectangle.getWidth() * 2) + (aRectangle.getHeight() * 2);
		return perimeter;
	}
}
