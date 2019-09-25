package exercise_07;

import java.util.ArrayList;

public class WordCountThreadRunner
{
	public static void main(String[] args)
	{
		ArrayList<WordCount> wordCountFiles = new ArrayList<>();
		ArrayList<Thread> threads = new ArrayList<>();
		
		for(String fileName : args)
		{
			WordCount count = new WordCount(fileName);
			wordCountFiles.add(count);
			
			Thread countThread = new Thread(count);
			threads.add(countThread);
		}
		
		for(Thread thread : threads)
		{
			thread.start();
		}
	}
}
