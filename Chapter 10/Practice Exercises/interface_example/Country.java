package interface_example;

/**
 * A class can implement more than one interface.
 * But a class can only extend (inherit from) a single superclass.
 * 
 * An interface merely specifies the behavior that an implementing class should supply.
 * You can think of an interface as a class in which every method is abstract (naming but not
 * implementing methods, and not having constructors)
 * 
 * 
 * @author Mayuresh
 *
 */
public class Country implements Measurable, Named
{
	private String name;
	private double area;
	
	/**
	 * Constructs a country with a name and area
	 * @param countryName Country name
	 * @param countryArea Country area
	 */
	public Country(String countryName, double countryArea)
	{
		this.name = countryName;
		this.area = countryArea;
	}
	
	/**
	 * Gets the country name
	 * @return the name
	 */
	public String getCountryName()
	{
		return this.name;
	}
	
	/**
	 * Gets the country area
	 * @return the area
	 */
	public double getCountryArea()
	{
		return this.area;
	}
	
	public double getMeasure()
	{
		return area;
	}
	
	public String getName()
	{
		return name;
	}
}
