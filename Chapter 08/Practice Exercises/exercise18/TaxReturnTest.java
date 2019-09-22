package exercise18;

import org.junit.Assert;
import org.junit.Test;

public class TaxReturnTest
{
	@Test
	public void getTax()
	{
		TaxReturn mayuresh = new TaxReturn(45000, 1);
		
		double actual = mayuresh.getTax();
		double expected = 6450;
		
		Assert.assertEquals(expected, actual, .001);
	}
}
