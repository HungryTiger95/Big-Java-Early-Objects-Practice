package exercise_10;

import java.util.ArrayList;
import java.util.List;

/**
 * This class computes permutations of a string.
 * 
 * It is possible to avoid the recursion, but the resulting solution is quite complex, and no faster.
 * Note: Using recursion, you can find all arrangements of a set of objects
 * 
 * Consider this problem. Consider the string "eat". Let's simplify the problem. First, we'll
 * generate all permutations that start with the letter 'e', then those that start with 'a', and
 * finally those that start with 't'. How do we generate the permutations that start with 'e'? We
 * need to know the permutations of the substring "at". But that's the same problem - to generate
 * all permutations - with a simpler input, namely the shorter string "at". Thus, we can use recursion.
 * 
 * The implementation is straightforward. In the permutations method, we loop through all positions in
 * the word to be permuted. for each of them, we compute the shorter word that is obtained by removing
 * the ith letter:
 * 
 * 		String shorter = word.substring(0, i) + word.substring(i + 1);
 * 
 * We compute the permutations of the shorter word:
 * 
 * 		ArrayList<String> shorterPermutations = permutations(shorter);
 * 
 * Finally, we add the removed letter to the front of all permutations of the shorter word.
 * 
 * 		for(String s : shorterPermutations)
 * 		{
 * 			result.add(word.charAt(i) + s);
 * 		}
 * 
 * As always, we have to provide a special case for the simplest strings. The simplest possible
 * string is the empty string, which has a single permutation - itself. We can also improve this
 * code by changing the the base case from:
 * 
 * 		if(word.length() == 0)
 * 		{
 * 			// code
 * 		}
 * 
 * to:
 * 
 * 		if(word.length() <= 1)
 * 		{
 * 			// code
 * 		}
 * 
 * because a word with a single letter is also its sole permutation.
 * 
 * Compare the Permutations and Triangle classes. Both of them work on the same principle. When they
 * work on a more complex input, they first solve the problem for a simpler input. Then they combine
 * the result for the simpler input with additional work to deliver the results for the more complex input.
 * 
 * If you test this code out. Entering a longer string will drastically increase the runtime.
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
