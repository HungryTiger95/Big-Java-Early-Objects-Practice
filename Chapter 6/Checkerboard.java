import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JFrame;

/**
 * Write a graphical application that displays a checkerboard with 64 squares, alternating
 * white and black.
 * 
 * @author Mayuresh
 *
 */
public class Checkerboard
{	
	// Instance Variables
	private int rows;
	private int columns;
	
	private int xPos = 10, yPos = 10, length = 30;
	private Square square = new Square(xPos, yPos, length);
	
	// Constructors
	public Checkerboard(int rows, int columns)
	{
		this.rows = rows;
		this.columns = columns;
	}
	
	public void draw(Graphics2D g2)
	{
		for(int i = 0; i < this.rows; i++)
		{
			for(int j = 0; j < this.columns; j++)
			{
				// Set Color
				if((i % 2 ) == (j % 2))
				{
					g2.setColor(Color.red);
				}
				else
				{
					g2.setColor(Color.black);
				}
				
				// Draw Square
				square.fill(g2);
				
				// Move Rectangle
				if(j >= 0 && j <= (this.rows - 2))
				{
					square.move((square.getX() + square.getLength()), square.getY());
				}
				else if(j == this.rows - 1)
				{
					square.move(xPos, square.getY() + square.getLength());
				}
			}
		}
	}
}
