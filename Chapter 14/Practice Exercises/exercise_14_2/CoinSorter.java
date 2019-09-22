package exercise_14_2;

public class CoinSorter
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	/**
	 * Sorts an array of coins based on the value of the coin
	 * @param coins the array of coins
	 */
	public static void sort(Coin[] coins)
	{
		
		for(int i = 0; i < coins.length; i++)
		{
			int minPos = minimumPosition(coins, i);
			CoinArrayUtil.swap(coins, minPos, i);
		}
	}
	
	/**
	 * Finds the smallest element in a tail range of the array
	 * @param array the array to sort
	 * @param pos the first position in the array to compare
	 * @return the position of the smallest element in the range array[pos] ... array[array.length - 1]
	 */
	public static int minimumPosition(Coin[] coins, int pos)
	{
		int minPos = pos;
		
		for(int i = pos + 1; i < coins.length; i++)
		{
			if(coins[i].getValue() < coins[minPos].getValue())
			{
				minPos = i;
			}
		}
		
		return minPos;
	}
}
