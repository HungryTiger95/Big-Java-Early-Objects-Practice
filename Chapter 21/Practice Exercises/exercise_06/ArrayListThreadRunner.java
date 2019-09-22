package exercise_06;

public class ArrayListThreadRunner
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		final int VAL = 10;
		final int REPETITIONS = 10;
		final int THREADS = 10;
		
		for(int i = 0; i < THREADS; i++)
		{
			AddLastRunnable<Integer> addLast = new AddLastRunnable<>(list, REPETITIONS, VAL);
			AddRunnable<Integer> add = new AddRunnable<>(list, REPETITIONS, VAL);
			RemoveRunnable<Integer> remove = new RemoveRunnable<>(list, REPETITIONS);
			SizeRunnable<Integer> size = new SizeRunnable<>(list, REPETITIONS);
			SetRunnable<Integer> set = new SetRunnable<>(list, REPETITIONS, VAL);
			GetRunnable<Integer> get = new GetRunnable<>(list, REPETITIONS);
			
			Thread addLastThread = new Thread(addLast);
			Thread addThread = new Thread(add);
			Thread removeThread = new Thread(remove);
			Thread sizeThread = new Thread(size);
			Thread getThread = new Thread(get);
			Thread setThread = new Thread(set);
			
			addLastThread.start();
			addThread.start();
			removeThread.start();
			sizeThread.start();
			getThread.start();
			setThread.start();
		}
	}
}
