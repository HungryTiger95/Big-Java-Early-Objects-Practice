package exercise_14_9;

import java.util.Comparator;

public class CountryAreaComparator implements Comparator<Country>
{
	public int compare(Country a, Country b)
	{
		if(a.getArea() < b.getArea())
		{
			return 1;
		}
		else if(a.getArea() == b.getArea())
		{
			return 0;
		}
		else
		{
			return -1;
		}
	}
}
