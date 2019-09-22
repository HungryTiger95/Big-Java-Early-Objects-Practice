package exercise_14_5;

/**
 * Write a telephone lookup program. Read a data set of 1,000 names and telephone numbers from a file that
 * contains the numbers in random order. Handle lookups by name and also reverse lookups by phone number.
 * Use a binary search for both lookups.
 * 
 * @author Mayuresh
 *
 */
public class TelephoneEntry
{
	// Instance Variables
	private String name;
	private long number;
	
	// Constructors
	/**
	 * Constructs a telephone entry with a given name and number
	 * @param name the name
	 * @param number the number
	 */
	public TelephoneEntry(String name, long number)
	{
		this.name = name;
		this.number = number;
	}
	
	// Methods
	/**
	 * Gets the name of the person that the telephone entry belongs to
	 * @return the name
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Gets the number of the person that the telephone entry belongs to
	 * @return the number
	 */
	public long getNumber()
	{
		return this.number;
	}
	
	/**
	 * Returns the string representation of the telephone entry
	 */
	public String toString()
	{
		return this.getClass().getName() + "[name=" + this.name + "][number=" + this.number + "]";
	}
}
