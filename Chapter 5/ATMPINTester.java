import java.util.Scanner;

/**
 * Business P5.9
 * 
 * When you use an automated teller machine with your bank card, you need
 * to use a PIN to access your account. If a user fails more than three
 * times when entering the PIN, the machine will block the card. Assume
 * that the user's PIN is "1234" and write a program that asks the user for
 * the PIN no more than three times, and does the following:
 * 
 * 		* If the user enters the right number, print a message saying
 * 		  "Your PIN is correct", and end the program
 * 
 * 		* If the user enters the wrong number, print a message saying "Your
 * 		  PIN is incorrect" and, if you have asked for the PIN less than three times, ask for it again.
 * 
 * 		* If the user enters a wrong number three times, print a message saying
 * 		  "Your bank card is blocked" and end the program
 * 
 * @author Mayuresh
 *
 */
public class ATMPINTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int actualPIN = 1234;
		int enteredPIN;
		int attempts = 3;
		
		System.out.print("Please Enter PIN: ");
		if(in.hasNextInt())
		{
			enteredPIN = in.nextInt();
			
			// First Attempt
			if(enteredPIN == actualPIN)
			{
				System.out.println("Your PIN is correct");
			}
			else
			{
				attempts--;
				System.out.println("Your PIN is incorrect\nYou have " + attempts + "attempt(s) left");
				System.out.println("-----------------------------------------------");
				System.out.print("Please Enter PIN: ");
				enteredPIN = in.nextInt();
				
				// Second Attempt
				if(enteredPIN == actualPIN)
				{
					
					System.out.println("Your PIN is correct");
				}
				else
				{
					attempts--;
					System.out.println("Your PIN is incorrect\nYou have " + attempts + "attempt(s) left");
					System.out.println("-----------------------------------------------");
					System.out.print("Please Enter PIN: ");
					enteredPIN = in.nextInt();
					
					// Third Attempt
					if(enteredPIN == actualPIN)
					{
						System.out.println("Your PIN is correct");
					}
					else
					{
						attempts--;
						System.out.println("Your card is blocked");
					}
				}
			}
		}
		
		in.close();
	}
}
