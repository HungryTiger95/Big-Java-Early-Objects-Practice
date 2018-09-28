package exercise_10_22;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JComponent;

/**
 * This component displays a rectangle that can be moved.
 * 
 * Note: Make changes so that each rectangle is set with one color
 * 
 * @author Mayuresh
 *
 */
public class RectangleComponent extends JComponent
{
	// Instance Variables
	private static final int BOX_WIDTH = 20;
	private static final int BOX_HEIGHT = 30;
	
	private Rectangle box;
	private ArrayList<Rectangle> rectList;
	
	// Constructors
	public RectangleComponent()
	{
		rectList = new ArrayList<Rectangle>();
	}
	
	// Methods
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		for(int i = 0; i < rectList.size(); i++)
		{
			// Make the box a random color
			Random col = new Random();
			int colVal = col.nextInt(4) + 1;
			
			if(colVal == 1)
			{
				g2.setColor(Color.BLACK);
			}
			else if (colVal == 2)
			{
				g2.setColor(Color.BLUE);
			}
			else if(colVal == 3)
			{
				g2.setColor(Color.ORANGE);
			}
			else
			{
				g2.setColor(Color.RED);
			}
			
			// Draw the rectangles
			g2.fill(rectList.get(i));
		}
	}
	
	/**
	 * Moves the rectangle to the given location
	 * @param x the x-position of the new location
	 * @param y the y-position of the new location
	 */
	public void addRectangleTo(int x, int y)
	{
		box = new Rectangle(x, y, BOX_WIDTH, BOX_HEIGHT);
		rectList.add(box);
		
		repaint();
	}
}
