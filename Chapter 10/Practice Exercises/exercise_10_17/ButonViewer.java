package exercise_10_17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Enhance the ButtonViewer program so that it prints the time at which the button was clicked
 * 
 * @author Mayuresh
 *
 */
public class ButonViewer
{
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 400;
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JButton button = new JButton("Click Me!");
		
		frame.add(button);
		
		ActionListener listener = new ClickListener();
		button.addActionListener(listener);
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	static class ClickListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			Date d = new Date();
			
			System.out.println("I Was Clicked at: " + DateFormat.getDateTimeInstance().format(d));
		}
	}
}
