package exercise_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Write a program that reads text from a file and breaks it up into individual words. Insert the
 * words into a tree set. At the end of the input file, print all words, followed by the size of the
 * resulting set. This program determines how many unique words a text file has.
 * 
 * @author Mayuresh
 *
 */
public class UniqueWords
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File infile = new File("src\\exercise_10\\alice30.txt");
		Set<String> words = new TreeSet<String>();
		
		// Read words
		try(Scanner in = new Scanner(infile))
		{
			while(in.hasNext())
			{
				String word = in.next();
				
				// Cut off any and all characters in the beginning of the word that isn't a letter
				while(!Character.isLetter(word.charAt(0)))
				{
					word = word.substring(1);
				}
				
				// Cut off any and all character in the end of the word that isn't a letter
				while(!Character.isLetter(word.charAt(word.length() - 1)))
				{
					word = word.substring(0, word.length() - 1);
				}
				
				words.add(word.toLowerCase());
			}
		}
		
		System.out.println(words);
		System.out.println(words.size());
	}
}
