package exercise_14_2;

public class CoinTester
{
	public static void main(String[] args)
	{
		Coin c1 = new Coin("Quarter", 0.25);
		Coin c2 = new Coin("Dime", 0.10);
		Coin c3 = new Coin("Nickel", 0.05);
		Coin c4 = new Coin("Penny", 0.01);
		
		Coin[] coins = new Coin[7];
		coins[0] = c1;
		coins[1] = c3;
		coins[2] = c2;
		coins[3] = c4;
		coins[4] = new Coin("Rink", 0.50);
		coins[5] = new Coin("Wern", 0.15);
		coins[6] = new Coin("Lans", 0.75);
		
		for(int i = 0; i < coins.length; i++)
		{
			System.out.printf("[name=%s value=%.2f]\n", coins[i].getName(), coins[i].getValue());
		}
		System.out.println();
		
		CoinSorter.sort(coins);
		for(int i = 0; i < coins.length; i++)
		{
			System.out.printf("[name=%s value=%.2f]\n", coins[i].getName(), coins[i].getValue());
		}
	}
}
