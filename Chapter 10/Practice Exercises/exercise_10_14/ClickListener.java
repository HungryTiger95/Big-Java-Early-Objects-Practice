package exercise_10_14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener
{
	// Instance Variables
	private int count = 1;
	
	// Constructors
	
	// Methods
	/**
	 * Increment the count by 1
	 */
	public void actionPerformed(ActionEvent event)
	{
		int n = count++;
		
		System.out.println("I Was Clicked " + n + " Times!");
	}
}
