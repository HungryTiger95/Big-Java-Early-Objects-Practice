package exercise_12_5.testing;

import org.junit.Assert;
import org.junit.Test;

import exercise_12_5.Message;

public class MessageTester
{
	@Test
	public void testConstructor()
	{
		Message m = new Message();
		
		m.setRecipient("mayuresh_95");
		m.setSender("logan_18");
		m.setMessage("Hey");
		
		Assert.assertEquals("mayuresh_95", m.getRecipient());
		Assert.assertEquals("logan_18", m.getSender());
		Assert.assertEquals("Hey", m.getMessage());
	}
	
	@Test
	public void testConstructorNull()
	{
		Message m = new Message();
		
		Assert.assertEquals(null, m.getRecipient());
		Assert.assertEquals(null, m.getSender());
		Assert.assertEquals(null, m.getMessage());
	}
	
	
}
