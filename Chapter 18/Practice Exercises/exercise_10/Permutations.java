package exercise_10;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement a generic version of the permutation generator in Section 13.4. Generate all permutations of a List<E>.
 * 
 * @author Mayuresh
 *
 */
public class Permutations
{
	public static void main(String[] args)
	{
		StopWatch t = new StopWatch();
		List<String> names = new ArrayList<>();
		names.add("Payal");
		names.add("Aarti");
		names.add("Aarohi");
		names.add("Radha");
		names.add("Riya");
		names.add("Maria");
		names.add("Sonu");
		names.add("Pooja");
		names.add("Shraddha");
		
		t.start();
		List<List<String>> permutations = permutations(names);
		t.stop();
		
		for(List<String> s : permutations)
		{
			System.out.println(s.toString());
		}
		
		System.out.println("Time Elapsed: " + t.getElapsedTime() + " Milliseconds");
		System.out.println("Numer of Permutations: " + permutations.size());
	}
	
	/**
	 * Gets all permutations of a given word
	 * @param word the string to permute
	 * @return a list of all permutations
	 */
	public static <E> List<List<E>> permutations(List<E> list)
	{
		// An empty list has a single permutation, the list itself.
		// A list with one element has a single permutation, the lone element
		if(list.size() == 0)
		{
			List<List<E>> result = new ArrayList<List<E>>();
			result.add(new ArrayList<E>());
			return result;
		}
		else
		{
			E firstElement = list.remove(0);
			List<List<E>> returnValue = new ArrayList<List<E>>();
			List<List<E>> permutations = permutations(list);
			
			for(List<E> smallerPermutation : permutations)
			{
				for(int i = 0; i <= smallerPermutation.size(); i++)
				{
					List<E> temp = new ArrayList<E>(smallerPermutation);
					temp.add(i, firstElement);
					returnValue.add(temp);
				}
			}
			return returnValue;
		}
	}
}
