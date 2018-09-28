package interface_example_3;

public class Data
{
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
}
