package exercise_04.testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class BankAccountSearchTest
{
	@Test
	public void testSearch()
	{
		ArrayList<BankAccount> accounts = new ArrayList<>();
		accounts.add(new BankAccount(1000));
		accounts.add(new BankAccount(15000));
		accounts.add(new BankAccount(21000));
		accounts.add(new BankAccount(2500));
		accounts.add(new BankAccount(1250));
		accounts.add(new BankAccount(4500));
		accounts.add(new BankAccount(1800));
		accounts.add(new BankAccount(9200));
		accounts.add(new BankAccount(1002));
		accounts.add(new BankAccount(3209));
		accounts.add(new BankAccount(100));
		accounts.add(new BankAccount(45));
		accounts.add(new BankAccount(640));
		Collections.sort(accounts);
		
		int pos = BinarySearcher.search(accounts, 0, accounts.size() - 1, new BankAccount(1250));
		
		boolean found = false;
		if(pos >= 0)
		{
			found = true;
		}
		assertEquals(true, found);
	}
	
	@Test
	public void testBadSearch()
	{
		ArrayList<BankAccount> accounts = new ArrayList<>();
		accounts.add(new BankAccount(1000));
		accounts.add(new BankAccount(15000));
		accounts.add(new BankAccount(21000));
		accounts.add(new BankAccount(2500));
		accounts.add(new BankAccount(1250));
		accounts.add(new BankAccount(4500));
		accounts.add(new BankAccount(1800));
		accounts.add(new BankAccount(9200));
		accounts.add(new BankAccount(1002));
		accounts.add(new BankAccount(3209));
		accounts.add(new BankAccount(100));
		accounts.add(new BankAccount(45));
		accounts.add(new BankAccount(640));
		Collections.sort(accounts);
		
		int pos = BinarySearcher.search(accounts, 0, accounts.size() - 1, new BankAccount(1999));
		
		boolean found = false;
		if(pos >= 0)
		{
			found = true;
		}
		assertEquals(false, found);
	}
}
