package exercise_10_1;

/**
 * Add a method
 * 		public static Measureable max(Measureable[] objects)
 * to the Data class that returns the object with the largest measure.
 * 
 * @author Mayuresh
 *
 */
public class Data
{
	/**
	 * Computes the average of the measures of the given objects
	 * @param objects an array of Measurable objects
	 * @return the average of the measures
	 */
	public static double average(Measureable[] objects)
	{
		double sum = 0;
		for(int i = 0; i < objects.length; i++)
		{
			sum = sum + objects[i].getMeasure();
		}
		
		if(objects.length > 0)
		{
			return sum / objects.length;
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * Computes the max of the measures of the given objects
	 * @param objects an array of Measurable objects
	 * @return the max of the measures
	 */
	public static double max(Measureable[] objects)
	{
		double largest = 0;
		for(int i = 0; i < objects.length; i++)
		{
			if(objects[i].getMeasure() > largest)
			{
				largest = objects[i].getMeasure();
			}
		}
		
		return largest;
	}
}
