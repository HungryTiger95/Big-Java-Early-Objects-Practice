package exercise_10_4;

import java.awt.Rectangle;

/**
 * Objects of this class measure rectangles by area.
 * 
 * This class implements the Measurer interface. So in this class, we define the measure method that was
 * declared in the actual interface.
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
	@Override
	public double measure(Object anObject)
	{
		Rectangle aRectangle = (Rectangle) anObject;
		
		double area = aRectangle.getWidth() * aRectangle.getHeight();
		return area;
	}
}
