package section_05;

/**
 * This class breaks up a string describing an expression
 * into tokens: numbers, parentheses, and operators
 * 
 * @author Mayuresh
 *
 */
public class ExpressionTokenizer
{
	// Instance Variables
	private String input;
	private int start;
	private int end;
	
	// Constructors
	/**
	 * Constructs a tokenizer
	 * @param anInput the string to tokenize
	 */
	public ExpressionTokenizer(String anInput)
	{
		this.input = anInput;
		this.start = 0;
		this.end = 0;
		
		nextToken();
	}
	
	// Methods
	/**
	 * Peeks at the next token without consuming it
	 * @return the next token or null if there are no more tokens
	 */
	public String peekToken()
	{
		if(this.start >= this.input.length())
		{
			return null;
		}
		else
		{
			return this.input.substring(this.start, this.end);
		}
	}
	
	/**
	 * Gets the next token and moves the tokenizer to the following token
	 * @return the next token or null if there are no more tokens
	 */
	public String nextToken()
	{
		String r = peekToken();
		this.start = this.end;
		
		if(this.start >= this.input.length())
		{
			return r;
		}
		
		if(Character.isDigit(this.input.charAt(end)))
		{
			this.end = this.start + 1;
			
			while(this.end < this.input.length() && Character.isDigit(this.input.charAt(this.end)))
			{
				this.end++;
			}
		}
		else
		{
			this.end = this.start + 1;
		}
		
		return r;
	}
}
