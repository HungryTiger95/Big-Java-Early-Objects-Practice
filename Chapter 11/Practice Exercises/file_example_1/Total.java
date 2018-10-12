package file_example_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * In Java, the most convenient mechanism for reading text is to use the Scanner class.
 * To read input from a disk files, the Scanner class relies on another class, File, which
 * describes disk files and directories. To begin, construct a File object with the name of the
 * input file:
 * 
 * 		File inputFile = new File("input.txt");
 * 
 * Then use the File object to construct a Scanner object:
 * 
 * 		Scanner in = new Scanner(inputFile);
 * 
 * This Scanner object reads text from the file input.txt. You can use teh Scanner methods
 * (such as nextInt, nextDouble, and next) to read data from the input file.
 * 
 * To write output to a file, you construct a PrintWriter object with the desired file name:
 * 
 * 		PrintWriter out = new PrintWriter("output.txt");
 * 
 * You can use the familiar print, println, and printf methosd with any PrintWriter object:
 * 
 * 		out.println("Hello, World!");
 * 		out.printf("Total: %8.2f\n", total);
 * 
 * When you are done processing a file, be sure to close the Scanner or PrintWriter:
 * 
 * 		in.close();
 * 		out.close();
 * 
 * If you don't close the PrintWriter, some of the output may not be written to the disk file.
 * 
 * If the input or output file for a Scanner doesn't exist, a FileNotFoundException occurs when the Scanner object
 * is constructed. The compiler insists that we specify what the program should do when that happens. Similarly,
 * the PrintWriter constructor generates this exception if it cannot open the file for writing. In this sample
 * program, we want to terminate the main method if the exception occurs. to achieve this, we label the main method
 * with a throws declaration:
 * 
 * 		public static void main(String[] args) throws FileNotFoundException
 * 
 * Further along, you will learn how to deal with exceptions more professionally.
 * 
 * 
 * You must remember to pass in a File object into the Scanner in object. Passing in a string
 * will not have the intended results
 * 
 * 
 * This class reads a set of values and writes a running total of the values in the output file
 * 
 * @author Mayuresh
 *
 */
public class Total
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner console = new Scanner(System.in);
		
		// Prompt for the input and output file names
		System.out.print("Input File: ");
		String inputFileName = "src//file_example_1//" + console.next();
		
		System.out.print("Output File: ");
		String outputFileName = "src//file_example_1//" + console.next();
		
		console.close();
		
		// Construct the Scanner and PrintWriter objects for reading and writing
		File inputFile = new File(inputFileName);
		
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName);
		
		// Read the input and write the output
		double total = 0;
		
		while(in.hasNextDouble())
		{
			double value = in.nextDouble();
			total += value;
			
			out.printf("%15.2f\n", value);
			
		}
		
		out.println("===============");
		out.printf("Total: %8.2f\n", total);
		
		
		in.close();
		out.close();
	}
}
