/**
 * E3.10
 * 
 * Implement a class Product. A product has a name and a price, for example
 * new Product("Toaster", 29.95). Supply methods getName, getPrice, and reducePrice.
 * Supply a program ProductPrinter that makes two products, prints the name and price, reduces
 * their prices by 5.00, and then prints the prices again.
 * 
 * @author Mayuresh
 *
 */

public class Product
{
	// Instance Variables
	private String name;
	private double price;
	
	// Constructors
	/**
	 * Constructs a product with a name and a price
	 * @param productName name of product
	 * @param productPrice price of product
	 */
	public Product(String productName, double productPrice)
	{
		name = productName;
		price = productPrice;
	}
	// Methods
	/**
	 * Gets the price of the product
	 * @return
	 */
	public double getPrice()
	{
		return price;
	}
	
	/**
	 * Gets the name of the product
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Reduces the price of product by an amount
	 * @param amount amount to be reduced
	 */
	public void reducePrice(double amount)
	{
		price = price - amount;
	}
}
