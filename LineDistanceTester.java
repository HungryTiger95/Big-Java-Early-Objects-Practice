import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Testing P2.8
 * 
 * Write a program LineDistanceTester that constructs a line joining the points (100, 100)
 * and (200, 200), then constructs points (100, 200), (150,150), and (250, 50). Print the
 * distance from the line to each of the three points, using the ptSegDist method of the
 * Line2D class. Also print the expected values. (Draw a sketch on graph paper to find
 * what values you expect.
 * 
 * @author Mayuresh
 *
 */
public class LineDistanceTester
{
	public static void main(String[] args)
	{
		// Makes two points and forms a segment from the two
		Point2D.Double from = new Point2D.Double(100, 100);
		Point2D.Double to = new Point2D.Double(200, 200);
		
		Line2D.Double seg1 = new Line2D.Double(from, to);
		
		Point2D.Double p1 = new Point2D.Double(100, 200);
		Point2D.Double p2 = new Point2D.Double(150, 150);
		Point2D.Double p3 = new Point2D.Double(250, 50);
		
		System.out.println("Point 1: " + seg1.ptSegDist(p1));
		System.out.println("Point 2: " + seg1.ptSegDist(p2));
		System.out.println("Point 3: " + seg1.ptSegDist(p3));
	}
}
