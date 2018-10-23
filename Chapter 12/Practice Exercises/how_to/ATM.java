package how_to;

/**
   An ATM that accesses a bank.
   
   This class is the brains behind this program. It aggregates the Bank class.
   Dependency-wise, because this class aggregates the Bank class, it automatically
   depends on the Customer and BankAccount classes. However, this class aggregates
   the Customer class and the BankAccount class.
   
   This class is responsible for many actions that an ATM needs to be able to perform.
   It resets itself to the initial state. For this class we use states in the form of
   integers. 1 is the starting state, 2 is the PIN entering state, 3 is the Account
   selection state, and 4 is the transaction selection state. The class is also responsible
   for setting the customer number given the number of the customer. This method is used
   by the running program and is inputed by the user and then sets the state of the ATM to
   PIN mode. Next, this class selects a customer from the Bank. Basically it tries to find
   a customer from the bank. If successful, it will change the mode to Account. Otherwise,
   it will go back to the start mode. Next, the class needs to be able to select the type
   of account that the customer wishes to make transactions to/from. This method only passes
   1 or 2; CHECKING or SAVINGS and sets the mode to Transaction. If the Transaction mode is
   the current state, then this class can allow a customer to make a deposit or a withdrawal.
   This class also allows the customer to go back a state.
*/
public class ATM 
{  
   public static final int CHECKING = 1;
   public static final int SAVINGS = 2;

   private int state;
   private int customerNumber;
   
   private Customer currentCustomer;
   private BankAccount currentAccount;
   private Bank theBank;
   
   public static final int START = 1;
   public static final int PIN = 2;
   public static final int ACCOUNT = 3;
   public static final int TRANSACT = 4;

   /**
      Constructs an ATM for a given bank.
      @param aBank the bank to which this ATM connects
   */    
   public ATM(Bank aBank)
   {
      theBank = aBank;
      reset();
   }

   /**
      Resets the ATM to the initial state.
   */
   public void reset()
   {
      customerNumber = -1;
      currentAccount = null;
      state = START;             
   }

   /** 
      Sets the current customer number 
      and sets state to PIN. 
      (Precondition: state is START)
      @param number the customer number.
   */
   public void setCustomerNumber(int number) 
   {
      customerNumber = number;
      state = PIN;
   }

   /** 
      Finds customer in bank.
      If found sets state to ACCOUNT, else to START.
      (Precondition: state is PIN)
      @param pin the PIN of the current customer
   */
   public void selectCustomer(int pin)
   {  
      currentCustomer = theBank.findCustomer(customerNumber, pin);
      if (currentCustomer == null) 
      {
         state = START;
      }
      else 
      {
         state = ACCOUNT;
      }
   }
   
   /** 
      Sets current account to checking or savings. Sets 
      state to TRANSACT. 
      (Precondition: state is ACCOUNT or TRANSACT)
      @param account one of CHECKING or SAVINGS
   */
   public void selectAccount(int account)
   {
      if (account == CHECKING)
      {
         currentAccount = currentCustomer.getCheckingAccount();
      }
      else
      {
         currentAccount = currentCustomer.getSavingsAccount();
      }
      state = TRANSACT;
   }

   /** 
      Withdraws amount from current account. 
      (Precondition: state is TRANSACT)
      @param value the amount to withdraw
   */
   public void withdraw(double value)
   {  
      currentAccount.withdraw(value);
   }

   /** 
      Deposits amount to current account. 
      (Precondition: state is TRANSACT)
      @param value the amount to deposit
   */
   public void deposit(double value)
   {  
      currentAccount.deposit(value);
   }

   /** 
      Gets the balance of the current account. 
      (Precondition: state is TRANSACT)
      @return the balance
   */
   public double getBalance()
   {  
      return currentAccount.getBalance();
   }

   /**
      Moves back to the previous state.
   */
   public void back()
   {
      if (state == TRANSACT)
      {
         state = ACCOUNT;
      }
      else if (state == ACCOUNT)
      {
         state = PIN;
      }
      else if (state == PIN)
      {
         state = START;
      }
   }

   /**
      Gets the current state of this ATM.
      @return the current state
   */
   public int getState()
   {
      return state;
   }
}
