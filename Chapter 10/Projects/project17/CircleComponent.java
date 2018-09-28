package project17;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class CircleComponent extends JComponent
{
	// Instance Variables
	private Shape circle;
	
	// Constructors
	/**
	 * Constructs a circle component with a given x position, y position, and radius
	 * @param x the x position
	 * @param y the y position
	 * @param radius the radius
	 */
	public CircleComponent(double x, double y, double radius)
	{
		circle = new Ellipse2D.Double(x ,y, radius * 2, radius * 2);
	}
	
	// Methods
	/**
	 * The drawing instructions
	 * @param g the graphics content
	 */
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		
		g2.draw(circle);
	}
}
