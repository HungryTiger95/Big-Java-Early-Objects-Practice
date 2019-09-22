import java.util.Scanner;
import java.util.Random;

/**
 * E6.7
 * 
 * Translate the following pseudocode for randomly permuting the characters in a string into a Java program
 * 
 * Read a word
 * Repeat word.length() times
 * 		Pick a random position i in the word, but not the last position
 * 		Pick a random position j > i in the word.
 * 		Swap the letters at positions j and i.
 * Print the word
 * 
 * @author Mayuresh
 *
 */
public class CharacterPermutation
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Random generator = new Random();
		
		String word, first, middle, last;
		int i, j;
		
		System.out.print("Enter a Word: ");
		word = in.next();
		
		in.close();
		
		// Repeat word.length() times
		for(int k = 0; k < word.length(); k++)
		{
			// Pick a random position for i, but not the last position
			i = generator.nextInt(word.length() - 1);
			// Pick a random position for j > i
			j = generator.nextInt(word.length() - i - 1) + i + 1;		// (word.length() - i's position - 1) == random position between word.length() - i - 1)
																		// this is anything from 0 to (word.length() - (i + 1)) and then add (i + 1) to get positions
																		// after i
			
			// if i == 0, then the first string will be empty
			if(i == 0)													
			{
				first = "";
			}
			// else, the first string will will be from 0 to i (not including i)
			else
			{
				first = word.substring(0, i);
			}
			
			// if i + 1 is the same as j, then the middle string will be empty
			if(i + 1 == j)
			{
				middle = "";
			}
			// else, the middle string is (i + 1), becuase we dont want i in the string, to j
			else
			{
				middle = word.substring(i + 1, j);
			}
			
			// if j is the last character, then the last string will be empty
			if(j == word.length() - 1)
			{
				last = "";
			}
			// esle, the last string will be (j + 1) to the last character
			else
			{
				last = word.substring(j + 1, word.length());
			}
			
			// Set the word variable using the combination from the loop iteration
			word = first + word.substring(j, j + 1) + middle + word.substring(i, i + 1) + last;
		}
		
		System.out.println(word);
	}
}
