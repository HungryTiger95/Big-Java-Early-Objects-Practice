import java.awt.Point;

/**
 * Testing E2.13
 * 
 * Look at the API of the Point class and find out how to construct a Point object. In a
 * PointTester program, construct two points with coordinates (3,4) and (-3,-4). Find
 * the distance between them, using the distance method. Print the distance, as well as
 * the expected value.
 * @author Mayuresh
 *
 */

public class PointTester
{
	public static void main (String[] args)
	{
		Point point1 = new Point(3, 4);
		Point point2 = new Point(-3, -4);
		
		double dist = point1.distance(point2);
		
		System.out.println("Expected: 10");
		System.out.println("Distance of the two points: " + dist);
	}
}
