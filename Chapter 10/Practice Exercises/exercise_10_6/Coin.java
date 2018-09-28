package exercise_10_6;

/**
 * Modify the Coin class to have it implement the Comparable interface.
 * 
 * @author Mayuresh
 *
 */
public class Coin implements Comparable
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
	
	public int compareTo(Object otherObject)
	{	
		Coin other = (Coin) otherObject;
		
		if (coinValue < other.coinValue)
		{
			return -1;
		}
		else if(coinValue > other.coinValue)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
