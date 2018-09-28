package project1;

public class SquareSequence implements Sequence
{
	// Instance Variables
	private int n = 0;
	
	// Constructors
	
	// Methods
	/**
	 * Returns the next value
	 */
	public long next()
	{
		n++;
		return n * n; 
	}
}
