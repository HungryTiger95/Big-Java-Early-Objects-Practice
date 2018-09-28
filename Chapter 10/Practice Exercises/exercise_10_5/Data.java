package exercise_10_5;

/**
 * Using a different Measurer object, process a set of Rectangle objects to find the rectangle with the largest
 * perimeter.
 * 
 * @author Mayuresh
 *
 */
public class Data
{
	/**
	 * Gets the average measure of all the objects
	 * @param objects an array of objects
	 * @param m the measurer for the objects
	 * @return the average of the measures
	 */
	public static double average(Object[] objects, Measurer m)
	{
		double sum = 0;
		for (Object obj : objects)
		{
			sum = sum + m.measure(obj);
		}
		
		if (objects.length > 0)
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
	 * @param objects an arrys of objects
	 * @param m the measurer for the objects
	 * @return the max of the measures
	 */
	public static double max(Object[] objects, Measurer m)
	{
		double largest = 0;
		for (Object obj : objects)
		{
			if(m.measure(obj) > largest)
			{
				largest = m.measure(obj);
			}
		}
		return largest;
	}
}
