package file_example_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * The next() method returns any sequence of chracters that is not white space. White space
 * includes spaces, tab characters, and the newline characters that separate lines.
 * 
 * Here is what happens:
 * 
 * 		Input characters that are white space are consumed - that is, removed from the input. However,
 * 		they do not become part of the word. The first character that is not white space becomes the first
 * 		character of the word. More characters are added until either another white space character occurs, or
 * 		the end of the input file has been reached. However, if the end of the input file is reached before
 * 		any character was added to the word, a "no such element exception" occurs.
 * 
 * 
 * Sometimes, you want to read just the words and discard anything that isn't a letter. You achieve this
 * task by calling the useDelimiter method on your Scanner object:
 * 
 * 		Scanner in = new Scanner(...);
 * 		in.useDelimiter("[^A-Za-z]+");
 * 
 * Here, we set the character pattern that separates words to "any sequence of characters other than letters".
 * (See Special Topic 11.4.) With this setting, punctuation and numbers are not included in the words returned by
 * the next method
 * 
 * @author Mayuresh
 *
 */
public class ReadingWords
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inputFile = new File("src//file_example_4//reading_words_input.txt");
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter("src//file_example_4//reading_words_output.txt");
		
		// Tells you where the directory is for this Java Project (Chapter 11 Practice Exercise).
		// The rest is treated as package scope.
		// That is why the File and PrintWriter objects are taking in "src\\file_example_4\\fileName.txt".
		// src and file_example_4 are both treated as packages
		System.out.println(System.getProperty("user.dir"));
		
		in.useDelimiter("[^A-Za-z'-]+");
		
		// Write the file with all the words on a separate line and does not include any other characters
		while(in.hasNext())
		{
			out.println(in.next());
		}
		
		in.close();
		out.close();
	}
}
