package project5;

import java.util.ArrayList;

/**
 * The Downtown Marketing Association wants to promote downtown
 * shopping with a loyalty program similar to the one in project4.
 * Shops are identified by a number between 1 and 20. Add a new
 * parameter variable to the makePurchase method that indicates the
 * shop. THe discount is awarded if a customer makes purchases in at
 * least three different shops, spending a total of $100 or more. 
 * 
 * @author Mayuresh
 *
 */
public class Customer
{
	// Instance Variables
	Shop shop;
	ArrayList<Double> purchaseList = new ArrayList<Double>();
	private double sumOfPurchases = 0;
	private int discount = 0;
	private double purchaseAccumulation = 0;
	
	// Constructors
	
	// Methods
	/**
	 * Makes a purchase at a store
	 * @param amount price of the purchase
	 * @param shop the shop at which the purchase was made
	 */
	public void makePurchase(double amount, Shop shop)
	{
		// add purchase to a shop
		shop.recordPurchase(amount);
		
		// add this purchase to a sumOfPurchases
		sumOfPurchases += amount;
		
		// add this purchase to the overall accumulation
		purchaseAccumulation += amount;
	}
	
	/**
	 * Assumes price was paid in full. Clears the purchase list and sets sum of purchases to 0
	 */
	public void completePurchase()
	{
		purchaseList.clear();
		sumOfPurchases = 0;
	}
	
	/**
	 * Uses a discount if a discount is available
	 */
	public void useDiscount()
	{
		if(discount > 0)
		{
			purchaseAccumulation -= 100.00;
		}
	}
	
	/**
	 * Gets a list of purchases made at a shop
	 * @param shop the shop to get the list of purchases from
	 * @return purchase list
	 */
	public ArrayList<Double> getPurchaseListFrom(Shop shop)
	{
		return shop.getPurchaseList();	
	}
	
	/**
	 * Gets a single purchase made at a shop
	 * @param shop the shop to the the purchase from
	 * @param index index i
	 * @return the amount of purchase at the given index
	 */
	public double getPurchaseFrom(Shop shop, int index)
	{
		return shop.getPurchaseAt(index);
	}
	
	/**
	 * Checks whether or not a discount is available to use
	 * @return true if a discount is available, false if not
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
	 * Checks whether or not a discount is reached
	 * @return true if the customer purchased more than $100 worth of items from at least
	 * 3 different stores, false if both conditions are not met
	 */
	public boolean isDiscountReached()
	{
		if(purchaseAccumulation >= 100 && enoughStoresPurchasedFrom())
		{
			discount++;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Gets the sum of all the purchases made by this customer
	 * @return the sum of all purchases
	 */
	public double getSumOfPurchases()
	{
		return sumOfPurchases;
	}
	
	/**
	 * Checks whether or not the customer purhcased from three different stores
	 * @return
	 */
	public boolean enoughStoresPurchasedFrom()
	{
		int count = 0;
		
		for(Shop visitedShop : Shop.values())
		{
			if(visitedShop.getPurchaseList().size() >= 1)
			{
				count++;
			}
		}
		
		if(count >= 3)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
