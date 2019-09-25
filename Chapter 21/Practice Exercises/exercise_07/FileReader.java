package exercise_07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FileReader
{
	// Instance Variables
	private Lock lock;
	private File inFile;
	private ArrayList<String> words;
	
	// Constructors
	/**
	 * Constructs a file reader
	 */
	public FileReader(File inFile)
	{
		this.inFile = inFile;
		this.lock = new ReentrantLock();
		this.words = new ArrayList<>();
	}
	
	// Methods
	/**
	 * Reads the contents of a given file
	 * @param fileName the file name
	 * @return an array of all the words in a file
	 * @throws FileNotFoundException 
	 */
	public void readFile() throws FileNotFoundException
	{
		this.lock.lock();
		
		try
		{
			Scanner in = new Scanner(inFile);

			try
			{
				readData(in);
			}
			finally
			{
				in.close();
			}
		}
		finally
		{
			this.lock.unlock();
		}
	}
	
	public void readData(Scanner in)
	{
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			String[] lineWords = line.split(" ");
			
			for(int i = 0; i < lineWords.length; i++)
			{
				if(lineWords[i].contains(",") || lineWords[i].contains("."))
				{
					lineWords[i] = lineWords[i].substring(0, lineWords[i].length() - 1);
				}
				
				words.add(lineWords[i]);
			}
		}
	}
	
	public ArrayList<String> getWordsList()
	{
		this.lock.lock();
		
		try
		{
			return this.words;
		}
		finally
		{
			this.lock.unlock();
		}
	}
	
	public String getFileName()
	{
		return this.inFile.getName();
	}
}
