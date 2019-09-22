package exercise1;

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
	 * @return value of the coin
	 */
	public double getCoinValue()
	{
		return coinValue;
	}
	
	/**
	 * Gets the name of the coin
	 * @return name of the coin
	 */
	public String getCoinName()
	{
		return coinName;
	}
	
	/**
	 * Sets the value of the coin
	 * @param value value of the coin
	 */
	public void setCoinValue(double value)
	{
		this.coinValue = value;
	}
	
	/**
	 * Sets the name of the coin
	 * @param name name of the coin
	 */
	public void setCoinName(String name)
	{
		this.coinName = name;
	}
}
