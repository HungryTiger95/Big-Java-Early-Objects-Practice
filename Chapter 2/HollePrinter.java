/**
 * E2.6
 * 
 * Write a HollePrinter that switches the letters "e" and "o" in a string. Use the replace method
 * repeatedly. Demonstrate that the string "Hello, World!" turns into "Holle, Werld!".
 * 
 * @author Mayuresh
 *
 */

public class HollePrinter
{
	public static void main (String[] argss)
	{
		String greeting = "Hello, World!";
		
		greeting = greeting.replace('e', 'O');
		greeting = greeting.replace('o', 'e');
		greeting = greeting.replace('O', 'o');
		
		System.out.println(greeting);
	}
}
