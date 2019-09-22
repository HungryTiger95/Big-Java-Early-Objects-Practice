import java.awt.Graphics2D;
import java.awt.Rectangle;

public class LetterH
{
	// Instance Variables
	int xTop, yTop;
	
	// Constructors
	/**
	 * Constructs a LetterH object
	 * @param xPosition x position
	 * @param yPosition y position
	 */
	LetterH(int xPosition, int yPosition)
	{
		this.xTop = xPosition;
		this.yTop = yPosition;
	}
	
	// Methods
	/**
	 * Draws the LetterH object
	 * @param g2 graphics
	 */
	public void draw(Graphics2D g2)
	{
		Rectangle box1 = new Rectangle(xTop, yTop, 15, 100);
		Rectangle box2 = new Rectangle(xTop + 15, yTop + 40, 45, 15);
		Rectangle box3 = new Rectangle(xTop + 60, yTop, 15, 100);
		
		g2.draw(box1);
		g2.draw(box2);
		g2.draw(box3);
	}
}
