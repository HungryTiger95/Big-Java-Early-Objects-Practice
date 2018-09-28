package exercise_10_5;

import java.awt.Rectangle;

public class AreaMeasurer implements Measurer
{
	/**
	 * Measures the area of an object, rectangle
	 * @param the object to be measured, the rectangle
	 * @return the area of the rectangle
	 */
	public double measure(Object anObject)
	{
		Rectangle aRectangle = (Rectangle) anObject;
		double area = aRectangle.getHeight() * aRectangle.getWidth();
		return area;
	}
}
