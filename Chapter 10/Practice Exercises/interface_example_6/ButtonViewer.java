package interface_example_6;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonViewer
{
	private static final int FRAME_WIDTH = 100;
	private static final int FRAME_HEIGHT = 200;
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JButton button = new JButton("Click Me!");
		frame.add(button);
		
		ActionListener listener = new ClickListener();
		button.addActionListener(listener);
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setLocation(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
