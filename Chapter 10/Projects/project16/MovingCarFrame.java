package project16;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

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
	private static final int FRAME_WIDTH = 800;
	private static final int FRAME_HEIGHT = 600;
	
	private MovingCarComponent scene;
	
	class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			for(int i = 0; i < scene.getAmountOfCars(); i++)
			{
				if(scene.getCarAt(i).getX() < 0)
				{
					scene.getCarAt(i).setDX(scene.getCarAt(i).getDX() * -1);
					scene.moveCarBy(scene.getCarAt(i).getDX(), 0, i);
				}
				else if(scene.getCarAt(i).getX() > FRAME_WIDTH - scene.getCarWidth())
				{
					scene.getCarAt(i).setDX(scene.getCarAt(i).getDX() * -1);
					scene.moveCarBy(scene.getCarAt(i).getDX(), 0, i);
				}
				else
				{
					scene.moveCarBy(scene.getCarAt(i).getDX(), 0, i);
				}
			}
		}
	}
	
	class MousePressListener extends MouseAdapter
	{
		public void mousePressed(MouseEvent event)
		{
			if(scene.getAmountOfCars() < 100)
			{
				scene.addCar(event.getX(), event.getY(), 2, Color.red);
			}
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
		
		MouseListener mouseList = new MousePressListener();
		scene.addMouseListener(mouseList);
		
		ActionListener timerList = new TimerListener();
		final int DELAY = 10;
		Timer t = new Timer(DELAY, timerList);
		t.start();
	}
	
	
}
