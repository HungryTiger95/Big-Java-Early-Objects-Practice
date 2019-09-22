package exercise_02;

public class PushRunnable<E> implements Runnable
{
	private static final int DELAY = 1;
	private LinkedListStack<E> stack;
	private E val;
	private int count;
	
	public PushRunnable(LinkedListStack<E> stack, E val, int count)
	{
		this.stack = stack;
		this.val = val;
		this.count = count;
	}
	
	public void run()
	{
		try
		{
			for(int i = 1; i <= count; i++)
			{
				stack.push(val);
				Thread.sleep(DELAY);
			}
		}
		catch(InterruptedException e) {}
	}
}
