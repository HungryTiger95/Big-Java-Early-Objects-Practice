package section_3;

import java.util.ArrayList;

/**
 * Describes an invoice for a set of purchased products
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
	public void add(Product aProduct, int quantity)
	{
		LineItem anItem = new LineItem(aProduct, quantity);
		this.items.add(anItem);
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
		
		r = r + String.format("\nAMOUNT DUE: $%8.2f", getAmountDue());
		
		return r;
	}
	
	/**
	 * Gets the total amount due
	 * @return the amount due
	 */
	public double getAmountDue()
	{
		double amountDue = 0;
		for(LineItem item : items)
		{
			amountDue += item.getTotalPrice();
		}
		
		return amountDue;
	}
}
