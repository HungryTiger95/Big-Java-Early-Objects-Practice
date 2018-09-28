package project8;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Write a program that displays a scrolling message in a panel. Use a timer for the scrolling effect.
 * In the timer's action listener, move the starting position of the message and repaint. When the message
 * has left the window, reset the starting position to the other corner. Provide a user interface to customize
 * the message text, font, foreground and background colors, and the scrolling speed and direction.
 * 
 * 
 * I DONT KNOW WHATS GOING ON
 * @author Mayuresh
 *
 */
public class ScrollingMessageComponent extends JPanel
{
	// Instance Variables
	private JLabel label;
	private String message;
	
	// Constructors
	/**
	 * Constructs a JPanel that contains a JLabel with a given message
	 * 
	 * @param message the message
	 */
	public ScrollingMessageComponent(String message)
	{
		setSize(500, 300);
		
		this.setLayout(new BorderLayout());
		this.message = message;
		this.label = new JLabel(this.message);
		
		add(this.label, BorderLayout.NORTH);
		
		
	}
	
	// Methods
	/**
	 * Gets the message on the JLabel
	 * @return the message
	 */
	public String getMessage()
	{
		return this.message;
	}
	
	/**
	 * Moves the JLabel to another position
	 * @param x the x position
	 * @param y the y position
	 */
	public void moveTo(int x, int y)
	{
		this.setLocation(x, y);
	}
}
