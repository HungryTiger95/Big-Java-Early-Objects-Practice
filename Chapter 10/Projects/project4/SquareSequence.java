package project4;

public class SquareSequence implements Sequence
{
	// Instance Variables
	private int n = 0;
	
	// Constructors
	
	// Methods
	@Override
	/**
	 * Gets the next value
	 */
	public int next()
	{
		n++;
		return n * n; 
	}
	
	@Override
	/**
	 * Checks if there are anymore values
	 */
	public boolean hasNext()
	{
		// Do Nothing
		return false;
	}
}
