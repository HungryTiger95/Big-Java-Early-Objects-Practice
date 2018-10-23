package exercise_12_3;

public class InvoicePrinter
{
	public static void main(String[] args)
	{
		Address myAddress = new Address("Sam's Small Appliances", "100 Main Street", "Anytown", "CA", "98765");
		
		Invoice samsInvoice = new Invoice(myAddress);
		
		samsInvoice.addLineItem(new Product("Toaster", 29.95), 2);
		samsInvoice.addLineItem(new Product("Pencil Case", 5.95), 1);
		samsInvoice.addLineItem(new Product("Water Bottle", 12.95), 1);
		samsInvoice.addLineItem(new Product("Cookie Pack", 1.50), 4);
		
		samsInvoice.addAbstractItem(new Product("Phone Case", 10.00), 1);
		samsInvoice.addAbstractItem(new Product("Pencil Eraser", 1.00), 5);
		
		samsInvoice.addFixedChargeItem(new Product("Shipping Charge", 5.00), 1);
		
		InvoiceFormatter formatter = new InvoiceFormatter(samsInvoice);
		System.out.println(formatter.formatInvoice());
	}
}
