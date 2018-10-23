package exercise_12_5;

public class Message
{
	// Instance Variables
	private String recipient;
	private String sender;
	private String message;
	
	// Constructors
	/**
	 * Constructs a message without a sender, recipient, or message
	 */
	public Message()
	{
		this.recipient = null;
		this.sender = null;
		this.message = null;
	}
	
	/**
	 * Constructs a message given a recipient, and sender, but not with a message
	 * @param recipient the recipient
	 * @param sender the sender
	 */
	public Message(String recipient, String sender)
	{
		this.recipient = recipient;
		this.sender = sender;
		this.message = null;
	}
	
	/**
	 * Constructs a message with a recipient, sender, and a message
	 * @param recipient the recipient
	 * @param sender the sender
	 * @param message the message
	 */
	public Message(String recipient, String sender, String message)
	{
		this.recipient = recipient;
		this.sender = sender;
		this.message = message;
	}
	
	// Methods
	/**
	 * Sets the recipients name
	 * @param recipient the recipient
	 */
	public void setRecipient(String recipient)
	{
		this.recipient = recipient;
	}
	
	/**
	 * Gets the recipients name
	 * @return the recipient name
	 */
	public String getRecipient()
	{
		return this.recipient;
	}
	
	/**
	 * Sets the senders name
	 * @param sender the senders name
	 */
	public void setSender(String sender)
	{
		this.sender = sender;
	}
	
	/**
	 * Gets the senders name
	 * @return the name of the sender
	 */
	public String getSender()
	{
		return this.sender;
	}
	
	/**
	 * Sets the message
	 * @param message the message
	 */
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	/**
	 * Gets the message
	 * @return the message
	 */
	public String getMessage()
	{
		return this.message;
	}
}
