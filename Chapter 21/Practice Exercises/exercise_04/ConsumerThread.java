package exercise_04;

public class ConsumerThread extends Thread
{
	private static final int DELAY = 1;
	private Queue<String> q;
	private int count;
	
	public ConsumerThread(Queue<String> queue, int count)
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
				q.remove();
				sleep(DELAY);
			}
		}
		catch(InterruptedException e) {}
	}
}
