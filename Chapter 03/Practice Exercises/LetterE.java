import java.awt.Graphics2D;
import java.awt.Rectangle;

public class LetterE
{
	// Instance Variables
	int xTop, yTop;
	
	// Constructors
	/**
	 * Constructs an object LetterE
	 * @param xPosition x position
	 * @param yPosition y position
	 */
	LetterE(int xPosition, int yPosition)
	{
		this.xTop = xPosition;
		this.yTop = yPosition;
	}
	
	// Methods
	/**
	 * Draw the LetterE object
	 * @param g2 graphics
	 */
	public void draw(Graphics2D g2)
	{
		Rectangle box1 = new Rectangle(xTop, yTop, 15, 100);
		Rectangle box2 = new Rectangle(xTop + 15, yTop, 60, 15);
		Rectangle box3 = new Rectangle(xTop + 15, yTop + 40, 60, 15);
		Rectangle box4 = new Rectangle(xTop + 15, yTop + 85, 60, 15);
		
		g2.draw(box1);
		g2.draw(box2);
		g2.draw(box3);
		g2.draw(box4);
	}
}
