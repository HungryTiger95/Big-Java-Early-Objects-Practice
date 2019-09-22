import java.util.Scanner;

/**
 * E4.11
 * 
 * Write a program that prompts the user for the drive letter
 * (C), the path (\Windows\System), the file name (Readme), and the extension(txt).
 * Then print the complete file name C:\Windows\System\Readme.txt.
 * 
 * @author Mayuresh
 *
 */

public class FileNamesExtensions
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String drive, path, fileName, extension;
		
		System.out.print("Enter the Drive Letter: ");
		drive = in.next();
		
		System.out.print("Enter the Path: ");
		path = in.next();
		
		System.out.print("Enter the File Name: ");
		fileName = in.next();
		
		System.out.print("Enter the Extension: ");
		extension = in.next();
		
		in.close();
		
		System.out.println(drive + ":\\\\" + path + "\\" + fileName + "\\" + extension + ".");
		
	}
}
