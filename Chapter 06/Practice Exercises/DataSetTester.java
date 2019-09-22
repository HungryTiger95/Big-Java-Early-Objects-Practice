import java.util.Scanner;

/**
 * Sample input: [100 29.9 54.2 93.8 18.9 23.8 1928.0119 10 q] 
 * @author Mayuresh
 *
 */
public class DataSetTester
{
	public static void main (String[] args)
	{
		DataSet data = new DataSet();
		Scanner in = new Scanner(System.in);
		
		double val;
		
		System.out.print("Add Values; [Q]uit: ");
		do
		{
			val = in.nextDouble();
			data.add(val);
		}
		while(in.hasNextDouble());
		
		in.close();
		
		// Expected Results
		System.out.println("Expected:");
		System.out.println("Largest Value: 1928.0119");
		System.out.println("Smallest Value: 10");
		System.out.println("Range Value: 1918.0119");
		System.out.println("Average Value: 282.33");
		System.out.println();
		
		// Actual Results
		System.out.println("Actual:");
		System.out.println("Largest Value: " + data.getLargest());
		System.out.println("Smallest Value: " + data.getSmallest());
		System.out.println("Range Value: " + data.getRange());
		System.out.printf("Average Value: %.2f", data.getAverage());
		System.out.println();
	}
}
