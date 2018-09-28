package exercise_10_19;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JLabel;

public class AddInterestListener implements ActionListener
{
	// Instance Variables
	private BankAccount account;
	private final double INTEREST_RATE = 10;
	private JLabel label;
	
	// Constructors
	public AddInterestListener(BankAccount account, JLabel label)
	{
		this.account = account;
		this.label = label;
	}
	
	// Methods
	public void actionPerformed(ActionEvent event)
	{
		double interest = account.getBalance() * INTEREST_RATE / 100;
		NumberFormat formatter = new DecimalFormat("#0.00");
		
		account.deposit(interest);
		label.setText("balance: " + Double.valueOf(formatter.format(account.getBalance())));
	}
	
}
