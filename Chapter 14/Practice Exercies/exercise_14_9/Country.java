package exercise_14_9;

/**
 * Write a program that sorts an ArrayList<Country> in decreasing order so that
 * the largest country is at the beginning of the array. Use a Comparator.
 * 
 * @author Mayuresh
 *
 */
public class Country
{
	// Instance Variables
	private String name;
	private int area;
	
	// Constructors
	/**
	 * Constructs a country with a given name and area
	 * @param countryName the name of the country
	 * @param countryArea the area of the country
	 */
	public Country(String countryName, int countryArea)
	{
		this.name = countryName;
		this.area = countryArea;
	}
	
	// Methods
	/**
	 * Gets the name of the country
	 * @return the name
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Gets the area of the country
	 * @return the area
	 */
	public int getArea()
	{
		return this.area;
	}
	
	/**
	 * Compares the area of this country and another
	 * @param otherObject the other object to compare to
	 * @return returns -1 is this objects area is less than
	 * the other objects area, 0 if both areas are the same,
	 * 1 if this area is more than the other objects area
	 */
	public int compareTo(Object otherObject)
	{
		Country other = (Country) otherObject;
		
		if(this.area < other.getArea())
		{
			return -1;
		}
		else if(this.area == other.getArea())
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	
	/**
	 * Returns the string representation of this object
	 */
	public String toString()
	{
		return getClass().getName() + "[name=" + this.name + "][area=" + this.area + "]";
	}
}
