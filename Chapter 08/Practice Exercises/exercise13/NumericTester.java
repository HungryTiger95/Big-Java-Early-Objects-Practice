package exercise13;

public class NumericTester {
	public static void main(String[] args)
	{
		// Test for n < 0
		double test1;
		test1 = Numeric.intPower(3, -8);
		
		// Test for n > 0 and even
		double test2;
		test2 = Numeric.intPower(3, 3);
		
		// Test for n > 0 and odd
		double test3;
		test3 = Numeric.intPower(3, 6);
		
		// Output
		System.out.println("n = negative int: " + test1);
		System.out.println("n = postive even int: " + test2);
		System.out.println("n = positive odd int: " + test3);
	}
}
