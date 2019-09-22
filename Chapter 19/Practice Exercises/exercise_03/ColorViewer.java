package exercise_03;

import javax.swing.JFrame;

/**
 * Write an application with three radio buttons labeled "Red", "Green", and "Blue" that changes the background
 * color of a panel in the center of the frame to red, green, or blue.
 * 
 * @author Mayuresh
 *
 */
public class ColorViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new ColorButtonsFrame();
		frame.setTitle("Color Buttons");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
