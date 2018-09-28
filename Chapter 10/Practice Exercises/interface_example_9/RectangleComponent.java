package interface_example_9;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

/**
 * The Timer class in the javax.swing package generates a sequence of action events, spaced at even time intervals.
 * (You can think of a timer as an invisible button that is automatically clicked.) This is useful whenever you want
 * to have an object updated at regular intervals.
 * 
 * 		class MyListener implements ActionListener
 * 		{
 * 			public void actionPerformed(ActionEvent event)
 * 			{
 * 				Action that is executed at each timer event
 * 			}
 * 		}
 * 
 * 		MyListener listener = new MyListener();
 * 		Timer t = new Timer(interval, listener);
 * 		t.start();
 * 
 * This program will display a moving rectangle. The moveRectangleBy method moves the rectangle by a given amount.
 * 
 * Note the call to repaint in the moveRectangleBy method. This call is necessary to ensure that the component is
 * repainted after the state of the rectangle object has been changed. The call to repaint forces a call to the
 * paintComponent method. The paintComponent method redraws the component, causing the rectangle to appear at the updated
 * location.
 * 
 * @author Mayuresh
 *
 */
public class RectangleComponent extends JComponent
{
	private static final int BOX_Y = 10;
	private static final int BOX_X = 10;
	private static final int BOX_WIDTH = 45;
	private static final int BOX_HEIGHT = 35;
	
	private Rectangle box;
	
	public RectangleComponent()
	{
		// The Rectangle that the paintComponent method draws
		box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.MAGENTA);
		g2.draw(box);
	}
	
	public void moveRectangleBy(int dx, int dy)
	{
		box.translate(dx, dy);
		repaint();
	}
}
