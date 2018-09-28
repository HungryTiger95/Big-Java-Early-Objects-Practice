package exercise_10_6;

import org.junit.Test;
import org.junit.Assert;

public class CoinTest
{
	@Test
	public void testComparable()
	{
		Coin penny = new Coin(.01, "penny");
		Coin dime = new Coin(.10, "dime");
		Coin myCoin = new Coin(.01, "my coin");
		
		Assert.assertEquals(-1, penny.compareTo(dime));
		Assert.assertEquals(0, penny.compareTo(myCoin));
		Assert.assertEquals(-1, myCoin.compareTo(dime));
	}
}
