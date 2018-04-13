import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * Graphics E3.16/ Graphics E3.17
 * 
 * Write a program that draws a picture of a house. Implement a class house
 * and supply a method draw(Graphics2D) g2.
 * 
 * @author Mayuresh
 *
 */

public class House
{
	private int xLeft;
	private int yTop;
	private int width;
	private int height;
	
	/**
	 * Constructs a house object with given position and size
	 * @param xPosition	X-coordinate
	 * @param yPosition Y-coordinate
	 * @param width Width of house
	 * @param height Height of House
	 */
	public House(int xPosition, int yPosition, int width, int height)
	{
		this.xLeft = xPosition;
		this.yTop = yPosition;
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Draws the house
	 * @param g2 the Graphics content
	 */
	public void draw(Graphics2D g2)
	{
		// Create the Shapes
		Rectangle box = new Rectangle(xLeft, yTop, width, height);
		Rectangle door = new Rectangle (xLeft + (width / 8), yTop + (height / 2), width / 3, height / 2);
		Ellipse2D.Double doorknob = new Ellipse2D.Double(xLeft + (width / 3), yTop + 2 * (height / 3), width / 12, height / 12);
		Line2D.Double leftRoof = new Line2D.Double(xLeft, yTop, xLeft + (width / 2), yTop - (height / 2));
		Line2D.Double rightRoof = new Line2D.Double(xLeft + width, yTop, xLeft + (width / 2), yTop - (height / 2));
		
		// Draw the shapes
		g2.draw(doorknob);
		g2.draw(door);
		g2.draw(box);
		g2.draw(leftRoof);
		g2.draw(rightRoof);
	}
}
