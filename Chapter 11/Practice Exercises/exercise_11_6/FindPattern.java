package exercise_11_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program Find that searches all fiels specified on the command line and prints out
 * all lines containing a specified word. For example, if you call
 * 
 * 		java Find ring report.txt address.txt Homework.java
 * 
 * then the program might print:
 * 
 * 		report.txt: has broken up an international ring of DVD bootleggers that
 * 		address.txt: Kris Kringle, North Pole
 * 		address.txt: Homer Simpson, Springfield
 * 		Homework.java: String fileName;
 * 
 * @author Mayuresh
 *
 */
public class FindPattern
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// Create an array to hold all the files
		ArrayList<File> fileList = new ArrayList<File>();
		
		// Create a string that hold the pattern to search for
		String patternToLookFor = "";
		
		// Loop through all the arguments
		for(int i = 0; i < args.length; i++)
		{
			// If its the first argument, then it must be the pattern to look for
			if(i == 0)
			{
				patternToLookFor = args[i];
			}
			// Otherwise, its a file name. Create a new file and add it to the file array
			else
			{
				String fileName = "exercise_11_6\\".concat(args[i]);
				fileList.add(new File(fileName));
			}
		}
		
		// For all the files, read the file and look for the pattern and then print out the entire line
		for(int i = 0; i < fileList.size(); i++)
		{
			String fileName = fileList.get(i).getName();
			System.out.print(fileName + ": ");
			
			Scanner in = new Scanner(fileList.get(i));
			
			while(in.hasNextLine())
			{
				String line = in.nextLine();
				
				if(line.contains(patternToLookFor))
				{
					System.out.println(line);
				}
			}
			
			System.out.println();
			in.close();
		}
	}
}
