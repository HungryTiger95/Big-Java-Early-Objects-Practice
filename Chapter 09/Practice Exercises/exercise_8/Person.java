package exercise_8;

/**
 * Implement a superclass Person. Make two classes, Student and Instructor, that inherit
 * for Person. A person has a name and a year of birth. A student has a major, and
 * an instructor has a salary. Write the class declarations, the constructors, and the
 * methods toString for all classes. Supply a test program that tests these classes and
 * methods.
 * 
 * @author Mayuresh
 *
 */
public class Person
{
	// Instance Variables
	private String name;
	private int birthYear;
	
	// Constructors
	/**
	 * Constructs a Person with a name and a birth year
	 * @param personName name of person
	 * @param personBirthYear birth year of person
	 */
	public Person()
	{
		name = "";
		birthYear = 0;
	}
	
	// Methods
	/**
	 * Gets the name of the Person
	 * @return name of person
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Sets the name of the Person
	 * @param personName name
	 */
	public void setName(String personName)
	{
		name = personName;
	}
	
	/**
	 * Sets the birth year of the Person
	 * @param year year
	 */
	public void setBirthYear(int year)
	{
		birthYear = year;
	}
	
	/**
	 * Gets the name of the Birth Year of the Person
	 * @return birth year of person
	 */
	public int getBirthYear()
	{
		return birthYear;
	}
	
	/**
	 * Returns a string representation for each object
	 */
	public String toString()
	{
		return getClass().getName() + "[Name=" + getName() + "][BirthYear=" + getBirthYear() + "]";
	}
	

}
