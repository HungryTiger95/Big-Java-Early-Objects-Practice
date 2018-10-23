package exercise_12_5;

public class User
{
	// Instance Variables
	private Mailbox mailbox;
	
	private String userName;
	private String password;
	
	// Constructors
	/**
	 * Constructs a user that has a user name and password
	 * @param userName the user name
	 * @param password the password
	 */
	public User(String userName, String password)
	{
		this.userName = userName;
		this.password = password;
		
		this.mailbox = new Mailbox();
	}
	
	// Methods
	/**
	 * Sets the user name for this user
	 * @param userName the user name
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	
	/**
	 * Gets the user name for this user
	 * @return the user name
	 */
	public String getUserName()
	{
		return this.userName;
	}
	
	/**
	 * Sets the password for this user
	 * @param password the password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	/**
	 * Gets the password for this user
	 * @return the password
	 */
	public String getPassword()
	{
		return this.password;
	}
	
	/**
	 * Adds a mailbox for this user
	 * @param box the mailbox
	 */
	public void setMailbox(Mailbox box)
	{
		this.mailbox = box;
	}
	
	/**
	 * Gets the users mailbox
	 * @return this users mailbox
	 */
	public Mailbox getMailbox()
	{
		return this.mailbox;
	}
	
	/**
	 * Gets this users message at the given index
	 * @param i index
	 * @return the message
	 */
	public Message getMessageAt(int i)
	{
		return this.mailbox.getMessageAt(i);
	}
	
	public void addMessageToBox(Message message)
	{
		this.mailbox.addMessage(message);
	}
	
	/**
	 * Tests if this user matches a user name and password
	 * @param userName a user name
	 * @param password a password
	 * @return true if the user name and password match
	 */
	public boolean match(String userName, String password)
	{
		return this.userName.equals(userName) && this.password.equals(password);
	}
	
	/**
	 * Tests if this users user name matches a give user name
	 * @param userName the user name to test
	 * @return true if there is a match, false if not
	 */
	public boolean matchUserName(String userName)
	{
		return this.userName.equals(userName);
	}
}

