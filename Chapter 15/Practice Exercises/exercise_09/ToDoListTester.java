package exercise_09;

import org.junit.Test;
import org.junit.Assert;

public class ToDoListTester
{
	@Test
	public void testAddQueues()
	{
		ToDoList list = new ToDoList();
		
		list.addTask(new Task("Doctors Appointment", 2));
		list.addTask(3, "Pick Weeds");
		list.addTask(4, "Go Shopping at Target");
		list.addTask(new Task("Write Paper", 1));
		list.addTask(new Task("Turn In Homework", 1));
		
		Assert.assertEquals(5, list.getTasks().size());
		
		System.out.println("REMOVING: " + list.peekTask().toString());
		list.removeTask();
		Assert.assertEquals(4, list.getTasks().size());
		
		System.out.println("REMOVING: " + list.peekTask().toString());
		list.removeTask();
		Assert.assertEquals(3, list.getTasks().size());
		
		Task t = new Task("Doctors Appointment", 2);
		Assert.assertEquals(t.getDescription(), list.peekTask().getDescription());
	}

}
