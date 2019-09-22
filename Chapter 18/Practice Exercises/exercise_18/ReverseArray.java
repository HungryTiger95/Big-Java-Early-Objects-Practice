package exercise_18;

import java.util.ArrayList;

/**
 * Provide a static method that reverses the elements of a generic array list.
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
		
		System.out.println("Reversed: " + reverseList(names).toString());
	}
	public static <T> ArrayList<T> reverseList(ArrayList<T> list)
	{
		ArrayList<T> reverseList = new ArrayList<>();
		while(list.size() > 0)
		{
			T element = list.remove(list.size() - 1);
			reverseList.add(element);
		}
		
		return reverseList;
	}
}
