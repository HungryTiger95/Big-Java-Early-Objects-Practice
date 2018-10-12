package exercise_11_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Write a program that reads a file containing two columns of floating-point numbers.
 * Prompt the user for the file name. Print the average of each column.
 * 
 * This program assumes that both columns are filled evenly
 * 
 * @author Mayuresh
 *
 */
public class AverageNum
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// Prompt the user to enter the input file name and output file name
		Scanner console = new Scanner(System.in);
		
		System.out.print("Input File Name: ");
		String inputFileName = "src\\exercise_11_4\\".concat(console.nextLine());
		
		System.out.print("Output File Name: ");
		String outputFileName = "src\\exercise_11_4\\".concat(console.nextLine());
		
		console.close();
		
		// Construct the Scanner and PrintWriter Objects for reading and writing
		File inputFile = new File(inputFileName);
		Scanner in = new Scanner(inputFile);
		PrintWriter out = new PrintWriter(outputFileName);
		
		// Read the input and write the output
		double colNum1, colNum2;
		double colSum1 = 0, colSum2 = 0;
		int numCounter1 = 0, numCounter2 = 0;
		double average1, average2;
		
		// Read Each Value and Write Each Value
		while(in.hasNextLine())
		{
			// First number processing
			String line = in.next();
			colNum1 = Double.parseDouble(line);
			colSum1 = colSum1 + colNum1;
			numCounter1++;
			
			// Second Number processing
			line = in.next();
			colNum2 = Double.parseDouble(line);
			colSum2 = colSum2 + colNum2;
			numCounter2++;
			
			// Print the numbers
			out.printf("%15.2f%15.2f\n",colNum1, colNum2);
			
		}
		
		out.print("-------------------------------------\n");
		
		// Calculate the Average of the numbers
		average1 = colSum1 / numCounter1;
		average2 = colSum2 / numCounter2;
		
		// Print the averages
		out.printf("Average: %6.2f %14.2f\n", average1, average2);
		
		// Close the Scanner and PrintWriter objects
		in.close();
		out.close();
	}
}
