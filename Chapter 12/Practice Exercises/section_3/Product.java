package section_3;

/**
 * Describes a product with a description and a price
 * 
 * @author Mayuresh
 *
 */
public class Product
{
	// Instance Variables
	private String description;
	private double price;
	
	// Constructors
	/**
	 * Constructs a product from a description and a price
	 * @param description the product description
	 * @param price the product price
	 */
	public Product(String description, double price)
	{
		this.description = description;
		this.price = price;
	}
	
	// Methods
	/**
	 * Gets the description of the product
	 * @return the description
	 */
	public String getDescritpion()
	{
		return this.description;
	}
	
	/**
	 * Gets the product price
	 * @return the unit price
	 */
	public double getPrice()
	{
		return this.price;
	}
}
