import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Graphics 2.13
 * 
 * Copy the code from the book and modify the program
 *
 * 		* Double the frame size
 * 		* Change the greeting to "Hello, your name!"
 * 		* Change the background color to pale green (See E2.9)
 * 		* Add and image of yourself (Construct an ImageIcon)
 * 
 * @author Mayuresh
 *
 */
public class FrameViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(400, 400);
		
		ImageIcon pic = new ImageIcon("deepika2.png");
		JLabel label = new JLabel("Hello, Deepika!", pic, 0);
		
		label.setOpaque(true);
		Color myColor = new Color(151, 252, 151);
		label.setBackground(myColor);
		

		
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
