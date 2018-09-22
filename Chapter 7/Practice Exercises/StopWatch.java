
public class StopWatch
{
	// Instance Variables
	private long elapsedTime;
	private long startTime;
	private boolean isRunning;
	
	// Constructors
	public StopWatch()
	{
		reset();
	}
	
	// Methods
	public void start()
	{
		if(isRunning)
		{
			return;
		}
		isRunning = true;
		startTime = System.currentTimeMillis();
	}
	
	public void stop()
	{
		if(isRunning)
		{
			return;
		}
		
		isRunning = false;
		long endTime = System.currentTimeMillis();
		elapsedTime += (endTime - startTime);
	}
	
	public long getElapsedTime()
	{
		if(isRunning)
		{
			long endTime = System.currentTimeMillis();
			return elapsedTime = endTime - startTime;
		}
		else
		{
			return elapsedTime;
		}
	}
	
	public void reset()
	{
		elapsedTime = 0;
		isRunning = false;
	}
}
