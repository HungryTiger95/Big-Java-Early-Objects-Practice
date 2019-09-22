package exercise_09;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Bar
{
	// Instance Variables
	private String label;
	private int length;
	private Color color;
	
	private Rectangle bar;
	private int xTop, yTop;
	public static final int HEIGHT = 30;
	
	// Constructors
	/**
	 * Constructs a bar given the label, length, and color
	 * @param label the label
	 * @param length the length
	 * @param color the color
	 */
	public Bar(int xTop, int yTop, String label, int length, Color color)
	{
		this.label = label;
		this.length = length;
		this.color = color;
		this.xTop = xTop;
		this.yTop = yTop;
		
		bar = new Rectangle(this.xTop, this.yTop, this.length, HEIGHT);
	}
	
	// Methods
	public String getLabel()
	{
		return this.label;
	}
	
	public int getLength()
	{
		return this.length;
	}
	
	public Color getColor()
	{
		return this.color;
	}
	
	public Rectangle getBar()
	{
		return this.bar;
	}
	
	public int getYTop()
	{
		return this.yTop;
	}
	
	public int getXTop()
	{
		return this.xTop;
	}
	
	public void draw(Graphics2D g2)
	{
		g2.setColor(this.color);
		g2.setStroke(new BasicStroke(2));
		g2.draw(bar);
		
		g2.setColor(Color.black);
		g2.drawString(label, getXTop() + 4, getYTop() + 15);
	}
}
