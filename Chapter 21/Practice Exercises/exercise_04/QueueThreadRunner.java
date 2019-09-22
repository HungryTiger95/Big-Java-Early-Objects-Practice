package exercise_04;

import java.util.Scanner;

public class QueueThreadRunner
{
	private static final int REPETITIONS = 100;
	
	public static void main(String[] args)
	{
		Queue<String> q = new Queue<>();
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of Producer/Consumer Threads: ");
		int threadCount = in.nextInt();
		in.close();
		
		for(int i = 0; i < threadCount; i++)
		{
			ProducerThread producer = new ProducerThread(q, REPETITIONS);
			ConsumerThread consumer = new ConsumerThread(q, REPETITIONS);
			
			producer.start();
			consumer.start();
		}
	}
	
}
