package exercise_10_21;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

/**
 * This component displays a rectangle that can be moved
 * 
 * @author Mayuresh
 *
 */
public class RectangleComponent extends JComponent
{
	// Instance Variables
	private static final int BOX_X = 15;
	private static final int BOX_Y = 10;
	private static final int BOX_WIDTH = 50;
	private static final int BOX_HEIGHT = 50;
	
	private Rectangle box;
	
	// Constructors
	/**
	 * Constructs a rectangle component
	 */
	public RectangleComponent()
	{
		box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
	}
	
	// Methods
	/**
	 * Drawing instructions for the component
	 * @param g
	 */
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.BLUE);
		g2.fill(box);
	}
	
	/**
	 * Moves the rectangle by a given amount and then repaints it
	 * @param dx the amount to move the rectangle in the x-direction
	 * @param dy the amount to move the rectangle in the y-direction
	 */
	public void moveRectangleBy(int dx, int dy)
	{
		box.translate(dx, dy);

		repaint();
	}
	
	/**
	 * Gets the X-position of the rectangle.
	 * @return X
	 */
	public double getRectangleX()
	{
		return box.getX();
	}
	
	/**
	 * Gets the Y-position of the rectangle
	 * @return Y
	 */
	public double getRectangleY()
	{
		return box.getY();
	}
	
	/**
	 * Gets the width of the rectangle
	 * @return width
	 */
	public double getRectangleWidth()
	{
		return box.getWidth();
	}
	
	/**
	 * Gets the height of the rectangle
	 * @return height
	 */
	public double getRectangleHeight()
	{
		return box.getHeight();
	}
}
