package exercise_15;

public class Person implements Comparable<Person>
{
	// Instance Variables
	private String name;
	
	// Constructors
	public Person(String name)
	{
		this.name = name;
	}
	
	// Methods
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return "[name=" + this.name + "]";
	}
	
	public int compareTo(Person other)
	{
		if(this.name.compareTo(other.name) < 0)
		{
			return  -1;
		}
		else if(this.name.compareTo(other.name) > 0)
		{
			return 1;
		}
		else
			return 0;
	}
}
