package exercise_10_19;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Implement the AddInterestListener in the InvestmentViewer2 program as a regular class(that is , not
 * an inner class). Hint: Store references to the bank account and the label in the listener. Add a constructor
 * to the listener class that sets the references.
 * 
 * @author Mayuresh
 *
 */
public class InvestmentViewer2
{	
	public static void main(String[] args)
	{
		// Creates a frame
		JFrame frame = new JFrame();
		
		// Creates a button
		JButton button = new JButton("Add Interest");
		
		// Initialize a BankAccount with an initial balance
		final BankAccount account = new BankAccount(1000);
		
		// Create a label
		NumberFormat formatter = new DecimalFormat("#0.00");
		final JLabel label = new JLabel("balance: " + Double.valueOf(formatter.format(account.getBalance())));
		
		// Create a panel and add the button and label to the panel
		// Then add the panel to the frame
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(label);
		frame.add(panel);
		
		// Implement the ActionListener
		ActionListener listener = new AddInterestListener(account, label);
		button.addActionListener(listener);
		
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
