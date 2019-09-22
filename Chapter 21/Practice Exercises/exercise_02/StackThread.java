package exercise_02;

/**
 * Implement a stack as a linked list in which the push, pop, and isEmpty methods can be
 * safely accessed from multiple threads.
 * @author Mayuresh
 *
 */
public class StackThread
{
	public static void main(String[] args)
	{
		LinkedListStack<Integer> stack = new LinkedListStack<Integer>();
		final int VAL = 10;
		final int REPETITIONS = 100;
		final int THREADS = 100;

		for(int i = 1; i <= THREADS; i++)
		{
			PushRunnable<Integer> push = new PushRunnable<>(stack, VAL, REPETITIONS);
			PopRunnable<Integer> pop = new PopRunnable<>(stack, REPETITIONS);
			EmptyRunnable<Integer> empty = new EmptyRunnable<>(stack, REPETITIONS);
			
			Thread pushThread = new Thread(push);
			Thread popThread = new Thread(pop);
			Thread emptyThread = new Thread(empty);
			
			pushThread.start();
			popThread.start();
			emptyThread.start();
		}
	}
}
