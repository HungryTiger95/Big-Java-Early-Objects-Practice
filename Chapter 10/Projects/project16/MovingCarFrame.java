package project16;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * Models the movement of a car across a frame. After the car gets to the end of the frame, it will turn around and keep
 * driving in the opposite direction.
 * 
 * DOES NOT WORK AS INTENDED
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
		
		public void actionPerformed(ActionEvent event)
		{
			if(scene.getCar1X() <= 0 || scene.getCar2X() <= 0)
			{
				dx = -dx;
			}
			else if(scene.getCar1X() >= FRAME_WIDTH - scene.getCarWidth() || scene.getCar2X() >= FRAME_WIDTH - scene.getCarWidth())
			{
				dx = -dx;
			}
			
			scene.moveCarBy(dx, 0);
		}
	}
	
	/**
	 * Constructs a moving car frame that has instructions to set up the JFrame
	 */
	public MovingCarFrame()
	{
		scene = new MovingCarComponent();
		add(scene);
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
		ActionListener timerList = new TimerListener();
		
		
		final int DELAY = 10;
		Timer t = new Timer(DELAY, timerList);
		t.start();
	}
	
	
}
