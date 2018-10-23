package exercise_12_3;

/**
 * Describes a mailing address
 * 
 * @author Mayuresh
 *
 */
public class Address
{
	// Instance Variables
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	
	// Constructors
	/**
	 * Constructs a mailing address given the name, street, city, state, and zip code
	 * @param name the recipient name
	 * @param street the street
	 * @param city the city
	 * @param state the two-letter state code
	 * @param zip the ZIP postal code
	 */
	public Address(String name, String street, String city, String state, String zip)
	{
		this.name = name;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	// Methods
	public String getName()
	{
		return this.name;
	}
	
	public String getStreet()
	{
		return this.street;
	}
	
	public String getCity()
	{
		return this.city;
	}
	
	public String getState()
	{
		return this.state;
	}
	
	public String getZIP()
	{
		return this.zip;
	}
}
