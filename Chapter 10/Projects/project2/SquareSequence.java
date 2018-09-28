package project2;

public class SquareSequence implements Sequence
{
	// Instance Variables
	private int n = 0;
	
	// Constructors
	
	// Methods
	/**
	 * Gets the next integer
	 */
	public int next()
	{
		n++;
		return n * n; 
	}
}
