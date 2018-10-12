package exercise_11_13;

/**
 * Test BankAccount:
 * 
 * 		1) Construct BankAccount with Negative initial balance
 * 		2) Withdraw a negative amount and an amount greater than the balance
 * 		3) Deposit a negative amount
 * 
 * @author Mayuresh
 *
 */
public class BankAccountTester
{
	public static void main(String[] args)
	{
		BankAccount harrysChecking = new BankAccount();
	      
	      try
	      {
	    	 /**
	    	  * This try/catch block tries to deposit a negative amount into the bank account.
	    	  * It should result in printing out exception1 noting that an IllegalArgumentException
	    	  * was thrown
	    	  */
	         try
	         {
	            harrysChecking.deposit(-100);
	            System.out.println("success1");
	         }
	         catch (IllegalDepositException e)
	         {
	            System.out.println(e.getMessage());
	         }
	         
	         /**
	    	  * This try/catch block tries to withdraw more money than is available in the account.
	    	  * It should result in printing out exception2 noting that an IllegalArgumentException
	    	  * was thrown
	    	  */
	         try
	         {
	            harrysChecking.withdraw(100);
	            System.out.println("success2");
	         }
	         catch (InsufficientFundsException e)
	         {
	            System.out.println(e.getMessage());
	         }

	         /**
	    	  * This try/catch block tries to create a new bank account with a negative initial balance.
	    	  * It should result in printing out exception3 noting that an IllegalArgumentException
	    	  * was thrown
	    	  */
	         try
	         {
	            harrysChecking = new BankAccount(-500);
	            System.out.println("success3");
	         }
	         catch (IllegalInitialBalanceException e)
	         {
	            System.out.println(e.getMessage());
	         }
	         
	         
	         System.out.println("done");         
	      }
	      catch (Throwable t)
	      {
	         System.out.println("unexpected exception: " + t);         
	      }
	}
}
