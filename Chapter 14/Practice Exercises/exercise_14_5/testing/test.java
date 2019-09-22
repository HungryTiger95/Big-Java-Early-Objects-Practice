package exercise_14_5.testing;

import java.io.FileNotFoundException;
import java.io.IOException;

import exercise_14_5.BadDataException;
import exercise_14_5.TelephoneBook;

public class test
{
	public static void main(String[] args)
	{
		// Creates a new telephone book
		TelephoneBook b = new TelephoneBook();

		try
		{
			// Read a file with telephone number entries
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
		
		// prints out all the elements of the array, there should be 100 because the array was instantiated with size of 100
		for(int i = 0; i < b.getEntries().length; i++)
		{
			System.out.print("Index: " + (i + 1) + "---");
			try
			{
				System.out.println(b.getEntryAt(i).toString());
			}
			catch(NullPointerException e)
			{
				System.out.println("null");
			}
		}
		
		// Trim the entries
		b.trimBook();
		
		// Print again
		for(int i = 0; i < b.getEntries().length; i++)
		{
			System.out.print("Index: " + (i + 1) + "---");
			try
			{
				System.out.println(b.getEntryAt(i).toString());
			}
			catch(NullPointerException e)
			{
				System.out.println("null");
			}
		}
		
		// Print out the unsorted telephone book
		System.out.println("\nUnsorted: \n=====================================================");
		System.out.println(b.printBook());
		
		// Print out a telephone book that is sorted by name
		System.out.println("\nSorted By Name: =================================================");
		b.sortByName();
		System.out.println(b.printBook());
		
		// Print out a telephone book that is sorted by number
		System.out.println("\nSorted By Number: ===============================================");
		b.sortByNumber();
		System.out.println(b.printBook());
		
		// Sort a telephone book by name and then conduct a binary search on that book by giving a name to search for
		System.out.println("\nSorted By Name: =================================================");
		b.sortByName();
		System.out.println(b.printBook());
		System.out.println("Roshni is Found at: " + b.binarySearchName("Sanjana"));
		
		// Sort a telephone book by number and then conduct a binary search on that book by giving a number to search for
		System.out.println("\nSorted By Number: ===============================================");
		b.sortByNumber();
		System.out.println(b.printBook());
		System.out.println("Priya is Found at: " + b.binarySearchNumber(4727880712L));
	}
}
