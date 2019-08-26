package exercise_06;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.ArrayList;

public class MergeSortTest
{
	public static <T> String printArray(T[] array)
	{
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(T element : array)
		{
			s.append(element.toString() + ", ");
		}
		String str = s.toString().substring(0, s.length() - 2);
		return str + "]";
	}
	
//	@Test
//	public void testGenericSelectionSort()
//	{
//		// Create an array with and print it out
//		Integer[] a = new Integer[12];
//		a[0] = 10;
//		a[1] = 50;
//		a[2] = 40;
//		a[3] = 100;
//		a[4] = 105;
//		a[5] = 503;
//		a[6] = 254;
//		a[7] = 345;
//		a[8] = 654;
//		a[9] = 123;
//		a[10] = 1;
//		a[11] = 370;
//		
//		// Print out the array
//		System.out.println("Original : " + printArray(a).trim());
//		
//		// Time the sort
//		StopWatch t = new StopWatch();
//		
//		t.start();
//		MergeSorter.sort(a);
//		t.stop();
//		
//		// Create an array that the final array should look like
//		ArrayList<Integer> expected = new ArrayList<>();
//		expected.add(1);
//		expected.add(10);
//		expected.add(40);
//		expected.add(50);
//		expected.add(100);
//		expected.add(105);
//		expected.add(123);
//		expected.add(254);
//		expected.add(345);
//		expected.add(370);
//		expected.add(503);
//		expected.add(654);
//		
//		// assert the two arrays
//		assertEquals(expected.toString(), printArray(a));
//		
//		// Print out the Results
//		System.out.println("Sorted: " + printArray(a).trim());
//		System.out.println("Elapsed Time: " + t.getElapsedTime() + " milliseconds");
//	}
	
	@Test
	public void testBankAccountSort()
	{
		BankAccount[] accounts = new BankAccount[13];
		accounts[0] = new BankAccount(1000);
		accounts[1] = new BankAccount(15000);
		accounts[2] = new BankAccount(21000);
		accounts[3] = new BankAccount(2500);
		accounts[4] = new BankAccount(1250);
		accounts[5] = new BankAccount(4500);
		accounts[6] = new BankAccount(1800);
		accounts[7] = new BankAccount(9200);
		accounts[8] = new BankAccount(1002);
		accounts[9] = new BankAccount(3209);
		accounts[10] = new BankAccount(100);
		accounts[11] = new BankAccount(45);
		accounts[12] = new BankAccount(640);
		System.out.println("Original:\n" + printArray(accounts).trim());

		// Time the sort
		StopWatch t = new StopWatch();

		t.start();
		MergeSorter.sort(accounts);
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

		assertEquals(expected.toString(), printArray(accounts));

		// Print out the Results
		System.out.println("Sorted:\n" + printArray(accounts));
		System.out.println("Elapsed Time: " + t.getElapsedTime() + " milliseconds");
	}
}
