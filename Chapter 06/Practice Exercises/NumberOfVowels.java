import java.util.Scanner;

/**
 * E6.10
 * 
 * Write a program that reads a word and prints the number of vowels in the word.
 * For this exercise, assume that (a, e, i, o, u, and y) are vowels.
 * 
 * @author Mayuresh
 *
 */

public class NumberOfVowels
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String word;
		int vowelCount = 0;
		
		System.out.print("Please Enter a Word: ");
		word = in.next();
		
		in.close();
		
		for (int i = 0; i < word.length(); i++)
		{
			char letter = word.charAt(i);
			
			if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I'
					|| letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U' || letter == 'y' || letter == 'Y')
			{
				vowelCount++;
			}
		}
		
		System.out.println("Number of Vowels: " + vowelCount);
	}

}
