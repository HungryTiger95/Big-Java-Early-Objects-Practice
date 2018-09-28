package project9;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class TriangleComponent extends JComponent
{
	// Instance Variables
	private Polygon triangle;
	private ArrayList<Point2D.Double> points;
	
	// Constructors
	/**
	 * Constructs a triangle component that holds points for the triangle and the triangle itself
	 */
	public TriangleComponent()
	{
		points = new ArrayList<Point2D.Double>();
		triangle = new Polygon();
	}
	
	// Methods
	/**
	 * The drawing instructions
	 */
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		// Draw the Points
		for(int i = 0; i < points.size(); i++)
		{
			Ellipse2D.Double e = new Ellipse2D.Double((int) points.get(i).getX(), (int) points.get(i).getY(), 5, 5);
			g2.draw(e);
		}
		
		// Draw the triangle
		g2.draw(getTriangle());
	}
	
	/**
	 * Adds a point to the list of points that make up a triangle
	 * @param x the x position
	 * @param y they y position
	 */
	public void addPoint(int x, int y)
	{
		Point2D.Double newPoint = new Point2D.Double((int) x, (int) y);
		points.add(newPoint);
		
		repaint();
	}
	
	/**
	 * Returns a triangle from three points
	 * @return a triangle
	 */
	public Polygon getTriangle()
	{
		for(int i = 0; i < points.size(); i++)
		{
			triangle.addPoint((int) points.get(i).getX(), (int) points.get(i).getY());
		}
		
		return triangle;
	}
	
	/**
	 * Resets the list of points
	 */
	public void resetPoints()
	{
		points.clear();
	}
	
	/**
	 * Resets the triangle by naming the old triangle as new
	 */
	public void resetTriangle()
	{
		triangle = new Polygon();
	}
}
