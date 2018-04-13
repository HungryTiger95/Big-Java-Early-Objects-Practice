import java.util.Random;

/**
 * The Monte Carlo method is an ingenious method for finding approximate solutions to
 * problems that cannot be precisely solve. This problem simulates shooting a dart into
 * a square surrounding a circle of radius 1. If the generated point lies inside the
 * circle, we count it as a hit. That is the case when x^2 + y^2 <= 1. Because our shots
 * are entirely random, we expect that the ratio of hits/ tries is approximately equal to
 * the ratio of the areas of the circle and the squares, that is pi / 4. Therefore, the
 * estimation of pi is $ * hits / tires.
 * 
 * @author Mayuresh
 *
 */
public class MonteCarloMethod
{
	public static void main(String[] args)
	{
		final int TRIES = 100000;
		
		Random generator = new Random();
		
		int hits = 0;
		double piEstimate = 0;
		
		for(int i = 1; i <= TRIES; i++)
		{
			// Generate two random numbers
			double r = generator.nextDouble();
			double x = -1 + 2 * r;		// Between -1 and 1
			
			r = generator.nextDouble();
			double y = -1 + 2 * r;
			
			// Check if the point lies in the circle
			if(Math.pow(x, 2) + Math.pow(y, 2) <= 1)
			{
				hits++;
			}
			
			piEstimate = 4.0 * hits / TRIES;
			System.out.printf("Estimate for PI: %.8f\n", piEstimate);
		}
		
		System.out.printf("Final PI: %.8f", piEstimate);
	}
}
