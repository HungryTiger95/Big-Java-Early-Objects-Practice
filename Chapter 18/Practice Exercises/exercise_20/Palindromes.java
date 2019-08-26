package exercise_20;

import java.util.ArrayList;
import java.util.List;

/**
 * Sometimes it is easier to find a recursive solution if you make a slight change to
 * the original problem. Then the original problem can be solved by calling a recursive
 * helper method.
 * 
 * Here is a typical example: In the palindrome test of How To 13.1, it is a bit
 * inefficient to construct new string objects in every step. Instead of testing
 * whether the entire sentence is a palindrome, let's check whether a substring
 * is a palindrome.
 * 
 * In the recursive calls, simply adjust the start and end parameter variables
 * to skip over matching letter pairs and characters that are not letters.
 * 
 * You should stil supply a method to solve the whole problem - the user of your
 * method shouldn't have to know about the trick with the substring positions.
 * 
 * Note that this call is not a recursive method call. The isPalindrome(String)
 * method calls the helper method isPalindrome(String, int, int). In this example,
 * we use over-loading to declare two methods with the same name. If you prefer, you
 * can avoid overloaded method by choosing different name for the helper method, such
 * as substringIsPalindrome.
 * 
 * Use the technique of recursive helper methods whenever it is easier to solve a
 * recursive problem that is equivalent to the original problem.
 * 
 * @author Mayuresh
 *
 */
public class Palindromes
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<>();
		names.add("Aarohi");
		names.add("Lisa");
		names.add("Maanvi");
		names.add("Payal");
		names.add("Aarti");
		System.out.println("List: " + names.toString());
		System.out.println("Palindrome: " + isPalindrome(names));
		
		
		ArrayList<String> names2 = new ArrayList<>();
		names2.add("Aarohi");
		names2.add("Lisa");
		names2.add("Maanvi");
		names2.add("Lisa");
		names2.add("Aarohi");
		System.out.println("\nList: " + names2.toString());
		System.out.println("Palindrome: " + isPalindrome(names2));
	}
	
	/**
	 * Tests whether a string is a palindrome
	 * @param s the string to test
	 * @return true if the string is a palindrome, else false
	 */
	public static <T> boolean isPalindrome(List<T> list)
	{
		return isPalindrome(list, 0, list.size() - 1);
	}
	
	/**
	 * Tests whether a substring is a palindrome
	 * @param text a string that is being checked
	 * @param start the index of the first character of the substring
	 * @param end the index of the last character of the substring
	 * @return true if the substring is a palindrome, else false
	 */
	private static <T> boolean isPalindrome(List<T> list, int start, int end)
	{
		// Separate case for substrings of length 0 and 1
		if(start >= end)
		{
			return true;
		}
		else
		{
			// Get first and last elements
			T first = list.get(start);
			T last = list.get(end);

			if(first == last)
			{
				// Test substring that doesn't contain the matching letters
				return isPalindrome(list, start + 1, end - 1);
			}
			else
			{
				return false;
			}
		}
	}
}
