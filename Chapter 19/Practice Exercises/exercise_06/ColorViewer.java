package exercise_06;

import javax.swing.JFrame;

/**
 * Write an application with a Color menu and menu items labeled "Read", "Green", and "Blue" that change
 * the background color of a panel in the center of the frame to red, green, or blue.
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
