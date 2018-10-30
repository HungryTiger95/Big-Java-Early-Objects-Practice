package exercise_13_13;

import java.util.ArrayList;

/**
 * Implement a SubsetGenerator that generates all subsets of the characters of a
 * string. For example, the subsets of the characters of the string "rum" are the
 * eight strings
 * 
 * 		"rum", "ru", "rm", "r", "um", "u", "m", ""
 * 
 * Note that the subsets don't have to be substrings - for example, "rm" isn't
 * a substring of "rum"
 * 
 * @author Mayuresh
 *
 */
public class SubsetGenerator
{
	public static void main(String[] args)
	{
		System.out.println(subsets("rum"));
	}
	
	public static ArrayList<String> subsets(String text)
	{
		ArrayList<String> results = new ArrayList<String>();
		
		if(text.equals(""))
		{
			results.add(text);
		}
		else
		{
			char c = text.charAt(0);
			String remaining = text.substring(1);
			
			ArrayList<String> subsets = subsets(remaining);
			
			results.addAll(subsets);
			
			for(String s : subsets)
			{
				results.add(c + s);
			}
		}
		
		return results;
	}
}
