package section_01;

import java.util.Date;

public class GreetingRunnable implements Runnable
{
	private static final int REPETITIONS = 10;
	private static final int DELAY = 1000;
	
	private String greeting;
	
	public GreetingRunnable(String aGreeting)
	{
		greeting = aGreeting;
	}
	
	public void run()
	{
		try
		{
			for(int i = 1; i <= REPETITIONS; i++)
			{
				Date now = new Date();
				System.out.println(now + " " + greeting);
				Thread.sleep(DELAY);
			}
		}
		catch(InterruptedException e){}
	}
}
