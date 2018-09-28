package exercise_10_14;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Enhance the ButtonViewer program so that it has two buttons, each of which prints a message "I
 * was clicked n times!" whenever the button is clicked. Each button should have a separate click count.
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
		JPanel panel = new JPanel();
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		
		panel.add(button1);
		panel.add(button2);
		
		frame.add(panel);
		
		
		ActionListener listener1 = new ClickListener();
		ActionListener listener2 = new ClickListener();
		button1.addActionListener(listener1);
		button2.addActionListener(listener2);
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
