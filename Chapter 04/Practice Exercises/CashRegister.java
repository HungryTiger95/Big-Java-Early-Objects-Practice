/**
 * E4.9/ E4.20
 * 
 * Improve the program from How To 4.1 to allow input of quarters in addition to bills.
 * A cash register totals up sales and computes change due.
 * 
 * Enhance the CashRegister class by adding separate methods enterDollars, enterQuarters,
 * enterDimes, enterNickels, and enterPennies.
 * 
*/
public class CashRegister
{
   public static final double QUARTER_VALUE = 0.25;
   public static final double DIME_VALUE = 0.1;
   public static final double NICKEL_VALUE = 0.05;
   public static final double PENNY_VALUE = 0.01;

   private double purchase;
   private double payment;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }

   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
   }
   
   /**
      Processes the payment received from the customer.
      @param dollars the number of dollars in the payment
      @param quarters the number of quarters in the payment
      @param dimes the number of dimes in the payment
      @param nickels the number of nickels in the payment
      @param pennies the number of pennies in the payment
   */
   public void receivePayment(int dollars, int quarters, 
         int dimes, int nickels, int pennies)
   {
      payment = dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
            + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
   }
   
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }
   
   /**
    * Enters the dollars in a payment
    * @param dollars dollars
    */
   public void enterDollars(int dollars)
   {
	   payment = payment + dollars;
   }
   
   /**
    * Enters the quarters in the payment
    * @param quarters quarters
    */
   public void enterQuarters(int quarters)
   {
	   payment = payment + (quarters * QUARTER_VALUE);
   }
   
   /**
    * Enters the dimes in the payment
    * @param dimes dimes
    */
   public void enterDimes(int dimes)
   {
	   payment = payment + (dimes * DIME_VALUE);
   }
   
   /**
    * Enters the nickels in the payment
    * @param nickels nickels
    */
   public void enterNickels(int nickels)
   {
	   payment = payment + (nickels * NICKEL_VALUE);
   }
   
   /**
    * Enters the pennies in the payment
    * @param pennies pennies
    */
   public void enterPennies(int pennies)
   {
	   payment = payment + (pennies * PENNY_VALUE);
   }
}
