import java.util.Scanner;

/**
 * P6.14
 * 
 * A simple model for the hull of a ship is given by:
 * 
 * 		|y| = (B / 2) * (1 - (2x / L)^2) * (1 - (z / T)^2)
 * 
 * where B is the beam, L is the length, and T is the draft. (Note: There are two values
 * of y for each x and z because the hull is symmetric from starboard to port.)
 * 
 * The cross-sectional area at a point x is called the "section" in nautical
 * parlance. To compute it, let z go from 0 to -T in n increments,
 * each of size T/n. For each value of z, compute the value for y.
 * Then sum the areas of trapezoidal strips. At right are the strips
 * where n = 4.
 * 
 * Write a program that reads in values for B, L, T, x, and n and then
 * prints out the cross-sectional area at x.
 * 
 * Does Not Work: Gave up on the derivation of the answer. Did Not know how to do the problem.
 *
 * @author Mayuresh
 *
 */
public class Ship
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		double B, L, T, x, n, y = 0;
		double temp1, temp2, temp3;
		
		System.out.print("Enter beam length: ");
		B = in.nextDouble();
		
		System.out.print("Enter Length: ");
		L = in.nextDouble();
		
		System.out.print("Enter T: ");
		T = in.nextDouble();
		
		System.out.print("Enter x: ");
		x = in.nextDouble();
		
		System.out.print("Enter n: ");
		n = in.nextDouble();
		
		temp1 = (B / 2);
		temp2 = (1 - Math.pow((2 * x) / L, 2));
		
		for(double z = 0; z < -T; z -= (T/n))
		{
			temp3 = (1 - Math.pow((z / T), 2));
			
			y += Math.abs(temp1 * temp2 * temp3);
		}
		
		System.out.println("Area: " + y);
	}	
}
