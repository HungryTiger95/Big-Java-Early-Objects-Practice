package exercise9;

import java.awt.geom.Ellipse2D;

public class GeometryMethodsTester
{
	public static void main(String[] args)
	{
		Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, 40, 30);
		
		System.out.println("An ellipse with a = " + ellipse.getWidth() / 2.0);
		System.out.println("An ellipse with b = " + ellipse.getHeight() / 2.0);
		System.out.println("---------------------------------------------------------------");
		System.out.printf("Area of Area: %5.3f\n", Geometry.area(ellipse));
		System.out.printf("Area of Perimeter: %5.3f\n", Geometry.perimeter(ellipse));
	}
}
