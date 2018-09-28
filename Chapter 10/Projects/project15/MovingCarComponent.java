package project15;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

/**
 * A component that holds the MovingCar object
 * 
 * @author Mayuresh
 *
 */
public class MovingCarComponent extends JComponent
{
	// Instance Variables
	private static final int CAR_X = 1;
	private static final int CAR_Y = 310;
	private static final Color CAR_COLOR = Color.red;
	
	private MovingCar car;
	
	// Constructors
	/**
	 * Constructs a moving car component
	 */
	public MovingCarComponent()
	{
		car = new MovingCar(CAR_X, CAR_Y, CAR_COLOR);
	}
	
	// Methods
	/**
	 * Draws the car.
	 * @param g2 the graphics content
	 */
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		car.draw(g2);
	}
	
	/**
	 * Gets the cars x position
	 * @return x value of top left corner of car
	 */
	public int getCarX()
	{
		return this.car.getX();
	}
	
	/**
	 * Sets the cars x position
	 * @param x the x value
	 */
	public void setCarX(int x)
	{
		this.car.setX(x);
	}
	
	/**
	 * Gets the cars y position
	 * @return y value of top left corner of car
	 */
	public int getCarY()
	{
		return this.car.getY();
	}
	
	/**
	 * Sets the cars y value
	 * @param y the y value
	 */
	public void setCarY(int y)
	{
		this.car.setY(y);
	}
	
	/**
	 * Gets the color of the car
	 * @return the color
	 */
	public Color getCarColor()
	{
		return this.car.getColor();
	}
	
	/**
	 * Sets the color of the car
	 * @param color the color to be set
	 */
	public void setCarColor(Color color)
	{
		this.car.setColor(color);
	}
	
	/**
	 * Gets the width of the car
	 * @return the width
	 */
	public int getCarWidth()
	{
		return 75;
	}
	
	/**
	 * Gets the height of the car
	 * @return the height
	 */
	public int getCarHeight()
	{
		return 85;
	}
	 /**
	  * Moves the car by a given number of x and y values
	  * @param x the amount to move the cars x position
	  * @param y the amount to move the cars y position
	  */
	public void moveCarBy(int x, int y)
	{
		car.translate(x, y);
		
		repaint();
	}
	
	/**
	 * Moves the car to a given location
	 * @param x the x position
	 * @param y the y position
	 */
	public void moveCarTo(int x, int y)
	{
		car.move(x, y);
		
		repaint();
	}
}
