
public class InvoiceTester
{
	public static void main(String[] args)
	{
		Invoice invoice = new Invoice();
		
		Item item1 = new Item(15.23, false, 2);
		Item item2 = new Item(200.32, false, 4);
		Item item3 = new Item(10.99, false, 4);
		Item item4 = new Item(9.50, false, 1);
		
		invoice.add(item1);
		invoice.add(item2);
		invoice.add(item3);
		invoice.add(item4);
		
		invoice.print();
		
		// Test getItem()
		System.out.printf("\n\n");
		for(int i = 0; i < invoice.getSize(); i++)
		{
			System.out.printf("Item %d:\nPrice: %.2f\nQuantity: %d\nPet?: %b\n\n",
					i + 1, invoice.getItem(i).getPrice(), invoice.getItem(i).getQuantity(),
					invoice.getItem(i).getIsPet());
		}
		
		// Test getTotalPrice, getQuantityTotal, hasBoughtPet
		System.out.printf("\n\nTotal Price: %10.2f\nTotal Quantity: %7d\nBought a Pet: %9b\n", 
				invoice.getPriceTotal(), invoice.getQuantityTotal(), invoice.hasBoughtPet());
	}
}
