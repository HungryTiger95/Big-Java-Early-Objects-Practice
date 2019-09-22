package exercise_14_13;

/**
 * Supply a class Person that implements the Comparable interface. Compare Persons by their names.
 * Ask the user to input ten names an generate ten Person objects. Using the compareTo method,
 * determine the first and last person among them and print them out.
 * 
 * 
 * I did this differently here. I simply created 10 Persons and used a comparator to do the
 * sorting. I implemented comparable but didn't use it.
 * 
 * @author Mayuresh
 *
 */
public class Person implements Comparable<Person>
{
	// Instance Variables
	private String name;
	private int age;
	
	// Constructors
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	// Methods
	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	@Override
	public int compareTo(Person p)
	{
		return this.name.compareTo(p.getName());
	}
	
	public String toString()
	{
		return this.getClass().getName() + "[name=" + this.name + "][age=" + this.age + "]";
	}
}
