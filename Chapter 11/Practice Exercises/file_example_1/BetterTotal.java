package file_example_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This program will take two files with double values in them and then
 * print out a total into another file
 * 
 * @author Mayuresh
 *
 */
public class BetterTotal
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner console = new Scanner(System.in);
		
		// Prompt for the input and output file names
		String fileName = "src//file_example_1//totalinput.txt";
		String fileName2 = "src//file_example_1//totalinput2.txt";
		
		File betterFile = new File(fileName2);
		File totalsFile = new File(fileName);
		
		console.close();
		
		// Read the file into an array
		double[] list = new double[20];
		
		Scanner in = new Scanner(totalsFile);
		int index = 0;
		double total = 0;
		
		while(in.hasNext())
		{
			double val = in.nextDouble();
			total += val;
			
			list[index] = val;
			
			index++;
		}
		in.close();
		
		// Open the other file and read into the array
		in = new Scanner(betterFile);
		
		while(in.hasNext())
		{
			double val = in.nextDouble();
			total += val;
			
			list[index] = val;
			
			index++;
		}
		in.close();
		
		for(double values : list)
		{
			System.out.println(values);
		}
		
		// Print the array to the output file
		PrintWriter out = new PrintWriter("src//file_example_1//generalOutput.txt");
		
		for(int i = 0; i < list.length; i++)
		{
			out.printf("%15.2f\n", list[i]);
		}
		
		out.println("===============");
		out.printf("Total: %8.2f\n", total);
		
		out.close();
	}
}
