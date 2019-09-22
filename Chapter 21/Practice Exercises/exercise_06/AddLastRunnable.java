package exercise_06;

public class AddLastRunnable<E> implements Runnable
{
	private ArrayList<E> list;
	private int count;
	private E element;
	private final int DELAY = 10;
	
	public AddLastRunnable(ArrayList<E> list, int count, E element)
	{
		this.list = list;
		this.count = count;
		this.element = element;
	}
	
	public void run()
	{
		try
		{
			for(int i = 1; i <= count; i++)
			{
				System.out.print("[AddLast...]");
				this.list.addLast(element);
				System.out.println("[Size: " + this.list.size() + "]");
				Thread.sleep(DELAY);
			}
		}
		catch(InterruptedException e) { e.printStackTrace(); }
	}
}
