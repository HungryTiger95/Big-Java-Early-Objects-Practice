package exercise_05;

import java.time.LocalTime;

public class ProducerThread extends Thread
{
	private static final int DELAY = 1;
	private Queue<String> q;
	private int count;
	
	public ProducerThread(Queue<String> queue, int count)
	{
		this.q = queue;
		this.count = count;
	}
	
	public void run()
	{
		try
		{
			for(int i = 0; i < count; i++)
			{
				String time = LocalTime.now().toString();
				System.out.println("Producer: " + time);
				q.add(time);
				sleep(DELAY);
			}
		}
		catch(InterruptedException e) {}
	}
}
