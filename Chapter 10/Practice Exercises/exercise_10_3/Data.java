package exercise_10_3;

/**
 * Add a method
 * 		public static Measurable max(Measurable[] objects)
 * to the Data class that returns the object with the largest measure.
 * 
 * @author Mayuresh
 *
 */
public class Data
{
	/**
	 * Computes the average of the measures of objects
	 * @param objects an array of measurable objects
	 * @return the average of the measures
	 */
	public static double average(Measurable[] objects)
	{
		double sum = 0;
		for(Measurable obj : objects)
		{
			sum = sum + obj.getMeasure();
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
	 * Computes the maximum measure of objects
	 * @param objects an array of measurable objects
	 * @return the largest measure
	 */
	public static Object max(Measurable[] objects)
	{
		double largest = objects[0].getMeasure();
		int largestPosition = 0;
		
		for(int i = 0; i < objects.length; i++)
		{
			if(objects[i].getMeasure() > largest)
			{
				largest = objects[i].getMeasure();
				largestPosition = i;
			}
		}
		
		Object result = objects[largestPosition];
		
		return result;
	}
}
