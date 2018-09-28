package interface_example;

import java.awt.Rectangle;

public class AreaMeasurer implements Measurer
{
	public double measure(Object anObject)
	{
		Rectangle aRectangle = (Rectangle) anObject;
		
		double area = aRectangle.getWidth() * aRectangle.getHeight();
		return area;
	}
}
