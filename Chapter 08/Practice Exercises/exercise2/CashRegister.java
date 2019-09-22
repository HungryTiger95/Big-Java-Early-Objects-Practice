package exercise2;

/**
 * Modify the giveChange method of the CashRegister class so that it returns the
 * number of coins of a particular type to return:
 * 
 * 		int giveChange(Coin coinType)
 * 
 * The caller needs to invoke this method for each coin type, in decreasing value.
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
	 * Gets the total payment
	 * @return total payment
	 */
	public double getTotalPayment()
	{
		return payment;
	}
	
	/**
	 * Gets the total purchase price
	 * @return total purchase price
	 */
	public double getTotalPurchase()
	{
		return purchase;
	}
	
	/**
	 * Gets the total change due
	 * @return total change due
	 */
	public double getTotalChange()
	{
		return (payment - purchase);
	}
	
	/**
	 * Gives the change based on payment and total purchase and resets payment
	 * and purchase values
	 * @return change
	 */
	public int giveChange(Coin coinType)
	{
		double coinValue = coinType.getCoinValue();
		double change = payment - purchase;
		int numberOfCoins;
		
		numberOfCoins = (int) (change / coinValue);
		
		payment = payment - (coinValue * numberOfCoins);
		
		if (coinType.getCoinValue() == 0.01)
		{
			numberOfCoins++;
		}
		
		return numberOfCoins;
	}
}
