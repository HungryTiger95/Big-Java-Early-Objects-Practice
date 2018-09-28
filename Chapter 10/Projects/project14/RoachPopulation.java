package project14;

/**
 * Models the increase in roach population assuming the population doubles exactly each time
 * the method is called
 * 
 * @author Mayuresh
 *
 */
class RoachPopulation
{
	// Instance Variables
	private double roachPopulation;
	
	// Constructors
	/**
	 * Constructs a roach population with an initial population
	 * @param initialPopulation the initial population
	 */
	public RoachPopulation(double initialPopulation)
	{
		this.roachPopulation = initialPopulation;
	}
	
	// Methods
	/**
	 * Doubles the roach population
	 */
	public void doublePopulation()
	{
		this.roachPopulation *= 2;
	}
	
	/**
	 * Gets the current roach population
	 * @return the roach population
	 */
	public double getPopulation()
	{
		return this.roachPopulation;
	}
}
