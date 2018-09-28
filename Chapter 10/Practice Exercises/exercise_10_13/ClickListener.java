package exercise_10_13;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * An action listener that prints a message
 * 
 * @author Mayuresh
 *
 */
public class ClickListener implements ActionListener
{
	// Instance Variables
	private int count = 1;
	
	// Constructors
	
	// Methods
	/**
	 * Increments the count by 1 and print out the number of times the source was clicked
	 */
	public void actionPerformed(ActionEvent event)
	{
		int n = count++;
		
		System.out.println("I Was Clicked " + n + " Times!");
	}
}
