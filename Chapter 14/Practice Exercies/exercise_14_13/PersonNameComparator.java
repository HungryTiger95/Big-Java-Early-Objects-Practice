package exercise_14_13;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person>
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	@Override
	public int compare(Person a, Person b)
	{
		return a.getName().compareTo(b.getName());
	}
}
