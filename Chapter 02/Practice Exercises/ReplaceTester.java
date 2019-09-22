/**
 * Testing 2.5
 * 
 * Write a program ReplaceTester that encodes a string by replacing all letters "i" with "!"
 * and all letters "s" with "$". Use the replace method. Demonstrate that you can
 * correctly encode the string "Mississippi". Print both the actual and expected result.
 * 
 * @author Mayuresh
 *
 */

public class ReplaceTester
{
	public static void main (String[] args)
	{
		String river = "Mississippi";
		
		river = river.replace('i', '!');
		river = river.replace('s', '$');
		
		System.out.println("Expected: M!$$!$$!pp!");
		System.out.println(river);
	}
}
