package exercise_06;

import java.util.Random;

public class GetRunnable<E> implements Runnable
{
	private ArrayList<E> list;
	private int count;
	private final int DELAY = 10;
	
	private Random gen;
	
	public GetRunnable(ArrayList<E> list, int count)
	{
		this.list = list;
		this.count = count;
		this.gen = new Random();
	}
	
	public void run()
	{
		try
		{
			for(int i = 1; i <= count; i++)
			{
				System.out.print("[Get...]");
				if(this.list.size() == 0)
				{
					this.list.get(0);
				}
				else
				{
					int index = gen.nextInt(this.list.size());
					this.list.get(index);
				}
				System.out.println("[Size: " + this.list.size() + "]");
				Thread.sleep(DELAY);
			}
		}
		catch(InterruptedException e) { e.printStackTrace(); }
	}
}
