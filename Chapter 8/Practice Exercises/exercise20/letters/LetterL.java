package exercise20.letters;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class LetterL
{
	// Instance Variables
	private Point2D.Double p = new Point2D.Double();
	private Graphics2D g2;
	
	// Constructors
	/**
	 * Constructs a LetterH object with a point and graphics2D
	 * @param p point where the letter starts (top left)
	 * @param g2 graphics content
	 */
	public LetterL(Point2D.Double p, Graphics2D g2)
	{
		this.p = p;
		this.g2 = g2;
	}
	
	/**
	 * Constructs a LetterH object with given coordinates and graphics content
	 * @param x x
	 * @param y y
	 * @param g2 graphics content
	 */
	public LetterL(int x, int y, Graphics2D g2)
	{
		this.p.setLocation(x, y);
		this.g2 = g2;
	}
	
	// Methods
	public void draw()
	{
		Line2D.Double line1 = new Line2D.Double(p.getX(), p.getY(), p.getX(), p.getY() + 20);
		Line2D.Double line2 = new Line2D.Double(p.getX(), p.getY() + 20, p.getX() + 10, p.getY() + 20);
		
		g2.draw(line1);
		g2.draw(line2);
	}
	
	/**
	 * Moves the LetterL object
	 * @param x x
	 * @param y y
	 */
	public void setLocation(int x, int y)
	{
		this.p.setLocation(x, y);
	}
}
