package exercise_09;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Add a condition to the deposit method of the BankAccount class in Section 21.5,
 * restricting deposits to $100,000 (the insurance limit of the U.S. government). The
 * method should block until sufficient money has been withdrawn by another thread.
 * Test your program with a large number of deposit threads.
 */
public class BankAccount
{
	private double balance;
	private Lock balanceChangeLock;
	private Condition sufficientFundsCondition;
	private Condition overageFundsCondition;
	
	/**
      Constructs a bank account with a zero balance.
	 */
	public BankAccount()
	{
		balance = 0;
		balanceChangeLock = new ReentrantLock();
		sufficientFundsCondition = balanceChangeLock.newCondition();
		overageFundsCondition = balanceChangeLock.newCondition();
	}

	/**
      Deposits money into the bank account.
      @param amount the amount to deposit
	 * @throws InterruptedException 
	 */
	public void deposit(double amount) throws InterruptedException
	{
		balanceChangeLock.lock();
		try
		{
			// Specify a condition for the deposit method to meet to allow the method to continue
			while(balance >= 100_000)
			{
				System.out.print("[overage funds]");
				overageFundsCondition.await();
			}
			System.out.print("Depositing " + amount);
			double newBalance = balance + amount;
			System.out.println(", new balance is " + newBalance);
			balance = newBalance;

			sufficientFundsCondition.signalAll();
		}
		finally
		{
			balanceChangeLock.unlock();
		}
	}

	/**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
	 */
	public void withdraw(double amount) throws InterruptedException
	{
		balanceChangeLock.lock();
		try
		{
			while (balance < amount)
			{
				System.out.print("[insufficient funds]");
				sufficientFundsCondition.await();
			}
			System.out.print("Withdrawing " + amount);
			double newBalance = balance - amount;
			System.out.println(", new balance is " + newBalance);
			balance = newBalance;
			
			overageFundsCondition.signalAll();
		}
		finally
		{
			balanceChangeLock.unlock();
		}
	}

	/**
      Gets the current balance of the bank account.
      @return the current balance
	 */
	public double getBalance()
	{
		return balance;
	}
}
