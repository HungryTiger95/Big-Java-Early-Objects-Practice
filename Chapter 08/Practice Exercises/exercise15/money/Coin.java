package exercise15.money;

public class Coin
{
	// Instance Variables
	private double coinValue;
	private String coinName;
	
	// Constructors
	/**
	 * Constructs an object Coin with a value and a name
	 * @param value value of the coin
	 * @param name name of the coin
	 */
	public Coin(double value, String name)
	{
		coinValue = value;
		coinName = name;
	}
	
	// Methods
	/**
	 * Gets the value of the coin
	 * @return the value
	 */
	public double getCoinValue()
	{
		return coinValue;
	}
	
	/**
	 * Gets the name of the coin
	 * @return the name
	 */
	public String getCoinName()
	{
		return coinName;
	}
}
