package exercise_12_1;

/**
 * Describes a quantity of an article to purchase
 * 
 * @author Mayuresh
 *
 */
public class LineItem
{
	// Instance Variables
	private int quantity;
	private Product product;
	
	// Constructors
	/**
	 * Constructs an item from the product and quantity
	 * @param aProduct the product
	 * @param quantity the item quantity
	 */
	public LineItem(Product aProduct, int quantity)
	{
		this.product = aProduct;
		this.quantity = quantity;
	}
	
	// Methods
	/**
	 * Computes the total price of this line item
	 * @return the total price
	 */
	public double getTotalPrice()
	{
		return getProduct().getPrice() * getQuantity();
	}
	
	/**
	 * Gets the product in this line item
	 * @return the product
	 */
	public Product getProduct()
	{
		return this.product;
	}
	
	/**
	 * Gets the quantity of the product in this line item
	 * @return the quantity of the product
	 */
	public int getQuantity()
	{
		return this.quantity;
	}
	
	/**
	 * Formats this item
	 * @return a formatted string of this item
	 */
	public String format()
	{
		return String.format("%-30s%8.2f%5d%8.2f",
				this.product.getDescription(), this.product.getPrice(), this.quantity, this.getTotalPrice());
	}
}
