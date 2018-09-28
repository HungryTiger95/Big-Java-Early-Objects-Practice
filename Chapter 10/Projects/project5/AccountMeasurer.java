package project5;

public class AccountMeasurer implements Measurer
{
	@Override
	/**
	 * Gets the measure of the balance of a bank account
	 */
	public double measure(Object anObject)
	{
		BankAccount account = (BankAccount) anObject;
		
		double accountBalance = account.getBalance();
		return accountBalance;
	}
}
