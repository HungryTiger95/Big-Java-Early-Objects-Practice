package exercise_10_3;

/**
 * A person has a name and a height in centimeters. Use the Data class to process an array of Person objects.
 * Display the average height and the name of the tallest person.
 * 
 * @author Mayuresh
 *
 */
public class Person implements Measurable
{
	// Instance Variables
	private double height;
	private String name;
	
	// Constructors
	/**
	 * Constructs a person with a height in centimeters and a name
	 * @param height height in centimeters
	 * @param name name
	 */
	public Person(double height, String name)
	{
		this.height = height;
		this.name = name;
	}
	
	// Methods
	@Override
	public double getMeasure()
	{
		return height;
	}
	
	/**
	 * Gets the height of the person
	 * @return the height
	 */
	public double getHeight()
	{
		return height;
	}
	
	/**
	 * Gets the name of the person
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
}
