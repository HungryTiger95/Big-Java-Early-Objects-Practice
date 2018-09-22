package exercise15.money;

/**
 * Implement the Coin class and modify the CashRegister class so that coins can be added to the cash
 * register, by supplying a method void recievePayment(int coinCount, Coin coinType).
 * Invoke this method multiple times, once for each type of coin that is present in the payment.
 * 
 * @author Mayuresh
 *
 */
public class CashRegister
{
	// Instance Variables
	private double purchase;
	private double payment;
	
	// Constructors
	/**
	 * Constructs a CashRegister with no money in it
	 */
	public CashRegister()
	{
		purchase = 0;
		payment = 0;
	}
	// Methods
	/**
	 * Records a purchase of an item
	 * @param amount amount of the purchase price
	 */
	public void recordPurchase(double amount)
	{
		purchase = purchase + amount;
	}
	
	/**
	 * Records a payment
	 * @param coinCount number of coins or dollars
	 * @param coinType the type of coin
	 */
	public void recievePayment(int coinCount, Coin coinType)
	{
		payment = payment + coinCount * coinType.getCoinValue();
	}
	
	/**
	 * Gives the change based on payment and total purchase and resets payment
	 * and purchase values
	 * @return change
	 */
	public double giveChange()
	{
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		return change;
	}
}
