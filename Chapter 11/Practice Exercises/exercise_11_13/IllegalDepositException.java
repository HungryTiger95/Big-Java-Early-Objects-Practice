package exercise_11_13;

public class IllegalDepositException extends IllegalArgumentException
{
	public IllegalDepositException() {}
	
	public IllegalDepositException(String message)
	{
		super(message);
	}
}
