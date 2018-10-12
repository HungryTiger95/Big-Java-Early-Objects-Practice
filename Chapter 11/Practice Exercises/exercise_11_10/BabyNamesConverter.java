package exercise_11_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Convert the raw data from any year of birth from the Social Security database to something like
 * 
 * 		Jennifer 34592
 * 		...
 * 
 * and so on for both boys and girls. There are thousands of names so you can simply print out
 * the first 100 for each sex.
 * 
 * @author Mayuresh
 *
 */
public class BabyNamesConverter
{
	public static void main(String[] args)
	{
		final int LIMIT = 1000;
		
		// Prompt for Input and Output File Names
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter Input File Name: ");
		String inputFileName = "src\\exercise_11_10\\".concat(console.nextLine());
		
		System.out.print("Enter Output File Name: ");
		String outputFileName = "src\\exercise_11_10\\".concat(console.nextLine());
		
		console.close();
		
		// Construct PrintWriter and File Objects
		File inputFile = new File(inputFileName);
		ArrayList<String> boyNames = new ArrayList<String>();
		ArrayList<String> girlNames = new ArrayList<String>();
		ArrayList<String> boyNameCounts = new ArrayList<String>();
		ArrayList<String> girlNameCounts = new ArrayList<String>();
		
		// Read all names and store the lines in an array
		try(Scanner in = new Scanner(inputFile))
		{
			while(in.hasNextLine())
			{
				String line = in.nextLine();
				
				int commaCharCount = 0;
				
				if(line.contains(",F,"))
				{
					// Get the name from the first letter up to the first comma
					for(int i = 0; i < line.length(); i++)
					{
						if(line.charAt(i) != ',')
						{
							commaCharCount++;
						}
						else
						{
							break;
						}
					}
					
					String name = line.substring(0, commaCharCount);
					girlNames.add(name);
					
					String nameCounts = line.substring(commaCharCount + 3, line.length());
					girlNameCounts.add(nameCounts);
				}
				else if(line.contains(",M,"))
				{
					// Get the name from the first letter up to the first comma
					for(int i = 0; i < line.length(); i++)
					{
						if(line.charAt(i) != ',')
						{
							commaCharCount++;
						}
						else
						{
							break;
						}
					}
					
					String name = line.substring(0, commaCharCount);
					boyNames.add(name);
					
					String nameCounts = line.substring(commaCharCount + 3, line.length());
					boyNameCounts.add(nameCounts);
				}
				else
				{
					System.out.println("There was an error");
					break;
				}
			}
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("ERROR: INPUT FILE NOT FOUND");
		}
		
		// Write all the names in the arrays to a file
		try(PrintWriter out = new PrintWriter(outputFileName))
		{
			// Write all the girl names first
			int rank = 1;
			for(int i = 0; i < LIMIT; i++)
			{
				out.print(rank + " " + girlNames.get(i) + " " + girlNameCounts.get(i));
				out.println(" " + boyNames.get(i) + " " + boyNameCounts.get(i));
				rank++;
			}
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("ERROR: OUTPUT FILE NOT FOUND");
		}
	}
}
