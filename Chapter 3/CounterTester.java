
public class CounterTester
{
	public static void main (String[] args)
	{
		Counter tally = new Counter();
		tally.setLimit(500);
		
		// Click 6 times
		tally.click();
		tally.click();
		tally.click();
		tally.click();
		tally.click();
		tally.click();
		
		System.out.println("Tally: " + tally.getValue());
		
		// Undo 8 times
		tally.undo();
		tally.undo();
		tally.undo();
		tally.undo();
		tally.undo();
		tally.undo();
		tally.undo();
		tally.undo();
		
		System.out.println("Tally: " + tally.getValue());
		
		Counter counter = new Counter();
		counter.setLimit(15);
		
		// Click 16 times
		counter.click();
		counter.click();
		counter.click();
		counter.click();
		counter.click();
		counter.click();
		counter.click();
		counter.click();
		counter.click();
		counter.click();
		counter.click();
		counter.click();
		counter.click();
		counter.click();
		counter.click();
		counter.click();
		counter.click();
		
		System.out.println("Counter: " + counter.getValue());
	}
	
	
}
