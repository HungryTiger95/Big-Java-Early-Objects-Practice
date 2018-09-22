import java.util.Random;
import java.util.Scanner;

public class ArrayMethodsIsInOrderTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Random generator = new Random();
		
		boolean done = false;
		int tries = 0;
		
		System.out.print("Enter Array Length: ");
		int arrayLength = in.nextInt();
		
		in.close();
		
		int[] nums = new int[arrayLength];
		ArrayMethods array = new ArrayMethods(nums);
		
		// Fun Automation to find the number of tries it takes to find an array that is sorted in ascending order
		// Please don't put a number in larger than 10
		while(!done)
		{
			// Generate array with random values
			for(int i = 0; i < arrayLength; i++)
			{
				int randNum = generator.nextInt(50) + 1;
				nums[i] = randNum;
			}
			
			System.out.println("This Array: ");
			array.printArray();
			
			if(array.isInOrder())
			{
				System.out.println("Is the Array in Order?: YES");
				done = true;
			}
			else
			{
				System.out.println("Is the Array in Order?: NO");
			}
			
			tries++;
			
			System.out.println("============================\n============================\n");
		}
		
		System.out.println("\n\nTries: " + tries);
	}

}
