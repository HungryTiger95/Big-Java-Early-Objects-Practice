package exercise_20;

import java.util.ArrayList;
import java.util.List;

/**
 * Provide a static method that checks whether a generic array list is a palindrome; that is, whether the values
 * at index i and n - 1 - i are equal to each other, where n is the size of the array list.
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
