package exercise_14_5.testing;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;
import org.junit.Assert;

import exercise_14_5.BadDataException;
import exercise_14_5.TelephoneBook;
import exercise_14_5.TelephoneEntry;

public class TelephoneBookTester
{
	@Test
	public void testReadFile()
	{
		TelephoneBook b = new TelephoneBook();
		
		try
		{
			b.readFile("telephone_numbers.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		catch(BadDataException e)
		{
			System.out.println("Bad Data: " + e.getMessage());
		}
		catch(IOException e)
		{
			e.printStackTrace();;
		}
		
		// Hard Code what the answer should be
		TelephoneEntry[] entries = new TelephoneEntry[100];
		entries[0] = new TelephoneEntry("Virginia", 3566906532L);
		entries[1] = new TelephoneEntry("Suman", 4727880712L);
		entries[2] = new TelephoneEntry("Priya", 6688908586L);
		entries[3] = new TelephoneEntry("Deepali", 5894799608L);
		entries[4] = new TelephoneEntry("Kuldeep", 2919343535L);
		entries[5] = new TelephoneEntry("Vipul", 2639987628L);
		entries[6] = new TelephoneEntry("Roshni", 2784608336L);
		entries[7] = new TelephoneEntry("Sanjana", 2508196513L);
		entries[8] = new TelephoneEntry("Gurmeet", 8622411961L);
		entries[9] = new TelephoneEntry("Gopal", 6832960605L);
		
		Assert.assertEquals(Arrays.toString(entries), b.toString());
	}
	
	@Test
	public void testReadFile2()
	{
		TelephoneBook b = new TelephoneBook();
		Scanner in = new Scanner(System.in);
		
		boolean isDone = false;
		while(!isDone)
		{
			try
			{
				System.out.print("Enter File Name: ");
				String fileName = in.next();
				
				b.readFile(fileName);
				
				isDone = true;
			}
			catch(FileNotFoundException e)
			{
				System.out.println("File Not Found");
			}
			catch(BadDataException e)
			{
				System.out.println("Bad Data: " + e.getMessage());
			}
			catch(IOException e)
			{
				e.printStackTrace();;
			}
		}
		in.close();
		
		// Hard Code what the answer should be
		TelephoneEntry[] entries = new TelephoneEntry[100];
		entries[0] = new TelephoneEntry("Virginia", 3566906532L);
		entries[1] = new TelephoneEntry("Suman", 4727880712L);
		entries[2] = new TelephoneEntry("Priya", 6688908586L);
		entries[3] = new TelephoneEntry("Deepali", 5894799608L);
		entries[4] = new TelephoneEntry("Kuldeep", 2919343535L);
		entries[5] = new TelephoneEntry("Vipul", 2639987628L);
		entries[6] = new TelephoneEntry("Roshni", 2784608336L);
		entries[7] = new TelephoneEntry("Sanjana", 2508196513L);
		entries[8] = new TelephoneEntry("Gurmeet", 8622411961L);
		entries[9] = new TelephoneEntry("Gopal", 6832960605L);
		
		Assert.assertEquals(Arrays.toString(entries), b.toString());
	}
	
	@Test
	public void testClearEntries()
	{
		TelephoneBook b = new TelephoneBook();

		try
		{
			b.readFile("telephone_numbers.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		catch(BadDataException e)
		{
			System.out.println("Bad Data: " + e.getMessage());
		}
		catch(IOException e)
		{
			e.printStackTrace();;
		}
		
		// Should print all the entries in the text file
		//System.out.println(b.toString());
		
		// Clear all entries
		b.clearEntries();
		
		// Create an empty array
		TelephoneEntry[] entries = new TelephoneEntry[100];
		
		// Test
		Assert.assertEquals(Arrays.toString(entries), b.toString());
	}
	
	@Test
	public void testTrim()
	{
		TelephoneBook b = new TelephoneBook();
		
		try
		{
			b.readFile("telephone_numbers.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		catch(BadDataException e)
		{
			System.out.println("Bad Data: " + e.getMessage());
		}
		catch(IOException e)
		{
			e.printStackTrace();;
		}
		
		// Trim the entries
		b.trimBook();
		
		TelephoneEntry[] entries = new TelephoneEntry[10];
		entries[0] = new TelephoneEntry("Virginia", 3566906532L);
		entries[1] = new TelephoneEntry("Suman", 4727880712L);
		entries[2] = new TelephoneEntry("Priya", 6688908586L);
		entries[3] = new TelephoneEntry("Deepali", 5894799608L);
		entries[4] = new TelephoneEntry("Kuldeep", 2919343535L);
		entries[5] = new TelephoneEntry("Vipul", 2639987628L);
		entries[6] = new TelephoneEntry("Roshni", 2784608336L);
		entries[7] = new TelephoneEntry("Sanjana", 2508196513L);
		entries[8] = new TelephoneEntry("Gurmeet", 8622411961L);
		entries[9] = new TelephoneEntry("Gopal", 6832960605L);
		
		Assert.assertEquals(Arrays.toString(entries), b.toString());
		Assert.assertEquals(10, b.getEntries().length);
	}
	
	@Test
	public void testSort()
	{
		TelephoneBook b = new TelephoneBook();

		try
		{
			b.readFile("telephone_numbers.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		catch(BadDataException e)
		{
			System.out.println("Bad Data: " + e.getMessage());
		}
		catch(IOException e)
		{
			e.printStackTrace();;
		}
		
		b.trimBook();
		
		System.out.println(b.printBook());
		b.sortByName();
		System.out.println(b.printBook());
	}
	
	@Test
	public void testNameSearcher()
	{
		TelephoneBook b = new TelephoneBook();

		try
		{
			b.readFile("telephone_numbers.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
		}
		catch(BadDataException e)
		{
			System.out.println("Bad Data: " + e.getMessage());
		}
		catch(IOException e)
		{
			e.printStackTrace();;
		}
		b.trimBook();
		
		b.sortByName();
		System.out.println("Found At: " + b.binarySearchName("Gopal"));
		
		Assert.assertEquals(1, b.binarySearchName("Gopal"));
		Assert.assertEquals(5, b.binarySearchName("Roshni"));
	}
}
