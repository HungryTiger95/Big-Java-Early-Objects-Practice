package exercise_04;

import javax.swing.JFrame;

/**
 * Write an application with three check boxes labeled "Red", "Green", "Blue" that adds a red, green, or blue
 * component to the background color of a panel in the center of the frame. This application can display a
 * total of eight color combinations.
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
