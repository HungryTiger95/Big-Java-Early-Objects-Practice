package exercise_10_18;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Implement the AddInterestListener in the InvestmentViewer program as a regular class (that is, not
 * an inner class). Hint: Store a reference to the bank account. Add a constructor to the listener class
 * that sets the reference.
 * 
 * @author Mayuresh
 *
 */
public class InvestmentViewer
{
	
	public static void main(String[] args)
	{
		
		// Initialize a frame
		JFrame frame = new JFrame();
		
		// Initialize a button
		JButton button = new JButton("Add Interest");
		frame.add(button);
		
		// The application adds interest to this bank account
		BankAccount account = new BankAccount(10000);
		
		// Set up the ActionListener
		ActionListener listener = new AddInterestListener(account);
		button.addActionListener(listener);
		
		// Set up the frame
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
