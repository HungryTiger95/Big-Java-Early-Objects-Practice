
public class FactorGenerator
{
	// Instance Variables
	private int factor;
	private int number;
	private boolean done;
	
	// Constructors
	/**
	 * Constructs a Factor Generator with a given number to factor
	 * @param numberToFactor number to factor
	 */
	public FactorGenerator(int numberToFactor)
	{
		this.number = numberToFactor;
		this.factor = 1;
	}
	// Methods
	/**
	 * Returns the next factor
	 * @return factor
	 */
	public int nextFactor()
	{
		return factor++;
	}
	
	/**
	 * Check to see if there are more factors
	 * @return hasMoreFactors
	 */
	public boolean hasMoreFactors()
	{
		boolean hasMoreFactors = false;
		done = false;
		
		if(factor < number)
		{
			while(!done)
			{
				if(number % factor != 0)
				{
					factor++;
				}
				else
				{
					done = true;
					hasMoreFactors = true;
				}
			}
		}
		
		return hasMoreFactors;
	}
}
