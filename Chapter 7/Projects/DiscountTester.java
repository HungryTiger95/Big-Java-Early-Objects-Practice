
/**
 * A pet shop wants to give a discount to its clients if they buy one or more
 * pets and at least five other items. The discount is equal to 20 percent of
 * the cost of the other items, but not the pets.
 * 
 * Use a class Item to describe an items, with any needed methods and a constructor:
 * 
 * 		public Item(double price, boolean isPet, int quantity)
 * 
 * An invoice holds a collection of Item objects; use an array or array list to
 * store them. In the Invoice class, implement methods
 * 
 * 		public void add(Item anItem)
 * 		public double getDiscount()
 * 
 * Write a program that prompts a cashier to enter each price and quantity,
 * and then a Y for a pet or N for another item. Use a price of -1 as a sentinel.
 * In the loop, call the add method; after the loop, call the getDiscount method
 * and display the returned value.
 * 
 * @author Mayuresh
 *
 */
public class DiscountTester
{
	public static void main(String[] args)
	{
		Invoice invoice = new Invoice();
		
		Item item1 = new Item(10.99, false, 1);
		Item item2 = new Item(10.50, false, 1);
		Item item3 = new Item(30.23, false, 2);
		Item item4 = new Item(15.20, false, 1);
		
		invoice.add(item1);
		invoice.add(item2);
		invoice.add(item3);
		invoice.add(item4);
		
		invoice.print();
		
	}
}
