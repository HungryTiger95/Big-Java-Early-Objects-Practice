package exercise_05;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class GenericSelectionSortTest
{
	@Test
	public void testGenericSelectionSort()
	{
		// Create an array with and print it out
		ArrayList<Integer> a = new ArrayList<>();
		a.add(10);
		a.add(50);
		a.add(40);
		a.add(100);
		a.add(105);
		a.add(503);
		a.add(254);
		a.add(345);
		a.add(654);
		a.add(123);
		a.add(1);
		a.add(370);
		System.out.println("Original:\n" + a.toString() + "\n");
		
		// Time the sort
		StopWatch t = new StopWatch();
		
		t.start();
		SelectionSorter.sort(a);
		t.stop();
		
		// Ceate an array that the final array should look like
		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(10);
		expected.add(40);
		expected.add(50);
		expected.add(100);
		expected.add(105);
		expected.add(123);
		expected.add(254);
		expected.add(345);
		expected.add(370);
		expected.add(503);
		expected.add(654);
		
		// assert the two arrays
		assertEquals(expected.toString(), a.toString());
		
		// Print out the Results
		System.out.println("Sorted:\n" + a.toString());
		System.out.println("Elapsed Time: " + t.getElapsedTime() + " milliseconds");
	}
	
	@Test
	public void testBankAccountSort()
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
		System.out.println("Original:\n" + accounts.toString() + "\n");

		// Time the sort
		StopWatch t = new StopWatch();

		t.start();
		SelectionSorter.sort(accounts);
		t.stop();
		
		ArrayList<BankAccount> expected = new ArrayList<>();
		expected.add(new BankAccount(45));
		expected.add(new BankAccount(100));
		expected.add(new BankAccount(640));
		expected.add(new BankAccount(1000));
		expected.add(new BankAccount(1002));
		expected.add(new BankAccount(1250));
		expected.add(new BankAccount(1800));
		expected.add(new BankAccount(2500));
		expected.add(new BankAccount(3209));
		expected.add(new BankAccount(4500));
		expected.add(new BankAccount(9200));
		expected.add(new BankAccount(15000));
		expected.add(new BankAccount(21000));

		assertEquals(expected.toString(), accounts.toString());

		// Print out the Results
		System.out.println("Sorted:\n" + accounts.toString());
		System.out.println("Elapsed Time: " + t.getElapsedTime() + " milliseconds");
	}
}
