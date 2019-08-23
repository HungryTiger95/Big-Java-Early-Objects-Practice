package exercise_08;

import org.junit.Assert;
import org.junit.Test;

public class AverageValueTest
{
	class AverageValCalculator implements BinarySearchTree.Visitor
	{
		private int count = 0;
		private int sum = 0;
		
		public void visit(Object data)
		{
			count++;
			sum += Integer.valueOf(data.toString());
		}
		
		public double getAverage()
		{
			return sum / (double) count;
		}
	}
	
	@Test
	public void test1()
	{
		BinarySearchTree t = new BinarySearchTree();
		t.add(15);
		t.add(19);
		t.add(25);
		t.add(12);
		t.add(5);
		t.add(90);
		t.add(54);
		
		AverageValCalculator v = new AverageValCalculator();
		
		System.out.println("Tree: " + t.print());
		t.inorder(v);
		
		//System.out.printf("Average: %.3f", v.getAverage());
		Assert.assertEquals(31.42, v.getAverage(), 0.01);
	}
}
