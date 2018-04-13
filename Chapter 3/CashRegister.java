/**
 * P3.1/ P3.2
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
	private double salesTax;
	private double totalSalesTax = 0;
	
	// Constructors
	/**
	 * Constructs a CashRegister object
	 */
	public CashRegister(double salesTax)
	{
		purchase = 0;
		payment = 0;
		salesCount = 0;
		salesTotal = 0;
		this.salesTax = salesTax / 100.0;
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
	 * Records a purchase that adds tax
	 * @param amount price of purchase
	 */
	public void recordTaxablePurchase(double amount)
	{
		purchase = purchase + (amount + (amount * salesTax));
		String price = String.valueOf(amount);
		priceString = priceString.concat(price + " \n         ");
		salesCount++;
		totalSalesTax = totalSalesTax + (amount * salesTax);
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
		System.out.println("Sales Tax: " + totalSalesTax);
		salesTotal = salesTotal + purchase;
		double change = payment - purchase;
		System.out.println("Payment: " + payment);
		purchase = 0;
		payment = 0;
		totalSalesTax = 0;
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
	 * @return total sales in one day
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
	
	/**
	 * Returns the Payment
	 * @return payment
	 */
	public double getPayment()
	{
		return payment;
	}
}
