package section_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class CollectionsDemo
{
	public static void main(String[] args)
	{
		System.out.println("Working with an ArrayList");
		workWith(new ArrayList<String>());
		
		System.out.println();
		
		System.out.println("Working with a TreeSet");
		workWith(new TreeSet<String>());
	}
	
	public static void workWith(Collection<String> col)
	{
		col.add("Harry");
		col.add("Sally");
		col.add("Fred");
		col.add("Wilman");
		col.add("Harry");
		
		System.out.println(col);
		System.out.print("Removing Harry and Tom: ");
		System.out.print(col.remove("Harry") + " ");
		System.out.println(col.remove("Tom"));
		
		System.out.print("Looking for Harry and Sally: ");
		System.out.print(col.contains("Harry") + " ");
		System.out.println(col.contains("Sally"));
		
		for(String s : col)
		{
			System.out.println(s);
		}
	}
}
