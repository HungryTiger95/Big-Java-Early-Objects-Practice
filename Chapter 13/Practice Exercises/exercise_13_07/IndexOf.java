package exercise_13_07;

import java.util.Scanner;

/**
 * Use recursion to implement a method
 * 
 * 		public static int indexOf(String text, String str)
 * 
 * that returns the starting position of the first substring of the text that
 * matches str. Return -1 if str is not a substring of the text.
 * 
 * For example, indexOf("Mississippi", "sip") returns 6.
 * 
 * Hint: This is a bit trickier than Exercise E13.6, because you must keep track
 * of how far the match is from the beginning of the text. Make that value a
 * parameter variable of a helper method.
 * 
 * @author Mayuresh
 *
 */
public class IndexOf
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the Text: ");
		String text = in.next();
		
		System.out.print("Enter the Test String: ");
		String test = in.next();
		
		System.out.println("Starting Index of Test: " + indexOf(text, test));
		
		in.close();
	}
	
	/**
	 * Gets the index of the first occurrence of a string within a text
	 * @param text the text
	 * @param str the string to test
	 * @return the index of the first occurrence
	 */
	public static int indexOf(String text, String str)
	{
		return indexOf(text, str, 0);
	}
	
	/**
	 * Gets the index of the first occurrence of a string within a text
	 * @param text the text
	 * @param str the string to test
	 * @param startIndex the first index of the first occurrence of the string
	 * @return the index where the string first occurs
	 */
	public static int indexOf(String text, String str, int startIndex)
	{
		// If the text is less than the str, then the str cannot be contained in the
		// text
		if(text.length() < str.length())
		{
			return -1;
		}
		// If the substring of the text from 0 to the length of the str
		// is the same as the str
		else if(text.substring(0, str.length()).equals(str))
		{
			return startIndex;
		}
		// Otherwise recurse without the first letter of the text and increase the
		// start index by 1
		else
		{
			return indexOf(text.substring(1), str, startIndex + 1);
		}
	}
}
