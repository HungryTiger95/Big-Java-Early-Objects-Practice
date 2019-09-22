import java.awt.Color;
import javax.swing.JFrame;

/**
 * E2.8/ Graphics E2.9
 * 
 * In the Java library, a color is specified by its red, green, and blue components between 0 and 225.
 * Write a program BrighterDemo that constructs a Color object with red, green, and blue values of
 * 50, 100, 150. Then apply the brighter method of the color class and print the red, green, and blue
 * values of the resulting color.
 * 
 * Then show the brighter demo as a visual
 * 
 * @author Mayuresh
 *
 */

public class BrighterDemo
{
	public static void main (String[] args)
	{
		Color c = new Color (50, 100, 150);
		System.out.println("Original Color: " + c.toString());
		
		// Make Brighter
		Color brighter = c.brighter();
		System.out.println("Brigther Color: " + brighter.toString());
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Brighter Color");
		frame.setLocation(800, 300);
		frame.getContentPane().setBackground(brighter);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JFrame frame2 = new JFrame();
		frame2.setSize(500, 500);
		frame2.setTitle("Original Color");
		frame2.setLocation(300, 300);
		frame2.getContentPane().setBackground(c);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);
	}
}
