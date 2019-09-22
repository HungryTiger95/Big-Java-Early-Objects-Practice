/**
 * E3.1/ E3.2
 * 
 * Add a button to the tally counter that allows an operator to undo an accidental button click.
 * Provide a method public void undo(). As an added precaution, make sure that clicking the
 * undo button more often than the click button has no effect.
 * 
 * Simulate a tally counter that can be used to admit a limited number of people. First, the limit
 * is set with a call public void setLimit(int maximum). If the click button is clicked more often
 * than the limit, it has no effect.
 * 
 * @author Mayuresh
 *
 */

public class Counter
{
	// Instance Variables
	private int value;
	private int limit;
	
	// Constructors
	/**
	 * Creates a counter with initial count at 0
	 */
	public Counter()
	{
		value = 0;
	}
	
	/**
	 * Creates a counter with a supplied initial count
	 * @param count starting value of Counter object
	 */
	public Counter(int count)
	{
		value = count;
	}
	
	// Methods
	/**
	 * Gets the current value of the counter.
	 * @return the current value
	 */
	public int getValue()
	{
		return value;
	}
	
	/**
	 * Advances the counter by 1
	 */
	public void click()
	{
		value++;
		value = Math.min(value, limit);
	}
	
	/**
	 * Resets the counter to 0
	 */
	public void reset()
	{
		value = 0;
	}
	
	/**
	 * Retreats the counter by 1
	 */
	public void undo()
	{
		value--;
		value = Math.max(value, 0);
	}
	
	/**
	 * Sets a limit on the maximum number of advances of the Counter
	 * @param maximum Max value Counter can have
	 */
	public void setLimit(int maximum)
	{
		limit = maximum;
	}
	
	
}
