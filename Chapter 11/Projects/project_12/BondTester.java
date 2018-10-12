package project_12;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import project_8.BadDataException;

public class BondTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		BondReader reader = new BondReader();
		
		boolean isDone = false;
		while(!isDone)
		{
			try
			{
				System.out.print("Enter Input File Name: ");
				String fileName = in.next();
				
				reader.readFile(fileName);
				reader.printTable();
				
				System.out.print("\nEnter Any Value From the Table and It Will Print Rows with the Same Value for the Given Column: ");
				if(in.hasNextInt())
				{
					// We are looking for the bond length
					int bondEnergy = in.nextInt();
					
					// Check each array to find any corresponding rows
					for(int i = 0; i < reader.getBondEnergyList().size(); i++)
					{
						if(reader.getBondEnergyList().get(i) == bondEnergy)
						{
							// Print out the entire row
							reader.printRow(i);
						}
					}
				}
				else if(in.hasNextDouble())
				{
					// We are looking for the bond length
					double bondLength = in.nextDouble();
					
					// Check each Array to find any corresponding rows
					for(int i = 0; i < reader.getBondLengthList().size(); i++)
					{
						if(reader.getBondLengthList().get(i) == bondLength)
						{
							// Print out the entire row
							reader.printRow(i);
						}
					}
				}
				else
				{
					// Otherwise we will look for the bond
					String bond = in.next();
					
					// Check each array for the same bond (Should never print any other array)
					for(int i = 0; i < reader.getBondList().size(); i++)
					{
						if(reader.getBondList().get(i) == bond)
						{
							// Print out the entire row
							reader.printRow(i);
						}
					}
				}
				
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
				e.getStackTrace();
			}
		}
		
		in.close();
	}
}
