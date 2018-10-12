package project_11;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import project_9.BadDataException;

public class RiseTimeTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		RiseTimeReader reader = new RiseTimeReader();
		
		boolean isDone = false;
		while(!isDone)
		{
			try
			{
				System.out.print("Enter Input File: ");
				String fileName = in.next();
				
				reader.readFile(fileName);
				System.out.println("Rise Time: " + reader.calculateRiseTime());
				
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
