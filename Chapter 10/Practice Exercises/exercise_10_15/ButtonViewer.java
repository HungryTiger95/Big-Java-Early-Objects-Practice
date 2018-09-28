package exercise_10_15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Enhance the ButtonViewer program so that it has two buttons labeled A and B, each of which prints
 * a message "Button x was clicked!", where x is A or B.
 * 
 * @author Mayuresh
 *
 */
public class ButtonViewer
{
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 400;
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		// The buttons to trigger the message
		JButton buttonA = new JButton("A");
		JButton buttonB = new JButton("B");
		
		// The label for displaying results
		JLabel label = new JLabel();
		
		// Panel that holds the user-interface components
		JPanel panel = new JPanel();
		
		// Add each component to the panel
		panel.add(buttonA);
		panel.add(buttonB);
		panel.add(label);
		frame.add(panel);
		
		// Inner Listener class
		class ClickListener implements ActionListener
		{
			// Instance Variables
			private int count;
			private JButton button;
			
			// Constructors
			/**
			 * Constructs a click listener with a given button
			 * @param button the button that listens for a click
			 */
			public ClickListener(JButton button)
			{
				this.count = 0;
				this.button = button;
			}
			
			// Methods
			/**
			 * The action performed when the button is clicked. The counter is incremented by 1
			 * and the label is updated with the number of times the button was clicked
			 */
			public void actionPerformed(ActionEvent event)
			{
				count++;
				label.setText("Button " + button.getText() + " was clicked " + count + " times");
			}
		}
		
		ActionListener listener = new ClickListener(buttonA);
		buttonA.addActionListener(listener);
		
		ActionListener listener2 = new ClickListener(buttonB);
		buttonB.addActionListener(listener2);
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
