package how_to_13_01;

import java.util.Scanner;

public class Palindromes
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter A Text: ");
		String s = in.nextLine();
		
		System.out.println("String: " + s);
		System.out.println("Is it a palindrome?: " + isPalindrome(s));
		
		in.close();
	}
	
	/**
	 * Tests whether or not a string is a Palindrome
	 * @param text the text to test
	 * @return true if the text is a palindrome, false if not
	 */
	public static boolean isPalindrome(String text)
	{
		int length = text.length();
		
		if(length <= 1)
		{
			return true;
		}
		else
		{
			// Get first and last characters, converted to lowercase
			char first = Character.toLowerCase(text.charAt(0));
			char last = Character.toLowerCase(text.charAt(length - 1));
			
			if(Character.isLetter(first) && Character.isLetter(last))
			{
				// Both are letters
				if(first == last)
				{
					// Remove both the first and last characters
					String shorter = text.substring(1, length -1);
					return isPalindrome(shorter);
				}
				else
				{
					return false;
				}
			}
			else if(!Character.isLetter(last))
			{
				// Remove Last Character
				String shorter = text.substring(1, length - 1);
				return isPalindrome(shorter);
			}
			else
			{
				// Remove First Character
				String shorter = text.substring(1);
				return isPalindrome(shorter);
			}
		}
	}
}
