package project8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class ScrollingMessageFrame extends JFrame
{
	private static final long serialVersionUID = 1L;

	// Instance Variables
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 400;
	
	private ScrollingMessageComponent panel;
	
	// Constructors
	/**
	 * Constructs a scrolling message frame that holds the instructions to create
	 * the JFrame and set its paramters. It also adds a timer listener that is triggered
	 * every x amount of ms to do something.
	 * 
	 * @param message the message to print
	 */
	public ScrollingMessageFrame(String message)
	{
		panel = new ScrollingMessageComponent(message);
		this.add(panel);
		
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocation(500, 300);
		
		ActionListener listener = new TimerListener();
		
		final int DELAY = 10;
		
		Timer t = new Timer(DELAY, listener);
		t.start();
	}
	// Methods
	
	// Inner Classes
	class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			int xPos = panel.getX();
			int yPos = panel.getY();
			
			if(xPos <= FRAME_WIDTH)
			{
				panel.moveTo(xPos + 1, yPos);
			}
			else
			{
				panel.moveTo(0 - panel.getMessage().length(), 0);
			}
		}
	}
}
