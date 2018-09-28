package exercise_10_7;

import java.awt.Rectangle;

public class MeasurerTester
{
	public static void main(String[] args)
	{
		class AreaMeasurer implements Measurer
		{
			public double measure(Object anObject)
			{
				Rectangle aRectangle = (Rectangle) anObject;
				double area = aRectangle.getHeight() * aRectangle.getWidth();
				return area;
			}
		}
		
		class PerimeterMeasurer implements Measurer
		{
			public double measure(Object anObject)
			{
				Rectangle aRectangle = (Rectangle) anObject;
				double perimeter = (aRectangle.getWidth() * 2) + (aRectangle.getHeight() * 2);
				return perimeter;
			}
		}
		
		Measurer areaMeas = new AreaMeasurer();
		Measurer perimeterMeas = new PerimeterMeasurer();
		
		Rectangle[] rects = new Rectangle[]
				{
						new Rectangle(5, 10, 20, 30),
						new Rectangle(10, 20, 30, 40),
						new Rectangle(20, 30, 5, 15)
				};
		
		double averageArea = Data.average(rects, areaMeas);
		System.out.println("Average Area: " + averageArea);
		System.out.println("Expected: 625");
		
		double largestArea = Data.max(rects, areaMeas);
		System.out.println("Largest Area: " + largestArea);
		System.out.println("Expected: 1200");
		
		double largestPerim = Data.max(rects, perimeterMeas);
		System.out.println("Largest Perimeter: " + largestPerim);
		System.out.println("Expected: 140");
	}
}
