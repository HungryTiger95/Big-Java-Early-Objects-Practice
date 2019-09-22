import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 * Graphics P3.6
 * 
 * Write a program that draws three stars. Use classes Star, StarComponent, and StarViewer.
 * 
 * @author Mayuresh
 *
 */

public class Star
{
	// Instance Variables
	private int xPosition;
	private int yPosition;
	private int length;
	
	// Constructors
	/**
	 * Constructs a star with a given x and y coordinate
	 * @param x x-coordinate of middle of the star
	 * @param y y-coordinate of middle of the star
	 * @param length length of the stars lines
	 */
	public Star(int x, int y, int length)
	{
		xPosition = x;
		yPosition = y;
		this.length = length;
	}
	
	/**
	 * Draws the star
	 * @param g2 the graphics content
	 */
	public void draw(Graphics2D g2)
	{
		// Creates the star
		Line2D.Double east = new Line2D.Double(xPosition, yPosition, xPosition + length, yPosition);
		Line2D.Double west = new Line2D.Double(xPosition - length, yPosition, xPosition, yPosition);
		Line2D.Double north = new Line2D.Double(xPosition, yPosition, xPosition, yPosition - length);
		Line2D.Double south = new Line2D.Double(xPosition, yPosition, xPosition, yPosition + length);
		
		Line2D.Double northEast = new Line2D.Double(xPosition, yPosition, xPosition + length, yPosition - length);
		Line2D.Double northWest = new Line2D.Double(xPosition, yPosition, xPosition - length, yPosition - length);
		Line2D.Double southEast = new Line2D.Double(xPosition, yPosition, xPosition + length, yPosition + length);
		Line2D.Double southWest = new Line2D.Double(xPosition, yPosition, xPosition - length, yPosition + length);
		
		// Draws the star
		g2.draw(north);
		g2.draw(south);
		g2.draw(east);
		g2.draw(west);
		g2.draw(northEast);
		g2.draw(northWest);
		g2.draw(southWest);
		g2.draw(southEast);
	}
}
