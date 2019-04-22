package section_04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapFrequency
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Map<String, Integer> frequencies = new TreeMap<String, Integer>();
		Scanner in = new Scanner(new File("src\\section_04\\alice30.txt"));
		
		while(in.hasNext())
		{
			String word = clean(in.next());
			
			// Get the old frequency count
			Integer count = frequencies.get(word);
			
			// If there was none, put 1; otherwise, increment the count
			if(count == null)
			{
				count = 1;
			}
			else
			{
				count++;
			}
			
			frequencies.put(word, count);
		}
		
		// Print all words and counts
		for(String key : frequencies.keySet())
		{
			System.out.printf("%-20s%10d\n", key, frequencies.get(key));
		}
		
		in.close();
	}
	
	/**
	 * Removes characters from a string that are not letters
	 * @param s a string
	 * @return a string with all letters from s
	 */
	public static String clean(String s)
	{
		String r = "";
		
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			if(Character.isLetter(c))
			{
				r += c;
			}
		}
		
		return r.toLowerCase();
	}
}
