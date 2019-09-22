package section_03;

public class BankAccountThreadRunner
{
	public static void main(String[] args)
	{
		BankAccount account = new BankAccount();
		final double AMOUNT = 100;
		final int REPETITIONS = 100;
		final int THREADS = 100;
		
		for(int i = 1; i <= THREADS; i++)
		{
			DepositRunnable d = new DepositRunnable(account, AMOUNT, REPETITIONS);
			WithdrawRunnable w = new WithdrawRunnable(account, AMOUNT, REPETITIONS);
			
			Thread dt = new Thread(d);
			Thread wt = new Thread(w);
			
			dt.start();
			wt.start();
		}
	}
}
