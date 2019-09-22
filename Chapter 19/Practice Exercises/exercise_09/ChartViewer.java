package exercise_09;

import javax.swing.JFrame;

/**
 * Write a program the lets users design charts such as the following:
 * 
 * Use appropriate components to ask for the length, label, and color, then apply them
 * when the user clicks an "Add Item" button.
 * 
 * @author Mayuresh
 * 
 */
public class ChartViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new ChartFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Charts");
		frame.setVisible(true);
	}
}
