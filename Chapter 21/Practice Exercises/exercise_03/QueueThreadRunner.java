package exercise_03;

public class QueueThreadRunner
{
	private static final int REPETITIONS = 100;
	
	public static void main(String[] args)
	{
		Queue<String> q = new Queue<>();
		
		ProducerThread producer = new ProducerThread(q, REPETITIONS);
		ConsumerThread consumer = new ConsumerThread(q, REPETITIONS);
		
		producer.start();
		consumer.start();
	}
	
}
