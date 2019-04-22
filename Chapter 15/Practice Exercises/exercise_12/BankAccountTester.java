package exercise_12;

import org.junit.Test;
import org.junit.Assert;

public class BankAccountTester
{
	@Test
	public void testHashCode()
	{
		BankAccount a1 = new BankAccount(1000);
		BankAccount a2 = new BankAccount(10000);
		BankAccount a3 = new BankAccount(5000);
		BankAccount a4 = new BankAccount(1000);
		BankAccount a5 = new BankAccount(10000);
		BankAccount a6 = a5;
		
		System.out.println("A1: " + a1.hashCode());
		System.out.println("A2: " + a2.hashCode());
		System.out.println("A3: " + a3.hashCode());
		System.out.println("A4: " + a4.hashCode());
		System.out.println("A5: " + a5.hashCode());
		System.out.println("A6: " + a6.hashCode());
		
		Assert.assertEquals(5005, a1.hashCode());
		Assert.assertEquals(5010, a2.hashCode());
		Assert.assertEquals(5015, a3.hashCode());
		Assert.assertEquals(5020, a4.hashCode());
		Assert.assertEquals(5025, a5.hashCode());
		Assert.assertEquals(5025, a6.hashCode());
		
		Assert.assertEquals(false, a1.equals(a2));
		Assert.assertEquals(false, a1.equals(a3));
		Assert.assertEquals(false, a1.equals(a4));
		Assert.assertEquals(false, a1.equals(a5));
		Assert.assertEquals(false, a2.equals(a3));
		Assert.assertEquals(false, a2.equals(a4));
		Assert.assertEquals(false, a2.equals(a5));
		Assert.assertEquals(false, a3.equals(a4));
		Assert.assertEquals(false, a3.equals(a5));
		Assert.assertEquals(false, a4.equals(a5));
		Assert.assertEquals(true, a6.equals(a5));
	}

}
