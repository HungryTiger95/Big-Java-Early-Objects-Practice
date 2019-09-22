package exercise_19;

import java.util.ArrayList;

/**
 * Provide a static method that returns the reverse of a generic array list, without modifying the original list.
 * 
 * @author Mayuresh
 *
 */
public class ReverseArray
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<>();
		names.add("Aarohi");
		names.add("Lisa");
		names.add("Maanvi");
		names.add("Payal");
		names.add("Aarti");
		System.out.println("Original: " + names.toString());
		
		System.out.println("\nReversed: " + reverseList(names).toString());
		System.out.println("Original: " + names.toString());
	}
	public static <T> ArrayList<T> reverseList(ArrayList<T> list)
	{
		ArrayList<T> reverseList = new ArrayList<>();
		for(int i = list.size() - 1; i >= 0; i--)
		{
			reverseList.add(list.get(i));
		}
		
		return reverseList;
	}
}
