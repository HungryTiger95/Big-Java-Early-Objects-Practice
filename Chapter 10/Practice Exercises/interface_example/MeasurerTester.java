package interface_example;

import java.awt.Rectangle;

public class MeasurerTester
{
	public static void main(String[] args)
	{
		Measurer areaMeas = new AreaMeasurer();
		
		Rectangle[] rects = new Rectangle[]
			{
						new Rectangle(5, 10, 20, 30),
						new Rectangle(10, 30, 100, 200),
						new Rectangle(10, 15, 20, 25),
						new Rectangle(100, 100, 100, 100)
			};
		
		double averageArea = Data.average(rects, areaMeas);
		
		System.out.println("Average Area: " + averageArea);
	}
}
