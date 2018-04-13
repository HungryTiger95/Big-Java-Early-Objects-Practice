import java.awt.Color;

import javax.swing.JFrame;

/**
 * E2.10
 * 
 * Repeat the BrighterDemo, but apply the darker method of the Color class twice to the
 * object Color.RED.
 * 
 * @author Mayuresh
 *
 */

public class DarkerDemo
{
	public static void main (String[] args)
	{
		Color myColor = Color.red;
		
		System.out.println("Original Clolor: " + myColor.toString());
		
		Color darker = myColor;
		darker = myColor.darker();
		darker = myColor.darker();
		
		System.out.println("After Darker: " + darker.toString());
		
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("Original Color");
		frame.setLocation(300, 300);
		frame.getContentPane().setBackground(myColor);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JFrame frame2 = new JFrame();
		frame2.setSize(500, 500);
		frame2.setTitle("Darker Color");
		frame2.setLocation(800, 300);
		frame2.getContentPane().setBackground(darker);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);
		
	}
}
