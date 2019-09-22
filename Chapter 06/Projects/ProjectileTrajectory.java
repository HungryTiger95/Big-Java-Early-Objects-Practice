
/**
 * P6.13
 * 
 * Projectile Flight. Suppose a cannonball is propelled straight into the air with a starting velocity v0.
 * Any calculus book will state that the position of the ball after t seconds is s(t) = -1/2gt^2 + v0t, where
 * g = 9.81 m/s^2 is the gravitational force of the earth. No calculus textbook ever mentions why someone would
 * want to carry out such an obviously dangerous experiment, so we will do it in the safety of the computer.
 * 
 * In fact, we will confirm the calculus by a simulation. In our simulation, we will consider how the ball moves
 * in very short time intervals delta t. In a short time interval the velocity v is nearly constant, and we
 * can compute the distance the ball moves as delta s = v * delta t. In our program, we will simply set
 * 
 * 		const double DELTA_T = 0.01;
 * 
 * and update the position by
 * 
 * 		s = s + v * DELTA_T;
 * 
 * The velocity changes constantly - in fact, it is reduced by the gravitational force of
 * the earth. In a short time interval, delta v = -g * delta t, we must keep the velocity updated as
 * 
 * 		v = v - g * DELTA_T;
 * 
 * In the next iteration the new velocity is used to update the distance.
 * 
 * Now run the simulation until the cannonball falls back to the earth. Get the initial
 * velocity as an input (100 m/s is a good value). Update the position and velocity 100 times per second,
 * but print out the position only every full second. Also printout the values from the exact formula s(t) = -1/2 * gt^2 + v0t
 * for comparison.
 * 
 * Note: You may wonder whether there is a benefit to this simulation when an exact
 * formula is available. Well, the formula form the calculus book is not exact. Actually, the gravitational
 * force diminishes the farther the cannonball is away from the surface of the earth. This complicates the algebra
 * sufficiently that it is not possible to give an exact formula for the actual motion, but the computer simulation
 * can simply be extended to apply a variable gravitational force. For cannonballs, the calculus-book formula is actually
 * good enough, but computers are necessary to compute accurate trajectories for higher-flying objects.
 * 
 * @author Mayuresh
 *
 */
public class ProjectileTrajectory
{
	public static void main(String[] args)
	{
		final double DELTA_T = 0.01;
		final double g = 9.81;
		
		double vEq1 = 100;
		double sEq1 = 0;
		
		double vEq2 = 100;
		double tEq2 = 0;
		double sEq2 = 0;
		
		int count = 1;
		
		while(sEq1 >= 0 || sEq2 >= 0)
		{
			sEq1 += vEq1 * DELTA_T;
			vEq1 -= g * DELTA_T;
			
			if(count % 100 == 0 || count == 1)
			{
				System.out.printf("FORMULA1: %8.2f|", sEq1);
			}
			
			sEq2 = (-.5*g*Math.pow(tEq2, 2)) + (vEq2*tEq2);
			tEq2 += DELTA_T;
			
			if(count % 100 == 0 || count == 1)
			{
				System.out.printf("Exact: %8.2f\n", sEq2);
			}
			count++;
		}
	}
}
