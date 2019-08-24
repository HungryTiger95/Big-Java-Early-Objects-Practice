package section_04;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MeasurableTester
{
	@Test
	public void testBankAccount()
	{
		BankAccount b1 = new BankAccount(1000);
		Assert.assertEquals(1000, b1.getBalance(), 0.01);
	}
	
	@Test
	public void testAverage()
	{
		ArrayList<BankAccount> accounts = new ArrayList<>();
		accounts.add(new BankAccount(1400));
		accounts.add(new BankAccount(2100));
		accounts.add(new BankAccount(1800));
		accounts.add(new BankAccount(4000));
		accounts.add(new BankAccount(1400));
		accounts.add(new BankAccount(1500));
		
		Assert.assertEquals(2033.33, Data.average(accounts), 0.01);
	}
	
	@Test
	public void testMax()
	{
		ArrayList<BankAccount> accounts = new ArrayList<>();
		accounts.add(new BankAccount(1400));
		accounts.add(new BankAccount(2100));
		accounts.add(new BankAccount(1800));
		accounts.add(new BankAccount(4000));
		accounts.add(new BankAccount(1400));
		accounts.add(new BankAccount(1500));
		
		Assert.assertEquals(new BankAccount(4000) , Data.max(accounts));
	}
	
	@Test
	public void testMin()
	{
		ArrayList<BankAccount> accounts = new ArrayList<>();
		accounts.add(new BankAccount(1400));
		accounts.add(new BankAccount(2100));
		accounts.add(new BankAccount(1800));
		accounts.add(new BankAccount(4000));
		accounts.add(new BankAccount(1400));
		accounts.add(new BankAccount(1500));
		
		Assert.assertEquals(new BankAccount(1400) , Data.min(accounts));
	}
}
