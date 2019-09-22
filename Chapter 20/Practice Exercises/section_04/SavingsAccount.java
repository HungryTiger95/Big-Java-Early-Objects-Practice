package section_04;

public class SavingsAccount extends BankAccount
{
	private static final long serialVersionUID = -2106793571444721571L;
	private double interestRate;
	
	
	public SavingsAccount(int accountNumber)
	{
		super(accountNumber);
		this.interestRate = 0.01;
	}
	
	public SavingsAccount(int accountNumber, double balance)
	{
		super(accountNumber, balance);
		this.interestRate = 0.01;
	}
	
	public SavingsAccount(int accountNumber, double balance, double interestRate)
	{
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}
	
	public void EndOfMonthUpdate()
	{
		double addBalance = this.getBalance() * this.interestRate;
		this.deposit(addBalance);
	}
	
	/**
	 * Returns the interest rate
	 * @return the interest rate
	 */
	public double getInterestRate()
	{
		return this.interestRate;
	}
}
