import java.util.ArrayList;

public class Invoice
{
	// Instance Variables
	private ArrayList<Item> itemList = new ArrayList<Item>();
	
	// Constructors
	/**
	 * Constructs an empty Invoice object
	 */
	public Invoice()
	{
		
	}
	
	// Methods
	/**
	 * Adds an item to the invoice
	 * @param anItem Item
	 */
	public void add(Item anItem)
	{
		itemList.add(anItem);
	}
	
	/**
	 * Gets the discount earned
	 * @return
	 */
	public double getDiscount()
	{
		double discount;
		double eligPrice = 0;
		
		// Check whether the customer bought a pet and at least 5 items
		if(hasBoughtPet() && getQuantityTotal() >= 5)
		{
			for(int i = 0; i < getSize(); i++)
			{
				if(getItem(i).getIsPet() == false)
				{
					eligPrice = eligPrice + getItem(i).getPrice();
				}
			}
			
			discount = (0.20 * eligPrice);
		}
		else
		{
			discount = 0;
		}
		
		return discount;
	}
	
	/**
	 * Gets an item from the invoice
	 * @param i index
	 * @return item
	 */
	public Item getItem(int i)
	{
		return itemList.get(i);
	}
	
	/**
	 * Gets the size of the list
	 * @return size
	 */
	public int getSize()
	{
		return itemList.size();
	}
	
	/**
	 * Gets the total price of items
	 * @return priceTotal
	 */
	public double getPriceTotal()
	{
		double priceTotal = 0;
		
		for(int i = 0; i < getSize(); i++)
		{
			
			priceTotal = priceTotal + getItem(i).getPrice();
		}
		
		return priceTotal;
	}
	
	/**
	 * Gets the total number of items bought
	 * @return quantityTotal
	 */
	public int getQuantityTotal()
	{
		int quantityTotal = 0;
		
		for(int i = 0; i < getSize(); i++)
		{
			quantityTotal = quantityTotal + getItem(i).getQuantity();
		}
		
		return quantityTotal;
	}
	
	/**
	 * Checks whether the customer bought a pet from the total invoice
	 * @return hasPet
	 */
	public boolean hasBoughtPet()
	{
		boolean hasPet = false;
		
		for(int i = 0; i < getSize(); i++)
		{
			if(getItem(i).getIsPet() == true)
			{
				hasPet = true;
			}
		}
		
		return hasPet;
	}
	
	/**
	 * Checks whether or not the customer got a discount
	 * @return discount
	 */
	public boolean hasDiscount()
	{
		if(getDiscount() == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	/**
	 * Prints all of the elements in the invoice
	 */
	public void print()
	{
		System.out.printf("%38s\n%35s\n%38s\n", "=============", "Invoice", "=============");
		
		for(int i = 1; i < getSize() + 1; i++)
		{
			System.out.print("Item " + i + ": ----->");
			System.out.printf("Price: %10.2f IsPet: %10b Quantity: %10d\n",
					getItem(i - 1).getPrice(), getItem(i - 1).getIsPet(), getItem(i - 1).getQuantity());
		}
		
		double subtotal = 0;
		
		if(hasDiscount())
		{
			subtotal = getPriceTotal() - getDiscount();
		}
		else
		{
			subtotal = getPriceTotal();
		}
		
		System.out.printf("\nDiscount: %53.2f\nSubtotal: %53.2f\nTotal Items Sold: %45d",
				getDiscount(), subtotal, getQuantityTotal());
	}
}
