package exercise_15;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class LabeledPointTester
{
	public static void main(String[] args)
	{
		Set<LabeledPoint> points = new TreeSet<LabeledPoint>();
		points.add(new LabeledPoint(1, 1, "Priya"));
		points.add(new LabeledPoint(2, 1, "Payal"));
		points.add(new LabeledPoint(1, 2, "Hailey"));
		points.add(new LabeledPoint(1, 1, "Priya"));
		points.add(new LabeledPoint(1, 4, "Dia"));
		points.add(new LabeledPoint(1, 1, "Marie"));
		points.add(new LabeledPoint(1, 2, "Hailey"));
		points.add(new LabeledPoint(1, 2, "Payal"));
		
		Iterator<LabeledPoint> iter = points.iterator();
		while(iter.hasNext())
		{
			LabeledPoint p = iter.next();
			System.out.println(p.toString());
		}
	}
}
