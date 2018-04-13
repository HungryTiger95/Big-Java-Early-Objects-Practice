import java.awt.Graphics2D;
import java.awt.Rectangle;

public class LetterL
{
	// Instance Variables
	int xTop, yTop;
	
	// Constructors
	/**
	 * Constructs a LetterL object
	 * @param xPosition x position
	 * @param yPosition y position
	 */
	LetterL(int xPosition, int yPosition)
	{
		this.xTop = xPosition;
		this.yTop = yPosition;
	}
	
	// Methods
	/**
	 * Draws the LetterL object
	 * @param g2 graphics
	 */
	public void draw(Graphics2D g2)
	{
		Rectangle box1 = new Rectangle(xTop, yTop, 15, 100);
		Rectangle box2 = new Rectangle(xTop + 15, yTop + 85, 60, 15);
		
		g2.draw(box1);
		g2.draw(box2);
	}
	
	/**
	 * Moves the LetterL object
	 * @param x x position
	 * @param y y position
	 */
	public void moveTo(int x, int y)
	{
		xTop = x;
		yTop = y;
	}
}
