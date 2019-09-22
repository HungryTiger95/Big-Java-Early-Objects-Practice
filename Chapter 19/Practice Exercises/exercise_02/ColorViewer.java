package exercise_02;

import javax.swing.JFrame;

/**
 * Add icons to the buttons of Exercise 19.1. Use a JButton constructor with an Icon
 * argument and supply an ImageIcon.
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
