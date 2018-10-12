package exercise_11_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Write a program that asks the user for a file name and prints the number of characters, words,
 * and lines in that file.
 * 
 * @author Mayuresh
 *
 */
public class LinesWordsChars
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// Prompt the user for input and output file names
		Scanner console = new Scanner(System.in);
		
		System.out.print("Input File Name: ");
		String inputFileName = "src\\exercise_11_5\\".concat(console.nextLine());
		
		System.out.print("Output File Name: ");
		String outputFileName = "src\\exercise_11_5\\".concat(console.nextLine());
		
		console.close();
		
		// Construct the File and PrintWriter objects
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName);
		
		// Read, process, and write input. Declare variables to use
		int charCounter = 0;
		int wordCounter = 0;
		int lineCounter = 0;
		
		while(in.hasNextLine())
		{
			// increment lineCounter variable
			String line = in.nextLine();
			lineCounter++;
			
			// increment charCounter variable
			for(int i = 0; i < line.length(); i++)
			{
				if(!Character.isWhitespace(line.charAt(i)))
				{
					charCounter++;
				}
				
			}
			
			// increment wordCounter variable
			for(int i = 0; i < line.length(); i++)
			{
				if(Character.isWhitespace(line.charAt(i)) || i == line.length() - 1)
				{
					wordCounter++;
				}
			}
		}
		
		// Write the results
		out.printf("Number of Lines: %15d\nNumber of Words: %15d\nNumber of Characters: %10d\n", lineCounter, wordCounter, charCounter);
		
		// Close PrintWriter and Scanner
		in.close();
		out.close();
	}
}
