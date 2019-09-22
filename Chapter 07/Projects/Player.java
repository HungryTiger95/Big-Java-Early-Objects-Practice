
public class Player
{
	// Instance Variables
	private String name;
	private String piece;
	
	// Constructors
	public Player(String name, String piece)
	{
		this.name = name;
		this.piece = piece;
	}
	// Methods
	/**
	 * Gets the name of the player
	 * @return name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Gets the piece name of the player
	 * @return piece
	 */
	public String getPiece()
	{
		return piece;
	}
	
	/**
	 * Sets the name of the player
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Sets the piece of the player
	 * @param piece
	 */
	public void setPiece(String piece)
	{
		this.piece = piece;
	}
}
