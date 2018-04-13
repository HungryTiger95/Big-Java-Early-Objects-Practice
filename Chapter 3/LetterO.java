import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class LetterO
{
	// Instance Variables
	int xTop, yTop;
	
	// Constructors
	/**
	 * Constructs a LetterO object
	 * @param xPosition x position
	 * @param yPosition x position
	 */
	LetterO(int xPosition, int yPosition)
	{
		this.xTop = xPosition;
		this.yTop = yPosition;
	}
	
	// Methods
	/**
	 * Draws the LetterO object
	 * @param g2 graphics
	 */
	public void draw(Graphics2D g2)
	{
		Ellipse2D.Double bigO = new Ellipse2D.Double(xTop, yTop, 75, 100);
		Ellipse2D.Double smallO = new Ellipse2D.Double(xTop + 20, yTop + 25, 35, 50);
		
		g2.draw(bigO);
		g2.draw(smallO);
	}
}
