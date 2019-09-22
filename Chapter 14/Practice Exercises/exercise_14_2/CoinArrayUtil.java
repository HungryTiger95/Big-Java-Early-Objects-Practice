package exercise_14_2;

public class CoinArrayUtil
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	/**
	 * Swaps two elements in an array of coins
	 * @param coins the array of coins
	 * @param i the first position to swap
	 * @param j the second position to swap
	 */
	public static void swap(Coin[] coins, int i, int j)
	{
		Coin temp = coins[i];
		coins[i] = coins[j];
		coins[j] = temp;
	}
}
