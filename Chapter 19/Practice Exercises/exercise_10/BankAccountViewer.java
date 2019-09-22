package exercise_10;

import javax.swing.JFrame;

/**
 * Write a graphical application simulating a bank account. Supply text fields and buttons for depositing
 * and withdrawing money, and for displaying the current balance in a label.
 * 
 * @author Mayuresh
 *
 */
public class BankAccountViewer
{
	public static void main(String[] args)
	{
		JFrame frame = new BankAccountFrame();
		frame.setTitle("Account Number: " + BankAccount.previousAccountNumber);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
