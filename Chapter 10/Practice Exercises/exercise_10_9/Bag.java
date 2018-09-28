package exercise_10_9;

import java.util.ArrayList;

/**
 * Implement a class Bag that stores items represented as string. Items can be repeated. Supply methods
 * for adding an item, and for counting how many times an item has been added:
 * 
 * 			public void add(String itemName)
 * 			public int count(String itemName)
 * 
 * Your Bag class should store the data in an ArrayList<Item>, where Item is an inner class with two instance
 * variables: the name of the item and the quantity.
 * 
 * @author Mayuresh
 *
 */
public class Bag
{
	// Instance Variables
	private ArrayList<Item> bagContent;
	
	// Constructors
	/**
	 * Constructs a Bag with an array list of Items
	 */
	public Bag()
	{
		bagContent = new ArrayList<Item>();
	}
	
	// Methods
	/**
	 * Adds an item to the bag
	 * @param itemName an item
	 */
	public void add(String itemName)
	{
		Item newItem = new Item(itemName);
		bagContent.add(newItem);
	}
	
	/**
	 * Counts how many items there are of an item name
	 * @param itemName name of item
	 * @return how many of an item there is in the Bag
	 */
	public int count(String itemName)
	{
		int itemCount = 0;
		
		for (int i = 0; i < bagContent.size(); i++)
		{
			if(bagContent.get(i).getName().equals(itemName))
			{
				itemCount++;
			}
		}
		
		return itemCount;
	}
	
	// Inner Classes
	static class Item
	{
		// Instance Variables
		private String itemName;
		
		// Constructors
		/**
		 * Constructs an Item with a name
		 * @param itemName name of Item
		 */
		public Item(String itemName)
		{
			this.itemName = itemName;
		}
		
		// Methods
		/**
		 * Gets the name of the Item
		 * @return name of item
		 */
		public String getName()
		{
			return itemName;
		}
	}
}
