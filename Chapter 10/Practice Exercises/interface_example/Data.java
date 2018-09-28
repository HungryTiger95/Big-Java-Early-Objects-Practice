package interface_example;

public class Data
{
	// Instance Variables
	
	// Constructors
	
	// Methods
	/**
	 * Computes the average of the measures of the given objects.
	 * @param objects an array of Measurable objects
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
	 * Computes the average of the measures of the given objects.
	 * @param objects an array of objects
	 * @param meas the measurer for the objects
	 * @return the average of the measures
	 */
	public static double average(Object[] objects, Measurer meas)
	{
		double sum = 0;
		
		for(Object obj : objects)
		{
			sum = sum + meas.measure(obj);
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
	 * Computes the larger of the two measures of the given objects
	 * @param obj1 first object
	 * @param obj2 second object
	 * @return the larger object based on the measure
	 */
	public static Measurable larger(Measurable obj1, Measurable obj2)
	{
		if(obj1.getMeasure() > obj2.getMeasure())
		{
			return obj1;
		}
		else
		{
			return obj2;
		}
	}
}
