package exercise_14_5;

import java.io.IOException;

public class BadDataException extends IOException
{
	public BadDataException() {}
	
	public BadDataException(String message)
	{
		super(message);
	}
}
