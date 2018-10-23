package exercise_12_5.testing;

import org.junit.Assert;
import org.junit.Test;

import exercise_12_5.Mailbox;
import exercise_12_5.Message;
import exercise_12_5.User;

public class UserTester
{
	@Test
	public void testUserConstructor()
	{
		User u = new User("mayuresh_95", "pass1");
		
		Assert.assertEquals("mayuresh_95", u.getUserName());
		Assert.assertEquals("pass1", u.getPassword());
	}
	
	@Test
	public void testMailbox()
	{
		Mailbox box = new Mailbox();
		box.addMessage(new Message("mayuresh_95", "diya_05", "Hello"));
		box.addMessage(new Message("jason_10", "mayuresh_95", "Hola"));
		box.addMessage(new Message("pollan_3", "rossan_1", "Allo"));
		
		User u = new User("mayuresh_95", "pass1");
		u.addMessageToBox(new Message("mayuresh_95", "diya_05", "Hello"));
		u.addMessageToBox(new Message("jason_10", "mayuresh_95", "Hola"));
		u.addMessageToBox(new Message("pollan_3", "rossan_1", "Allo"));
		
		Assert.assertEquals(3, box.getMessages().size());
		Assert.assertEquals(3, u.getMailbox().getMessages().size());
		
		Assert.assertEquals(box.toString(), u.getMailbox().toString());
	}
	
	@Test
	public void testMatch1()
	{
		User u = new User("mayuresh_95", "pass1");
		
		boolean match1 = u.match("mayuresh", "pass1");
		boolean match2 = u.match("mayuresh_95", "pass1");
		
		Assert.assertEquals(false, match1);
		Assert.assertEquals(true, match2);
	}
	
	@Test
	public void testMatch2()
	{
		User u = new User("mayuresh_95", "pass1");
		
		boolean match1 = u.matchUserName("mayuresh");
		boolean match2 = u.matchUserName("mayuresh_95");
		
		Assert.assertEquals(false, match1);
		Assert.assertEquals(true, match2);
	}
}
