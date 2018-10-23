package exercise_12_5;

/**
 * Implement a simple e-mail messaging system. A message has a recipient, a sender, and a message text.
 * A mailbox can store messages. Supply a number of mailboxes for different users and a user interface
 * for users to log in, send messages to other users, read their own messages, and log out. Follow
 * the design process that was described in this chapter.
 * 
 * @author Mayuresh
 *
 */
public class EmailSystem
{
	// Instance Variables
	public static final int START = 1;
	public static final int PASSWORD = 2;
	public static final int EMAIL_ACTIONS = 3;
	public static final int READ_MESSAGES = 4;
	public static final int SEND_MESSAGE = 5;
	
	public static final int READ = 1;
	public static final int SEND = 2;
	
	private int state;
	private String userName;
	
	private EmailDatabase emaildb;
	private User currentUser;
	
	// Constructors
	/**
	 * Constructs an email system for a given email database
	 * @param anEmailDatabase the database for which this system connects to
	 */
	public EmailSystem(EmailDatabase anEmailDatabase)
	{
		this.emaildb = anEmailDatabase;
		reset();
	}
	
	// Methods
	/**
	 * Resets the system to the initial state
	 */
	public void reset()
	{
		this.state = START;
		
		this.userName = null;
		this.currentUser = null;
	}
	
	/**
	 * Sets the current user name and sets state to PASSWORD
	 * @param userName the user name
	 */
	public void setUserUsername(String userName)
	{
		this.userName = userName;
		this.state = PASSWORD;
	}
	
	/**
	 * Finds a user in the email database.
	 * If found, sets the state to EMAIL_ACTIONS, else back to START
	 * (Precondition: state is PASSWORD)
	 * @param password the password of this user
	 */
	public void selectUser(String password)
	{
		this.currentUser = this.emaildb.findUser(this.userName, password);
		
		if(this.currentUser == null)
		{
			this.state = START;
		}
		else
		{
			this.state = EMAIL_ACTIONS;
		}
	}
	
	/**
	 * Selects an email action (READ_MESSAGES or SEND_MESSAGE)
	 * (Precondition: state must be EMAIL_ACTIONS)
	 * @param action the action to perform
	 */
	public void selectEmailAction(int action)
	{
		if(action == READ)
		{
			this.state = READ_MESSAGES;
		}
		else if(action == SEND)
		{
			this.state = SEND_MESSAGE;
		}
	}
	
	/**
	 * Reads a message in the users mailbox given the index
	 * @param index the index
	 * @return the message written in the mail
	 */
	public String readMessageAt(int index)
	{
		return this.currentUser.getMailbox().getMessageAt(index).getMessage();
	}
	
	/**
	 * Sends a message to another user given the message
	 * @param message the message
	 */
	public void sendMessage(Message message)
	{
		String sendTo = message.getRecipient();
		String sender = message.getSender();
		String messageString = message.getMessage();
		
		if(emaildb.checkUserName(sendTo))
		{
			Message m = new Message(sendTo, sender, messageString);
			emaildb.findUser(sendTo).addMessageToBox(m);
		}
		else
		{
			System.out.println("Failed To Send: Cannot Find User");
			back();
		}
	}
	
	/**
	 * Sends a message to another user given the user name and the message
	 * @param userName the user name of the user to send to
	 * @param message the message to send
	 */
	public void sendMessage(String userName, String message)
	{
		if(emaildb.checkUserName(userName))
		{
			Message m = new Message(userName, this.userName, message);
			emaildb.findUser(userName).addMessageToBox(m);
		}
		else
		{
			back();
		}
	}
	
	/**
	 * Moves back to the previous state
	 */
	public void back()
	{
		if(this.state == SEND_MESSAGE)
		{
			this.state = EMAIL_ACTIONS;
		}
		else if(this.state == READ_MESSAGES)
		{
			this.state = EMAIL_ACTIONS;
		}
		else if(this.state == EMAIL_ACTIONS)
		{
			this.state = START;
		}
	}
	
	/**
	 * Gets the current state of this system
	 * @return the current state
	 */
	public int getState()
	{
		return this.state;
	}
	
	/**
	 * Gets the user name of the current user
	 * @return the user name
	 */
	public String getCurrentUserName()
	{
		if(this.currentUser == null)
		{
			return null;
		}
		else
		{
			return this.currentUser.getUserName();
		}
	}
	
	/**
	 * Gets the current user
	 * @return the current user
	 */
	public User getCurrentUser()
	{
		return this.currentUser;
	}
	
	/**
	 * Displays a message from the mailbox given the index
	 * @param index the index
	 */
	public void displayMessage(int index)
	{
		String recipient = this.currentUser.getMailbox().getMessageAt(index).getRecipient();
		String sender = this.currentUser.getMailbox().getMessageAt(index).getSender();
		String message = this.currentUser.getMailbox().getMessageAt(index).getMessage();
		
		System.out.printf("Recipient: %s\nSent By: %s\nMessage: %s\n", recipient, sender, message);
	}
}
