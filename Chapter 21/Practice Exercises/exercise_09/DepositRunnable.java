package exercise_09;

public class DepositRunnable implements Runnable
{
	private static final int DELAY = 50;
	private BankAccount account;
	private double amount;
	private int count;
	
	/**
	 * Constructs a deposit runnable
	 * @param anAccount the account into which to deposit money
	 * @param anAmount the amount to deposit in each repetition
	 * @param aCount the number of repetitions
	 */
	public DepositRunnable(BankAccount anAccount, double anAmount, int aCount)
	{
		account = anAccount;
		amount = anAmount;
		count = aCount;
	}
	
	public void run()
	{
		try
		{
			for(int i = 1; i <= count; i++)
			{
				account.deposit(amount);
				Thread.sleep(DELAY);
			}
		}
		catch(InterruptedException e) {}
	}
}
