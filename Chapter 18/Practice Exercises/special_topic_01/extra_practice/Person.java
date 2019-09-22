package special_topic_01.extra_practice;

public class Person implements Comparable<Person>
{
	private String name;
	
	public Person(String name)
	{
		this.name = name;
	}
	
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
		return getClass().getName() + "[name=" + this.name + "]";
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
