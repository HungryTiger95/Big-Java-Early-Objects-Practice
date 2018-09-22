package exercise_14;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest
{
	CheckingAccount bob = new CheckingAccount();
	
	@Test
	public void testTransactionProcessing()
	{
		bob.deposit(1000);
		bob.deposit(500);
		bob.withdraw(200);
		bob.deposit(300);
		bob.withdraw(200);
		
		double expected = 1398.00;
		
		Assert.assertEquals(expected, bob.getBalance(), 0.01);
	}
}
