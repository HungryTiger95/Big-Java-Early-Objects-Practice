package exercise_12_3;

import java.util.ArrayList;

/**
 * Describes an invoice for a set of purchased products
 * 
 * The invoice-printing program has an unfortunate flaw - it mixes "application logic" (the computation of
 * total charges) and "presentation" (the visual appearance of the invoice). To appreciate this flaw, imagine
 * the changes that would be necessary to draw the invoice in HTML for presentation on the Web. Reimplement the
 * program, using a separate InvoiceFormatter class to format the invoice. That is, the Invoice and LineItem
 * methods are no longer responsible for formatting. However, they will acquire other responsibilities, because
 * the InvoiceFormatter class needs to query them for the values that it requires.
 * 
 * 
 * @author Mayuresh
 *
 */
public class Invoice
{
	// Instance Variables
	private Address billingAddress;
	private ArrayList<LineItem> items;
	
	// Constructors
	public Invoice(Address anAddress)
	{
		this.items = new ArrayList<LineItem>();
		this.billingAddress = anAddress;
	}
	
	// Methods
	/**
	 * Adds a charge for a product to this invoice
	 * @param aProduct the product that the customer ordered
	 * @param quantity the quantity of the product
	 */
	public void addLineItem(Product aProduct, int quantity)
	{
		LineItem anItem = new LineItem(aProduct, quantity);
		this.items.add(anItem);
	}
	
	/**
	 * Adds a charge for a product to this invoice. This product will be
	 * formatted as an abstract item
	 * @param aProduct the product that the customer ordered
	 * @param quantity the quantity of the product
	 */
	public void addAbstractItem(Product aProduct, int quantity)
	{
		AbstractItem anItem = new AbstractItem(aProduct, quantity);
		this.items.add(anItem);
	}
	
	/**
	 * Adds a charge for a product to this invoice (fixed charge)
	 * @param aProduct the product that the customer ordered
	 * @param quantity the quantity of the product
	 */
	public void addFixedChargeItem(Product aProduct, int quantity)
	{
		FixedChargeItem anItem = new FixedChargeItem(aProduct, quantity);
		this.items.add(anItem);
	}
	
	/**
	 * Gets the array list of all the line items
	 * @return line item list
	 */
	public ArrayList<LineItem> getLineItems()
	{
		return this.items;
	}
	
	/**
	 * Gets the billing address
	 * @return the billing address
	 */
	public Address getBillingAddress()
	{
		return this.billingAddress;
	}
	
	/**
	 * Gets the total amount due
	 * @return the amount due
	 */
	public double getTotalAmountDue()
	{
		double amountDue = 0;
		
		for(LineItem item : items)
		{
			amountDue += item.getTotalPrice();
		}
		
		return amountDue;
	}
}
