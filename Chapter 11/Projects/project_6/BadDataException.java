package project_6;

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
