package exercise_12_5.testing;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import exercise_12_5.Mailbox;
import exercise_12_5.Message;

public class MailboxTester
{
	@Test
	public void testAddMessage()
	{
		Mailbox box = new Mailbox();
		
		box.addMessage(new Message("mayuresh_95", "logan_18", "Hello"));
		
		Assert.assertEquals("mayuresh_95", box.getMessageAt(0).getRecipient());
		Assert.assertEquals("logan_18", box.getMessageAt(0).getSender());
		Assert.assertEquals("Hello", box.getMessageAt(0).getMessage());
	}
	
	@Test
	public void testAddMessage2()
	{
		Mailbox box = new Mailbox();
		Message m = new Message("mayuresh_95", "logan_18", "Hello");
		box.addMessage(m);
		
		Assert.assertEquals("mayuresh_95", box.getMessageAt(0).getRecipient());
		Assert.assertEquals("logan_18", box.getMessageAt(0).getSender());
		Assert.assertEquals("Hello", box.getMessageAt(0).getMessage());
	}
	@Test
	public void testGetMessages()
	{
		Mailbox box = new Mailbox();
		
		Message m1 = new Message("mayuresh_95", "logan_18", "Hello");
		Message m2 = new Message("bogus_10", "planney_17", "Hola");
		Message m3 = new Message("marcus_7", "logan_18", "Allo");
		Message m4 = new Message("priya_32", "raj_3", "Namaste");
		
		ArrayList<Message> messages = new ArrayList<Message>();
		messages.add(m1);
		messages.add(m2);
		messages.add(m3);
		messages.add(m4);
		
		box.addMessage(m1);
		box.addMessage(m2);
		box.addMessage(m3);
		box.addMessage(m4);
		
		Assert.assertEquals(messages, box.getMessages());
	}
	
	@Test
	public void testRemoveMessage()
	{
		Mailbox box = new Mailbox();
		
		box.addMessage(new Message("mayuresh_95", "logan_18", "Hello"));
		box.addMessage(new Message("bogus_10", "planney_17", "Hola"));
		box.addMessage(new Message("marcus_7", "logan_18", "Allo"));
		box.addMessage(new Message("priya_32", "raj_3", "Namaste"));
		
		box.removeMessage();
		
		Assert.assertEquals(3, box.getMessages().size());
	}
	
	@Test
	public void testRemoveMessageMid()
	{
		Mailbox box = new Mailbox();
		
		box.addMessage(new Message("mayuresh_95", "logan_18", "Hello"));
		box.addMessage(new Message("bogus_10", "planney_17", "Hola"));
		box.addMessage(new Message("marcus_7", "logan_18", "Allo"));
		box.addMessage(new Message("priya_32", "raj_3", "Namaste"));
		
		box.removeMessage(2);
		
		Assert.assertEquals(3, box.getMessages().size());
	}
	
	@Test
	public void testRemoveMessageSpecific()
	{
		Mailbox box = new Mailbox();
		
		box.addMessage(new Message("mayuresh_95", "logan_18", "Hello"));
		box.addMessage(new Message("bogus_10", "planney_17", "Hola"));
		box.addMessage(new Message("marcus_7", "logan_18", "Allo"));
		box.addMessage(new Message("priya_32", "raj_3", "Namaste"));
		
		box.removeMessage(2);
		
		Assert.assertEquals("mayuresh_95", box.getMessageAt(0).getRecipient());
		Assert.assertEquals("bogus_10", box.getMessageAt(1).getRecipient());
		Assert.assertEquals("priya_32", box.getMessageAt(2).getRecipient());
		Assert.assertEquals(3, box.getMessages().size());
	}
}
