package project15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * Models the movement of a car across a frame. After the car gets to the end of the frame, it will turn around and keep
 * driving in the opposite direction.
 * 
 * @author Mayuresh
 *
 */
public class MovingCarFrame extends JFrame
{
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 400;
	
	private MovingCarComponent scene;
	
	class TimerListener implements ActionListener
	{
		private int dx = 2;
		private int dy = 4;
		
		public void actionPerformed(ActionEvent event)
		{
			if(scene.getCarX() <= 0)
			{
				dx = -dx;
				scene.moveCarBy(dx, dy);
			}
			else if(scene.getCarX() >= FRAME_WIDTH - scene.getCarWidth())
			{
				dx = -dx;
				scene.moveCarBy(dx, dy);
			}
			else if(scene.getCarY() >= FRAME_HEIGHT - scene.getCarHeight())
			{
				scene.moveCarTo(0, 0);
			}
			
			scene.moveCarBy(dx, 0);
		}
	}
	
	/**
	 * Constructs a Moving Car Frame that sets up the JFrame and add the listeners
	 */
	public MovingCarFrame()
	{
		scene = new MovingCarComponent();
		add(scene);
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		ActionListener listener = new TimerListener();
		
		final int DELAY = 10;
		Timer t = new Timer(DELAY, listener);
		t.start();
	}
	
	
}
