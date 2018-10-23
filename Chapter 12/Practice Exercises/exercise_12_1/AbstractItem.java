package exercise_12_1;

public class AbstractItem extends LineItem
{
	// Instance Variable
	
	// Constructor
	public AbstractItem(Product aProduct, int aQuantity)
	{
		super(aProduct, aQuantity);
	}
	
	// Methods
	/**
	 * Formats this item
	 * @return returns formatted item
	 */
	public String format()
	{
		String description = super.getQuantity() + " " + super.getProduct().getDescription();
		
		return String.format("%-30s%8.2f     %8.2f",
				description, super.getProduct().getPrice(), super.getTotalPrice());
	}
}
