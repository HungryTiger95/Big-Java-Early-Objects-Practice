import java.util.Scanner;

/**
 * P4.13
 * 
 * Pipe clip temperatures are robust sensors that can be clipped directly onto copper
 * pipes to measure the temperature of the liquids in the pipes. Each sensor contains
 * a device called a thermistor. Thermistors are semiconductor devices that exhibit a
 * temperature-dependent resistance described by:
 * 
 * 			R = R0 e^(B*((1/T) - (1/T0)))
 * 
 * where R is the resistance at the temperature T (in K), and R0 is the resistance at
 * the temperature T0 (in K). B is a constant that depends on the material used to make
 * the thermistor. Thermistors are specified by providing values for R0, T0, and B. The
 * Thermistors used to make the pipe clip temperature sensors have R0 = 1075 at
 * T0 = 85 + 273, and B = 3969K. The liquid temperature, in C, is determined from the
 * resistance R using:
 * 
 * 			T = (((B*T0) / (T0*ln(R/R0) + B)) - 273
 * 
 * 
 * @author Mayuresh
 *
 */
public class Thermistor
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		final double B = 3969;
		final double R0 = 1075;
		final double T0 = 358;
		
		double r, t;
		
		System.out.print("Enter Resistance: ");
		r = in.nextDouble();
		
		in.close();
		
		double eq1 = B * T0; 
		double eq2 = (T0 * Math.log1p((r / R0) - 1)) + B;
		t = (eq1 / eq2) - 273;
		
		System.out.printf("Liquid Temperature: %8.2f", t);
	}
}
