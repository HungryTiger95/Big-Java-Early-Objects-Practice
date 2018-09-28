package exercise_10_21;

import javax.swing.JFrame;

public class RectangleViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new RectangleFrame();
		frame.setTitle("An animated rectangle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
