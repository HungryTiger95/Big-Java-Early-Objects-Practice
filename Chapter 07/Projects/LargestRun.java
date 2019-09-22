
public class LargestRun
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
		
		// Checks for largest run
		int maxRunStart = 0;
		int maxRunEnd = 0;
		int largestRun[] = {maxRunStart, maxRunEnd};
		
		for(int i = 0; i < values.length - 1; i++)
		{
			if(isRun)
			{
				if(values[i] != values[i  - 1])
				{
					maxRunEnd = i;
					
					if((maxRunEnd - maxRunStart) >= (largestRun[1] - largestRun[0]))
					{
						largestRun[0] = maxRunStart;
						largestRun[1] = maxRunEnd;
					}
					
					isRun = false;
					
					// This snippet checks if there is another run that starts after the last one ends
					if(values[i] == values[i + 1])
					{
						maxRunStart = i;
						isRun = true;
					}
				}
			}
			else
			{
				if(values[i] == values[i + 1])
				{
					maxRunStart = i;
					isRun = true;
				}
			}
		}
		
		// For last element
		// For the last element, check if it is in a run then print the last number
		if(isRun)
		{
			if(values[values.length - 1] == values[values.length - 2])
			{
				maxRunEnd = values.length;
				
				if((maxRunEnd - maxRunStart) >= (largestRun[1] - largestRun[0]))
				{
					largestRun[0] = maxRunStart;
					largestRun[1] = maxRunEnd;
				}
			}
			else
			{
				maxRunEnd = values.length;
				
				if((maxRunEnd - maxRunStart) >= (largestRun[1] - largestRun[0]))
				{
					largestRun[0] = maxRunStart;
					largestRun[1] = maxRunEnd;
				}
			}
			
		}
		
		// Print the sequence of values with largest run
		for(int i = 0; i < values.length; i++)
		{
			if(i == largestRun[0])
			{
				System.out.print("(");
			}
			else if(i == largestRun[1])
			{
				System.out.print(")");
			}
			else
			{
				// Do nothing
			}
			
			System.out.print(values[i]);
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
