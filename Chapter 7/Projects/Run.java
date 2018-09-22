
/**
 * A run is a sequence of adjacent repeated values. Write a program that
 * generates a sequence of 20 random die tosses in an array and that
 * prints the die values, marking the runs by including them in parentheses
 * like this:
 * 
 * 1 2 (5 5 ) 3 1 2 4 3 (2 2 2 2) 3 6 (5 5) 6 3 1
 * 
 * 
 * @author Mayuresh
 *
 */
public class Run
{
	// Instance Variables
	private static boolean isRun = false;
	private final static int LENGTH = 20;
	private static int[] values = new int[LENGTH];
	private static Die die = new Die(6);
	
	// Main Method
	public static void main(String[] args)
	{
		// Set up random sequence of die rolls
		setSeq();
		
		// Print the sequence of die rolls
		printSeq();
		
		// Checks for runs by looping through all elements except the last one
		for(int i = 0; i < LENGTH - 1; i++)
		{
			if(isRun)
			{
				if(values[i] != values[i  - 1])
				{
					System.out.print(")");
					isRun = false;
					
					// This snippet checks if there is another run that starts after the last one ends
					if(values[i] == values[i + 1])
					{
						System.out.print("(");
						isRun = true;
					}
				}
			}
			else
			{
				if(values[i] == values[i + 1])
				{
					System.out.print("(");
					isRun = true;
				}
			}
			
			System.out.print(values[i]);
		}
		
		// For the last element, check if it is in a run then print the last number
		if(isRun)
		{
			if(values[values.length - 1] == values[values.length - 2])
			{
				System.out.print(values[values.length - 1]);
				System.out.print(")");
			}
			else
			{
				System.out.print(")");
				System.out.print(values[values.length - 1]);
			}
			
		}
		else
		{
			System.out.print(values[values.length - 1]);
		}
	}
	
	// Methods
	/**
	 * Prints the sequence of rolls
	 */
	public static void printSeq()
	{
		for(int i = 0; i < values.length; i++)
		{
			System.out.print(values[i]);
		}
		System.out.println();
	}
	
	/**
	 * Sets up the sequence of rolls
	 */
	public static void setSeq()
	{
		int roll;
		
		for(int i = 0; i < LENGTH; i++)
		{
			roll = die.roll();
			values[i] = roll;
		}
	}
}
