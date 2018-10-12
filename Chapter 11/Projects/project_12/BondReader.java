package project_12;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import project_9.BadDataException;

/**
 * Write a program that accepts data from one column and returns the corresponding data
 * from the other columns in the stored file. If input data matches different rows, then
 * return all matching row data.
 * 
 * @author Mayuresh
 *
 */
public class BondReader
{
	// Instance Variables
	ArrayList<String> bondList = new ArrayList<String>();
	ArrayList<Integer> bondEnergyList = new ArrayList<Integer>();
	ArrayList<Double> bondLengthList = new ArrayList<Double>();
	
	// Constructors
	
	// Methods
	public void readFile(String fileName) throws IOException
	{
		File inFile = new File("src\\project_12\\".concat(fileName));
		
		try(Scanner in = new Scanner(inFile))
		{
			readData(in);
		}
	}
	
	public void readData(Scanner in) throws BadDataException
	{
		while(in.hasNextLine())
		{
			if(in.hasNextInt() || in.hasNextDouble())
			{
				throw new BadDataException("Expected Bond");
			}
			bondList.add(in.next());
			
			if(!in.hasNextInt())
			{
				throw new BadDataException("Expected Bond Engery");
			}
			bondEnergyList.add(in.nextInt());
			
			if(!in.hasNextDouble())
			{
				throw new BadDataException("Expected Bond Length");
			}
			bondLengthList.add(in.nextDouble());
		}
	}
	
	public void printTable()
	{
		System.out.printf("%12s %12s %12s\n", "Bond", "Bond Energy", "Bond Length");
		for(int i = 0; i < bondList.size() && i < bondEnergyList.size() && i < bondLengthList.size(); i++)
		{
			System.out.printf("%12s %12d %12.3f\n", bondList.get(i), bondEnergyList.get(i), bondLengthList.get(i));
		}
	}
	
	public void printRow(int index)
	{
		System.out.printf("%12s %12d %12.3f\n", bondList.get(index), bondEnergyList.get(index), bondLengthList.get(index));
	}
	
	public ArrayList<String> getBondList()
	{
		return this.bondList;
	}
	
	public ArrayList<Double> getBondLengthList()
	{
		return this.bondLengthList;
	}
	
	public ArrayList<Integer> getBondEnergyList()
	{
		return this.bondEnergyList;
	}
}
