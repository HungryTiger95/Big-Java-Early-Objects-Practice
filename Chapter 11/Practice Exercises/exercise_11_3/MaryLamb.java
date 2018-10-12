package exercise_11_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Write a program that reads a file containing text. Read each line and send it to the
 * output file, preceded by line numbers. If the input file is:
 * 
 * 		Mary had a little lamb
 * 		Whose fleece was white as snow,
 * 		And everywhere that Mary went,
 * 		The lamb was sure to go!
 * 
 * For this exercise, repeat exercise 2 but allow the user to specify the file name on the command
 * line. If the user doesn't specify a file name, then prompt the user for a name.
 * 
 * To run:
 * 
 * 		javac exercise_11_3.MaryLamb.java
   		java exercise_11_3.MaryLamb marylamb.txt marylamb_output.txt
 * 
 * @author Mayuresh
 *
 */
public class MaryLamb
{
	public static void main(String[] args) throws FileNotFoundException
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
			inputFileName += "src\\exercise_11_3\\".concat(console.next());
			
			System.out.print("Output file: ");
			outputFileName += "src\\exercise_11_3\\".concat(console.next());
			
			console.close();
		}
		else if(args.length == 2)
		{
			inputFileName += "exercise_11_3\\".concat(args[0]);
			outputFileName += "exercise_11_3\\".concat(args[1]);
		}
		else
		{
			usage();
			return;
		}
		
		
		// Construct the Scanner and PrintWriter objects for reading and writing
		PrintWriter out = new PrintWriter(outputFileName);
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		
		// Print to the output file
		int lineNum = 0;
		
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			lineNum++;
			out.println("/* " + lineNum + " */ " + line);
		}
		
		in.close();
		out.close();
	}
	
	/**
	 * Reports proper usage
	 */
	public static void usage()
	{
		System.out.println("Usage: java MaryLamb infile outfile");
	}
}
