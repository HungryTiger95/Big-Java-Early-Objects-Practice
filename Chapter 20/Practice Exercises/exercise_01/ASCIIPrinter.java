package exercise_01;

import java.io.IOException;
import java.util.Scanner;
import java.io.InputStream;
import java.io.FileInputStream;

/**
 * Write a program that opens a binary file and prints all ASCII characters from that file,
 * that is, all bytes with values between 32 and 126. Print a new line after every 64
 * characters. What happens when you use your program with word processor documents? With
 * Java class files?
 * @author Mayuresh
 *
 */
public class ASCIIPrinter
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		try
		{
			System.out.print("Input File: ");
			String inFile = in.next();
			
			InputStream inStream = new FileInputStream(inFile);
			
			boolean done = false;
			while(!done)
			{
				int next = inStream.read();
				if(next == -1)
				{
					done = true;
				}
				else
				{
					if(next >= 32 && next <= 126)
					{
						if(next == 32)
						{
							System.out.println();
						}
						else
						{
							char c = (char) next;
							System.out.print(c);
						}
					}
				}
			}
			inStream.close();
		}
		catch(IOException e)
		{
			System.out.println("Error Processing File: " + e);
		}
		
		in.close();
	}
}
