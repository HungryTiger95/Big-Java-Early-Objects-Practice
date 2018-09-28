package exercise_10_21;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * This frame contains a moving rectangle:
 * 
 * Change the RectangleComponent class for the animation program in section 10.9 so that the rectangle bounces off the edges of
 * the component rather than simply moving outside of it.
 * 
 * @author Mayuresh
 *
 */
public class RectangleFrame extends JFrame
{
	// Instance Variables
	private static final int FRAME_WIDTH = 600;
	private static final int FRAME_HEIGHT = 600;
	
	private RectangleComponent scene;
	private Timer t;
	
	// Inner Classes
	class TimerListener implements ActionListener
	{
		private int dx = 1;
		private int dy = 1;
		
		/**
		 * The actions to be performed when the source is triggered.
		 * 
		 * 
		 */
		public void actionPerformed(ActionEvent event)
		{	
			double x = scene.getRectangleX();
			double y = scene.getRectangleY();
			double width = scene.getRectangleWidth();
			double height = scene.getRectangleHeight();
			
			if(x <= 0)
			{
				dx = -dx;
			}
			else if(y <= 0)
			{
				dy = -dy;
			}
			else if(x + width >= FRAME_WIDTH - 6)
			{
				dx = -dx;
			}
			else if(y + height >= FRAME_HEIGHT - 40)
			{
				dy = -dy;
			}
			
			scene.moveRectangleBy(dx, dy);
		}
	}
	
	// Constructors
	/**
	 * Constructs a rectangle frame object to set up a frame where the rectangle
	 * will be moved.
	 */
	public RectangleFrame()
	{
		scene = new RectangleComponent();
		add(scene);
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		
		ActionListener listener = new TimerListener();
		
		final int DELAY = 1;
		t = new Timer(DELAY, listener);
		t.start();
	}
	
	
}
