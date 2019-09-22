package exercise_14_2;

/**
 * Modify the selection sort algorithm to sort an array of coins
 * by their values.
 * 
 * @author Mayuresh
 *
 */
public class Coin
{
	// Instance Variables
	private String name;
	private double value;
	
	// Constructors
	/**
	 * Constructs a coin with a given name and value
	 * @param name the name of the coin
	 * @param value the value of the coin
	 */
	public Coin(String name, double value)
	{
		this.name = name;
		this.value = value;
	}
	
	// Methods
	/**
	 * Gets the name of this coin
	 * @return the name of the coin
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Gets the value of this coin
	 * @return the value of this coin
	 */
	public double getValue()
	{
		return this.value;
	}
	
	/**
	 * Sets the name of this coin
	 * @param coinName the name of this coin
	 */
	public void setName(String coinName)
	{
		this.name = coinName;
	}
	
	/**
	 * Sets the value of this coin
	 * @param coinValue the value of this coin
	 */
	public void setValue(double coinValue)
	{
		this.value = coinValue;
	}
}
