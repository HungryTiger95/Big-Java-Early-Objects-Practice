import java.util.Random;

/**
 * Just a simple test to see how the Random class works
 * 
 * @author Mayuresh
 *
 */
public class RandTest
{
	public static void main(String[] args)
	{
		Random gen = new Random();
		
		int num;
		int zeroCount = 0;
		int oneCount = 0;
		int twoCount = 0;
		int threeCount = 0;
		int fourCount = 0;
		
		for(int i = 0; i < 10000; i++)
		{
			num = gen.nextInt(3) + 1;
			
			if(num == 0)
			{
				zeroCount++;
			}
			else if(num == 1)
			{
				oneCount++;
			}
			else if(num == 2)
			{
				twoCount++;
			}
			else if(num == 3)
			{
				threeCount++;
			}
			else if(num == 4)
			{
				fourCount++;
			}
			else
			{
				System.out.println("Error");
			}
		}
		
		System.out.printf("0: %d\n1: %d\n2: %d\n3: %d\n4: %d\n", zeroCount, oneCount, twoCount, threeCount, fourCount);
	}
}
