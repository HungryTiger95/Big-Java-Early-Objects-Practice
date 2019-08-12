package section_04;

import java.util.Iterator;

public class HashSetDemo
{
	public static void main (String[] args)
	{
		HashSet names = new HashSet(20);
		
		names.add("Harry");
		names.add("Payal");
		names.add("Anika");
		names.add("Diya");
		names.add("Aalia");
		names.add("Aarohi");
		names.add("Sara");
		names.add("Meera");
		names.add("Ridhi");
		names.add("Nidhi");
		names.add("Suhana");
		names.add("Divya");
		
		names.remove("Meera");
		names.remove("Harry");
		
		Iterator iter = names.iterator();
		while(iter.hasNext())
		{
			String name = (String) iter.next();
			System.out.println(name + ": " + name.hashCode());
		}
	}
}
