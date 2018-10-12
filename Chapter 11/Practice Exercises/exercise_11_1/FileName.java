package exercise_11_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Write a program that carries out the following tasks:
 * 
 * 		- Open a file with the name hello.txt
 * 		- Store the message "Hello, World!" in the file
 * 		- Close the file
 * 		- Open the same file again
 * 		- Read the message into a string variable and print it in the console
 * 
 * This program reads a file and prints the first line in the console
 * 
 * @author Mayuresh
 *
 */
public class FileName
{
	public static void main(String[] args) throws FileNotFoundException
	{
		// Open A File with the name file_name_input.txt, write something, and then close it
		File outputFile = new File("src\\exercise_11_1\\file_name_output.txt");
		
		try(PrintWriter out = new PrintWriter(outputFile))
		{
			out.println("Im trying to print something to the file");
		}
		
		// Open the same file and read it
		try(Scanner in = new Scanner(outputFile))
		{
			String line = in.nextLine();
			System.out.println(line);
		}
	}
}
