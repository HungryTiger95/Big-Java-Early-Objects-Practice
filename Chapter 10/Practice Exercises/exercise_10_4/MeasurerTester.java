package exercise_10_4;

import java.awt.Rectangle;

public class MeasurerTester
{
	public static void main(String[] args)
	{
		Measurer areaMeas = new AreaMeasurer();
		
		Rectangle[] rects = new Rectangle[]
				{
						new Rectangle(5, 10, 15, 20),
						new Rectangle(8, 15, 12, 60),
						new Rectangle(6, 12, 35, 20),
						new Rectangle(10, 10, 150, 100),
						new Rectangle(9, 15, 55, 40),
						new Rectangle(10, 10, 85, 40),
						new Rectangle(90, 50, 15, 80)
				};
		
		double averageArea = Data.average(rects, areaMeas);
		Rectangle largestRect = (Rectangle) Data.max(rects, areaMeas);
		
		System.out.println("Max Area: " + areaMeas.measure(largestRect));
		System.out.println("Average Area: " + averageArea);
	}
}
