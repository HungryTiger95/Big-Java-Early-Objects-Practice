import java.util.Scanner;

/**
 * E6.3
 * 
 * Write programs that read a line of input as a string and print
 * 		1) Only the upper case letters
 * 		2) Every second letter of the string
 * 		3) The string, with all vowels replaced by an underscore
 * 		4) The number of vowels in the string
 * 		5) The positions of all vowels in the string
 * 
 * @author Mayuresh
 *
 */

public class Strings
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		String word;
		int vowelCount;
		int vowelPos;
		
		System.out.print("Please Enter a Word: ");
		word = in.next();
		
		in.close();
		
		// Print all uppercase letters
		System.out.print("All The Upper Case Letters: ");
		
		for (int i = 0; i < word.length(); i++)
		{
			if (Character.isUpperCase(word.charAt(i)))
			{
				System.out.print(word.charAt(i) + ", ");
			}
		}
		System.out.println();
		
		// Every Second Letter of the String
		System.out.print("Every Second Letter of the String: ");
		
		for (int i = 0; i < word.length(); i++)
		{
			if (i % 2 != 0)
			{
				System.out.print(word.charAt(i) + " ");
			}
		}
		System.out.println();
		
		// Replace All Vowels with an Underscore
		
		
		vowelCount = 0;
		System.out.print("Position of Vowels: ");
		for (int i = 0; i < word.length(); i++)
		{
			char letter = word.charAt(i);
			
			if (letter == 'A' || letter == 'a' || letter == 'E' || letter == 'e' ||letter == 'I' ||letter == 'i' ||
					letter == 'O' || letter == 'o' || letter == 'U' || letter == 'u' || letter == '_')
			{
				vowelCount++;
				vowelPos = i;
				System.out.print(vowelPos + " ");
				word = word.replace(word.charAt(i), '_');
			}
		}
		System.out.println();
		System.out.println("Replaced all Vowels with Underscore: " + word);
		
		System.out.println("The Number of Vowels: " + vowelCount);
		
	}
}
