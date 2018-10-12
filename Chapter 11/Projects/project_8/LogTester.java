package project_8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LogTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		SalesReader reader = new SalesReader();
		ArrayList<ServiceLog> log = new ArrayList<ServiceLog>();
		
		boolean isDone = false;
		while(!isDone)
		{
			try
			{
				System.out.print("Enter the Input File Name: ");
				String fileName = in.next();
			
				log = reader.readFile(fileName);
				
				// Print the log
				System.out.println("Printing Log...");
				for(int i = 0; i < log.size(); i++)
				{
					System.out.print("[" + log.get(i).getName() + "]");
					System.out.print("[" + log.get(i).getService() + "]");
					System.out.print("[" + log.get(i).getPrice() + "]");
					System.out.println("[" + log.get(i).getDate() + "]");
				}
				
				// Get the totals for each category
				reader.removeSimilarServiceNames();
				reader.computeTotalAmounts();
				reader.writeCategories();
				
				// Print the totals
				System.out.printf("\n%10s%20s\n", "Service", "Total Price");
				for(int i = 0; i < reader.getUniqueServices().size(); i++)
				{
					System.out.printf("%10s", reader.getUniqueServices().get(i));
					System.out.printf("%20.2f\n", reader.getTotalPrices().get(i));
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
				e.printStackTrace();
			}
		}
		
		in.close();
	}
}
