package exercise_12_1;

public class FixedChargeItem extends LineItem
{
	// Instance Variables
	private Product theProduct;
	
	// Constructors
	/**
	 * Constructs a Fixed Charge Item
	 * @param aProduct the fixed charge 
	 */
	public FixedChargeItem(Product aProduct, int aQuantity)
	{
		super(aProduct, aQuantity);
		this.theProduct = aProduct;
	}
	
	// Methods
	/**
	 * Formats this item
	 * @return returns formatted item
	 */
	public String format()
	{
		return String.format("%-43s%8.2f", theProduct.getDescription(), getTotalPrice());
	}
}
