package project16;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Models a car
 * 
 * @author Mayuresh
 *
 */
public class MovingCar
{
	// Instance Variables
	private int xTop, yTop;
	private Color color;
	
	// Constructors
	/**
	 * Constructs a car
	 * @param xPosition x position.
	 * @param yPosition y position.
	 * @param size size multiplier. Cannot be 0. Default size is 1.
	 * @param color color of the car.
	 */
	public MovingCar(int xPosition, int yPosition, Color color)
	{
		this.xTop = xPosition;
		this.yTop = yPosition;
		this.color = color;	
	}
	
	// Methods
	/**
	 * Draws the car.
	 * @param g2 the graphics content
	 */
	public void draw(Graphics2D g2)
	{
		Rectangle body = new Rectangle(xTop, yTop + 10, 60, 10);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(xTop + 10, yTop + 20, 10, 10);
		Ellipse2D.Double backTire = new Ellipse2D.Double(xTop + 40, yTop + 20, 10, 10);
		
		// The bottom of the front windsheild
		Point2D.Double r1 = new Point2D.Double((xTop + 10), (yTop + 10));
		
		// The front of the roof
		Point2D.Double r2 = new Point2D.Double((xTop + 20), yTop);
		
		// The rear of the roof
		Point2D.Double r3 = new Point2D.Double((xTop + 40), yTop);
		
		// The bottom of the rear windshield
		Point2D.Double r4 = new Point2D.Double((xTop + 50), (yTop + 10));
		
		// Make lines from the above points
		Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
		Line2D.Double roofTop = new Line2D.Double(r2, r3);
		Line2D.Double rearWindshield = new Line2D.Double(r3, r4);
		
		Polygon RoofWindshield = new Polygon();
		RoofWindshield.addPoint((int) r1.getX(), (int) r1.getY());
		RoofWindshield.addPoint((int) r2.getX(), (int) r2.getY());
		RoofWindshield.addPoint((int) r3.getX(), (int) r3.getY());
		RoofWindshield.addPoint((int) r4.getX(), (int) r4.getY());
		
		g2.setColor(color);
		
		g2.fill(body);
		g2.fill(frontTire);
		g2.fill(backTire);
		g2.fillPolygon(RoofWindshield);
		//g2.draw(frontWindshield);
		//g2.draw(roofTop);
		//g2.draw(rearWindshield);
	}
	
	/**
	 * Sets the top left corner x value
	 * @param x x value
	 */
	public void setX(int x)
	{
		this.xTop = x;
	}
	
	/**
	 * Gets the top left corner x value
	 * @return the top left corner x value
	 */
	public int getX()
	{
		return this.xTop;
	}
	
	/**
	 * Sets the top left corner y value
	 * @param y y value
	 */
	public void setY(int y)
	{
		this.yTop = y;
	}
	
	/**
	 * Gets the top left corner y value
	 * @return the top left corner y value
	 */
	public int getY()
	{
		return this.yTop;
	}
	
	/**
	 * Sets the color
	 * @param color the color
	 */
	public void setColor(Color color)
	{
		this.color = color;
	}
	
	/**
	 * Gets the color for this car
	 * @return the color
	 */
	public Color getColor()
	{
		return this.color;
	}
	
	/**
	 * Gets the car width
	 * @return the width of the car
	 */
	public int getCarWidth()
	{
		return this.xTop + 60;
	}
	
	/**
	 * Moves the car by a given x value and y value
	 * @param x how far to move the car with regards to the x value
	 * @param y how far to move the car with regards to the y value
	 */
	public void translate(int x, int y)
	{
		this.xTop += x;
		this.yTop += y;
	}
	
	/**
	 * Moves the car to a given x value and y value
	 * @param x the x position to move to
	 * @param y the y position to move to
	 */
	public void move(int x, int y)
	{
		this.xTop = x;
		this.yTop = y;
	}
}
