package exercise_4;

import java.util.ArrayList;

public class Test
{
	public static void main(String[] args)
	{
		ArrayList<String> answerStrings = new ArrayList<String>();
		
		String response = "1 3 4 6";
		
		// Go through all of the responses
		for(int i = 0; i < response.length(); i++)
		{
			int start = i;
			int end = i;
			
			// Check if the current character is a digit and not whitespace
			if(Character.isDigit(response.charAt(i)))
			{
				System.out.println("Character: " + response.charAt(i));
				System.out.println("Start: " + end);
				end++;
				System.out.println("Start Change: " + end);
			}
			else if(Character.isWhitespace(response.charAt(i)))
			{
				System.out.println("Character: whitespace");
				continue;
			}
			
			// add this substring to the answerStrings array
			answerStrings.add(response.substring(start, end));
		}
		
		System.out.println(response);
		System.out.println(answerStrings);	
	}
}
