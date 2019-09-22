package exercise_07;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JComponent;

public class RectangleComponent extends JComponent
{
	// Instance Variables
	private ArrayList<Rectangle> rects;
	
	// Constructors
	/**
	 * Constructs the rectangle component
	 */
	public RectangleComponent()
	{
		rects = new ArrayList<>();
	}
	
	// Methods
	/**
	 * The paint component
	 */
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		for(Rectangle r : rects)
		{
			g2.setColor(Color.red);
			g2.fill(r);
		}
	}
	
	/**
	 * Gets the array list containing the rectangles
	 * @return the array list
	 */
	public ArrayList<Rectangle> getRects()
	{
		return this.rects;
	}
	
	/**
	 * Removes half of all the rectangles in the list
	 */
	public void removeHalf()
	{
		int halfSize = rects.size() / 2;
		for(int i = rects.size() - 1; i >= halfSize; i--)
		{
			rects.remove(i);
			repaint();
		}
		
		System.out.println(rects.size());
		repaint();
	}
	
	/**
	 * Doubles the amount of rectangles in the list
	 */
	public void doubleRects()
	{
		int doubleSize = rects.size();
		for(int i = 0; i < doubleSize; i++)
		{
			Random gen = new Random();
			Rectangle r = new Rectangle(
					gen.nextInt(300) + 1,
					gen.nextInt(400) + 1,
					50,
					50);
			rects.add(r);
		}
		System.out.println(rects.size());
		repaint();
	}
	
	/**
	 * Adds the first rectangle into the list
	 */
	public void addFirst()
	{
		Rectangle r = new Rectangle(10, 10, 50, 50);
		rects.add(r);
		System.out.println(rects.size());
		repaint();
	}
}
