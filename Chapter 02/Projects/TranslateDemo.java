import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Graphics 2.4
 * 
 * In this exercise, you will explore a simple way of visualizing a Rectangle object. The
 * setBounds method of the JFrame class moves a frame window to a given rectangle.
 * 
 * @author Mayuresh
 *
 */

public class TranslateDemo
{
	public static void main (String[] args)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		// Construct a rectangle and set the frame bounds
		Rectangle box = new Rectangle(10, 10, 300, 400);
		frame.setBounds(box);
		
		JOptionPane.showMessageDialog(frame, "Click OK to continue");
		
		// Move the rectangle and set the frame bounds again
		box.setLocation(500, 100);
		frame.setBounds(box);
		
		JOptionPane.showMessageDialog(frame, "Click OK to continue");
		
		// Move the rectangle and set the frame bounds again
		box.setLocation(700, 200);
		frame.setBounds(box);
	}
}
