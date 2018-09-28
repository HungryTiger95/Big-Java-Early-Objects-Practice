package exercise_10_12;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.JFrame;

public class RandomShape extends JFrame
{
	// Instance Variables
	private int xTop, yTop, xTop2, yTop2, width, height;
	
	// Constructors
	public RandomShape()
	{
		
	}
	
	// Methods
	/**
	 * Gets a random shape between a rectangle, line, and ellipse
	 * @return a shape
	 */
	public Shape getRandomShape()
	{
		// Set up a random number generator that generates numbers between 1 and 3
		Random gen = new Random();
		int num = gen.nextInt(3) + 1;
		
		// Descision tree to decide which Shape to return
		if(num == 1)
		{
			return getRectangle();
		}
		else if(num == 2)
		{
			return getLine();
		}
		else
		{
			return getEllipse();
		}
	}
	
	/**
	 * Sets up a rectangle
	 * @return a rectangle
	 */
	public Shape getRectangle()
	{
		setParameters();
		Rectangle r = new Rectangle(this.xTop, this.yTop, this.width, this.height);
		
		return r;
	}
	
	/**
	 * Sets up a line
	 * @return a line
	 */
	public Shape getLine()
	{
		setParameters();
		Line2D.Double l = new Line2D.Double(this.xTop, this.yTop, this.xTop2, this.yTop2);
		
		return l;
	}
	
	/**
	 * Sets up an ellipse
	 * @return a ellipse
	 */
	public Shape getEllipse()
	{
		setParameters();
		Ellipse2D.Double e = new Ellipse2D.Double(this.xTop, this.yTop, this.width, this.height);
		
		return e;
	}
	
	/**
	 * Sets up the parameters to create a shape
	 */
	public void setParameters()
	{
		// Generate random values for each parameter
		Random p = new Random();
		
		this.xTop = p.nextInt(800) + 1;
		this.yTop = p.nextInt(500) + 1;
		this.xTop2 = p.nextInt(xTop) + 1;
		this.yTop2 = p.nextInt(yTop) + 1;
		this.width = p.nextInt(100) + 1;
		this.height = p.nextInt(100) + 1;
	}
}
