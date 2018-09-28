package interface_example_4;

import java.awt.Rectangle;

/**
 * An entity is anonymous if it does not have a name. In a program, something that is
 * only used once doesn't usually need a name. Programmers like anonymous objects,
 * because they don't have to go through the trouble of coming up with a name. In Java,
 * it is possible to declare anonymous classes if all you ever need is a single object
 * of the class.
 * 
 * 		public static void main(String[] args)
 * 		{
 * 			// Construct an object of any anonymous class
 * 			Measurer m = new Measurer()
 * 				// Class declaration starts here
 * 				{
 * 					public double measure(Object anObject)
 * 					{
 * 						Rectangle aRectangle = (Rectangle) anObject;
 * 						return aRectangle.getWidth() * aRectangle.getHeigth();
 * 					}
 * 				};
 * 
 * 			double result = Data.average(rectangles, m);
 * 			...
 * 		}
 * 
 * This means: Construct an object of a class that implements the Measurer interface by
 * declaring the measure method as specified.
 * 
 * @author Mayuresh
 *
 */
public class MeasurerTester
{	
	public static void main(String[] args)
	{	
		// Constructs an object of an anonymous class
		Measurer m = new Measurer()
		{
			public double measure(Object anObject)
			{
				Rectangle aRectangle = (Rectangle) anObject;
				double area = aRectangle.getWidth() * aRectangle.getHeight();
				
				return area;
			}
		};
		
		Rectangle[] rects = new Rectangle[]
				{
						new Rectangle(5, 10, 15, 20),
						new Rectangle(8, 15, 12, 60),
						new Rectangle(6, 12, 35, 20),
						new Rectangle(9, 15, 55, 40),
						new Rectangle(10, 10, 85, 40),
						new Rectangle(90, 50, 15, 80)
				};
		
		double averageArea = Data.average(rects, m);
		
		System.out.println("Average Area: " + averageArea);
	}
}
