package project15;

import javax.swing.JFrame;

/**
 * Write a program that animates a car so taht it moves across a frame
 * 
 * @author Mayuresh
 *
 */
public class MovingCarViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new MovingCarFrame();
		
		frame.setTitle("Moving Car");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
