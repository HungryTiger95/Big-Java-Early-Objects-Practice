package project2;

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
	public int next()
	{
		int num = n;
		n++;
		
		return num;
	}
		
}
