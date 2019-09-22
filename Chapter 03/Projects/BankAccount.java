/**
 * P3.9
 * 
 * In this project you will enhance the BankAccount class and see how abstraction and
 * encapsulation enable evolutionary changes to software.
 *  
 * Begin with a simple enhancement: charging a fee for every deposit and withdrawal.
 * Supply a mechanism for setting the fee and modify the deposit and withdraw methods
 * so that the fee is levied. Test your resulting class and check that the fee is computed
 * correctly.
 *  
 * Now make a more complex change. The bank will allow a fixed number of free transactions
 * (deposits or withdrawals) every month, and charge for transactions exceeding the free
 * allotment. The charge is not levied immediately but at the end of the month.
 * 
 * Supply a new method deductMonthlyCharge to the BankAccount class that deducts the
 * monthly charge and resets the transaction count. (Hint: Use Math.max(actual transaction count,
 * free transaction count) in your computation.)
 * @author Mayuresh
 *
 */

public class BankAccount
{  
   private double balance;
   private double transactionFee;
   private int transactionCount;
   private int freeTransactions;

   /**
    * Constructs an object BankAccount with an initial balance 0
    * and a fee to be levied every transaction. 
    * @param fee amount to be charged per transaction
    */
   public BankAccount(double fee, int freeTransactions)
   {
	  this.freeTransactions = freeTransactions;
	  transactionCount = 0;
	  transactionFee = fee;
      balance = 0;
   }

   /**
    * Constructs an object BankAccount with a given initial balance
    * and a fee to be levied every transaction.
    * @param initialBalance initial balance
    * @param fee amount to be charged per transaction
    */
   public BankAccount(double initialBalance, double fee, int freeTransactions)
   {  
	  this.freeTransactions = freeTransactions;
	  transactionCount = 0;
	  transactionFee = fee;
      balance = initialBalance;
   }

   /**
    * Deposits money into the bank account
    * @param amount the amount to deposit
    */
   public void deposit(double amount)
   {  
      balance = balance + amount;
      transactionCount++;
   }

   /**
    * Withdraws money from the bank account.
    * @param amount the amount to withdraw
    */
   public void withdraw(double amount)
   {   
      balance = balance - amount;
      transactionCount++;
   }

   /**
    * Gets the current balance of the bank account.
    * @return the current balance
    */
   public double getBalance()
   {   
      return balance;
   }
   
   /**
    * Deducts a monthly charge from the bank account at the end of the month.
    */
   public void deductMonthlyCharge()
   {
	  double transactions = Math.max(transactionCount, freeTransactions) - freeTransactions;
	  balance = balance - (transactions * transactionFee);
	  transactionCount = 0;
   }
}
