package exercise_02;

public class EmptyRunnable<E> implements Runnable
{
	private static final int DELAY = 1;
	private LinkedListStack<E> stack;
	private int count;
	
	public EmptyRunnable(LinkedListStack<E> stack, int count)
	{
		this.stack = stack;
		this.count = count;
	}
	
	public void run()
	{
		try
		{
			for(int i = 1; i <= count; i++)
			{
				stack.isEmpty();
				Thread.sleep(DELAY);
			}
		}
		catch(InterruptedException e) {}
	}
}
