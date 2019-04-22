package section_06;

import java.util.Scanner;
import java.util.Stack;

/**
 * This program evaluates arithmetic expressions, using two stacks
 * 
 * @author Mayuresh
 *
 */
public class ExpressionCalculator
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter an Expression: ");
		String expression = in.nextLine().replace(" ", "");
		in.close();
		
		Stack<Integer> numStack = new Stack<Integer>();
		Stack<Character> opStack = new Stack<Character>();
		
		int pos = 0;
		while(pos < expression.length())
		{
			char ch = expression.charAt(pos);
			pos++;
			
			if(isOperator(ch))
			{
				if(opStack.size() == 0)
				{
					opStack.push(ch);
				}
				else
				{
					char oldOp = opStack.pop();
					
					if(precedence(ch) > precedence(oldOp))
					{
						opStack.push(oldOp);
					}
					else
					{
						evaluateTop(numStack, oldOp);
					}
					
					opStack.push(ch);
				}
			}
			else if(ch == '(')
			{
				opStack.push(ch);
			}
			else if(ch == ')')
			{
				boolean done = false;
				while(!done)
				{
					if(opStack.size() == 0)
					{
						error("No Matching (");
					}
					
					char oldOp = opStack.pop();
					if(oldOp == '(')
					{
						done = true;
					}
					else
					{
						evaluateTop(numStack, oldOp);
					}
				}
			}
			else if(Character.isDigit(ch))
			{
				int start = pos - 1;
				while(pos < expression.length() && Character.isDigit(expression.charAt(pos)))
				{
					pos++;
				}
				
				String num = expression.substring(start, pos);
				numStack.push(Integer.parseInt(num));
			}
			else
			{
				error("Number, operator, or parenthesis expected:");
			}
		}
		
		while(opStack.size() > 0)
		{
			char oldOp = opStack.pop();
			if(oldOp == '(')
			{
				error("No Matching )");
			}
			else
			{
				evaluateTop(numStack, oldOp);
			}
		}
		
		if(numStack.size() == 0)
		{
			error("Syntax Error");
		}
		System.out.println(numStack.pop());
		
		if(numStack.size() > 0)
		{
			error("Syntax Error");
		}
	}
	
	// Methods
	/**
	 * Tests if a token is a operator
	 * @param ch the token
	 * @return true if ch is one of: + - / *
	 */
	public static boolean isOperator(char ch)
	{
		return ch == '+' || ch == '-' || ch == '/' || ch == '*';
	}
	
	/**
	 * Prints an error message and exits
	 * @param message information about the error
	 */
	public static void error(String message)
	{
		System.out.println("ERROR: " + message + ".");
		System.exit(1);
	}
	
	/**
	 * Computes the precedence level of an operator
	 * @param ch the operator
	 * @return the precedence level(1 = lowest, 3 = highest)
	 */
	public static int precedence(char ch)
	{
		if(ch == '+' || ch == '-')
		{
			return 1;
		}
		else if(ch == '*' || ch == '/')
		{
			return 2;
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * Computes a new value and pushes it on the stack
	 * @param num the stack for the operands and result
	 * @param op the operation to use
	 */
	public static void evaluateTop(Stack<Integer> num, char op)
	{
		if(num.size() == 0)
		{
			error("Syntax Error");
		}
		
		int y = num.pop();
		
		if(num.size() == 0)
		{
			error("Syntax Error");
		}
		
		int x = num.pop();
		int z = 0;
		
		if(op == '*')
		{
			z = x * y;
		}
		else if(op == '/')
		{
			if(y == 0)
			{
				error("Divide by 0");
			}
			else
			{
				z = x / y;
			}
		}
		else if(op == '+')
		{
			z = x + y;
		}
		else if(op == '-')
		{
			z = x - y;
		}
		else
		{
			error("Syntax Error");
		}
		
		num.push(z);
	}
}
