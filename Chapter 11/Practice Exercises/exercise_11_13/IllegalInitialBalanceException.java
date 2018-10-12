package exercise_11_13;

public class IllegalInitialBalanceException extends IllegalArgumentException
{
	public IllegalInitialBalanceException() {}
	
	public IllegalInitialBalanceException(String message)
	{
		super(message);
	}
}
