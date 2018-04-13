import java.util.Scanner;

/**
 * E6.9
 * 
 * Write a program that reads a word and prints it in reverse
 * 
 * @author Mayuresh
 *
 */
public class ReversePrint
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		String word;
		
		System.out.print("Please Enter a Word: ");
		word = in.next();
		
		in.close();
		
		for (int i = word.length() - 1; i >= 0; i--)
		{
			System.out.print(word.charAt(i));
		}
	}
}
