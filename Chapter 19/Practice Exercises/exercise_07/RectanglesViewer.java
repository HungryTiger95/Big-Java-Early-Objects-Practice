package exercise_07;

import javax.swing.JFrame;

/**
 * Write a program that displays a number of rectangles at random positions. Supply
 * menu items "Fewer" and "More" that generate fewer or more random rectangles. Each
 * time the user selects "Fewer", the count should be halved. Each time the user clicks
 * on "More", the count should be doubled.
 * 
 * @author Mayuresh
 *
 */
public class RectanglesViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new RectanglesFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Rectangles");
		frame.setVisible(true);
	}
}
