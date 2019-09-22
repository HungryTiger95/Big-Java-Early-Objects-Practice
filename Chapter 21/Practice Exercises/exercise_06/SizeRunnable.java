package exercise_06;

public class SizeRunnable<E> implements Runnable
{
	private ArrayList<E> list;
	private int count;
	private final int DELAY = 10;
	
	public SizeRunnable(ArrayList<E> list, int count)
	{
		this.list = list;
		this.count = count;
	}
	
	public void run()
	{
		try
		{
			for(int i = 1; i <= count; i++)
			{
				System.out.print("[Size...]");
				System.out.println("[Size: " + this.list.size() + "]");
				Thread.sleep(DELAY);
			}
		}
		catch(InterruptedException e) { e.printStackTrace(); }
	}
}
