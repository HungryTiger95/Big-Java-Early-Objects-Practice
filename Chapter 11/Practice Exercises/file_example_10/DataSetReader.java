package file_example_10;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * First, read the comments on the methods, then read this section:
 * 
 * 
 * 
 * To see the exception handling at work, look at a specific error scenario:
 * 
 * 	1) DataAnalyzer.main calls DataSetReader.readFile
 * 
 * 	2) readFile calls readData
 * 
 * 	3) readData calls readValue
 *  
 *  4) readValue doesn't find the expected value and throws a BadDataException
 *  
 *  5) readValue has no handler for the exception and terminates immediately
 *  
 *  6) readData has no handler for the exception and terminates immediately after excecuting the finally clause and closing the Scanner object
 *  
 *  7) readFile has no handler for the exception and terminates immediately after executing the finally clause and closing the Scanner object
 *  
 *  8) DataAnalyzer.main has a handler for a BadDataException. That handler prints a message to the user. Afterward, the user is given
 *  	another chance to enter a file name. Note that the statements computing the sum of the values have been skipped
 *  
 *  This example shows the separatoin between error detection (in the DataSetReader.readValue method) and error handling
 *  (in the DataAnalyzer.main method). In between the two are the readData and readFile methods, which just pass exceptions along.
 *  
 * @author Mayuresh
 *
 */
public class DataSetReader
{
	// Instance Variables
	private double[] data;
	
	// Constructors
	
	// Methods
	/**
	 * Reads a data set.
	 * 
	 * This method constructs a Scanner object and calls the readData method. It is
	 * completely unconcerned with any exceptions. If there is a problem with the input
	 * file, it simply passes the exception to its caller. The method throws and IOException,
	 * the common superclass of FileNotFoundException(which is thrown by the Scanner constructor)
	 * and BadDataException(which is thrown by the readData method)
	 * 
	 * Using Automatic Resource Management in Java 7 and up, you can rewrite the try/finally statement like this:
	 * 
	 * 		try(Scanner in = new Scanner(inFile)
	 * 		{
	 * 			readData(in);
	 * 			return data
	 * 		}
	 * 
	 * 
	 * @param fileName the name of the file holding the data
	 * @return the data in the file
	 * @throws IOException
	 */
	public double[] readFile(String fileName) throws IOException
	{
		File inFile = new File(fileName);
		Scanner in = new Scanner(inFile);
		
		try
		{
			readData(in);
			return data;
		}
		finally
		{
			in.close();
		}
	}
	
	/**
	 * Reads all data
	 * 
	 * This method reads the number of values, constructs an array, and calls readValue for each data value.
	 * It checks for two potential errors. The file might not start with an integer, or it might have
	 * additional data after reading all values. However, this method makes no attempt to catch any exceptions.
	 * Plus, if the readValue method throws an exception, the exception is is simply passed on to the caller.
	 * 
	 * @param in the scanner that scans the data
	 * @throws BadDataException
	 */
	public void readData(Scanner in) throws BadDataException
	{
		if(!in.hasNextInt())
		{
			throw new BadDataException("Length Expected");
		}
		
		int numberOfValues = in.nextInt();
		data = new double[numberOfValues];
		
		for(int i = 0; i < numberOfValues; i++)
		{
			readValue(in, i);
		}
		
		if(in.hasNext())
		{
			throw new BadDataException("End of file expected");
		}
	}
	
	/**
	 * Reads one data value
	 * @param in the scanner that scans the data
	 * @param i the position of the value to read
	 * @throws BadDataException
	 */
	public void readValue(Scanner in, int i) throws BadDataException
	{
		if(!in.hasNextDouble())
		{
			throw new BadDataException("Data value expected");
		}
		
		data[i] = in.nextDouble();
	}
}
