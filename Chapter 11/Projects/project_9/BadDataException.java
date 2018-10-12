package project_9;

import java.io.IOException;

/**
 * This class reports bad input data.
 * 
 * @author Mayuresh
 *
 */
public class BadDataException extends IOException
{
	public BadDataException() {}
	
	public BadDataException(String message)
	{
		super(message);
	}
}
