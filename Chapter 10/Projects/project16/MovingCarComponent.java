package project16;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;

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
	private static final int CAR_X = 10;
	private static final int CAR_Y = 10;
	private static final Color CAR_COLOR = Color.red;
	
	private MovingCar car1;
	private MovingCar car2;
	
	// Constructors
	/**
	 * Constructs a moving car component
	 */
	public MovingCarComponent()
	{
		car1 = new MovingCar(CAR_X, CAR_Y, CAR_COLOR);
		car2 = new MovingCar(CAR_X + 40, CAR_Y + 100, CAR_COLOR);
	}
	
	// Methods
	/**
	 * Draws the car.
	 * @param g2 the graphics content
	 */
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		car1.draw(g2);
		car2.draw(g2);
	}
	
	/**
	 * Gets the cars x position
	 * @return x value of top left corner of car
	 */
	public int getCar1X()
	{
		return this.car1.getX();
	}
	
	/**
	 * Gets the second cars x position
	 * @return x value of top left corner of car
	 */
	public int getCar2X()
	{
		return this.car2.getX();
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
	  * Moves the car by a given number of x and y values
	  * @param x the amount to move the cars x position
	  * @param y the amount to move the cars y position
	  */
	public void moveCarBy(int x, int y)
	{
		car1.translate(x, y);
		car2.translate(x, y);
		
		repaint();
	}
	
	/**
	 * Moves the car to a given location
	 * @param x the x position
	 * @param y the y position
	 */
	public void moveCarTo(int x, int y)
	{
		car1.move(x, y);
		car2.move(x, y);
		
		repaint();
	}
}
