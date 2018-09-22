package project5;

import java.util.ArrayList;

public enum Shop
{
	AEROPOSTALE,
	UNDER_ARMOUR,
	CHANEL,
	LEVIS,
	VICTORAS_SECRET,
	OREVER21, RALPH_LAUREN,
	VANS,
	CONVERSE,
	MACYS,
	ADIDAS,
	JORDAN,
	TARGET,
	NIKE,
	AMERICAN_EAGLE,
	HM,
	RUE21,
	VERSACE,
	ZARA,
	GAP;
	
	// Instance Variables
	private ArrayList<Double> purchaseList = new ArrayList<Double>();
	
	// Constructors
	/**
	 * Constructs each shop at the time that this enum is loaded
	 */
	private Shop()
	{
		
	}
	
	// Methods
	/**
	 * Adds a purchase to this shop's list of purchases
	 * @param price price of the purchase
	 */
	public void recordPurchase(double price)
	{
		purchaseList.add(price);
	}
	
	/**
	 * Gets the list of the prices of the items purchased at this shop
	 * @return the purchase list
	 */
	public ArrayList<Double> getPurchaseList()
	{
		return purchaseList;
	}
	
	/**
	 * Gets a purchase at a given index
	 * @param index index
	 * @return the purchase price
	 */
	public double getPurchaseAt(int index)
	{
		return purchaseList.get(index);
	}
}

