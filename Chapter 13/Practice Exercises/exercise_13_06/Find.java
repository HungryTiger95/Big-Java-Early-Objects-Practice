package exercise_13_06;

/**
 * Use recursion to implement a method
 * 
 * 		public static boolean find(String text, String str)
 * 
 * that tests whether a given text contains a string. For example, find("Mississippi", "sip")
 * returns true.
 * 
 * Hint: If the text starts with the string you want to match, then you are done. If not, consider
 * the text that you obtain by removing the first character.
 * 
 * @author Mayuresh
 *
 */
public class Find
{
	public static void main(String[] args)
	{
		String s = "Charizard";
		String f = "iza";
		
		System.out.println("Is " + f + " in " + s + "?");
		System.out.println(find(s, f));
	}
	
	/**
	 * Checks whether a string is within a text
	 * @param text the text
	 * @param textToFind the string to test
	 * @return true if the string is in the text, else false
	 */
	public static boolean find(String text, String textToFind)
	{
		// If the length of the text is less than the length of the textToFind,
		// then we should return false
		if(text.length() < textToFind.length())
		{
			return false;
		}
		// If the substring of the text from 0 to the length of the textToFind
		// is the same as the the textToFind return true
		else if(text.substring(0, textToFind.length()).equals(textToFind))
		{
			return true;
		}
		// Otherwise, recurse by passing in the substring of the text without the
		// first character
		else
		{
			return find(text.substring(1), textToFind);
		}
	}
}
