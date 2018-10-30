package section_02;

import java.util.Scanner;

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
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter text to test: ");
		String text = in.nextLine();
		
		System.out.println("Palindrome: " + isPalindrome(text));
		
		in.close();
	}
	
	/**
	 * Tests whether a string is a palindrome
	 * @param s the string to test
	 * @return true if the string is a palindrome, else false
	 */
	public static boolean isPalindrome(String text)
	{
		return isPalindrome(text, 0, text.length() - 1);
	}
	
	/**
	 * Tests whether a substring is a palindrome
	 * @param text a string that is being checked
	 * @param start the index of the first character of the substring
	 * @param end the index of the last character of the substring
	 * @return true if the substring is a palindrome, else false
	 */
	public static boolean isPalindrome(String text, int start, int end)
	{
		// Separate case for substrings of length 0 and 1
		if(start >= end)
		{
			return true;
		}
		else
		{
			// Get first and last characters, converted to lowercase
			char first = Character.toLowerCase(text.charAt(start));
			char last = Character.toLowerCase(text.charAt(end));
			
			if(Character.isLetter(first) && Character.isLetter(last))
			{
				if(first == last)
				{
					// Test substring that doesn't contain the matching letters
					return isPalindrome(text, start + 1, end - 1);
				}
				else
				{
					return false;
				}
			}
			else if(!Character.isLetter(last))
			{
				// Test substring that doesn't contain the last character
				return isPalindrome(text, start, end - 1);
			}
			else
			{
				// Test substring that doesn't contain the first character
				return isPalindrome(text, start + 1, end);
			}
		}
	}
}
