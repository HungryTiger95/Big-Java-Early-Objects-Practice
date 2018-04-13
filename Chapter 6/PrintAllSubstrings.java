import java.util.Scanner;

/**
 * E6.11
 * 
 * Write a program that reads a word and prints all substrings, sorted by length. for example, if input is "rum"
 * the program prints:
 * 
 * 		r
 * 		u
 * 		m
 * 		ru
 * 		um
 * 		rum
 * 
 * 
 * @author Mayuresh
 *
 */
public class PrintAllSubstrings
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//System.out.print("Enter a word: ");
		String word = "homes";
		
		in.close();
		
		/**
		 * (1) go to the first letter and print, go to the second letter and print, etc
		 * (2) go to first letter and print that one and the next one, go to the second letter and print
		 * 		that one and the next one, etc.
		 * (3) go to the first letter and print that one and the next two, go to the second letter and print
		 * 		that one and the next two, etc.
		 * (4, etc)
		 */
		for(int i = 1; i < word.length(); i++)
		{
			for(int j = 0; j < word.length() - i + 1; j++)
			{
				System.out.println(word.substring(j, j + i));
			}
		}
		
		System.out.println(word);
	}
}
