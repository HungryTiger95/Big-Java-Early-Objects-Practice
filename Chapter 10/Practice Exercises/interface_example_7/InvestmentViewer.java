package interface_example_7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import interface_example.BankAccount;

/**
 * It is common to implement listener classes as inner classes. There are two advantages to making a listener class into an
 * inner class. First, listener classes tend to be very short. You can put the inner class close to where it is needed, without
 * cluttering up the remainder of the project. Also, inner classes have a very attractive feature:
 * 
 * 		Their methods can access instance variables and methods of the surrounding class.
 * 
 * This is particularly useful when implementing event handlers because it allows the inner class to access variables without
 * having to receive them as constructor or method arguments. However, an inner class can access surrounding local variables only
 * if they are declared as final. Keep in mind that an object variables is final when the variable always refers to the same object.
 * An inner class can also access instance variables of the surrounding class, again with a restriction. The instance variable must
 * belong to the object that constructed the inner class object. If the inner class was created inside a static method, it can only
 * access static variables.
 * 
 * @author Mayuresh
 *
 */
public class InvestmentViewer
{
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 300;
	
	private static final double INTEREST_RATE = 10;
	private static final double INITIAL_BALANCE = 1000;
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		// The button to trigger the calculation
		JButton button = new JButton("Add Interest");
		frame.add(button);
		
		// The application adds interest to this bank account
		final BankAccount account = new BankAccount(INITIAL_BALANCE);
		
		class AddInterestListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				// The listener method accesses the account variable from the surrounding block
				double interest = account.getBalance() * INTEREST_RATE / 100;
				account.deposit(interest);
				
				System.out.printf("Balance: %.2f\n", account.getBalance());
			}
		}
		
		ActionListener listener = new AddInterestListener();
		button.addActionListener(listener);
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setLocation(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
