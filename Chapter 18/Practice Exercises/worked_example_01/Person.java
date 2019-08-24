package worked_example_01;

public class Person implements Comparable<Person>
{
	private String name;
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return getClass().getName() + "[name=" + this.name + "]";
	}
	
	public int compareTo(Person other)
	{
		return name.compareTo(other.name);
	}
}
