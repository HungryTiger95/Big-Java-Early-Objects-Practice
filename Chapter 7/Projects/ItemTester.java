
public class ItemTester
{
	public static void main(String[] args)
	{
		Item item1 = new Item(15.23, false, 2);
		
		System.out.println("Item 1: ");
		System.out.printf("Price: %10.2f IsPet: %10b Quantity: %10d\n\n", item1.getPrice(), item1.getIsPet(), item1.getQuantity());
		
		Item item2 = new Item(18.23, true, 1);
		
		System.out.println("Item 2: ");
		System.out.printf("Price: %10.2f IsPet: %10b Quantity: %10d\n\n", item2.getPrice(), item2.getIsPet(), item2.getQuantity());
		
		item1.setIsPet(true);
		item2.setPrice(2.73);
		item1.setQuantity(4);
		item2.setIsPet(false);
		
		System.out.println("Item 1: ");
		System.out.printf("Price: %10.2f IsPet: %10b Quantity: %10d\n\n", item1.getPrice(), item1.getIsPet(), item1.getQuantity());
		
		System.out.println("Item 2: ");
		System.out.printf("Price: %10.2f IsPet: %10b Quantity: %10d\n\n", item2.getPrice(), item2.getIsPet(), item2.getQuantity());
	}
	
}
