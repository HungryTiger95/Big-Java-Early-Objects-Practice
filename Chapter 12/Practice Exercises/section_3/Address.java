package section_3;

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
	/**
	 * Formats the address
	 * @return the address as a string with three lines
	 */
	public String format()
	{
		return this.name + " \n" + this.street + "\n" + this.city + "\n" + this.state + "\n" + this.zip;
	}
}
