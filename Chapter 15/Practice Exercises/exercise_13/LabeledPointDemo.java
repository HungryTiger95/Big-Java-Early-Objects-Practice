package exercise_13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LabeledPointDemo
{
	public static void main(String[] args)
	{
		LabeledPoint p1 = new LabeledPoint(1, 1, "Aarohi");
		LabeledPoint p2 = new LabeledPoint(1, 2, "Leah");
		LabeledPoint p3 = new LabeledPoint(1, 1, "Bailey");
		LabeledPoint p4 = new LabeledPoint(1, 1, "Payal");
		LabeledPoint p5 = new LabeledPoint(2, 1, "Alison");
		LabeledPoint p6 = new LabeledPoint(2, 2, "Mahi");
		
		Set<LabeledPoint> points = new HashSet<LabeledPoint>();
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
		points.add(p5);
		points.add(p6);
		points.add(new LabeledPoint(1, 1, "Aarohi"));
		points.add(new LabeledPoint(3, 4, "Reema"));
		points.add(new LabeledPoint(2, 1, "Alison"));
		points.add(new LabeledPoint(3, 4, "Reema"));
		
		Iterator<LabeledPoint> iter = points.iterator();
		
		while(iter.hasNext())
		{
			LabeledPoint p = iter.next();
			System.out.println(p.toString());
		}
	}
}
