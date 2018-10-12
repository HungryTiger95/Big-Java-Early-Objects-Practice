package file_example_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * When a user supplies a file name to a program the user should not type the backslash twice.
 * In this program provide a absolute file path with single backslashes
 * 
 * @author Mayuresh
 *
 */
public class BackslashTest
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter the File Path: ");
		String filePath = console.nextLine();
		
		File file = new File(filePath);
		
		Scanner in = new Scanner(file);
		
		// Read the File:
		while(in.hasNextLine())
		{
			System.out.println(in.nextLine());
		}
		
		console.close();
		in.close();
	}
}
