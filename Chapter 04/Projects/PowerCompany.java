import java.util.Scanner;

/**
 * Science P2.14
 * 
 * The circuit shown below illustrates some important aspects of the connection
 * between a power company and one of its customers. The customer is represented
 * by three parameters, Tt, P, and pf. Vt is the voltage accessed by plugging into
 * a wall outlet. Customers depend on having a dependable value of Vt in order for
 * their appliances to work properly. Accordingly, the power company regulates the
 * value of Vt carefully. P describes the amount of power used by the customer and is
 * the primary factor in determining the customer's electric bill. The power factor is
 * less familiar. (The power factor is calculated as the cosine of an angle so that its
 * value will always be between 0 and 1.) In this problem you will be asked to write
 * a Java program to investigate the significance of the power factor. In the figure,
 * the power lines are represented, somewhat simplistically, as resistances in Ohms.
 * The power company is represented as an AC voltage source. The source voltage, Vs,
 * required to provide the customer with power P at voltage Vt can be determined using
 * the formula:
 * 
 * 		Vs = sqrt((Vt + ((2*R*P) / Vt))^2 + ((2*R*P) / (pf * Vt))^2 * (1 - pf^2))
 * 
 * (Vs has units of Vrms). This formula indicates that the value of Vs depends on the
 * values of pf. Write a Java program that prompts the user for a power factor value
 * and then prints a message giving the corresponding value of Vs, using the values for
 * P, R, and Vt shown above.
 * 
 * 		Vs = ?
 * 		R = 10
 * 		Vt = 120
 * 		P = 260
 * 		fp = 0.6
 * 
 * @author Mayuresh
 *
 */
public class PowerCompany
{
	public static void main(String[] args)
	{
		final double resistance = 10;
		final double power = 260;
		final double voltageAccessed = 120;
		
		double powerFactor;
		double voltageSourced;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Power Factor: ");
		powerFactor = in.nextDouble();
		
		in.close();
		
		double temp1, temp2, temp3;
		
		temp1 = Math.pow((voltageAccessed + ((2 * resistance * power) / voltageAccessed)), 2);
		temp2 = Math.pow((2 * resistance * power) / (powerFactor * voltageAccessed), 2);
		temp3 = (1 - Math.pow(powerFactor, 2));
		
		//System.out.println("Temp1: " + temp1);
		//System.out.println("Temp2: " + temp2);
		//System.out.println("Temp3: " + temp3);
		
		voltageSourced = Math.sqrt(temp1 + (temp2 * temp3));
		
		System.out.printf("Voltage Source: %4.3f Vrms\n", voltageSourced);
	}
}
