package exercise_10;

public class AccountMeasurer
{
	/**
	 * Gets the maximum element in the array provided
	 * @param <T> the type of the elements
	 * @param values the array to find the largest value in
	 * @param meas the measurer
	 * @return the largest element
	 */
	public static <T> T max(T[] values, Measurable<T> meas)
	{
		T largest = values[0];
		for(int i = 1; i < values.length; i++)
		{
			double val = meas.getMeasure(values[i]);
			
			if(val > meas.getMeasure(largest))
			{
				largest = values[i];
			}
		}
		return largest;
	}
	
	/**
	 * Gets the element with the smallest value in the array provided
	 * @param <T> the type of the elements
	 * @param values the array to find the largest value in
	 * @param meas the measurer
	 * @return the largest element
	 */
	public static <T> T min(T[] values, Measurable<T> meas)
	{
		T smallest = values[0];
		for(int i = 1; i < values.length; i++)
		{
			if(meas.getMeasure(values[i]) < meas.getMeasure(smallest))
			{
				smallest = values[i];
			}
		}
		return smallest;
	}
	
	/**
	 * Gets the average element value
	 * @param <T> the type of element
	 * @param values the array
	 * @param meas the measurer
	 * @return the average of the elements values
	 */
	public static <T> double average(T[] values, Measurable<T> meas)
	{
		double sum = 0;
		for(T a : values)
		{
			sum += meas.getMeasure(a);
		}
		
		return sum / values.length;
	}
}
