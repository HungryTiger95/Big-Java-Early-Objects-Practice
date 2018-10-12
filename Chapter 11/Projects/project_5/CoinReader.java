package project_5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CoinReader
{
	// Instance Variables
	private ArrayList<Coin> coinList = new ArrayList<Coin>();
	
	// Constructors
	
	// Methods
	/**
	 * Read a file.
	 * 
	 * This method constructs a file object given the file name and then constructs
	 * a scanner object using the file object. Then it tries to read data. If successful
	 * in reading data, it stores all the coins in an array.
	 * 
	 * This method is completely unconcerned with any exceptions. If there is a problem
	 * with the input file, it simply passes the exception to its caller (in the main method).
	 * The method throws an IOException, the common superclass of FileNotFoundException (which
	 * can be thrown by the Scanner constructor and BadDataException, which in thrown by the readData
	 * method.
	 * 
	 * @param fileName the name of the file
	 * @return the data in the file
	 * @throws IOException
	 */
	public ArrayList<Coin> readFile(String fileName) throws IOException
	{
		File inFile = new File("src\\project_5\\".concat(fileName));
		Scanner in = new Scanner(inFile);
		
		try
		{
			readData(in);
			return coinList;
		}
		finally
		{
			in.close();
		}
	}
	
	/**
	 * Reads a data line from the file
	 * 
	 * This method reads a line of data from the file, and adds the
	 * coin object to the array of coins.
	 * 
	 * The method expects to find data in this format:
	 * 
	 * 		coinName coinValue
	 * 		...
	 * 
	 * Otherwise it will throw an exception.
	 * 
	 * @param in the scanner that scans the data
	 * @throws BadDataException
	 */
	public void readData(Scanner in) throws BadDataException
	{
		while(in.hasNextLine())
		{
			if(in.hasNextInt() || in.hasNextDouble())
			{
				coinList.clear();
				throw new BadDataException("Coin Name Expected");
			}
			String coinName = in.next();
			
			if(!in.hasNextDouble())
			{
				coinList.clear();
				throw new BadDataException("Coin Value Expected");
			}
			double coinValue = in.nextDouble();
			
			// Create the coin and add it to the array list
			Coin newCoin = new Coin(coinValue, coinName);
			coinList.add(newCoin);
		}
	}
}
