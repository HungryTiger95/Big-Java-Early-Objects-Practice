package project_10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import project_9.BadDataException;

public class VoltageTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		VoltageReader reader = new VoltageReader();
		
		ArrayList<Double> voltageList = new ArrayList<Double>();
		ArrayList<Integer> timeList = new ArrayList<Integer>();
		
		boolean isDone = false;
		while(!isDone)
		{
			try
			{
				System.out.print("Enter Input File: ");
				String fileName = in.next();
				
				System.out.print("Enter Output File: ");
				String outputFileName = in.next();
				
				System.out.print("Enter Delta Time: ");
				int deltaT = in.nextInt();
				
				reader.readFile(fileName);
				reader.calculateVoltage(deltaT);
				
				voltageList = reader.getVoltages();
				timeList = reader.getTimes();
				
				try(PrintWriter out = new PrintWriter("src\\project_10\\".concat(outputFileName)))
				{
					for(int i = 0; i < voltageList.size(); i++)
					{
						if(i == voltageList.size() - 1)
						{
							out.printf("%d %.5f", timeList.get(i), voltageList.get(i));
						}
						else
						{
							out.printf("%d %.5f\n", timeList.get(i), voltageList.get(i));
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
				e.printStackTrace();
			}
		}
		
		in.close();
	}
}
