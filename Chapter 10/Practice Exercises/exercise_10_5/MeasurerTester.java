package exercise_10_5;

import java.awt.Rectangle;

public class MeasurerTester
{
	public static void main(String[] args)
	{
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
