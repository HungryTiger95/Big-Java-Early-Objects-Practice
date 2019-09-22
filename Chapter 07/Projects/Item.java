
public class Item
{
	// Instance Variables
	private double price;
	private boolean isPet;
	private int quantity;
	
	// Constructors
	/**
	 * Constructs an Item object with a price, quantity, and if it is a pet or not
	 * @param price price
	 * @param isPet isPet
	 * @param quantity quantity
	 */
	public Item(double price, boolean isPet, int quantity)
	{
		this.price = price;
		this.isPet = isPet;
		this.quantity = quantity;
	}
	
	// Methods
	/**
	 * Sets the price of the item
	 * @param price price
	 */
    public void setPrice(double price)
    {
    	this.price = price;
    }
    
    /**
     * Sets whether or the item is a pet
     * @param isPet pet or not
     */
    public void setIsPet(boolean isPet)
    {
    	this.isPet = isPet;
    }
    
    /**
     * Sets the quantity of the item
     * @param quantity quantity
     */
    public void setQuantity(int quantity)
    {
    	this.quantity = quantity;
    }
    
    /**
     * Gets the price of the item
     * @return price
     */
    public double getPrice()
    {
    	return price;
    }
    
    /**
     * Gets whether or not the item is a pet
     * @return isPet
     */
    public boolean getIsPet()
    {
    	return isPet;
    }
    
    /**
     * Gets the quantity of the item
     * @return quantity
     */
    public int getQuantity()
    {
    	return quantity;
    }
}
