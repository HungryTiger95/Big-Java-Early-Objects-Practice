package section_3;

public class InvoicePrinter
{
	public static void main(String[] args)
	{
		Address myAddress = new Address("Sam's Small Appliances", "100 Main Street", "Anytown", "CA", "98765");
		
		Invoice samsInvoice = new Invoice(myAddress);
		samsInvoice.add(new Product("Toaster", 29.95), 2);
		samsInvoice.add(new Product("Hair Dryer", 49.95), 1);
		samsInvoice.add(new Product("Car Vacuum", 19.95), 1);
		
		System.out.println(samsInvoice.format());
	}
}
