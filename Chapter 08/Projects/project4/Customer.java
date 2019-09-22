package project4;

import java.util.ArrayList;

/**
 * Design a Customer class to handle a customer loyalty marketing campaign. After
 * accumulating $100 in purchases, the customer receives a $10 discount on the next
 * purchase.
 * 
 * Provide methods void makePurchase(double amount) and boolean isDiscountReached()
 * 
 * Provide a test program and a test scenario in which a customer has earned a discount
 * and then made over $90, but less than $100 in purchases. This should not result in a
 * second discount. Then add another purchase that results in the second discount.
 * 
 * @author Mayuresh
 *
 */
public class Customer
{
	// Instance Variables
	private ArrayList<Double> purchaseList = new ArrayList<Double>();
	private double sumOfPurchases = 0; 
	private double purchaseAccumulation = 0;
	private int discount = 0;
	
	// Constructors
	
	// Methods
	/**
	 * Makes a purchase of a given amount
	 * @param amount cost of the purchase
	 */
	public void makePurchase(double amount)
	{
		// add purchase
		purchaseList.add(amount);
		
		// add to the sum and the purchase accumulation
		sumOfPurchases += amount;
		purchaseAccumulation += amount;
	}
	
	/**
	 * Completes the purchase assuming payment was made in full.
	 * Resets the purchase list and the sum of the purchases
	 */
	public void completePurchase()
	{
		purchaseList.clear();
		sumOfPurchases = 0;
	}
	
	/**
	 * Gets the purchase list
	 * @return list of all the purchases
	 */
	public ArrayList<Double> getPurchaseList()
	{
		return purchaseList;
	}
	
	/**
	 * Uses a discount if a discount is available
	 */
	public void useDiscount()
	{
		if(discount > 0)
		{
			purchaseAccumulation -= 100.00;
			sumOfPurchases -= 10.00;
			discount--;
		}
	}
	
	/**
	 * Checks if a discount is available
	 * @return true if there is a discount available, false if not
	 */
	public boolean discountAvailable()
	{
		if(discount > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/**
	 * Checks if a discount has been reached. A discount is reached
	 * if and only if a total of $100 was reached in a single purchase
	 * @return
	 */
	public boolean isDiscountReached()
	{
		if(getSumOfPurchases() >= 100)
		{
			discount++;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double getSumOfPurchases()
	{
		return sumOfPurchases;
	}
}
