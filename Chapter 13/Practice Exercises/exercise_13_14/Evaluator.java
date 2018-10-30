package exercise_13_14;

/**
 * Extend the expression evaluator so that it can handle the % operator as well as
 * a "raise to power" operator ^. For example, 2 ^ 3 should evaluate to 8. As in
 * mathematics, raising to a power should bind more strongly than
 * multiplication: 5 * 2 ^ 3 is 40.
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
		int value = getPowValue();
		boolean isDone = false;
		
		while(!isDone)
		{
			String next = tokenizer.peekToken();
			
			if("*".equals(next) || "/".equals(next) || "%".equals(next))
			{
				tokenizer.nextToken();
				int value2 = getFactorValue();
				
				if("*".equals(next))
				{
					value = value * value2;
				}
				else if("/".equals(next))
				{
					value = value / value2;
				}
				else
				{
					value = value % value2;
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
	 * Evaluates the next power term found in the expression
	 * @return the value of the term
	 */
	public int getPowValue()
	{
		int value = getFactorValue();
		boolean isDone = false;
		
		while(!isDone)
		{
			String next = tokenizer.peekToken();
			
			if("^".equals(next))
			{
				tokenizer.nextToken();
				int value2 = getFactorValue();
				
				value = (int) Math.pow(value, value2);
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
