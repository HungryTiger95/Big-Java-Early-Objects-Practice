package exercise_17;

import java.util.Iterator;

/**
 * Debug to show that when hasNext is called, a search happens. And then when
 * next is called, another search happens.
 * 
 * @author Mayuresh
 *
 */
public class HashSetDemo
{
	public static void main(String[] args)
	{
		String[] names = {"Harry", "Mike", "Aarohi", "Payal", "Naina", "Sameera",
				"Meena", "Marcus", "Michael", "Corina", "Tina", "Reema", "Alisha", "Ankita"};
		System.out.println("Names Array Length: " + names.length);
		
		HashSet set = new HashSet(names.length);
		for(int i = 0; i < names.length; i++)
		{
			set.add(names[i]);
		}
		System.out.println("Set Length: " + set.size());
		System.out.println(set.toString());
		
		Iterator iter = set.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}
