package exercise_10_18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddInterestListener implements ActionListener
{
	// Instance Variables
	private BankAccount account;
	private final double INTEREST_RATE = 0.9;
	
	// Constructors
	public AddInterestListener(BankAccount account)
	{
		this.account = account;
	}
	
	// Methods
	@Override
	public void actionPerformed(ActionEvent event)
	{
		double interest = account.getBalance() * INTEREST_RATE / 100;
		
		account.deposit(interest);
		System.out.printf("balance: %.2f\n", account.getBalance());
	}
	
}
