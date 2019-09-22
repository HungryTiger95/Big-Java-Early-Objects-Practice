package exercise_01;

import java.util.LinkedList;
import java.util.List;

/**
 * Write a program in which multiple threads add and remove elements from a java.
 * util.LinkedList. Demonstrate that the list is being corrupted.
 *
 * @author Mayuresh
 *
 */
public class ListThreadRunner
{
	public static void main(String[] args)
	{
		List<Integer> lst = new LinkedList<>();
		final int VAL = 100;
		final int REPETITIONS = 50;
		final int THREADS = 100;
		
		for(int i = 1; i <= THREADS; i++)
		{
			AddRunnable<Integer> a = new AddRunnable<>(lst, VAL, REPETITIONS);
			RemoveRunnable<Integer> r = new RemoveRunnable<>(lst, VAL, REPETITIONS);
			
			Thread at = new Thread(a);
			Thread rt = new Thread(r);
			
			at.start();
			rt.start();
		}
	}
}
