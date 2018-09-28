package exercise_10_4;

public class Data
{
	/**
	 * Computes the average of the measures of the given objects
	 * @param objects the objects to be measured
	 * @param meas the measurer
	 * @return the average of the measures
	 */
	public static double average(Object[] objects, Measurer meas)
	{
		double sum = 0;
		
		for(int i = 0; i < objects.length; i++)
		{
			sum = sum + meas.measure(objects[i]);
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
	 * Computes the largest measure of the given objects
	 * @param objects the objects to be measured
	 * @param meas the measurer
	 * @return the largest measure of all the objects
	 */
	public static Object max(Object[] objects, Measurer meas)
	{
		double largest = meas.measure(objects[0]);
		int largestPos = 0;
		
		for(int i = 1; i < objects.length; i++)
		{
			if(meas.measure(objects[i]) > largest)
			{
				largest = meas.measure(objects[i]);
				largestPos = i;
			}
		}
		
		return objects[largestPos];
	}
}
