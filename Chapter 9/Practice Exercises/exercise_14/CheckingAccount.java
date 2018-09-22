package exercise_14;

/**
 * Change the CheckingAccount class so that a $1 fee is levied for deposits or
 * Withdrawals in excess of three free monthly transactions. Place the code for
 * computing the fee into a separate method that you call from the deposit and
 * withdraw methods.
 * 
 * @author Mayuresh
 *
 */
public class CheckingAccount extends BankAccount
{
	// Instance Variables
	private int transactionCount = 0;
	private final int TRANSACTION_LIMIT = 3;
	private final int TRANSACTION_FEE = 1;
	
	// Constructors
	/**
	 * Constructs a checking account with a zero balance and sets the account number
	 * based on whatever the last number was used
	 */
	public CheckingAccount()
	{
		super();
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
	 * not the account has surpassed the free transaction limit. If it has, withdraw
	 * from the account a withdrawal fee
	 */
	public void withdraw(double amount)
	{	
		super.withdraw(amount);
		transactionProcessing();
	}
	
	/**
	 * Deposits an amount of money to this account and then checks whether or
	 * not the account has surpassed the free transaction limit. If it has, withdraw
	 * form the account a withdrawal fee
	 */
	public void deposit(double amount)
	{
		super.deposit(amount);
		transactionProcessing();
	}
	
	/**
	 * The transaction processing carried out after every transaction.
	 * After every transaction, a transaction count is incremented.
	 * If this transaction count surpasses the number of free transactions
	 * given each month, then a transaction fee will be deducted from the account.
	 */
	public void transactionProcessing()
	{
		transactionCount++;
		
		if(transactionCount > TRANSACTION_LIMIT)
		{
			super.withdraw(TRANSACTION_FEE);
		}
	}
	
	/**
	 * Carries out the end of month processing that is appropriate for this account.
	 * For this account type, the free withdrawal count used up is reset to 0.
	 */
	public void monthEnd()
	{
		transactionCount = 0;
	}
	
	public String toString()
	{
		return super.toString() + "[freeWithdrawals=" + TRANSACTION_LIMIT + "]";
	}
	
	/**
	 * Checks if this object is equal to another object. This method assumes that the
	 * object being compared is an object of the same type
	 * @return true if both objects contain the same values, false if not
	 */
	public boolean equals(Object otherObject)
	{
		if(!super.equals(otherObject))
		{
			return false;
		}
		
		CheckingAccount other = (CheckingAccount) otherObject;
		return super.getBalance() == other.getBalance() && transactionCount == other.transactionCount;
	}
}
