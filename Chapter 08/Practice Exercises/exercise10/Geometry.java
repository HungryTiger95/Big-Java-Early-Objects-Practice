package exercise10;

import java.awt.geom.Point2D;

/**
 * Write methods
 * 
 * 		public static double angle(Point2D.Double p, Point2D.Double q)
 * 		public static double slope(Point2D.Double p, Point2D.Double q)
 * 
 * that compute the angle between the x-axis and the line joining two points,
 * measured in degrees, and the slop of that line. Add the methods to the
 * class Geometry. Supply suitable preconditions. Why does it make sense
 * to use a static method in this case?
 * 
 * @author Mayuresh
 *
 */
public class Geometry
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	
	/**
	 * Computes the angle of a line formed by two points in relation to the x-axis
	 * @param p point 1
	 * @param q point 2
	 * @return the angle of the line and the x-axis
	 */
	public static double angle(Point2D.Double p, Point2D.Double q)
	{
		double angle;
		double xLength;
		double yLength;
		
		// Adjust for point p to be on the x-axis (quadrant)
		if(q.getX() > p.getX() && q.getY() > p.getY())
		{
			// Get the side lengths
			xLength = q.getX() - p.getX();
			yLength = q.getY() - p.getY();
			
			// Find the angle
			angle = Math.atan2(yLength, xLength);
			angle = Math.toDegrees(angle);
			
			// Adjust for the quadrant
			angle = angle + 0;
		}
		else if(q.getX() < p.getX() && q.getY() > p.getY())
		{
			// Get the side lengths
			xLength = p.getX() - q.getX();
			yLength = q.getY() - p.getY();
			
			// Find the angle
			angle = Math.atan2(yLength, xLength);
			angle = Math.toDegrees(angle);
			
			// Adjust for the quadrant
			angle = angle + 90;
		}
		else if(q.getX() < p.getX() && q.getY() < p.getY())
		{
			// Get the side lengths
			xLength = p.getX() - q.getX();
			yLength = p.getY() - q.getY();
			
			// Find the angle
			angle = Math.atan2(yLength, xLength);
			angle = Math.toDegrees(angle);
			
			// Adjust for the quadrant
			angle = angle + 180;
		}
		else if(q.getX() > p.getX() && q.getY() < p.getY())
		{
			// Get the side lengths
			xLength = q.getX() - p.getX();
			yLength = p.getY() - q.getY();
			
			// Find the angle
			angle = Math.atan2(yLength, xLength);
			angle = Math.toDegrees(angle);
			
			// Adjust for the quadrant
			angle = 360 - angle;
		}
		else
		{
			angle = 0;
		}
		
		return angle;
	}
	
	/**
	 * Gets the slope of the line formed by two points
	 * @param p point 1
	 * @param q point 2
	 * @return the slope of the line
	 */
	public static double slope(Point2D.Double p, Point2D.Double q)
	{
		double slope;
		
		double deltaY = q.getY() - p.getY();
		double deltaX = q.getX() - p.getX();
		
		slope = deltaY / deltaX;
		
		return slope;
	}
}
