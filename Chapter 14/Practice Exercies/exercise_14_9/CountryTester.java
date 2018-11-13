package exercise_14_9;

import java.util.ArrayList;
import java.util.Collections;

public class CountryTester
{
	public static void main(String[] args)
	{
		ArrayList<Country> c = new ArrayList<Country>();
		c.add(new Country("Australia", 150000));
		c.add(new Country("New Zealand", 50000));
		c.add(new Country("China", 300000));
		c.add(new Country("South Africa", 210000));
		
		Collections.sort(c, new CountryAreaComparator());
		
		System.out.println("Sorted:");
		for(int i = 0; i < c.size(); i++)
		{
			System.out.println(c.get(i).toString());
		}
	}
}
