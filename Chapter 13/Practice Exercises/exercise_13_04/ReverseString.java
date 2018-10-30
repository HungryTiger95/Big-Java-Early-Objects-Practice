package exercise_13_04;

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
		String text = "Sleeper Simulant";
		System.out.println("Reverse of: " + text + "\nis: " + reverseString(text));
	}
	
	// Methods
	public static String reverseString(String text, int start, int end)
	{
		// String has length of 0 or 1
		if(end <= 1)
		{
			return text;
		}
		else
		{
			return reverseString(text.substring(1, text.length()), start + 1, end - 1) + text.charAt(0);
		}
	}
	
	public static String reverseString(String text)
	{
		return reverseString(text, 0, text.length());
	}
}
