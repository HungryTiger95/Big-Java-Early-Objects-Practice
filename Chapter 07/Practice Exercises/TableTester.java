import java.util.Random;

public class TableTester
{
	public static void main(String[] args)
	{
		Table table = new Table(5, 5);
		Random gen = new Random();
		
		// Set Random Values Between 1 and 30
		for(int i = 0; i < table.getRowLength(); i++)
		{
			for(int j = 0; j < table.getColumnLength(); j++)
			{
				table.set(i, j, gen.nextInt(30) + 1);
			}
		}
		
		// Print Table
		table.print();
		
		// Test isVal(int n) method
		System.out.println("Is there a 25? " + table.isValue(25));
		
		// Test neighborAverage(int row, int column)
		System.out.printf("Average of neighbors: %.2f", table.neighborAverage(4, 4));
	}
}
