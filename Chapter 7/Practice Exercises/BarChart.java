import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * E7.17/ E7.18/ E7.19
 * 
 * Write a program that reads a sequence of input values and displays a bar chart of the
 * values, using asterisks, like this:
 * 
 * **************************
 * **************
 * ********
 * ***************
 * *******************
 * ******
 * 
 * Improve the program to work correctly when the data set contains negative values.
 * 
 * Improve the program by adding caption for each bar. Prompt the user for the captions and data values.
 * Output should look like this:
 * 
 * Egypt       *********************
 * France      ********************
 * Japan       **********************************
 * Uruguay     ********************
 * Switzerland ******************
 * 
 * Note: I asked this question on StackOverflow and I don't really understand it very much. I'll have to
 * trace the code to see what actually happens.
 * 
 * @author Mayuresh
 *
 */
public class BarChart
{
	public static void main(String[] args)
	{
		Random gen = new Random();
		
		int randNum = gen.nextInt(6) + 10;
		System.out.print("Array Size: " + randNum);
		
		int maxMin = gen.nextInt(20) + 1;
		
		System.out.println();
		
		printArray(buildArray(randNum, -maxMin, maxMin));
	}
	
	// Methods
	private static int[] buildArray(int length, int min, int max)
	{
		Random gen = new Random();
		int[] array = new int[length];
		
		for(int i = 0; i < length; i++)
		{
			array[i] = gen.nextInt(max - min + 1) + min;
		}
		return array;
	}
	
	private static String repeat(char c, int length)
	{
		char[] buffer = new char[length];
		Arrays.fill(buffer, c);
		return new String(buffer);
	}
	
	private static void printArray(int... array)
	{
		int min = -1, numLength = 1;
		
		for(int val : array)
		{
			min = Math.min(min, val);
			numLength = Math.max(numLength, Integer.toString(val).length());
		}
		
		String format = "%" + -min + "s[%" + numLength + "d]%s%n";
		
		for(int val : array)
		{
			if(val >= 0)
			{
				System.out.printf(format, "", val, repeat('*', val));
			}
			else
			{
				System.out.printf(format, repeat('*', -val), val, "");
			}
		}
	}
}
