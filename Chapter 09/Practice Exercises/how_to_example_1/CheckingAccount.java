package how_to_example_1;

public class CheckingAccount extends BankAccount
{
	// Instance Variables
	private int withdrawalCount;
	private final int FREE_WITHDRAWALS = 3;
	private final int WITHDRAWAL_FEE = 1;
	
	// Constructors
	/**
	 * Constructs a checking account with a zero balance and sets the account number
	 * based on whatever the last number was used
	 */
	public CheckingAccount()
	{
		
	}
	
	/**
	 * Constructs a checking account with a given balance and sets the
	 * account number of this account.
	 * @param initialBalance
	 */
	public CheckingAccount(double initialBalance)
	{	
		super.deposit(initialBalance);
	}
	
	// Methods
	/**
	 * Withdraws an amount of money from this account and then checks whether or
	 * not the account has surpassed the free withdrawal limit. If it has, withdraw
	 * from the account a withdrawal fee
	 */
	public void withdraw(double amount)
	{	
		super.withdraw(amount);
		withdrawalCount++;
		
		if(withdrawalCount > FREE_WITHDRAWALS)
		{
			super.withdraw(WITHDRAWAL_FEE);
		}
	}
	
	/**
	 * Carries out the end of month processing that is appropriate for this account.
	 * For this account type, the free withdrawal count used up is reset to 0.
	 */
	public void monthEnd()
	{
		withdrawalCount = 0;
	}
	
	public String toString()
	{
		return super.toString() + "[freeWithdrawals=" + FREE_WITHDRAWALS + "]";
	}
	
	public boolean equals(Object otherObject)
	{
		if(!super.equals(otherObject))
		{
			return false;
		}
		
		CheckingAccount other = (CheckingAccount) otherObject;
		return super.getBalance() == other.getBalance() && withdrawalCount == other.withdrawalCount;
	}
}
