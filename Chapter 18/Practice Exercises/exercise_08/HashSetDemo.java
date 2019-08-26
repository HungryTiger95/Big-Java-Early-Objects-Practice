package exercise_08;

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
		
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < names.length; i++)
		{
			set.add(names[i]);
		}
		System.out.println("Set Length: " + set.getSize());
		System.out.println(set.toString());
		
		SetIterator<String> iter = set.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}
