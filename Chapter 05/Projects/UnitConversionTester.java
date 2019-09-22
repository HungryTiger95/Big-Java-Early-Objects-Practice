import java.util.Scanner;

public class UnitConversionTester
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Convert From: ");
		String convertFrom = in.nextLine();
		
		System.out.print("Convert To: ");
		String convertTo = in.nextLine();
		
		System.out.print("Value: ");
		double value = in.nextDouble();
		
		in.close();
		
		UnitConversion convert = new UnitConversion();
		
		System.out.printf("%.3f %s ----> %.3f %s", value, convertFrom, convert.convert(convertFrom, convertTo, value), convertTo);
	}
}
