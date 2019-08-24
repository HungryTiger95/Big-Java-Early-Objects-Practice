package section_04;

/**
 * A class implements an interface type if it declares the interface in an implements clause.
 * 
 * The class needs to declare the method as public but the interface doesn't need to becuase
 * all methods in an interface are public.
 * 
 * 
 * @author Mayuresh
 *
 */
public class BankAccount implements Measurable, Comparable<BankAccount>
{
	// Instance Variables
	private double balance;
	private static int previousAccountNumber = 1000;	// This variable belongs to this class not an instance of this class
	private int accountNumber;
	
	// Constructors
	/**
	 * Constructs a bank account with a zero balance
	 */
	public BankAccount()
	{
		this.balance = 0;
		
		previousAccountNumber++;
		accountNumber = previousAccountNumber;
	}
	
	/**
	 * Creates a bank account with a given initial balance
	 * @param initialBalance initial balance
	 */
	public BankAccount(double initialBalance)
	{
		this.balance = initialBalance;
		
		previousAccountNumber++;
		accountNumber = previousAccountNumber;
	}
	
	// Methods
	/**
	 * Deposits a given amount of money into this account
	 * @param amount the amount of the deposit
	 */
	public void deposit(double amount)
	{
		this.balance += amount;
	}
	
	/**
	 * Withdraws a given amount of money out of this account
	 * @param amount the amount of the withdrawal
	 */
	public void withdraw(double amount)
	{
		this.balance -= amount;
	}
	
	/**
	 * Carries out the end of month processing that is appropriate
	 * for this account
	 */
	public void monthEnd()
	{
		// Do Nothing
	}
	
	/**
	 * Gets the current balance of this account
	 * @return the current balance
	 */
	public double getBalance()
	{
		return balance;
	}
	
	/**
	 * Gets the account number for this account
	 * @return the account number for this account
	 */
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	/**
	 * Gets the String representation of this BankAccount. It returns the
	 * balance and the account number.
	 */
	public String toString()
	{
		return getClass().getName() + "[balance=" + balance + ",accountNumber=" + accountNumber +"]";
	}
	
	/**
	 * Checks whether or not two different BankAccount objects are "equal"
	 * to each other. First this method checks if the otherObject is set as null.
	 * If it is, it return false. Then it checks whether the two objects are of the
	 * same class. If they are not of the same class, then it returns false. This
	 * method only checks whether or not the balance of both accounts are the same.
	 * The account number cannot be checked since no bank account has the same account
	 * number. Furthermore, account type can be checked also, but is not in this situation
	 */
	public boolean equals(Object otherObject)
	{
		// Check if otherObject is null
		if(otherObject == null)
		{
			return false;
		}
		
		// Check if both objects are of the same class
		if(getClass() != otherObject.getClass())
		{
			return false;
		}
		
		// Cast the parameter variable to the class BankAccount because you are not allowed to change
		// the type of the parameter variable
		BankAccount other = (BankAccount) otherObject;
		
		return getBalance() == other.getBalance();
	}
	
	/**
	 * Measures the balance of this account
	 * @return the balance
	 */
	public double getMeasure()
	{
		return this.balance;
	}
	
	/**
	 * Compares this bank account with another account
	 * @return -1 if this accounts balance is less than the other, 1 if this accounts balance is greater than the other, 0 if both accounts balances are equal
	 */
	public int compareTo(BankAccount otherAccount)
	{	
		if(balance < otherAccount.balance)
		{
			return - 1;
		}
		else if(balance > otherAccount.balance)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
