import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

/**
 * Graphics P2.9
 * 
 * Write a program LineDistanceTester that constructs a line joining the points (100, 100)
 * and (200, 200), then constructs points (100, 200), (150,150), and (250, 50). Print the
 * distance from the line to each of the three points, using the ptSegDist method of the
 * Line2D class. Also print the expected values. (Draw a sketch on graph paper to find
 * what values you expect.
 * 
 * Write a graphical application that shows the line and the points. Draw each point as a
 * tiny circle. Use the drawString method to draw each distance next to the point, using
 * calls
 * 
 * 		g2.drawString("Distance: " + distance, p.getX(), p.getY());
 * 
 * @author Mayuresh
 *
 */
public class LineDistanceComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		// Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Instantiate the main line segment from two points
		Point2D.Double from = new Point2D.Double(100, 100);
		Point2D.Double to = new Point2D.Double(200, 200);
		
		Line2D.Double seg1 = new Line2D.Double(from, to);
		
		// Draw the line segment
		g2.draw(seg1);
		
		// Instantiate the 3 points
		Point2D.Double p1 = new Point2D.Double(100, 200);
		Point2D.Double p2 = new Point2D.Double(150, 150);
		Point2D.Double p3 = new Point2D.Double(250, 50);
		
		// Make ellipse objects to draw small dots
		Ellipse2D.Double point1 = new Ellipse2D.Double(p1.getX(), p1.getY(), 5, 5);
		Ellipse2D.Double point2 = new Ellipse2D.Double(p2.getX(), p2.getY(), 5, 5);
		Ellipse2D.Double point3 = new Ellipse2D.Double(p3.getX(), p3.getY(), 5, 5);
		
		// Instantiate but don't set value for distance from point to line
		int distance;
		
		// Set the color for the dots
		g2.setColor(Color.BLUE);
		
		// Fill in the 3 points, find the distance from the point to the line, and write the distance next to it
		g2.fill(point1);
		distance = (int) seg1.ptLineDist(p1);
		g2.drawString("Distance: " + distance, (int) p1.getX() - 30, (int) p1.getY() + 20);
		
		g2.fill(point2);
		distance = (int) seg1.ptLineDist(p2);
		g2.drawString("Distance: " + distance, (int) p2.getX() - 30, (int) p2.getY() + 20);

		g2.fill(point3);
		distance = (int) seg1.ptLineDist(p3);
		g2.drawString("Distance: " + distance, (int) p3.getX() - 30, (int) p3.getY() + 20);
	}
}
