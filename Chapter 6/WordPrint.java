import java.util.Scanner;

/**
 * E6.8
 * 
 * Write a program that reads a word and prints each character of the word on a seperate line.
 * For example, if the user provides the input "Harry", the program prints
 * 
 * H
 * A
 * R
 * R
 * Y
 * 
 * @author Mayuresh
 *
 */
public class WordPrint
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		String word;
		
		System.out.print("Please Enter a Word: ");
		word = in.nextLine();
		
		in.close();
		
		for (int i = 0; i < word.length(); i++)
		{
			System.out.println(word.charAt(i));
		}
	}
}
