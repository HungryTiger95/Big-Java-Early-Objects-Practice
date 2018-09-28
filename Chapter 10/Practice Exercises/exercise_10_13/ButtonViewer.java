package exercise_10_13;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Enhance the ButtonViewer program so that it prints a message "I was clicked
 * n times!" whenever the button is clicked. The value n should be incremented with each click.
 * 
 * @author Mayuresh
 *
 */
public class ButtonViewer
{
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 300;
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JButton button = new JButton("Button 1");
		
		frame.add(button);
		
		ActionListener listener1 = new ClickListener();
		
		button.addActionListener(listener1);
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
