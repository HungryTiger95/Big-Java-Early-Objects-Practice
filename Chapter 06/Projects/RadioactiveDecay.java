import java.util.Scanner;

/**
 * P6.15
 * 
 * Radioactive decay of radioactive materials can be modeled by the equation
 * 
 * 		N(t) = N0 * e(((-.693 * t) / t.5))
 * 
 * where N(t) is the amount of the material at time t, N0 is the amount
 * at time 0, and t.5 is the half life.
 * 
 * Technetium-99 is a radioisotope that is used in imaging
 * of the brain. It has a half-life of 6 hours.
 * 
 * Your program should display the relative amount N(t) / N0 in a patient
 * body every hour for 24 hours after receiving a dose.
 * 
 * @author Mayuresh
 *
 */
public class RadioactiveDecay
{
	public static void main(String[] args)
	{
		double n = 0, nInit = 0;
		double tHalf = 6;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Initial Material: ");
		nInit = in.nextDouble();
		
		for(int i = 0; i <= 24; i++)
		{
			n = nInit * Math.exp((-.693 * i) / tHalf);
			
			System.out.printf("After %d Hour(s): %.3f\n", i, n);
		}
		in.close();
		
		System.out.printf("Relative Amount Left: %.3f\n", (n / nInit));
	}
}
