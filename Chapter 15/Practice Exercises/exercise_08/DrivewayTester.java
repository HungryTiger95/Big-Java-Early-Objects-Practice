package exercise_08;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class DrivewayTester
{
	@Test
	public void testAdd()
	{
		Driveway d = new Driveway();
		d.addToDriveway(2);
		d.addToDriveway(4);
		d.addToDriveway(5);
		
		Stack<Integer> exp = new Stack<Integer>();
		exp.push(2);
		exp.push(4);
		exp.push(5);
		
		Assert.assertEquals(exp, d.getDriveway());
	}

	@Test
	public void testRemoveFromDriveway()
	{
		Driveway d = new Driveway();
		d.addToDriveway(1);
		d.addToDriveway(2);
		d.addToDriveway(3);
		d.addToDriveway(4);
		d.addToDriveway(5);
		d.addToDriveway(6);
		d.addToDriveway(7);
		d.addToDriveway(8);
		d.addToDriveway(9);
		d.addToDriveway(11);
		d.addToDriveway(13);
		d.addToDriveway(15);
		
		d.removeFromDriveway(7);
		d.removeFromDriveway(3);
		
		Stack<Integer> exp = new Stack<Integer>();
		exp.push(1);
		exp.push(2);
		exp.push(4);
		exp.push(5);
		exp.push(6);
		exp.push(8);
		exp.push(9);
		exp.push(11);
		exp.push(13);
		exp.push(15);
		
		Assert.assertEquals(exp, d.getDriveway());
	}
}
