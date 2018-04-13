import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;

public class Square
{
	// Instance Variables
	private int xPosition, yPosition, length;
	Rectangle rect = new Rectangle();
	
	// Constructors
	/**
	 * Constructs a square
	 * @param x xPosition
	 * @param y yPosition
	 * @param length side length
	 */
	public Square(int x, int y, int length)
	{
		this.xPosition = x;
		this.yPosition = y;
		this.length = length;
	}
	
	// Methods
	/**
	 * Sets the x position
	 * @param x xPosition
	 */
	public void setX(int x)
	{
		this.xPosition = x;
	}
	
	/**
	 * Sets the y position
	 * @param y yPosition
	 */
	public void setY(int y)
	{
		this.yPosition = y;
	}
	
	/**
	 * Sets the length
	 * @param length length
	 */
	public void setLength(int length)
	{
		this.length = length;
	}
	
	/**
	 * Gets the x position
	 * @return xPosition
	 */
	public int getX()
	{
		return xPosition;
	}
	
	/**
	 * Gets the y position
	 * @return yPosition
	 */
	public int getY()
	{
		return yPosition;
	}
	
	/**
	 * Gets the length
	 * @return length
	 */
	public int getLength()
	{
		return length;
	}
	
	/**
	 * Moves the square to the given coordinates
	 * @param x xPosition
	 * @param y yPosition
	 */
	public void move(int x, int y)
	{
		this.xPosition = x;
		this.yPosition = y;
	}
	
	public void draw(Graphics2D g2)
	{	
		rect.setBounds(getX(), getY(), getLength(), getLength());
		g2.draw(rect);
	}
	
	public void fill(Graphics2D g2)
	{
		rect.setBounds(getX(), getY(), getLength(), getLength());
		g2.fill(rect);
	}
}
