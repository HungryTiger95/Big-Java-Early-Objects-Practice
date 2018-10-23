package exercise_12_1;

import java.util.ArrayList;

/**
 * Describes an invoice for a set of purchased products
 * 
 * Enhance the invoice-printing class by providing for two kinds of line items: One
 * kind describes products that are purchased in certain numerical quantities (such as
 * "3 Toasters"), another describes a fixed charge (such as "Shipping: $5.00). Hint: Use
 * inheritance. Produce a UML diagram of your modified implementation.
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
	 * Formats the invoice
	 * @return the formatted invoice
	 */
	public String format()
	{
		String r = "                      I N V O I C E\n\n"
				+ billingAddress.format()
				+ String.format("\n\n%-30s%8s%5s%8s\n", "Description", "Price", "Qty", "Total");
		
		for(LineItem item : items)
		{
			r = r + item.format() + "\n";
		}
		
		r = r + String.format("\nAMOUNT DUE: $%8.2f", getTotalAmountDue());
		
		return r;
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
