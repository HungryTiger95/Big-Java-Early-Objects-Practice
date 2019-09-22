package project18;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class CircleComponent extends JComponent
{
	// Instance Variables
	private Ellipse2D.Double circle;
	private ArrayList<Point2D.Double> points;
	
	// Constructors
	/**
	 * Constructs a circle component
	 */
	public CircleComponent()
	{
		points = new ArrayList<Point2D.Double>();
		circle = new Ellipse2D.Double();
	}
	
	// Methods
	/**
	 * The drawing instructions
	 * @param g the graphics content
	 */
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		// Draw the Points
		for(int i = 0; i < points.size(); i++)
		{
			Ellipse2D.Double e = new Ellipse2D.Double(points.get(i).getX(), points.get(i).getY(), 5, 5);
			g2.draw(e);
		}
		
		// Draw the Circle
		g2.draw(circle);
	}
	
	/**
	 * Adds the center point of the circle
	 * @param x the center x value
	 * @param y the center y value
	 */
	public void addCenter(int x, int y)
	{
		points.add(new Point2D.Double(x, y));
		repaint();
	}
	
	/**
	 * Adds a radius point of the circle
	 * @param x the radius x value
	 * @param y the radius y value
	 */
	public void addRadius(int x, int y)
	{
		points.add(new Point2D.Double(x, y));
		repaint();
	}
	
	/**
	 * Returns a circle created from the center point and radius point
	 * @return a circle
	 */
	public Ellipse2D.Double getCircle()
	{
		double x, y, w, h;
		
		// Get the width and height (both are same)
		w = (int) points.get(0).distance(points.get(1)) * 2;
		h = (int) w;
		
		// Get the top left corner of the bounding rectangle
		double centerPointX, centerPointY;
		centerPointX = points.get(0).getX();
		centerPointY = points.get(0).getY();
		
		x = centerPointX - (w / 2);
		y = centerPointY - (w / 2);
		
		circle = new Ellipse2D.Double(x, y, w, h);
		
		return circle;
	}
	
	/**
	 * Erases the data on the the points
	 */
	public void resetData()
	{
		points.clear();
	}
	
	/**
	 * Resets the circle to having 0 as all parameter values
	 */
	public void resetCircle()
	{
		circle = new Ellipse2D.Double(0, 0, 0, 0);
	}
	
	/**
	 * Gets a point from the list of points: For this example, there can only
	 * be two points in the array list. The center is stored as the first element
	 * and the radius is stored as the second.
	 * @param i index
	 * @return center point if i = 0, or the radius point if i = 1
	 */
	public Point2D.Double getPoint(int i)
	{
		return points.get(i);
	}
}
