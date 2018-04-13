/**
 * E3.11
 * 
 * Provide a class for authoring a simple letter. In the constructor, supply the names of
 * the sender and the recipient. Supply a method addLine(String line) to add a line of text
 * to the body of the letter. Supply a method getText() that returns the entire text of the
 * letter.
 * 
 * @author Mayuresh
 *
 */

public class Letter
{
	private String sender;
	private String recipient;
	private String text = "";
	
	// Constructors
	/**
	 * Constructs a letter object with a sender and recipient names
	 * @param sender sender name
	 * @param recipient recipient name
	 */
	public Letter(String sender, String recipient)
	{
		this.sender = sender;
		this.recipient = recipient;
	}
	
	// Methods
	/**
	 * Adds a line to the letter and then makes a new line
	 * @param line the message
	 */
	public void addLine(String line)
	{
		text = text.concat(line + "\n");
	}
	
	/**
	 * Gets the text of the letter
	 * @return text
	 */
	public String getText()
	{
		return text;
	}
	
	/**
	 * Gets the recipients name
	 * @return recipient name
	 */
	public String getRecipient()
	{
		return recipient;
	}
	
	/**
	 * Gets the senders name
	 * @return sender name
	 */
	public String getSender()
	{
		return sender;
	}
}
