/**
 * P3.7
 * 
 * Implement a class RoachPopulation that simulates the growth of a roach population.
 * The constructor takes the size of the initial roach population. the breed method
 * simulates a period in which the roaches breed, which doubles their population. The
 * spray(double percent) method simulates spraying with insecticide, which reduces the
 * population by the given percentage. The getRoaches method returns the current number
 * of roaches. A program called RoachSimulation simulates a population that starts
 * out with 10 roaches. Breed, spray to reduce the population by 10 percent, and print
 * the roach count. Repeat three more times.
 * 
 * @author Mayuresh
 *
 */

public class RoachPopulation
{
	// Instance Variables
	private double populationSize;
	
	// Constructors
	/**
	 * Constructs a RoachPopulation object with a given initial population
	 * @param initialPop initial population
	 */
	public RoachPopulation(int initialPop)
	{
		populationSize = initialPop;
	}
	
	// Methods
	/**
	 * Breeds the population of roaches and doubles
	 * population size
	 */
	public void breed()
	{
		populationSize = populationSize * 2;
	}
	
	/**
	 * Kills off the population by a certain percentage
	 * @param byPercent percent to kill off
	 */
	public void spray(double byPercent)
	{
		double percent = byPercent / 100.0;
		populationSize = populationSize - (populationSize * percent);
	}
	
	/**
	 * Gets the roach population
	 * @return roach population
	 */
	public double getRoachPopulation()
	{
		return populationSize;
	}
	
	
}
