package exercise_13_12;

/**
 * Implement a SubstringGenerator that generates all substring of a string. For
 * example, the substrings of the string "rum" are the seven strings
 * 
 * 		"r", "ru", "rum", "u", "um", "m", ""
 * 
 * Hint: First enumerate all substrings that start with the first character. There
 * are n of them if the string has length n. Then enumerate the substrings of the
 * string that you obtain by removing the first character.
 * 
 * @author Mayuresh
 *
 */
public class SubstringGenerator
{
	public static void main(String[] args)
	{
		substringGenerator("pink");
	}
	
	/**
	 * Generates all the substrings of a text
	 * @param text the text
	 */
	public static void substringGenerator(String text)
	{
		substringGenerator(text, 0, 0);
	}
	
	/**
	 * Generates all the substring of a text
	 * @param text the text
	 * @param letterIndex the index of the current character
	 * @param textIndex the index of the starting character
	 */
	public static void substringGenerator(String text, int letterIndex, int textIndex)
	{
		// Base case
		// if the letter index is greater than or equal to the length of the
		// text, then we are at the base case: print out "" and return.
		if(letterIndex >= text.length())
		{
			System.out.println("\"\"");
			return;
		}
		else
		{
			// if the text index is less than the length, increment the textIndex and
			// then print out the substring from the letter index to the text index
			if(textIndex < text.length())
			{
				textIndex++;
				System.out.println(text.substring(letterIndex, textIndex));
			}
			// otherwise, increment the letterIndex and set the textIndex to the letterIndex
			else
			{
				letterIndex++;
				textIndex = letterIndex;
			}
			
			// Recurse
			substringGenerator(text, letterIndex, textIndex);
		}
	}
}
