package exercise_14_5;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class TelephoneBook
{
	// Instance Variables
	private TelephoneEntry[] entries;
	
	// Constructors
	/**
	 * Constructs a telephone book that holds up to 100 entries
	 */
	public TelephoneBook()
	{
		entries = new TelephoneEntry[100];
	}
	
	// Methods
	/**
	 * Reads a file and records data for telephone entries in this book
	 * @param fileName the name of the file to be read from
	 * @return an array of telephone entries
	 * @throws IOException
	 */
	public TelephoneEntry[] readFile(String fileName) throws IOException
	{
		File inFile = new File("src//exercise_14_5//".concat(fileName));
		Scanner in = new Scanner(inFile);
		
		try
		{
			readData(in);
			return entries;
		}
		finally
		{
			in.close();
		}
	}
	
	/**
	 * Reads a single line of data from a file
	 * @param in the file scanner object
	 * @throws BadDataException
	 */
	public void readData(Scanner in) throws BadDataException
	{
		int i = 0;
		while(in.hasNextLine() && i < entries.length)
		{
			if(i >= entries.length)
			{
				break;
			}
			
			if(in.hasNextInt() || in.hasNextDouble())
			{
				clearEntries();
				throw new BadDataException("Telephone Owner Name Expected");
			}
			String name = in.next();
			
			if(!in.hasNextLong())
			{
				clearEntries();
				throw new BadDataException("Telephone Number Expected");
			}
			long number = in.nextLong();
			
			TelephoneEntry t = new TelephoneEntry(name, number);
			entries[i] = t;
			
			i++;
		}
	}
	
	/**
	 * Clears the entries in this telephone book
	 */
	public void clearEntries()
	{
		for(int i = 0; i < entries.length; i++)
		{
			entries[i] = null;
		}
	}
	
	/**
	 * Gets the array of telephone entries
	 * @return the array of entries
	 */
	public TelephoneEntry[] getEntries()
	{
		return this.entries;
	}
	
	/**
	 * Gets a telephone entry at a given index
	 * @param i the index
	 * @return the telephone
	 */
	public TelephoneEntry getEntryAt(int i)
	{
		return this.entries[i];
	}
	
	/**
	 * Trims the telephone book by removing all null entries
	 */
	public void trimBook()
	{
		int tempLength = -1;
		
		for(int i = entries.length - 1; i > 0; i--)
		{
			if(entries[i] != null)
			{
				tempLength = i;
				break;
			}
		}
		
		TelephoneEntry[] t = new TelephoneEntry[tempLength + 1];
		for(int i = 0; i < t.length; i++)
		{
			t[i] = this.entries[i];
		}
		
		this.entries = t;
	}
	
	/**
	 * Sorts the telephone book by the name of the person associated with
	 * the entry
	 */
	public void sortByName()
	{
		Arrays.sort(this.entries, new TelephoneEntryNameComparator());
	}
	
	/**
	 * Sorts the telephone book by the number of the person associated with
	 * the entry
	 */
	public void sortByNumber()
	{
		Arrays.sort(this.entries, new TelephoneEntryNumberComparator());
	}
	
	/**
	 * Conducts a binary search to find an entry given the name of the person
	 * associated with an entry
	 * @param name the name to search for
	 * @return the index at which the telephone entry is located
	 */
	public int binarySearchName(String name)
	{
		TelephoneEntry t = new TelephoneEntry(name, 0);
		return Arrays.binarySearch(this.entries, t, new TelephoneEntryNameComparator());
	}
	
	/**
	 * Conducts a binary search to find an entry given the number of the person
	 * associated with an entry
	 * @param number the number to search for
	 * @return the index at which the telephone entry is located
	 */
	public int binarySearchNumber(long number)
	{
		TelephoneEntry t = new TelephoneEntry("", number);
		return Arrays.binarySearch(this.entries, t, new TelephoneEntryNumberComparator());
	}
	
	/**
	 * Prints the telephone book by showing the name and number of each entry
	 * @return
	 */
	public String printBook()
	{
		String s = "";
		
		for(int i = 0; i < entries.length; i++)
		{
			s += this.entries[i].toString() + "\n";
		}
		
		return s;
	}
	
	/**
	 * Returns the string representation of this phonebook
	 */
	public String toString()
	{
		return Arrays.toString(entries);
	}
}
