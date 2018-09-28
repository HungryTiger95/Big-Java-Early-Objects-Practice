package exercise_10_12;

import javax.swing.JFrame;

/**
 * A class to view the RandomShapeComponent which draws a RandomShape.
 * 
 * @author Mayuresh
 *
 */
public class RandomShapeViewer
{
	public static void main(String[] args)
	{
		final int FRAME_WIDTH = 800;
		final int FRAME_HEIGHT = 600;
		
		JFrame frame = new JFrame();
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setLocation(400, 200);
		frame.setTitle("Random Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RandomShapeComponent component = new RandomShapeComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}
