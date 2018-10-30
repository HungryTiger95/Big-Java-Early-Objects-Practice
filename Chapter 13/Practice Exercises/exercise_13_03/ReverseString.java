package exercise_13_03;

/**
 * Write a recursive method String reverse(String text) that reverses a string. For
 * example, reverse("Hello!") return the string "!olleH". Implement a recursive solution
 * by removing the first character, reversing the remaining text, and combining the two.
 * 
 * @author Mayuresh
 *
 */
public class ReverseString
{
	public static void main(String[] args)
	{
		String text = "Charizard";
		System.out.println("Reverse of: " + text + "\nis: " + reverseString(text));
	}
	
	// Methods
	/**
	 * Reverses a string
	 * @param text the text to reverse
	 * @return
	 */
	public static String reverseString(String text)
	{
		// String has length of 0 or 1
		if(text.length() <= 1)
		{
			return text;
		}
		else
		{
			// take off the first letter and then call reverse string starting with the second letter to the end
			return reverseString(text.substring(1, text.length())) + text.charAt(0);
		}
	}
}
