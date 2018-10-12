package exercise_11_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a program that reads each line in a file, reverses its lines, and writes them to another file.
 * For example, if the file input.txt contains the lines:
 * 
 * 			Mary had a little lamb
 * 			Its fleece was white as snow
 * 			And everywhere that Mary went
 * 			The lamb was sure to go.
 * 
 * 		And you run
 * 
 * 			reverse input.txt output.txt
 * 
 * 		Them output.txt contains
 * 
 * 			The lamb was sure to go.
 * 			And everywhere that Mary went
 * 			Its fleece was white as snow
 * 			Mary had a little lamb
 * 
 * 
 * @author Mayuresh
 *
 */
public class ReverseLines
{
	public static void main(String args[]) throws FileNotFoundException
	{
		// Construct a scanner to read in from the console and construct the inputFile
		// and outputFile names
		String inputFileName = "";
		String outputFileName = "";
		
		// Check for arguments
		if(args.length == 0)
		{	
			Scanner console = new Scanner(System.in);
			
			System.out.print("Input file: ");
			inputFileName += "src\\exercise_11_9\\".concat(console.next());
			
			System.out.print("Output file: ");
			outputFileName += "src\\exercise_11_9\\".concat(console.next());
			
			console.close();
		}
		else if(args.length == 2)
		{
			inputFileName += "exercise_11_9\\".concat(args[0]);
			outputFileName += "exercise_11_9\\".concat(args[1]);
		}
		else
		{
			usage();
			return;
		}
		
		// Construct the PrintWriter and File Objects
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName);
		
		// Process Input File
		ArrayList<String> lineArray = new ArrayList<String>();
		
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			lineArray.add(line);
		}
		
		// Print the Array in reverse to the output file
		for(int i = lineArray.size() - 1; i >= 0; i--)
		{
			out.println(lineArray.get(i));
		}
		
		// Close the PrintWriter and Scanner objects
		in.close();
		out.close();
	}
	
	public static void usage()
	{
		System.out.println("Usage: java ReverseLines inFile outFile");
	}
}
