package section_06;

import java.util.Scanner;
import java.util.Stack;

/**
   This program uses a stack to check whether an expression has balanced 
   parentheses.
 */
public class ParenChecker
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an expression with { [ ( ) ] }: ");
		String expression = in.nextLine();
		in.close();
		
		Stack<Character> parens = new Stack<Character>();

		for (int i = 0; i < expression.length(); i++)
		{
			char ch = expression.charAt(i);
			
			if (ch == '(' || ch == '[' || ch == '{')
			{
				parens.push(ch);
			}
			else if (ch == ')' || ch == ']' || ch == '}')
			{
				if (parens.size() == 0)
				{
					System.out.println("Not balanced.");
					return;
				}
				
				char open = parens.pop();
				
				if (!(open == '(' && ch == ')' || open == '[' && ch == ']' || open == '{' && ch == '}'))
				{
					System.out.println("Not balanced.");
					return;
				}
			}
		}
		if (parens.size() == 0) 
		{ 
			System.out.print("Balanced.");
		}
		else
		{ 
			System.out.print("Not balanced.");
		}
	}
}
