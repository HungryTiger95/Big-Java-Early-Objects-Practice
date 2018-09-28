package project5;

/**
 * Repeat exercise_10_5, making the Measurer into an inner class inside the main method.
 * 
 * @author Mayuresh
 *
 */
public class Data
{
	/**
	 * Gets the average measure of all the objects given it passes a filter
	 * @param objects an array of objects
	 * @param m the measurer for the objects
	 * @param f the filter
	 * @return the average of the measures that were passed through the filter
	 */
	public static double average(Object[] objects, Measurer m, Filter f)
	{
		double sum = 0;
		int count = 0;
		
		for(int i = 0; i < objects.length; i++)
		{
			if(f.accept(objects[i]))
			{
				count++;
				
				sum += m.measure(objects[i]);
			}
		}
		
		if (count > 0)
		{
			return sum / count;
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * Gets the average measure of all the objects given it passes a filter
	 * @param objects an array of objects
	 * @param m the measurer for the objects
	 * @param f the filter
	 * @return the average of the measures
	 */
	public static double average(Object[] objects, Measurer m)
	{
		double sum = 0;
		for (Object obj : objects)
		{
			sum += m.measure(obj);
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
	 * @param objects an arrays of objects
	 * @param m the measurer for the objects
	 * @return the max of the measures
	 */
	public static double max(Object[] objects, Measurer m, Filter f)
	{
		double largest = 0;
		for (int i = 0; i < objects.length; i++)
	    {   
	        if(m.measure(objects[i]) > largest)
	        {
	            largest = m.measure(objects[i]);
	        }
	    }
		return largest;
	}
}
