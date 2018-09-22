package exercise20.letters;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class LetterO
{
	// Instance Variables
	private Point2D.Double p = new Point2D.Double();
	private Graphics2D g2;
	
	// Constructors
	/**
	 * Constructs a LetterO object with a point and graphics2D
	 * @param p point where the letter starts (top left)
	 * @param g2 graphics content
	 */
	public LetterO(Point2D.Double p, Graphics2D g2)
	{
		this.p = p;
		this.g2 = g2;
	}
	
	/**
	 * Constructs a LetterO object with given coordinates and graphics content
	 * @param x x
	 * @param y y
	 * @param g2 graphics content
	 */
	public LetterO(int x, int y, Graphics2D g2)
	{
		this.p.setLocation(x, y);
		this.g2 = g2;
	}
	
	// Methods
	/**
	 * Draws the LetterO object
	 */
	public void draw()
	{
		Ellipse2D.Double ellipse = new Ellipse2D.Double(p.getX(), p.getY(), 15, 20);
		
		g2.draw(ellipse);
	}
}
