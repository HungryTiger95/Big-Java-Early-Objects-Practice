
/**
 * E4.17
 * 
 * Write a program that prints HELLO in asterisks.
 * Declare each letter as a final String and use the \n newline escape key
 * 
 * @author Mayuresh
 *
 */
public class BigHello
{
	public static void main(String[] args)
	{
		final String LETTER_H = "*    *\n*    *\n******\n*    *\n*    *";
		final String LETTER_E = "******\n*\n******\n*\n******";
		final String LETTER_L = "*\n*\n*\n*\n******";
		final String LETTER_O = " ****\n*    *\n*    *\n*    *\n ****";
		
		System.out.println(LETTER_H + "\n" + LETTER_E + "\n" + LETTER_L + "\n" + LETTER_L + "\n" + LETTER_O);
	}
}
