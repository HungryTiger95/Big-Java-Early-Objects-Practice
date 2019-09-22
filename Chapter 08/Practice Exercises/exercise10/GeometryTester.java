package exercise10;

import java.awt.geom.Point2D;

public class GeometryTester
{
	public static void main(String[] args)
	{
		Point2D.Double p = new Point2D.Double(3, 1);
		Point2D.Double q = new Point2D.Double(9,-4);
		
		System.out.printf("Angle: %5.2f\n", Geometry.angle(p, q));
		System.out.printf("Slope: %5.2f\n", Geometry.slope(p, q));
	}
}
