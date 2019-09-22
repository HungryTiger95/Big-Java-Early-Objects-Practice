import java.util.Random;

public class DataSetTester
{
	public static void main(String[] args)
	{
		DataSet set = new DataSet();
		Random gen = new Random();
		
		int numVals = 1000;
		double val;
		
		for(int i = 0; i < numVals; i++)
		{
			val = gen.nextDouble() * 100;
			set.add(val);
		}
		
		System.out.printf("n: %.3f\nSum: %.3f\nSum Square: %.3f\nAverage: %.3f\nStd Dev: %.3f\n",
				set.getValCount(), set.getSum(), set.getSumOfSquares(), set.getAverage(), set.getStandardDeviation());
	}
}
