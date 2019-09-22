package exercise_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Use a stack to reverse the words of a sentence. Keep reading words until you have a word
 * that ends in a period, adding them onto a stack. When you have a word with a period, pop
 * the words off and print them. Stop when there are no more words in the input. For example,
 * you should turn the input:
 * 
 * 		Mary had a little lamb. Its fleece was white as snow.
 * 
 * into
 * 
 * 		Lamb little a had mary. Snow as white was fleece its.
 * 
 * Pay attention to capitalization and the placement of the period.
 * 
 * @author Mayuresh
 *
 */
public class ReverseSentence
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	public static void main(String[] args)
	{
		File file = new File("src\\exercise_06\\file.txt");
		try(Scanner in = new Scanner(file))
		{	
			while(in.hasNext())
			{
				Stack<String> sentence = new Stack<String>();
				
				// Push each word in the sentence into the stack
				do
				{
					String word = in.next();
					
					if(word.contains("."))
					{
						sentence.push(word.substring(0, word.length() -1));
						break;
					}
					else
					{
						sentence.push(word);
					}
				}
				while(!sentence.peek().contains("."));
				
				// Pop off each word from the stack and print out the reverse
				reverseSentence(sentence);
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getStackTrace());
		}
	}
	
	/**
	 * Reverses a sentence
	 * @param sentence the sentence to reverse given as a stack
	 */
	public static void reverseSentence(Stack<String> sentence)
	{
		// Pop off the top of the stack, when it reaches the end, put a period
		int startSize = sentence.size();
		while(sentence.size() > 0)
		{
			if(sentence.size() == startSize)
			{
				// Last word in the sentence would the first word in the new sentence and
				// it must be capitalized
				String firstWord = sentence.pop();
				String word = firstWord.substring(0, 1).toUpperCase();
				word += firstWord.substring(1);
				
				System.out.printf("%s ", word);
			}
			else if(sentence.size() == 1)
			{
				System.out.printf("%s. ", sentence.pop().toLowerCase());
			}
			else
			{
				System.out.printf("%s ", sentence.pop());
			}
		}
	}
}
