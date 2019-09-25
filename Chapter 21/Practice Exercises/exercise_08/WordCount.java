package exercise_08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WordCount implements Runnable
{
	private final static int DELAY = 10;
	private final Total total;
	private final String fileName;
	private FileReader reader;
	
	public WordCount(String fileName, Total total)
	{
		this.total = total;
		this.fileName = fileName;
		
		File inFile = new File("src\\exercise_08\\".concat(fileName));
		this.reader = new FileReader(inFile);
	}
	
	public int countWords()
	{
		try
		{
			this.reader.readFile();
			return this.reader.getWordsList().size();
		}
		catch(FileNotFoundException e) { e.printStackTrace(); }
		
		return -1;
	}
	
	@Override
    public void run()
	{
        try
        {
            System.out.printf("%-17s running in %s %s%n", fileName, Thread.currentThread().getThreadGroup().getName(), Thread.currentThread().getName());
            final long result = this.countWords();
            total.setTotal(result);
            
            System.out.printf("%-17s | %d%n", fileName, result);
            Thread.sleep(DELAY);
        }
        catch (InterruptedException e) { e.printStackTrace(); }

        if(Thread.currentThread().getThreadGroup().activeCount() == 1)
        {
            System.out.printf("%-17s | %d%n", "total", total.getTotal());
        }
    }
}
