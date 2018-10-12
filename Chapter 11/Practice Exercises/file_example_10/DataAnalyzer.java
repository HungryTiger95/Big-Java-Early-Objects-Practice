package file_example_10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * This program asks a user for the name of a file. The file is expected to contain data values.
 * The first line of the file contains the total number of values, and the remaining lines contain
 * the data. A typical input file looks like this:
 * 
 * 		3
 * 		1.45
 * 		-2.1
 * 		0.05
 * 
 * Ask yourself what can go wrong:
 * 
 * 		1) The file might not exist
 * 		2) The file might have data in the wrong format
 * 
 * Then ask who can detect these faults:
 * 
 * 		1) The Scanner constructor will throw an exception when the file does not exist.
 * 		2) The methods that process the input values need to throw an exception when they find an error in the data format.
 * 
 * Then ask what exceptions can be thrown:
 * 
 * 		1) The Scanner constructor throws a FileNotFoundException when the file does not exist
 * 		2) When the file data is in the wrong format, we will throw a BadDataException, a custom checked exception class
 * 			We use a checked exception because corruption of a file is out of our control
 * 
 * Lastly, ask who can remedy the faults that the exceptions report:
 * 
 * 		1) Only the main method of the DataAnalyzer program interacts with the user. It catches the exceptions, prints
 * 			appropriate error messages, and gives the user another chance to enter a correct file.
 * 
 * 		2) The catch clauses in the main method give a human-readable error report if the file was not found or bad
 * 			data was encountered.
 * 
 * 
 * @author Mayuresh
 *
 */
public class DataAnalyzer
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		DataSetReader reader = new DataSetReader();
		
		boolean isDone = false;
		while(!isDone)
		{
			try
			{
				System.out.print("Please Enter the File Name: ");
				String fileName = "src\\file_example_10\\" + in.next();
				
				double[] data = reader.readFile(fileName);
				double sum = 0;
				
				for(double d : data)
				{
					sum += d;
				}
				System.out.printf("Sum: %.2f\n", sum);
				
				isDone = true;
			}
			catch(FileNotFoundException e)
			{
				System.out.println("ERROR: File Not Found");
			}
			catch(BadDataException e)
			{
				System.out.println("Bad Data: " + e.getMessage());
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
		in.close();
	}
}
