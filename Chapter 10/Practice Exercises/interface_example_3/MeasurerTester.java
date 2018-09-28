package interface_example_3;

import java.awt.Rectangle;

/**
 * When you have a class that serves a very limited purpose, such as the AreaMeasurer class,
 * you can declare the class inside the method that needs it. A class that is declared inside
 * another class is called an inner class. This signals that the AreaMeasurer class is not
 * interesting beyond the scope of this method. Since an inner class inside a method is not a
 * publicly accessible  feature, you don't need to document it as thoroughly. You can also
 * declare an inner class inside an enclosing class, but outside of its methods. Then the
 * inner class is available to all methods of the enclosing class. Also, the compiler turns
 * an inner class into a regular class file.
 * 
 * @author Mayuresh
 *
 */
public class MeasurerTester
{	
	public static void main(String[] args)
	{	
		class AreaMeasurer implements Measurer
		{
			@Override
			public double measure(Object anObject)
			{
				Rectangle aRectangle = (Rectangle) anObject;
				
				double area = aRectangle.getWidth() * aRectangle.getHeight();
				return area;
			}
			
		}
		
		Measurer areaMeas = new AreaMeasurer();
		
		Rectangle[] rects = new Rectangle[]
				{
						new Rectangle(5, 10, 15, 20),
						new Rectangle(8, 15, 12, 60),
						new Rectangle(6, 12, 35, 20),
						new Rectangle(9, 15, 55, 40),
						new Rectangle(10, 10, 85, 40),
						new Rectangle(90, 50, 15, 80)
				};
		
		double averageArea = Data.average(rects, areaMeas);
		
		System.out.println("Average Area: " + averageArea);
	}
}
