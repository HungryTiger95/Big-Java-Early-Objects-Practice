package file_example_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * When you want to read a file one character at a time call the useDelimiter method on your Scanner object with an
 * empty string:
 * 
 * 		Scanner in = new Scanner(...);
 * 		in.useDelimiter("");
 * 
 * Now each call to next returns a string consisting of a single character.
 * 
 * The Character class declares several useful methods for the purpose of knowing what kind of a character a character is.
 * For example, the call
 * 
 * 		Character.isDigit(ch)
 * 
 * returns true if ch is a digit ('0' ... '9' or a digit in another writing system), false otherwise.
 * 
 * @author Mayuresh
 *
 */
public class ReadingCharacters
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File inputFile = new File("src//file_example_5//reading_chars_input.txt");
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter("src//file_example_5//reading_chars_output.txt");
		
		in.useDelimiter("");
		
		// Write the file with each character on a separate line
		while(in.hasNext())
		{
			char ch = in.next().charAt(0);
			
			out.println(ch);
		}
		
		in.close();
		out.close();
	}
}
