package exercise_07;

import java.io.File;
import java.io.FileNotFoundException;

public class WordCount implements Runnable
{
	// Instance Variables
	private final static int DELAY = 10;
	private FileReader reader;
	
	// Constructors
	public WordCount(String fileName)
	{
		File inFile = new File("src\\exercise_07\\".concat(fileName));
		reader = new FileReader(inFile);
	}
	
	// Methods
	public void run()
	{
		try
		{
			reader.readFile();
			System.out.println(reader.getFileName() + ": " + reader.getWordsList().size());
			
			Thread.sleep(DELAY);
		}
		catch(InterruptedException e) {}
		catch(FileNotFoundException e) { System.out.println("FileNotFound"); }
	}
}
