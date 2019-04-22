package section_06;

import java.util.Scanner;
import java.util.Stack;

public class Calculator
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Stack<Integer> results = new Stack<Integer>();
		
		System.out.println("Enter one number or operator per line, Q to quit:");
		
		boolean isDone = false;
		while(!isDone)
		{
			String input = in.nextLine();
			
			// If the command is an operator, pop the arguments and push the result
			if(input.equals("+"))
			{
				results.push(results.pop() + results.pop());
			}
			else if(input.equals("-"))
			{
				Integer args2 = results.pop();
				results.push(results.pop() - args2);
			}
			else if(input.equals("*") || input.equals("x"))
			{
				results.push(results.pop() * results.pop());
			}
			else if(input.equals("/"))
			{
				Integer args2 = results.pop();
				results.push(results.pop() / args2);
			}
			else if(input.equals("Q") || input.equals("q"))
			{
				isDone = true;
			}
			// Otherwise, the command is a number, push the value
			else
			{
				results.push(Integer.parseInt(input));
			}
			
			System.out.println(results);
		}
		
		in.close();
	}
}
