package section_04;

import java.util.ArrayList;

public class Data
{
	public static <E extends Measurable> double average(ArrayList<E> objects)
	{
		if(objects.size() == 0)
		{
			return 0;
		}
		double sum = 0;
		for(E obj : objects)
		{
			sum += obj.getMeasure();
		}
		
		return sum / objects.size();
	}
	
	public static <E extends Comparable<E>> E max(ArrayList<E> objects)
	{
		E largest = objects.get(0);
		for(int i = 1; i < objects.size(); i++)
		{
			E obj = objects.get(i);
			if(obj.compareTo(largest) > 0)
			{
				largest = obj;
			}
		}
		return largest;
	}
	
	public static <E extends Comparable<E>> E min(ArrayList<E> objects)
	{
		E smallest = objects.get(0);
		for(int i = 1; i < objects.size(); i++)
		{
			E obj = objects.get(i);
			if(obj.compareTo(smallest) < 0)
			{
				smallest = obj;
			}
		}
		return smallest;
	}
}
