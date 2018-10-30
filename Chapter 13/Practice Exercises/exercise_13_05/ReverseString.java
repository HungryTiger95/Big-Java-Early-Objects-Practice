package exercise_13_05;

import java.util.Scanner;

/**
 * Implement the reverse method of exercise 3 as an iteration.
 * 
 * @author Mayuresh
 *
 */
public class ReverseString
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String s = in.nextLine();
		
		System.out.println("Reversed: " + reverseString(s));
		
		in.close();
	}
	
	/**
	 * Reverses a given string
	 * @param text the text to reverse
	 * @return the reversed text
	 */
	public static String reverseString(String text)
	{
		String r = "";
		
		for(int i = text.length() - 1; i >= 0; i--)
		{
			r += (text.charAt(i));
		}
		
		return r;
	}
}
