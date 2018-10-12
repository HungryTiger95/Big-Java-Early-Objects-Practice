package project_7;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A hotel salesperson enters sales in a text file. Each line contains the following,
 * separated by semicolons: the name of the client, the service sold, the mount of the sale,
 * and the date of that event. Write a program that reads such a file and displays the total
 * amount for each service category. Display an error if the file does not exist or if the
 * file is not formatted correctly.
 * 
 * @author Mayuresh
 *
 */
public class SalesReader
{
	// Instance Variables
	ArrayList<ServiceLog> log = new ArrayList<ServiceLog>();
	ArrayList<String> uniqueServiceNames = new ArrayList<String>();
	ArrayList<Double> servicePriceTotals = new ArrayList<Double>();
	
	// Constructors
	
	// Methods
	/**
	 * Reads a file given the file name
	 * @param fileName the file name
	 * @return an array list of ServiceLog objects
	 * @throws IOException 
	 */
	public ArrayList<ServiceLog> readFile(String fileName) throws IOException
	{
		File inFile = new File("src\\project_7\\".concat(fileName));
		
		try(Scanner in = new Scanner(inFile))
		{
			readData(in);
			return log;
		}
	}
	
	/**
	 * Reads through the file and adds each log data into an array
	 * @param in the scanner that scans the file
	 * @throws BadDataException
	 */
	public void readData(Scanner in) throws BadDataException
	{
		while(in.hasNextLine())
		{	
			Scanner line = new Scanner(in.nextLine());
			line.useDelimiter(":");
			
			// Pick apart the line and assign a variable for each part
			if(line.hasNextInt() || line.hasNextDouble())
			{
				line.close();
				throw new BadDataException("Expected Client Name");
			}
			String name = line.next();
			
			if(line.hasNextInt() || line.hasNextDouble())
			{
				line.close();
				throw new BadDataException("Expected Service Name");
			}
			String service = line.next();
			
			if(!line.hasNextDouble())
			{
				line.close();
				throw new BadDataException("Expected Price");
			}
			double price = line.nextDouble();

			if(line.hasNextInt() || line.hasNextDouble())
			{
				line.close();
				throw new BadDataException("Expected Date");
			}
			String date = line.next();
			
			// Add Each Data to an arraylist
			log.add(new ServiceLog(name, service, date, price));
			
			line.close();
		}
	}
	
	/**
	 * Removes all instances of the same service names in the log and
	 * sets an array with all unique service names. This creates an
	 * array filled with each category in the file.
	 */
	public void removeSimilarServiceNames()
	{
		uniqueServiceNames.add(log.get(0).getService());
		
		for(int i = 1; i < log.size(); i++)
		{
			int similarCount = 0;
			for(int j = 0; j < uniqueServiceNames.size(); j++)
			{
				if(log.get(i).getService().equals(uniqueServiceNames.get(j)))
				{
					similarCount++;
				}
			}
			
			if(similarCount == 0)
			{
				uniqueServiceNames.add(log.get(i).getService());
			}
		}
	}
	
	/**
	 * Computes the totals for each category of services
	 */
	public void computeTotalAmounts()
	{
		removeSimilarServiceNames();
		
		for(int i = 0; i < uniqueServiceNames.size(); i++)
		{
			double priceTotal = 0;
			
			for(int j = 0; j < log.size(); j++)
			{
				if(log.get(j).getService().equals(uniqueServiceNames.get(i)))
				{
					priceTotal += log.get(j).getPrice();
				}
			}
			
			servicePriceTotals.add(priceTotal);
		}
	}
	
	/**
	 * Gets the service log array
	 * @return service log
	 */
	public ArrayList<ServiceLog> getLog()
	{
		return log;
	}
	
	/**
	 * Gets the total prices array
	 * @return array containing total prices for each unique service
	 */
	public ArrayList<Double> getTotalPrices()
	{
		return servicePriceTotals;
	}
	
	/**
	 * Gets the unique services array
	 * @return array containing the unique service names
	 */
	public ArrayList<String> getUniqueServices()
	{
		return uniqueServiceNames;
	}
}
