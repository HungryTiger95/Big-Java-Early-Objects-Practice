package exercise_06;

public class StopWatch
{
	// Instance Variables
	private long elapsedTime;
	private long startTime;
	private boolean isRunning;
	
	// Constructors
	/**
	 * Constructs a stopwatch that is in the stopped state and
	 * has no time accumulated
	 */
	public StopWatch()
	{
		reset();
	}
	
	// Methods
	/**
	 * Starts the stopwatch. Time starts accumulating now.
	 */
	public void start()
	{
		if(isRunning)
		{
			return;
		}
		isRunning = true;
		
		startTime = System.currentTimeMillis();
	}
	
	/**
	 * Stops the stopwatch. Time stops accumulating and
	 * it is added to the elapsed time
	 */
	public void stop()
	{
		if(!isRunning)
		{
			return;
		}
		isRunning = false;
		
		long endTime = System.currentTimeMillis();
		elapsedTime =  elapsedTime + endTime - startTime;
	}
	
	/**
	 * Gets the time elapsed
	 * @return the time elapsed
	 */
	public long getElapsedTime()
	{
		if(isRunning)
		{
			long endTime = System.currentTimeMillis();
			return elapsedTime + endTime - startTime;
		}
		else
		{
			return elapsedTime;
		}
	}
	
	/**
	 * Stops the watch and resets the elapsed time to 0
	 */
	public void reset()
	{
		elapsedTime = 0;
		isRunning = false;
	}
}
