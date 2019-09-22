import java.util.Random;
import java.util.Scanner;

public class ArrayMethodsHasDuplicateTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Random generator = new Random();
		
		System.out.print("Enter Array Length: ");
		int arrayLength = in.nextInt();
		
		in.close();
		
		int[] nums = new int[arrayLength];
		
		for(int i = 0; i < arrayLength; i++)
		{
			int randNum = generator.nextInt(49) + 1;
			nums[i] = randNum;
		}
		
		ArrayMethods array = new ArrayMethods(nums);
		System.out.println("\nThis Array: ");
		array.printArray();
		
		System.out.println("\nDoes the Array Have Duplicate Elements?: " + array.hasDuplicate());
	}

}
