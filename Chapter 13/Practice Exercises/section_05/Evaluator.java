package section_05;

/**
 * A class that can compute the value of an arithmetic expression
 * 
 * Mutual Recursion:
 * 
 * In a mutual recursion, a set of cooperating methods calls each other repeatedly.
 * This technique is significantly more advanced than simple recursion.
 * 
 * Computing such an expression is complicated by the fact that * and / bind more
 * strongly than + and -, and that parentheses can be used to group subexpressions.
 * 
 * Look at figure 3 on page 608 that shows a set of syntax diagrams that describes
 * the syntax of these expressions.
 * 
 * This is how the syntax diagrams work:
 * 
 * 		- Enter the expression syntax diagram. The arrow  points directly to term,
 * 			giving you no alternative.
 * 
 * 		- Enter the term syntax diagram. The arrow points to factor, again giving
 * 			you no choice.
 * 
 * 		- Enter the factor diagram. You have two choices: to follow the top branch
 * 			or the bottom branch. Because the first input token is the number 3 and
 * 			not a (, follow the bottom branch.
 * 
 * 		- Accept the input token because it matches the number. The unprocessed
 * 			input is now +4*5.
 * 
 * 		- Follow the arrow out of number to the end of factor. As in a method call,
 * 			you now back up, returning to the end of the factor element of the
 * 			term diagram.
 * 
 * 		- Now you have another choice - to loop back in the term diagram, or to exit.
 * 			The next input token is a +, and it matches neither the * or the / that
 * 			would be required to loop back. So you exit, returning to expression.
 * 
 * 		- Again, you have a choice, to loop back or to exit. Now the + matches one
 * 			of the choices in the loop. Accept the + in the input and move back to the
 * 			term element. The remaining input is 4*5.
 * 
 * In this fashion, an expression is broken down into a sequence of terms, separated by
 * + or -, each term is broken down into a sequence of factors, each separated by * or /,
 * and each factor is either a parenthesized expression or a number.
 * 
 * Why do the syntax diagrams help us compute the value of the tree? If you look at
 * the syntax trees, you will see that they accurately represent which operations should
 * be carried out first. In the first tree, 4 and 5 should be multiplied, and then the
 * result should be added to 3. In the second tree, 3 and 4 should be added, and the
 * result should be multiplied by 5.
 * 
 * The Evaluator makes use of an expressionTokenizer class, which breaks up an input
 * string into tokens - numbers, operators, and parentheses.
 * 
 * When you call nextToken, the next input token is returned as a string. peekToken,
 * which allows you to see the next token without consuming it. To see why the
 * peekToken method is necessary, consider the syntax diagram of the term type.
 * If the next token is a * or /, you want to continue adding and subtracting terms.
 * But if the next token is another character, such as a + or a -, you want to stop
 * without actually consuming it, so that the token can be considered later.
 * 
 * The getExpressionValue method first calls getTermValue to get the value of the
 * first terms of the expression. Then it checks whether the next input token is
 * one of + or -. If so, it calls getTermValue again and adds or subtracts it.
 * 
 * The gettermValue method calls getFactorValue in the same way, multiplying or
 * dividing the factor values. Finally, the getFactorValue method checks whether
 * the next input is a number, or whether it begins with a ( token. In the first
 * case, the value is simply the value of the number. However, in the second case,
 * the getFactorValue method makes a recursive call to getExpressionValue. Thus,
 * the three methods are mutually recursive.
 * 
 * As always with a recursive solution, you need to ensure that the recursion
 * terminates. In this situation, that is easy to see when you consider the
 * situation in which getExpressionValue calls itself. The second call works on
 * a shorter subexpression than the original expression. At each recursive call,
 * at least some of the tokens of the input string are consumed, so eventually the
 * recursion must come to an end.
 * 
 * @author Mayuresh
 *
 */
public class Evaluator
{
	// Instance Variables
	private ExpressionTokenizer tokenizer;
	
	// Constructors
	/**
	 * Constructs an evaluator
	 * @param anExpression a string containing the expression to be evaluated
	 */
	public Evaluator(String anExpression)
	{
		tokenizer = new ExpressionTokenizer(anExpression);
	}
	
	// Methods
	/**
	 * Evaluates the expression
	 * @return the value of the expression
	 */
	public int getExpressionValue()
	{
		int value = getTermValue();
		boolean isDone = false;
		
		while(!isDone)
		{
			String next = tokenizer.peekToken();
			
			if("+".equals(next) || "-".equals(next))
			{
				tokenizer.nextToken();
				
				int value2 = getTermValue();
				
				if("+".equals(next))
				{
					value = value + value2;
				}
				else
				{
					value = value - value2;
				}
			}
			else
			{
				isDone = true;
			}
		}
		
		return value;
	}
	
	/**
	 * Evaluates the next term found in the expression
	 * @return the value of the term
	 */
	public int getTermValue()
	{
		int value = getFactorValue();
		boolean isDone = false;
		
		while(!isDone)
		{
			String next = tokenizer.peekToken();
			
			if("*".equals(next) || "/".equals(next))
			{
				tokenizer.nextToken();
				int value2 = getFactorValue();
				
				if("*".equals(next))
				{
					value = value * value2;
				}
				else
				{
					value = value / value2;
				}
			}
			else
			{
				isDone = true;
			}
		}
		
		return value;
	}
	
	/**
	 * Evaluates the next factor found in the expression
	 * @return the value of the factor
	 */
	public int getFactorValue()
	{
		int value;
		String next = tokenizer.peekToken();
		
		if("(".equals(next))
		{
			tokenizer.nextToken();
			value = getExpressionValue();
			tokenizer.nextToken();
		}
		else
		{
			value = Integer.parseInt(tokenizer.nextToken());
		}
	
		return value;
	}	
}
