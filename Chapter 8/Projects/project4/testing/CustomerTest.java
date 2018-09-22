package project4.testing;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import project4.Customer;

public class CustomerTest
{
	@Test
	public void testMakePurchase()
	{
		Customer sonu = new Customer();
		
		sonu.makePurchase(25.39);
		sonu.makePurchase(15.99);
		
		double[] list = {25.39, 15.99};
		
		Assert.assertEquals(Arrays.toString(list), sonu.getPurchaseList().toString());
	}
	
	@Test
	public void testGetSumOfPurchases()
	{
		Customer sonu = new Customer();
		
		sonu.makePurchase(25.39);
		sonu.makePurchase(15.99);
		
		double expected = 41.38;
		
		Assert.assertEquals(expected, sonu.getSumOfPurchases(), .001);
	}
	
	@Test
	public void testIsDiscountReached()
	{
		Customer sonu = new Customer();
		
		sonu.makePurchase(25.39);
		sonu.makePurchase(15.99);
		
		boolean expected = false;
		
		Assert.assertEquals(expected, sonu.isDiscountReached());
		
		Customer marco = new Customer();
		
		marco.makePurchase(52.39);
		marco.makePurchase(49.90);
		
		expected = true;
		
		Assert.assertEquals(expected, marco.isDiscountReached());
		
		Customer payal = new Customer();
		
		payal.makePurchase(52.39);
		payal.useDiscount();
		
		payal.makePurchase(49.90);
		payal.useDiscount();
		
		payal.completePurchase();
		
		payal.makePurchase(90.39);
		payal.useDiscount();
		
		expected = false;
		
		Assert.assertEquals(expected, payal.isDiscountReached());
	}
}
