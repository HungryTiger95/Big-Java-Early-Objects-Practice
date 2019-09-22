import java.util.Scanner;

/**
 * Science P4.12
 * 
 * Write a program that reads the relative humidity (between 0 and 1) and the
 * temperature (in degrees C) and prints the dew point value. Use the Java
 * function log to compute the natural logarithm
 * 
 * The dew point temperature Td can be calculated form the relative humidity RH
 * and the actual temperature T.
 * 
 * @author Mayuresh
 *
 */
public class RelativeHumidity
{

	public static void main(String[] args)
	{
		final double A = 17.27;
		final double B = 237.7;
		
		Scanner in = new Scanner(System.in);
		
		double temp, rH, equ, humidity;
		
		System.out.print("Enter Temperature(C): ");
		temp = in.nextDouble();
		
		System.out.print("Enter Relative Humidity: ");
		rH = in.nextDouble();
		
		in.close();
		
		equ = (((A * temp) / (B + temp)) + Math.log1p((rH / 100.0) - 1));
		
		humidity = ((B * equ) / (A - equ));
		
		System.out.printf("Humidity: %5.3f", humidity);
	}

}
