package exercise_14;

import java.util.ArrayList;

public class AppendLists
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<>();
		names.add("Katrina");
		names.add("Payal");
		names.add("Pooja");
		names.add("Aarti");
		System.out.println("Names: " + names.toString());
		
		ArrayList<String> lastNames = new ArrayList<>();
		lastNames.add("Patel");
		lastNames.add("Rao");
		lastNames.add("Shah");
		lastNames.add("Mehta");
		System.out.println("Last Names: " + lastNames.toString());
		
		append(names, lastNames);
		System.out.println("Appended: " + names.toString());
	}
	
	/**
	 * Given two lists, appends the second onto the end of the first
	 * @param <T> the type of elements in the lists
	 * @param a first list
	 * @param b second list
	 */
	public static <T> void append(ArrayList<T> a, ArrayList<T> b)
	{
		for(T element : b)
		{
			a.add(element);
		}
	}
}
