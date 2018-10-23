package exercise_12_5;

import java.util.ArrayList;

public class Mailbox
{
	// Instance Variables
	private ArrayList<Message> messages;
	
	// Constructs
	/**
	 * Constructs a mailbox that can hold a number of messages
	 */
	public Mailbox()
	{
		messages = new ArrayList<Message>();
	}
	
	// Methods
	/**
	 * Gets all the messages in this mailbox
	 * @return all messages stored in this mailbox
	 */
	public ArrayList<Message> getMessages()
	{
		return this.messages;
	}
	
	/**
	 * Gets a message at a given index
	 * @param i index
	 * @return the message at i
	 */
	public Message getMessageAt(int i)
	{
		return this.messages.get(i);
	}
	
	/**
	 * Removes a message at the given index
	 * @param i index
	 */
	public void removeMessage(int i)
	{
		this.messages.remove(i);
	}
	
	/**
	 * Removes the last message in the box
	 */
	public void removeMessage()
	{
		this.messages.remove(messages.size() - 1);
	}
	
	/**
	 * Adds a message to the box
	 * @param message the message to add
	 */
	public void addMessage(Message message)
	{
		this.messages.add(message);
	}
	
	/**
	 * Adds a message given the parameters to construct a message
	 * @param recipient the recipient
	 * @param sender the sender
	 * @param message the message
	 */
	public void addMessage(String recipient, String sender, String message)
	{
		Message newMessage = new Message(recipient, sender, message);
		this.messages.add(newMessage);
	}
	
	@Override
	/**
	 * Returns the string representation of this class
	 */
	public String toString()
	{
		if(this.messages.size() == 0)
		{
			return this.getClass().getName() + "[]";
		}
		else
		{
			String s = this.getClass().getName();
			for(int i = 0; i < this.messages.size(); i++)
			{
				s += "[recipient=" + this.messages.get(i).getRecipient() + "]" +
						"[sender=" + this.messages.get(i).getSender() + "]" +
						"[message=" + this.messages.get(i).getMessage() + "]";
			}
			return s;
		}
	}
}
