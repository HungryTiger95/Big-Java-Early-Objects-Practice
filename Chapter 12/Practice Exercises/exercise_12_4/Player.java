package exercise_12_4;

public class Player
{
	// Instance Variables
	private String name;
	private int points;
	private int tries;
	
	// Constructors
	/**
	 * Constructs a player with a given name
	 * @param name the name of the player
	 */
	public Player(String name)
	{
		this.name = name;
		this.points = 0;
		this.tries = 3;
	}
	
	// Methods
	/**
	 * Sets the name of the player
	 * @param name the name of the player
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Gets the name of the player
	 * @return the name of the player
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Sets the number of points for this player
	 * @param points the points to be set
	 */
	public void setPoints(int points)
	{
		this.points = points;
	}
	
	/**
	 * Adds points to the player
	 * @param points the number of points to be added
	 */
	public void addPoints(int points)
	{
		this.points += points;
	}
	
	/**
	 * Adds a single point to the player
	 */
	public void addPoint()
	{
		this.points++;
	}
	
	/**
	 * Gets the number of points this player has
	 * @return
	 */
	public int getPoints()
	{
		return this.points;
	}
	
	/**
	 * Sets the number of tries this player has
	 * @param tries the number of tries
	 */
	public void setTries(int tries)
	{
		this.tries = tries;
	}
	
	/**
	 * Decrements tries by one
	 */
	public void decrementTries()
	{
		this.tries--;
	}
	
	/**
	 * Resets the number of tries back to 3
	 */
	public void resetTries()
	{
		this.tries = 3;
	}
	
	/**
	 * Gets the number of tries this player has
	 * @return the number of tries this player has
	 */
	public int getTries()
	{
		return this.tries;
	}
}
