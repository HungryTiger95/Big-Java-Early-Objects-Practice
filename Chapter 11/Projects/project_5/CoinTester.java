package project_5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CoinTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		CoinReader reader = new CoinReader();
		ArrayList<Coin> data = new ArrayList<Coin>();
		
		boolean isDone = false;
		while(!isDone)
		{	
			try
			{
				System.out.print("Enter Input File Name: ");
				String fileName = in.next();
				
				data = reader.readFile(fileName);
				
				for(Coin coins : data)
				{
					System.out.println(coins.getCoinName() + "-" + coins.getCoinValue());
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
