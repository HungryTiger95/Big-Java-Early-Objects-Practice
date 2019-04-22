package exercise_14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LabeledPointDemo
{
	public static void main(String[] args)
	{
		LabeledPoint p1 = new LabeledPoint(1, 1, "Payal");
		LabeledPoint p2 = new LabeledPoint(1, 1, "Payal");
		LabeledPoint p3 = new LabeledPoint(1, 1, "Marcus");
		LabeledPoint p4 = new LabeledPoint(1, 1, "Hailey");
		LabeledPoint p5 = new LabeledPoint(2, 1, "Lowe");
		LabeledPoint p6 = new LabeledPoint(2, 2, "Lowe");
		
		Set<LabeledPoint> points = new HashSet<LabeledPoint>();
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		points.add(p5);
		points.add(p6);
		
		Iterator<LabeledPoint> iter = points.iterator();
		
		while(iter.hasNext())
		{
			LabeledPoint p = iter.next();
			
			System.out.println("====================");
			System.out.println("Point HashCode: " + p.getPoint().hashCode());
			System.out.println("Label HashCode: " + p.getLabel().hashCode());
			System.out.println("Own HashCode: " + p.hashCode());
			System.out.println(p.toString());
		}
	}
}
