package section_05;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{
   private double balance;
   private Lock balanceChangeLock;
   private Condition sufficientFundsCondition;
   
   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {
      balance = 0;
      balanceChangeLock = new ReentrantLock();
      sufficientFundsCondition = balanceChangeLock.newCondition();
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {
      balanceChangeLock.lock();
      try
      {
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
            sufficientFundsCondition.await();
         }
         System.out.print("Withdrawing " + amount);
         double newBalance = balance - amount;
         System.out.println(", new balance is " + newBalance);
         balance = newBalance;
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
