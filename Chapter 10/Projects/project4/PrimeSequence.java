package project4;

/**
 * 
 * @author Mayuresh
 *
 */
public class PrimeSequence implements Sequence
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
		int num = n;
		n++;
		
		return num;
	}
	
	@Override
	/**
	 * Checks if there is another value
	 */
	public boolean hasNext()
	{
		// Do Nothing
		return false;
	}
}
