package file_example_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * When each line of a file is a data record, it is often best to read entire
 * lines with the nextLine() method. Usually, the next input line is placed into
 * a string and then processed.
 * 
 * The hasNextLine() method returns true if there is at least one more line in
 * the input, false when all lines have been read. To ensure that there is another
 * line to process, call hasNextLine before calling nextLine.
 * 
 * The worldpop.txt file contains a list of countries with their population sizes.
 * The file is formatted in a certain way but for this example, we just reformat
 * it so that there is only one space between the country name and population.
 * 
 * In this example, it's best to read each line as a whole. Run a while loop
 * indicating hasNextLine() and set a string called line to hold the contents
 * of the line. Then use the Character class to get everything from index 0 to
 * the point where the numbers start. Then use the trim() method of the String class
 * to remove all whitespaces before the first character and after the last character.
 * Next, create strings countryName and population that hold substrings of the line.
 * 
 * 
 * Another way to get the countryName and population size is to scan a string.
 * This method bypasses breaking a line into separate strings. You can use a
 * Scanner object to read the characters from a string like this:
 * 
 * 		Scanner lineScanner = new Scanner(line);
 * 
 * 		while(!lineScanner.hasNextInt())
 * 		{
 * 			countryName = countryName + " " + lineScanner.next();
 * 		}
 * 		int populationValue = lineScanner.nextInt();
 * 
 * 
 * @author Mayuresh
 *
 */
public class ReadingLines
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// Construct a Scanner and PrintWriter object for reading and writing
		File inputFile = new File("src//file_example_6//worldpop.txt");
		Scanner in = new Scanner(inputFile);
		
		PrintWriter out = new PrintWriter("src//file_example_6//worldpop_output.txt");
		
		// Process the lines
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			
			int i = 0;
			while(!Character.isDigit(line.charAt(i)))
			{
				i++;
			}
			
			String countryName = line.substring(0, i);
			String countryPopulation = line.substring(i);
			
			countryName = countryName.trim();
			
			// Print it out to the output file
			out.println(countryName + " " + countryPopulation);
		}
		
		in.close();
		out.close();
	}
}
