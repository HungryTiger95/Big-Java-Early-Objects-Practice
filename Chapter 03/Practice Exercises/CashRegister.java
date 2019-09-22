/**
 * E3.6/ E3.7
 * 
 * Add a method printReciept to the CashRegister class. The method should print the
 * prices of all purchased items and the total amount due. Hint: you will need to form
 * a string of all prices. Use the concat method of the String class to add additional items
 * to that string. To turn a price into a string, use the call String.valueOf(price).
 * 
 * After closing time, the store manager would like to know how much business was
 * transacted during the day. Modify the CashRegister class to enable this functionality.
 * Supply methods getSalesTotal and getSalesCount to get the total amount of all sales
 * and the number of sales. Supply a method reset that resets any counters and totals so
 * that the next day's sales start from 0.
 * 
 * @author Mayuresh
 *
 */

public class CashRegister
{
	// Instance Variables
	private double purchase;
	private double payment;
	private String priceString = "";
	private int salesCount;
	private double salesTotal;
	
	// Constructors
	/**
	 * Constructs a CashRegister object
	 */
	public CashRegister()
	{
		purchase = 0;
		payment = 0;
		salesCount = 0;
		salesTotal = 0;
	}
	
	// Methods
	/**
	 * Records a purchase
	 * @param amount the price of the item
	 */
	public void recordPurchase(double amount)
	{
		purchase = purchase + amount;
		String price = String.valueOf(amount);
		priceString = priceString.concat(price + " \n         ");
		salesCount++;
		
	}
	
	/**
	 * Receives a payment
	 * @param amount the payment for the item
	 */
	public void recievePayment(double amount)
	{
		payment = payment + amount;
	}
	
	/**
	 * Returns the change and resets the cash register for next customer
	 * @return the change
	 */
	public double giveChange()
	{
		salesTotal = salesTotal + purchase;
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		return change;
	}
	
	/**
	 * Prints a receipt of all items sold in a sale
	 */
	public void printReceipt()
	{
		System.out.println("Reciept:");
		
		System.out.println("         " + priceString);
		
		System.out.println("=================");
		System.out.println("Total:   " + purchase);
	}
	
	/**
	 * Gets the total sales in one day
	 * @return total sales
	 */
	public double getSalesTotal()
	{
		return salesTotal;
	}
	
	/**
	 * Gets the number of sales in one day
	 * @return number of sales
	 */
	public int getSalesCount()
	{
		return salesCount;
	}
}
