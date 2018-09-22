import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListPractice
{
	public static void main(String[] args)
	{
		// Instantiate the ArrayList, Random, and Scanner objects
		Random gen = new Random();
		ArrayList<Integer> nums = new ArrayList<>();
		ArrayList<Integer> numCount = new ArrayList<>();
		ArrayList<Integer> numAverage = new ArrayList<>();
		Scanner in = new Scanner(System.in);
	
		// Fill the array with 500 random numbers between 1 and 50
		int randNum;
		int count = 0;
		
		for(int i = 0; i < 20; i++)
		{
			randNum = gen.nextInt(10) + 1;
			nums.add(randNum);
			count++;
		}
		
		// Print this array
		System.out.println(nums);
		System.out.println("Total Count: " + count);
		
		// Find out how many of each values there are
		for(int i = 0; i < nums.size(); i++)
		{
			for(int j = 0; j < nums.size(); j++)
			{
				int arrayCount = 0;
				
				if(nums.indexOf(j) == j)
				{
					
				}
			}
		}
	}
}
