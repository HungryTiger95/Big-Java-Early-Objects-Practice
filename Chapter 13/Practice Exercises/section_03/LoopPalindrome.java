package section_03;

import java.util.Scanner;

/**
 * Frequently, the iterative and recursive solution have essentially the same performance.
 * This solution keeps two index variables: start and end. The first index starts at the
 * beginning of the string and is advanced whenever a letter has been matched or a
 * non letter has been ignored. The second index starts at the end of the string and moves
 * toward the beginning.
 * 
 * Both the iteration and the recursion run at about the same speed. If a palindrome has
 * n characters, the iteration executes the loop between n/2 and n times, depending on how
 * many of the character are letters, because one or both index variables are moved in each
 * step. Similarly, the recursive solution calls itself between n/2 and n times, because one
 * or two characters are removed in each step.
 * 
 * In such a situation, the iterative solution tends to be a bit faster, because each recursive
 * method call takes a certain amount of processor time. In principle, it is possible for a smart
 * compiler to avoid recursive method calls if they follow simple patterns, but most Java compilers
 * don't do that. Form that point of view, an iterative solution is preferable.
 * 
 * However, many problems have recursive solutions that are easier to understand and implement
 * correctly than their iterative counterparts.
 * 
 * @author Mayuresh
 *
 */
public class LoopPalindrome
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a text: ");
		String text = in.nextLine();
		
		System.out.println("Is Palindrome: " + isPalindrome(text));
		in.close();
	}
	
	public static boolean isPalindrome(String text)
	{
		int start = 0;
		int end = text.length() - 1;
		
		while(start < end)
		{
			char first = Character.toLowerCase(text.charAt(start));
			char last = Character.toLowerCase(text.charAt(end));
			
			if(Character.isLetter(first) && Character.isLetter(end))
			{
				// Both are letters
				if(first == last)
				{
					start++;
					end--;
				}
				else
				{
					return false;
				}
			}
			
			if(!Character.isLetter(last))
			{
				end--;
			}
			
			if(!Character.isLetter(end))
			{
				start++;
			}
		}
		
		return true;
	}
}
