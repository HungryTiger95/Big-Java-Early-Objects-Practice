package how_to;

/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
   
   The BankAccount class does not depend on any other class and does not inherit from any other class.
   Changes to this class have the possibility to affect classes that depend on this class.
   
   This class is fairly simple with just three methods: deposit, withdraw, and get balance. The deposit
   and withdraw methods would be considered responsibilities of this class but I don't know if the 
   get balance would technically be a responsibility since all it does is return the balance.
   
   I think that it would be a responsibility though.
*/
public class BankAccount
{  
   private double balance; 

   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {  
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {  
      balance = initialBalance;
   }
 
   /** 
      Deposits money into the account.
      @param amount the amount of money to withdraw
   */
   public void deposit(double amount) 
   {  
      balance = balance + amount;
   }

   /** 
      Withdraws money from the account.
      @param amount the amount of money to deposit
   */
   public void withdraw(double amount) 
   {  
      balance = balance - amount;
   }

   /** 
      Gets the account balance.
      @return the account balance
   */
   public double getBalance()
   {  
      return balance; 
   }
}

