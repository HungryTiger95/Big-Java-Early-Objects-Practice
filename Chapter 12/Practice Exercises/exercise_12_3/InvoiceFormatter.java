package exercise_12_3;

import java.util.ArrayList;

public class InvoiceFormatter
{
	// Instance Variables
	private Invoice invoice;
	
	// Constructors
	/**
	 * Constructs an invoice formatter with a given invoice
	 * @param invoice the invoice to format
	 */
	public InvoiceFormatter(Invoice invoice)
	{
		this.invoice = invoice;
	}
	
	// Methods
	/**
	 * Formats the invoice
	 * @return the formatted invoice
	 */
	public String formatInvoice()
	{
		
		String r = String.format("%35s\n\n", "I N V O I C E") +
				formatBillingAddress() +
				formatCategories() +
				formatLineItems(invoice.getLineItems()) +
				formatTotalDue();
		
		return r;
	}
	
	/**
	 * Formats the billing address
	 * @param billingAddress the billing address
	 * @return the formatted billing address
	 */
	public String formatBillingAddress()
	{
		return this.invoice.getBillingAddress().getName() + "\n" +
				this.invoice.getBillingAddress().getStreet() + "\n" + 
				this.invoice.getBillingAddress().getCity() + "\n" + 
				this.invoice.getBillingAddress().getState() + "\n" + 
				this.invoice.getBillingAddress().getZIP();
	}
	
	/**
	 * Formats the categories
	 * @return the formatted categories
	 */
	public String formatCategories()
	{
		return String.format("\n\n%-30s%10s%8s%10s\n", "Description", "Price", "Qty", "Total");
	}
	
	/**
	 * Formats the Line Items
	 * @param itemList the list of line items
	 * @return the formatted line items
	 */
	public String formatLineItems(ArrayList<LineItem> itemList)
	{
		String lineItems = "";
		
		for(LineItem item : invoice.getLineItems())
		{
			if(item.getClass().getSimpleName().equals("AbstractItem"))
			{
				lineItems += String.format("%-30s%10.2f%18.2f\n",
						item.getQuantity() + " " + item.getProduct().getDescription() + "(s)",
						item.getProduct().getPrice(),
						item.getTotalPrice());
			}
			else if(item.getClass().getSimpleName().equals("FixedChargeItem"))
			{
				lineItems += String.format("%-48s%10.2f\n",
						item.getProduct().getDescription(),
						item.getTotalPrice());
			}
			else
			{
				lineItems += String.format("%-30s%10.2f%7d%11.2f\n",
						item.getProduct().getDescription(),
						item.getProduct().getPrice(),
						item.getQuantity(),
						item.getTotalPrice());
			}
		}
		
		return lineItems;
	}
	
	/**
	 * Formats the total amount due
	 * @return the formatted total due
	 */
	public String formatTotalDue()
	{
		return String.format("\nAMOUNT DUE: $%8.2f", invoice.getTotalAmountDue());
	}
}
